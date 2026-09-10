package com.badlogic.gdx.assets;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.loaders.AssetLoader;
import com.badlogic.gdx.assets.loaders.BitmapFontLoader;
import com.badlogic.gdx.assets.loaders.CubemapLoader;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.I18NBundleLoader;
import com.badlogic.gdx.assets.loaders.MusicLoader;
import com.badlogic.gdx.assets.loaders.ParticleEffectLoader;
import com.badlogic.gdx.assets.loaders.PixmapLoader;
import com.badlogic.gdx.assets.loaders.ShaderProgramLoader;
import com.badlogic.gdx.assets.loaders.SkinLoader;
import com.badlogic.gdx.assets.loaders.SoundLoader;
import com.badlogic.gdx.assets.loaders.TextureAtlasLoader;
import com.badlogic.gdx.assets.loaders.TextureLoader;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Cubemap;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.graphics.g2d.PolygonRegion;
import com.badlogic.gdx.graphics.g2d.PolygonRegionLoader;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.loader.G3dModelLoader;
import com.badlogic.gdx.graphics.g3d.loader.ObjLoader;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.I18NBundle;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.Logger;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.ObjectIntMap;
import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.ObjectSet;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.UBJsonReader;
import com.badlogic.gdx.utils.async.AsyncExecutor;
import com.badlogic.gdx.utils.async.ThreadUtils;
import com.badlogic.gdx.utils.reflect.ClassReflection;

/* JADX INFO: loaded from: classes.dex */
public class AssetManager implements Disposable {
    final ObjectMap<String, Array<String>> assetDependencies;
    final ObjectMap<String, Class> assetTypes;
    final ObjectMap<Class, ObjectMap<String, RefCountedContainer>> assets;
    final AsyncExecutor executor;
    final ObjectSet<String> injected;
    AssetErrorListener listener;
    final Array<AssetDescriptor> loadQueue;
    int loaded;
    final ObjectMap<Class, ObjectMap<String, AssetLoader>> loaders;
    Logger log;
    int peakTasks;
    final FileHandleResolver resolver;
    final Array<AssetLoadingTask> tasks;
    int toLoad;

    public static class RefCountedContainer {
        Object object;
        int refCount = 1;
    }

    public AssetManager() {
        this(new InternalFileHandleResolver());
    }

    private void addTask(AssetDescriptor assetDescriptor) {
        AssetLoader loader = getLoader(assetDescriptor.type, assetDescriptor.fileName);
        if (loader != null) {
            this.tasks.add(new AssetLoadingTask(this, assetDescriptor, loader, this.executor));
            this.peakTasks++;
        } else {
            throw new GdxRuntimeException("No loader for type: " + ClassReflection.getSimpleName(assetDescriptor.type));
        }
    }

    private void handleTaskError(Throwable th) {
        this.log.error("Error loading asset.", th);
        if (this.tasks.isEmpty()) {
            throw new GdxRuntimeException(th);
        }
        AssetLoadingTask assetLoadingTaskPop = this.tasks.pop();
        AssetDescriptor assetDescriptor = assetLoadingTaskPop.assetDesc;
        if (assetLoadingTaskPop.dependenciesLoaded && assetLoadingTaskPop.dependencies != null) {
            Array.ArrayIterator<AssetDescriptor> it = assetLoadingTaskPop.dependencies.iterator();
            while (it.hasNext()) {
                unload(it.next().fileName);
            }
        }
        this.tasks.clear();
        AssetErrorListener assetErrorListener = this.listener;
        if (assetErrorListener == null) {
            throw new GdxRuntimeException(th);
        }
        assetErrorListener.error(assetDescriptor, th);
    }

    private void incrementRefCountedDependencies(String str) {
        Array<String> array = this.assetDependencies.get(str);
        if (array == null) {
            return;
        }
        Array.ArrayIterator<String> it = array.iterator();
        while (it.hasNext()) {
            String next = it.next();
            this.assets.get(this.assetTypes.get(next)).get(next).refCount++;
            incrementRefCountedDependencies(next);
        }
    }

