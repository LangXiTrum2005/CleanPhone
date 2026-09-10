package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonWriter;
import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.reflect.ClassReflection;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ParticleEffectLoader extends AsynchronousAssetLoader<ParticleEffect, ParticleEffectLoadParameter> {
    protected Array<ObjectMap.Entry<String, ResourceData<ParticleEffect>>> items;

    public static class ParticleEffectLoadParameter extends AssetLoaderParameters<ParticleEffect> {
        Array<ParticleBatch<?>> batches;

        public ParticleEffectLoadParameter(Array<ParticleBatch<?>> array) {
            this.batches = array;
        }
    }

    public static class ParticleEffectSaveParameter extends AssetLoaderParameters<ParticleEffect> {
        Array<ParticleBatch<?>> batches;
        FileHandle file;
        JsonWriter.OutputType jsonOutputType;
        AssetManager manager;
        boolean prettyPrint;

        public ParticleEffectSaveParameter(FileHandle fileHandle, AssetManager assetManager, Array<ParticleBatch<?>> array) {
            this(fileHandle, assetManager, array, JsonWriter.OutputType.minimal, false);
        }

        public ParticleEffectSaveParameter(FileHandle fileHandle, AssetManager assetManager, Array<ParticleBatch<?>> array, JsonWriter.OutputType outputType, boolean z) {
            this.batches = array;
            this.file = fileHandle;
            this.manager = assetManager;
            this.jsonOutputType = outputType;
            this.prettyPrint = z;
        }
    }

    public ParticleEffectLoader(FileHandleResolver fileHandleResolver) {
        super(fileHandleResolver);
        this.items = new Array<>();
    }

    private <T> T find(Array<?> array, Class<T> cls) {
        Array.ArrayIterator<?> it = array.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (ClassReflection.isAssignableFrom(cls, t.getClass())) {
                return t;
            }
        }
        return null;
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public void loadAsync(AssetManager assetManager, String str, FileHandle fileHandle, ParticleEffectLoadParameter particleEffectLoadParameter) {
    }

    public void save(ParticleEffect particleEffect, ParticleEffectSaveParameter particleEffectSaveParameter) throws IOException {
        ResourceData resourceData = new ResourceData(particleEffect);
        particleEffect.save(particleEffectSaveParameter.manager, resourceData);
        Array<ParticleBatch<?>> array = particleEffectSaveParameter.batches;
        if (array != null) {
            Array.ArrayIterator<ParticleBatch<?>> it = array.iterator();
            while (it.hasNext()) {
                ParticleBatch<?> next = it.next();
                Array.ArrayIterator<ParticleController> it2 = particleEffect.getControllers().iterator();
                while (it2.hasNext()) {
                    if (it2.next().renderer.isCompatible(next)) {
                        next.save(particleEffectSaveParameter.manager, resourceData);
                        break;
                    }
                }
            }
        }
        Json json = new Json(particleEffectSaveParameter.jsonOutputType);
        if (!particleEffectSaveParameter.prettyPrint) {
            json.toJson(resourceData, particleEffectSaveParameter.file);
        } else {
            particleEffectSaveParameter.file.writeString(json.prettyPrint(resourceData), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [V, com.badlogic.gdx.graphics.g3d.particles.ResourceData] */
    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public Array<AssetDescriptor> getDependencies(String str, FileHandle fileHandle, ParticleEffectLoadParameter particleEffectLoadParameter) {
        Array<ResourceData.AssetData> assets;
        ?? r0 = (ResourceData) new Json().fromJson(ResourceData.class, fileHandle);
        synchronized (this.items) {
            ObjectMap.Entry<String, ResourceData<ParticleEffect>> entry = new ObjectMap.Entry<>();
            entry.key = str;
            entry.value = r0;
            this.items.add(entry);
            assets = r0.getAssets();
        }
        Array<AssetDescriptor> array = new Array<>();
        Array.ArrayIterator<ResourceData.AssetData> it = assets.iterator();
        while (it.hasNext()) {
            ResourceData.AssetData next = it.next();
            if (!resolve(next.filename).exists()) {
                next.filename = fileHandle.parent().child(Gdx.files.internal(next.filename).name()).path();
            }
            Class<T> cls = next.type;
            if (cls == ParticleEffect.class) {
                array.add(new AssetDescriptor(next.filename, cls, particleEffectLoadParameter));
            } else {
                array.add(new AssetDescriptor(next.filename, cls));
            }
        }
        return array;
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public ParticleEffect loadSync(AssetManager assetManager, String str, FileHandle fileHandle, ParticleEffectLoadParameter particleEffectLoadParameter) {
        ResourceData<ParticleEffect> resourceData;
        synchronized (this.items) {
            int i = 0;
            while (true) {
                try {
                    Array<ObjectMap.Entry<String, ResourceData<ParticleEffect>>> array = this.items;
                    if (i >= array.size) {
                        resourceData = null;
                        break;
                    }
                    ObjectMap.Entry<String, ResourceData<ParticleEffect>> entry = array.get(i);
                    if (entry.key.equals(str)) {
                        resourceData = entry.value;
                        this.items.removeIndex(i);
                        break;
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        resourceData.resource.load(assetManager, resourceData);
        if (particleEffectLoadParameter != null) {
            Array<ParticleBatch<?>> array2 = particleEffectLoadParameter.batches;
            if (array2 != null) {
                Array.ArrayIterator<ParticleBatch<?>> it = array2.iterator();
                while (it.hasNext()) {
                    it.next().load(assetManager, resourceData);
                }
            }
            resourceData.resource.setBatch(particleEffectLoadParameter.batches);
        }
        return resourceData.resource;
    }
}
