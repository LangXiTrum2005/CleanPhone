package com.badlogic.gdx.assets;

import com.badlogic.gdx.assets.loaders.AssetLoader;
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader;
import com.badlogic.gdx.assets.loaders.SynchronousAssetLoader;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.async.AsyncExecutor;
import com.badlogic.gdx.utils.async.AsyncResult;
import com.badlogic.gdx.utils.async.AsyncTask;
import java.lang.reflect.GenericDeclaration;

/* JADX INFO: loaded from: classes.dex */
class AssetLoadingTask implements AsyncTask<Void> {
    volatile Object asset;
    final AssetDescriptor assetDesc;
    volatile boolean asyncDone;
    volatile boolean cancel;
    volatile Array<AssetDescriptor> dependencies;
    volatile boolean dependenciesLoaded;
    volatile AsyncResult<Void> depsFuture;
    final AsyncExecutor executor;
    volatile AsyncResult<Void> loadFuture;
    final AssetLoader loader;
    AssetManager manager;
    final long startTime;

    public AssetLoadingTask(AssetManager assetManager, AssetDescriptor assetDescriptor, AssetLoader assetLoader, AsyncExecutor asyncExecutor) {
        this.manager = assetManager;
        this.assetDesc = assetDescriptor;
        this.loader = assetLoader;
        this.executor = asyncExecutor;
        this.startTime = assetManager.log.getLevel() == 3 ? TimeUtils.nanoTime() : 0L;
    }

    private void handleAsyncLoader() {
        AsynchronousAssetLoader asynchronousAssetLoader = (AsynchronousAssetLoader) this.loader;
        if (!this.dependenciesLoaded) {
            if (this.depsFuture == null) {
                this.depsFuture = this.executor.submit(this);
                return;
            }
            if (this.depsFuture.isDone()) {
                try {
                    this.depsFuture.get();
                    this.dependenciesLoaded = true;
                    if (this.asyncDone) {
                        AssetManager assetManager = this.manager;
                        AssetDescriptor assetDescriptor = this.assetDesc;
                        this.asset = asynchronousAssetLoader.loadSync(assetManager, assetDescriptor.fileName, resolve(this.loader, assetDescriptor), this.assetDesc.params);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    throw new GdxRuntimeException("Couldn't load dependencies of asset: " + this.assetDesc.fileName, e);
                }
            }
            return;
        }
        if (this.loadFuture == null && !this.asyncDone) {
            this.loadFuture = this.executor.submit(this);
            return;
        }
        if (this.asyncDone) {
            AssetManager assetManager2 = this.manager;
            AssetDescriptor assetDescriptor2 = this.assetDesc;
            this.asset = asynchronousAssetLoader.loadSync(assetManager2, assetDescriptor2.fileName, resolve(this.loader, assetDescriptor2), this.assetDesc.params);
        } else if (this.loadFuture.isDone()) {
            try {
                this.loadFuture.get();
                AssetManager assetManager3 = this.manager;
                AssetDescriptor assetDescriptor3 = this.assetDesc;
                this.asset = asynchronousAssetLoader.loadSync(assetManager3, assetDescriptor3.fileName, resolve(this.loader, assetDescriptor3), this.assetDesc.params);
            } catch (Exception e2) {
                throw new GdxRuntimeException("Couldn't load asset: " + this.assetDesc.fileName, e2);
            }
        }
    }

    private void handleSyncLoader() {
        SynchronousAssetLoader synchronousAssetLoader = (SynchronousAssetLoader) this.loader;
        if (this.dependenciesLoaded) {
            AssetManager assetManager = this.manager;
            AssetDescriptor assetDescriptor = this.assetDesc;
            this.asset = synchronousAssetLoader.load(assetManager, assetDescriptor.fileName, resolve(this.loader, assetDescriptor), this.assetDesc.params);
            return;
        }
        this.dependenciesLoaded = true;
        AssetDescriptor assetDescriptor2 = this.assetDesc;
        this.dependencies = synchronousAssetLoader.getDependencies(assetDescriptor2.fileName, resolve(this.loader, assetDescriptor2), this.assetDesc.params);
        if (this.dependencies != null) {
            removeDuplicates(this.dependencies);
            this.manager.injectDependencies(this.assetDesc.fileName, this.dependencies);
        } else {
            AssetManager assetManager2 = this.manager;
            AssetDescriptor assetDescriptor3 = this.assetDesc;
            this.asset = synchronousAssetLoader.load(assetManager2, assetDescriptor3.fileName, resolve(this.loader, assetDescriptor3), this.assetDesc.params);
        }
    }

    private void removeDuplicates(Array<AssetDescriptor> array) {
        boolean z = array.ordered;
        array.ordered = true;
        for (int i = 0; i < array.size; i++) {
            String str = array.get(i).fileName;
            GenericDeclaration genericDeclaration = array.get(i).type;
            for (int i2 = array.size - 1; i2 > i; i2--) {
                if (genericDeclaration == array.get(i2).type && str.equals(array.get(i2).fileName)) {
                    array.removeIndex(i2);
                }
            }
        }
        array.ordered = z;
    }

    private FileHandle resolve(AssetLoader assetLoader, AssetDescriptor assetDescriptor) {
        if (assetDescriptor.file == null) {
            assetDescriptor.file = assetLoader.resolve(assetDescriptor.fileName);
        }
        return assetDescriptor.file;
    }

    public void unload() {
        AssetLoader assetLoader = this.loader;
        if (assetLoader instanceof AsynchronousAssetLoader) {
            AssetManager assetManager = this.manager;
            AssetDescriptor assetDescriptor = this.assetDesc;
            ((AsynchronousAssetLoader) assetLoader).unloadAsync(assetManager, assetDescriptor.fileName, resolve(assetLoader, assetDescriptor), this.assetDesc.params);
        }
    }

    public boolean update() {
        if (this.loader instanceof SynchronousAssetLoader) {
            handleSyncLoader();
        } else {
            handleAsyncLoader();
        }
        return this.asset != null;
    }

    @Override // com.badlogic.gdx.utils.async.AsyncTask
    public Void call() throws Exception {
        if (this.cancel) {
            return null;
        }
        AsynchronousAssetLoader asynchronousAssetLoader = (AsynchronousAssetLoader) this.loader;
        if (this.dependenciesLoaded) {
            AssetManager assetManager = this.manager;
            AssetDescriptor assetDescriptor = this.assetDesc;
            asynchronousAssetLoader.loadAsync(assetManager, assetDescriptor.fileName, resolve(this.loader, assetDescriptor), this.assetDesc.params);
            this.asyncDone = true;
        } else {
            AssetDescriptor assetDescriptor2 = this.assetDesc;
            this.dependencies = asynchronousAssetLoader.getDependencies(assetDescriptor2.fileName, resolve(this.loader, assetDescriptor2), this.assetDesc.params);
            if (this.dependencies != null) {
                removeDuplicates(this.dependencies);
                this.manager.injectDependencies(this.assetDesc.fileName, this.dependencies);
            } else {
                AssetManager assetManager2 = this.manager;
                AssetDescriptor assetDescriptor3 = this.assetDesc;
                asynchronousAssetLoader.loadAsync(assetManager2, assetDescriptor3.fileName, resolve(this.loader, assetDescriptor3), this.assetDesc.params);
                this.asyncDone = true;
            }
        }
        return null;
    }
}