    private synchronized void injectDependency(String str, AssetDescriptor assetDescriptor) {
        try {
            Array<String> array = this.assetDependencies.get(str);
            if (array == null) {
                array = new Array<>();
                this.assetDependencies.put(str, array);
            }
            array.add(assetDescriptor.fileName);
            if (isLoaded(assetDescriptor.fileName)) {
                this.log.debug("Dependency already loaded: " + assetDescriptor);
                RefCountedContainer refCountedContainer = this.assets.get(this.assetTypes.get(assetDescriptor.fileName)).get(assetDescriptor.fileName);
                refCountedContainer.refCount = refCountedContainer.refCount + 1;
                incrementRefCountedDependencies(assetDescriptor.fileName);
            } else {
                this.log.info("Loading dependency: " + assetDescriptor);
                addTask(assetDescriptor);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void nextTask() {
        AssetLoaderParameters.LoadedCallback loadedCallback;
        AssetDescriptor assetDescriptorRemoveIndex = this.loadQueue.removeIndex(0);
        if (!isLoaded(assetDescriptorRemoveIndex.fileName)) {
            this.log.info("Loading: " + assetDescriptorRemoveIndex);
            addTask(assetDescriptorRemoveIndex);
            return;
        }
        this.log.debug("Already loaded: " + assetDescriptorRemoveIndex);
        RefCountedContainer refCountedContainer = this.assets.get(this.assetTypes.get(assetDescriptorRemoveIndex.fileName)).get(assetDescriptorRemoveIndex.fileName);
        refCountedContainer.refCount = refCountedContainer.refCount + 1;
        incrementRefCountedDependencies(assetDescriptorRemoveIndex.fileName);
        AssetLoaderParameters assetLoaderParameters = assetDescriptorRemoveIndex.params;
        if (assetLoaderParameters != null && (loadedCallback = assetLoaderParameters.loadedCallback) != null) {
            loadedCallback.finishedLoading(this, assetDescriptorRemoveIndex.fileName, assetDescriptorRemoveIndex.type);
        }
        this.loaded++;
    }

    private boolean updateTask() {
        AssetLoaderParameters.LoadedCallback loadedCallback;
        AssetLoadingTask assetLoadingTaskPeek = this.tasks.peek();
        try {
            if (!assetLoadingTaskPeek.cancel && !assetLoadingTaskPeek.update()) {
                return false;
            }
        } catch (RuntimeException e) {
            assetLoadingTaskPeek.cancel = true;
            taskFailed(assetLoadingTaskPeek.assetDesc, e);
        }
        Array<AssetLoadingTask> array = this.tasks;
        if (array.size == 1) {
            this.loaded++;
            this.peakTasks = 0;
        }
        array.pop();
        if (assetLoadingTaskPeek.cancel) {
            return true;
        }
        AssetDescriptor assetDescriptor = assetLoadingTaskPeek.assetDesc;
        addAsset(assetDescriptor.fileName, assetDescriptor.type, assetLoadingTaskPeek.asset);
        AssetDescriptor assetDescriptor2 = assetLoadingTaskPeek.assetDesc;
        AssetLoaderParameters assetLoaderParameters = assetDescriptor2.params;
        if (assetLoaderParameters != null && (loadedCallback = assetLoaderParameters.loadedCallback) != null) {
            loadedCallback.finishedLoading(this, assetDescriptor2.fileName, assetDescriptor2.type);
        }
        long jNanoTime = TimeUtils.nanoTime();
        this.log.debug("Loaded: " + ((jNanoTime - assetLoadingTaskPeek.startTime) / 1000000.0f) + "ms " + assetLoadingTaskPeek.assetDesc);
        return true;
    }

    public <T> void addAsset(String str, Class<T> cls, T t) {
        this.assetTypes.put(str, cls);
        ObjectMap<String, RefCountedContainer> objectMap = this.assets.get(cls);
        if (objectMap == null) {
            objectMap = new ObjectMap<>();
            this.assets.put(cls, objectMap);
        }
        RefCountedContainer refCountedContainer = new RefCountedContainer();
        refCountedContainer.object = t;
        objectMap.put(str, refCountedContainer);
    }

    public void clear() {
        synchronized (this) {
            this.loadQueue.clear();
        }
        finishLoading();
        synchronized (this) {
            try {
                ObjectIntMap objectIntMap = new ObjectIntMap();
                while (this.assetTypes.size > 0) {
                    objectIntMap.clear(51);
                    Array<String> array = this.assetTypes.keys().toArray();
                    Array.ArrayIterator<String> it = array.iterator();
                    while (it.hasNext()) {
                        Array<String> array2 = this.assetDependencies.get(it.next());
                        if (array2 != null) {
                            Array.ArrayIterator<String> it2 = array2.iterator();
                            while (it2.hasNext()) {
                                objectIntMap.getAndIncrement(it2.next(), 0, 1);
                            }
                        }
                    }
                    Array.ArrayIterator<String> it3 = array.iterator();
                    while (it3.hasNext()) {
                        String next = it3.next();
                        if (objectIntMap.get(next, 0) == 0) {
                            unload(next);
                        }
                    }
                }
                this.assets.clear(51);
                this.assetTypes.clear(51);
                this.assetDependencies.clear(51);
                this.loaded = 0;
                this.toLoad = 0;
                this.peakTasks = 0;
                this.loadQueue.clear();
                this.tasks.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean contains(String str) {
        Array<AssetLoadingTask> array = this.tasks;
        if (array.size > 0 && array.first().assetDesc.fileName.equals(str)) {
            return true;
        }
        int i = 0;
        while (true) {
            Array<AssetDescriptor> array2 = this.loadQueue;
            if (i >= array2.size) {
                return isLoaded(str);
            }
            if (array2.get(i).fileName.equals(str)) {
                return true;
            }
            i++;
        }
    }

    public synchronized <T> boolean containsAsset(T t) {
        ObjectMap<String, RefCountedContainer> objectMap = this.assets.get(t.getClass());
        if (objectMap == null) {
            return false;
        }
        ObjectMap.Values<RefCountedContainer> it = objectMap.values().iterator();
        while (it.hasNext()) {
            Object obj = it.next().object;
            if (obj == t || t.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        this.log.debug("Disposing.");
        clear();
        this.executor.dispose();
    }

    public void finishLoading() {
        this.log.debug("Waiting for loading to complete...");
        while (!update()) {
            ThreadUtils.yield();
        }
        this.log.debug("Loading complete.");
    }

    public <T> T finishLoadingAsset(AssetDescriptor assetDescriptor) {
        return (T) finishLoadingAsset(assetDescriptor.fileName);
    }

    public synchronized <T> T get(String str) {
        return (T) get(str, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized <T> Array<T> getAll(Class<T> cls, Array<T> array) {
        ObjectMap<String, RefCountedContainer> objectMap = this.assets.get(cls);
        if (objectMap != null) {
            ObjectMap.Values<RefCountedContainer> it = objectMap.values().iterator();
            while (it.hasNext()) {
                array.add(it.next().object);
            }
        }
        return array;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized <T> String getAssetFileName(T t) {
        try {
            ObjectMap.Keys<Class> it = this.assets.keys().iterator();
            while (it.hasNext()) {
                ObjectMap.Entries<String, RefCountedContainer> it2 = this.assets.get(it.next()).iterator();
                while (it2.hasNext()) {
                    ObjectMap.Entry next = it2.next();
                    Object obj = ((RefCountedContainer) next.value).object;
                    if (obj != t && !t.equals(obj)) {
                    }
                    return (String) next.key;
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Array<String> getAssetNames() {
        return this.assetTypes.keys().toArray();
    }

    public synchronized Class getAssetType(String str) {
        return this.assetTypes.get(str);
    }

    public synchronized Array<String> getDependencies(String str) {
        return this.assetDependencies.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized String getDiagnostics() {
        StringBuilder sb;
        try {
            sb = new StringBuilder(256);
            ObjectMap.Entries<String, Class> it = this.assetTypes.iterator();
            while (it.hasNext()) {
                ObjectMap.Entry next = it.next();
                String str = (String) next.key;
                Class cls = (Class) next.value;
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(str);
                sb.append(", ");
                sb.append(ClassReflection.getSimpleName(cls));
                sb.append(", refs: ");
                sb.append(this.assets.get(cls).get(str).refCount);
                Array<String> array = this.assetDependencies.get(str);
                if (array != null) {
                    sb.append(", deps: [");
                    Array.ArrayIterator<String> it2 = array.iterator();
                    while (it2.hasNext()) {
                        sb.append(it2.next());
                        sb.append(',');
                    }
                    sb.append(']');
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    public FileHandleResolver getFileHandleResolver() {
        return this.resolver;
    }

    public synchronized int getLoadedAssets() {
        return this.assetTypes.size;
    }

    public <T> AssetLoader getLoader(Class<T> cls) {
        return getLoader(cls, null);
    }

    public Logger getLogger() {
        return this.log;
    }

    public synchronized float getProgress() {
        try {
            int i = this.toLoad;
            if (i == 0) {
                return 1.0f;
            }
            float f = this.loaded;
            int i2 = this.peakTasks;
            if (i2 > 0) {
                f += (i2 - this.tasks.size) / i2;
            }
            return Math.min(1.0f, f / i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int getQueuedAssets() {
        return this.loadQueue.size + this.tasks.size;
    }

    public synchronized int getReferenceCount(String str) {
        Class cls;
        cls = this.assetTypes.get(str);
        if (cls == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        return this.assets.get(cls).get(str).refCount;
    }

    public synchronized void injectDependencies(String str, Array<AssetDescriptor> array) {
        try {
            ObjectSet<String> objectSet = this.injected;
            Array.ArrayIterator<AssetDescriptor> it = array.iterator();
            while (it.hasNext()) {
                AssetDescriptor next = it.next();
                if (!objectSet.contains(next.fileName)) {
                    objectSet.add(next.fileName);
                    injectDependency(str, next);
                }
            }
            objectSet.clear(32);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean isFinished() {
        return this.loadQueue.size == 0 && this.tasks.size == 0;
    }

    public synchronized boolean isLoaded(AssetDescriptor assetDescriptor) {
        return isLoaded(assetDescriptor.fileName);
    }

    public synchronized <T> void load(String str, Class<T> cls) {
        load(str, cls, null);
    }

    public synchronized void setErrorListener(AssetErrorListener assetErrorListener) {
        this.listener = assetErrorListener;
    }

    public synchronized <T, P extends AssetLoaderParameters<T>> void setLoader(Class<T> cls, AssetLoader<T, P> assetLoader) {
        setLoader(cls, null, assetLoader);
    }

    public void setLogger(Logger logger) {
        this.log = logger;
    }

    public synchronized void setReferenceCount(String str, int i) {
        Class cls = this.assetTypes.get(str);
        if (cls == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        this.assets.get(cls).get(str).refCount = i;
    }

    public synchronized void unload(String str) {
        AssetLoaderParameters assetLoaderParameters;
        AssetLoaderParameters.LoadedCallback loadedCallback;
        Array<AssetLoadingTask> array = this.tasks;
        if (array.size > 0) {
            AssetLoadingTask assetLoadingTaskFirst = array.first();
            if (assetLoadingTaskFirst.assetDesc.fileName.equals(str)) {
                this.log.info("Unload (from tasks): " + str);
                assetLoadingTaskFirst.cancel = true;
                assetLoadingTaskFirst.unload();
                return;
            }
        }
        Class cls = this.assetTypes.get(str);
        int i = 0;
        while (true) {
            Array<AssetDescriptor> array2 = this.loadQueue;
            if (i >= array2.size) {
                i = -1;
                break;
            } else if (array2.get(i).fileName.equals(str)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.toLoad--;
            AssetDescriptor assetDescriptorRemoveIndex = this.loadQueue.removeIndex(i);
            this.log.info("Unload (from queue): " + str);
            if (cls != null && (assetLoaderParameters = assetDescriptorRemoveIndex.params) != null && (loadedCallback = assetLoaderParameters.loadedCallback) != null) {
                loadedCallback.finishedLoading(this, assetDescriptorRemoveIndex.fileName, assetDescriptorRemoveIndex.type);
            }
            return;
        }
        if (cls == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        RefCountedContainer refCountedContainer = this.assets.get(cls).get(str);
        int i2 = refCountedContainer.refCount - 1;
        refCountedContainer.refCount = i2;
        if (i2 <= 0) {
            this.log.info("Unload (dispose): " + str);
            Object obj = refCountedContainer.object;
            if (obj instanceof Disposable) {
                ((Disposable) obj).dispose();
            }
            this.assetTypes.remove(str);
            this.assets.get(cls).remove(str);
        } else {
            this.log.info("Unload (decrement): " + str);
        }
        Array<String> array3 = this.assetDependencies.get(str);
        if (array3 != null) {
            Array.ArrayIterator<String> it = array3.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (isLoaded(next)) {
                    unload(next);
                }
            }
        }
        if (refCountedContainer.refCount <= 0) {
            this.assetDependencies.remove(str);
        }
    }

    public synchronized boolean update() {
        boolean z = false;
        try {
            if (this.tasks.size == 0) {
                while (this.loadQueue.size != 0 && this.tasks.size == 0) {
                    nextTask();
                }
                if (this.tasks.size == 0) {
                    return true;
                }
            }
            if (updateTask() && this.loadQueue.size == 0 && this.tasks.size == 0) {
                z = true;
            }
            return z;
        } catch (Throwable th) {
            handleTaskError(th);
            return this.loadQueue.size == 0;
        }
    }

    public AssetManager(FileHandleResolver fileHandleResolver) {
        this(fileHandleResolver, true);
    }

    public <T> T finishLoadingAsset(String str) {
        ObjectMap<String, RefCountedContainer> objectMap;
        RefCountedContainer refCountedContainer;
        this.log.debug("Waiting for asset to be loaded: " + str);
        while (true) {
            synchronized (this) {
                try {
                    Class cls = this.assetTypes.get(str);
                    if (cls != null && (objectMap = this.assets.get(cls)) != null && (refCountedContainer = objectMap.get(str)) != null) {
                        this.log.debug("Asset loaded: " + str);
                        return (T) refCountedContainer.object;
                    }
                    update();
                } catch (Throwable th) {
                    throw th;
                }
            }
            ThreadUtils.yield();
        }
    }

    public synchronized <T> T get(String str, Class<T> cls) {
        return (T) get(str, cls, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> AssetLoader getLoader(Class<T> cls, String str) {
        ObjectMap<String, AssetLoader> objectMap = this.loaders.get(cls);
        AssetLoader assetLoader = null;
        if (objectMap != null && objectMap.size >= 1) {
            if (str == null) {
                return objectMap.get("");
            }
            ObjectMap.Entries<String, AssetLoader> it = objectMap.entries().iterator();
            int length = -1;
            while (it.hasNext()) {
                ObjectMap.Entry next = it.next();
                if (((String) next.key).length() > length && str.endsWith((String) next.key)) {
                    assetLoader = (AssetLoader) next.value;
                    length = ((String) next.key).length();
                }
            }
        }
        return assetLoader;
    }

    public synchronized boolean isLoaded(String str) {
        if (str == null) {
            return false;
        }
        return this.assetTypes.containsKey(str);
    }

    public AssetManager(FileHandleResolver fileHandleResolver, boolean z) {
        this.assets = new ObjectMap<>();
        this.assetTypes = new ObjectMap<>();
        this.assetDependencies = new ObjectMap<>();
        this.injected = new ObjectSet<>();
        this.loaders = new ObjectMap<>();
        this.loadQueue = new Array<>();
        this.tasks = new Array<>();
        this.log = new Logger("AssetManager", 0);
        this.resolver = fileHandleResolver;
        if (z) {
            setLoader(BitmapFont.class, new BitmapFontLoader(fileHandleResolver));
            setLoader(Music.class, new MusicLoader(fileHandleResolver));
            setLoader(Pixmap.class, new PixmapLoader(fileHandleResolver));
            setLoader(Sound.class, new SoundLoader(fileHandleResolver));
            setLoader(TextureAtlas.class, new TextureAtlasLoader(fileHandleResolver));
            setLoader(Texture.class, new TextureLoader(fileHandleResolver));
            setLoader(Skin.class, new SkinLoader(fileHandleResolver));
            setLoader(ParticleEffect.class, new ParticleEffectLoader(fileHandleResolver));
            setLoader(com.badlogic.gdx.graphics.g3d.particles.ParticleEffect.class, new com.badlogic.gdx.graphics.g3d.particles.ParticleEffectLoader(fileHandleResolver));
            setLoader(PolygonRegion.class, new PolygonRegionLoader(fileHandleResolver));
            setLoader(I18NBundle.class, new I18NBundleLoader(fileHandleResolver));
            setLoader(Model.class, ".g3dj", new G3dModelLoader(new JsonReader(), fileHandleResolver));
            setLoader(Model.class, ".g3db", new G3dModelLoader(new UBJsonReader(), fileHandleResolver));
            setLoader(Model.class, ".obj", new ObjLoader(fileHandleResolver));
            setLoader(ShaderProgram.class, new ShaderProgramLoader(fileHandleResolver));
            setLoader(Cubemap.class, new CubemapLoader(fileHandleResolver));
        }
        this.executor = new AsyncExecutor(1, "AssetManager");
    }

    @Null
    public synchronized <T> T get(String str, boolean z) {
        ObjectMap<String, RefCountedContainer> objectMap;
        RefCountedContainer refCountedContainer;
        Class cls = this.assetTypes.get(str);
        if (cls != null && (objectMap = this.assets.get(cls)) != null && (refCountedContainer = objectMap.get(str)) != null) {
            return (T) refCountedContainer.object;
        }
        if (!z) {
            return null;
        }
        throw new GdxRuntimeException("Asset not loaded: " + str);
    }

    public synchronized <T> void load(String str, Class<T> cls, AssetLoaderParameters<T> assetLoaderParameters) {
        try {
            if (getLoader(cls, str) != null) {
                int i = 0;
                if (this.loadQueue.size == 0) {
                    this.loaded = 0;
                    this.toLoad = 0;
                    this.peakTasks = 0;
                }
                int i2 = 0;
                while (true) {
                    Array<AssetDescriptor> array = this.loadQueue;
                    if (i2 < array.size) {
                        AssetDescriptor assetDescriptor = array.get(i2);
                        if (assetDescriptor.fileName.equals(str) && !assetDescriptor.type.equals(cls)) {
                            throw new GdxRuntimeException("Asset with name '" + str + "' already in preload queue, but has different type (expected: " + ClassReflection.getSimpleName(cls) + ", found: " + ClassReflection.getSimpleName(assetDescriptor.type) + ")");
                        }
                        i2++;
                    } else {
                        while (true) {
                            Array<AssetLoadingTask> array2 = this.tasks;
                            if (i < array2.size) {
                                AssetDescriptor assetDescriptor2 = array2.get(i).assetDesc;
                                if (assetDescriptor2.fileName.equals(str) && !assetDescriptor2.type.equals(cls)) {
                                    throw new GdxRuntimeException("Asset with name '" + str + "' already in task list, but has different type (expected: " + ClassReflection.getSimpleName(cls) + ", found: " + ClassReflection.getSimpleName(assetDescriptor2.type) + ")");
                                }
                                i++;
                            } else {
                                Class cls2 = this.assetTypes.get(str);
                                if (cls2 != null && !cls2.equals(cls)) {
                                    throw new GdxRuntimeException("Asset with name '" + str + "' already loaded, but has different type (expected: " + ClassReflection.getSimpleName(cls) + ", found: " + ClassReflection.getSimpleName(cls2) + ")");
                                }
                                this.toLoad++;
                                AssetDescriptor assetDescriptor3 = new AssetDescriptor(str, cls, assetLoaderParameters);
                                this.loadQueue.add(assetDescriptor3);
                                this.log.debug("Queued: " + assetDescriptor3);
                            }
                        }
                    }
                }
            } else {
                throw new GdxRuntimeException("No loader for type: " + ClassReflection.getSimpleName(cls));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized <T, P extends AssetLoaderParameters<T>> void setLoader(Class<T> cls, String str, AssetLoader<T, P> assetLoader) {
        try {
            if (cls == null) {
                throw new IllegalArgumentException("type cannot be null.");
            }
            if (assetLoader != null) {
                this.log.debug("Loader set: " + ClassReflection.getSimpleName(cls) + " -> " + ClassReflection.getSimpleName(assetLoader.getClass()));
                ObjectMap<String, AssetLoader> objectMap = this.loaders.get(cls);
                if (objectMap == null) {
                    ObjectMap<Class, ObjectMap<String, AssetLoader>> objectMap2 = this.loaders;
                    ObjectMap<String, AssetLoader> objectMap3 = new ObjectMap<>();
                    objectMap2.put(cls, objectMap3);
                    objectMap = objectMap3;
                }
                if (str == null) {
                    str = "";
                }
                objectMap.put(str, assetLoader);
            } else {
                throw new IllegalArgumentException("loader cannot be null.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean isLoaded(String str, Class cls) {
        ObjectMap<String, RefCountedContainer> objectMap = this.assets.get(cls);
        if (objectMap == null) {
            return false;
        }
        return objectMap.get(str) != null;
    }

    public synchronized boolean contains(String str, Class cls) {
        Array<AssetLoadingTask> array = this.tasks;
        if (array.size > 0) {
            AssetDescriptor assetDescriptor = array.first().assetDesc;
            if (assetDescriptor.type == cls && assetDescriptor.fileName.equals(str)) {
                return true;
            }
        }
        int i = 0;
        while (true) {
            Array<AssetDescriptor> array2 = this.loadQueue;
            if (i < array2.size) {
                AssetDescriptor assetDescriptor2 = array2.get(i);
                if (assetDescriptor2.type == cls && assetDescriptor2.fileName.equals(str)) {
                    return true;
                }
                i++;
            } else {
                return isLoaded(str, cls);
            }
        }
    }

    public boolean update(int i) {
        boolean zUpdate;
        if (Gdx.app.getType() == Application.ApplicationType.WebGL) {
            return update();
        }
        long jMillis = TimeUtils.millis() + ((long) i);
        while (true) {
            zUpdate = update();
            if (zUpdate || TimeUtils.millis() > jMillis) {
                break;
            }
            ThreadUtils.yield();
        }
        return zUpdate;
    }

    @Null
    public synchronized <T> T get(String str, Class<T> cls, boolean z) {
        RefCountedContainer refCountedContainer;
        ObjectMap<String, RefCountedContainer> objectMap = this.assets.get(cls);
        if (objectMap != null && (refCountedContainer = objectMap.get(str)) != null) {
            return (T) refCountedContainer.object;
        }
        if (!z) {
            return null;
        }
        throw new GdxRuntimeException("Asset not loaded: " + str);
    }

    public synchronized <T> T get(AssetDescriptor<T> assetDescriptor) {
        return (T) get(assetDescriptor.fileName, assetDescriptor.type, true);
    }

    public synchronized void load(AssetDescriptor assetDescriptor) {
        load(assetDescriptor.fileName, assetDescriptor.type, assetDescriptor.params);
    }

    public void taskFailed(AssetDescriptor assetDescriptor, RuntimeException runtimeException) {
        throw runtimeException;
    }
}
