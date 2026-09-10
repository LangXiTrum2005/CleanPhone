package com.badlogic.gdx.assets.loaders;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.ModelLoader.ModelParameters;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.model.data.ModelData;
import com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial;
import com.badlogic.gdx.graphics.g3d.model.data.ModelTexture;
import com.badlogic.gdx.graphics.g3d.utils.TextureProvider;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.ObjectMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ModelLoader<P extends ModelParameters> extends AsynchronousAssetLoader<Model, P> {
    protected ModelParameters defaultParameters;
    protected Array<ObjectMap.Entry<String, ModelData>> items;

    public static class ModelParameters extends AssetLoaderParameters<Model> {
        public TextureLoader.TextureParameter textureParameter;

        public ModelParameters() {
            TextureLoader.TextureParameter textureParameter = new TextureLoader.TextureParameter();
            this.textureParameter = textureParameter;
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Linear;
            textureParameter.magFilter = textureFilter;
            textureParameter.minFilter = textureFilter;
            Texture.TextureWrap textureWrap = Texture.TextureWrap.Repeat;
            textureParameter.wrapV = textureWrap;
            textureParameter.wrapU = textureWrap;
        }
    }

    public ModelLoader(FileHandleResolver fileHandleResolver) {
        super(fileHandleResolver);
        this.items = new Array<>();
        this.defaultParameters = new ModelParameters();
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public void loadAsync(AssetManager assetManager, String str, FileHandle fileHandle, P p) {
    }

    public Model loadModel(FileHandle fileHandle, TextureProvider textureProvider, P p) {
        ModelData modelDataLoadModelData = loadModelData(fileHandle, p);
        if (modelDataLoadModelData == null) {
            return null;
        }
        return new Model(modelDataLoadModelData, textureProvider);
    }

    public ModelData loadModelData(FileHandle fileHandle) {
        return loadModelData(fileHandle, null);
    }

    public abstract ModelData loadModelData(FileHandle fileHandle, P p);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [V, com.badlogic.gdx.graphics.g3d.model.data.ModelData] */
    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public Array<AssetDescriptor> getDependencies(String str, FileHandle fileHandle, P p) {
        Array<AssetDescriptor> array = new Array<>();
        ?? LoadModelData = loadModelData(fileHandle, p);
        if (LoadModelData == 0) {
            return array;
        }
        ObjectMap.Entry<String, ModelData> entry = new ObjectMap.Entry<>();
        entry.key = str;
        entry.value = LoadModelData;
        synchronized (this.items) {
            this.items.add(entry);
        }
        TextureLoader.TextureParameter textureParameter = p != null ? p.textureParameter : this.defaultParameters.textureParameter;
        Array.ArrayIterator<ModelMaterial> it = LoadModelData.materials.iterator();
        while (it.hasNext()) {
            Array<ModelTexture> array2 = it.next().textures;
            if (array2 != null) {
                Array.ArrayIterator<ModelTexture> it2 = array2.iterator();
                while (it2.hasNext()) {
                    array.add(new AssetDescriptor(it2.next().fileName, Texture.class, textureParameter));
                }
            }
        }
        return array;
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public Model loadSync(AssetManager assetManager, String str, FileHandle fileHandle, P p) {
        ModelData modelData;
        synchronized (this.items) {
            int i = 0;
            modelData = null;
            while (true) {
                try {
                    Array<ObjectMap.Entry<String, ModelData>> array = this.items;
                    if (i >= array.size) {
                        break;
                    }
                    if (array.get(i).key.equals(str)) {
                        modelData = this.items.get(i).value;
                        this.items.removeIndex(i);
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (modelData == null) {
            return null;
        }
        Model model = new Model(modelData, new TextureProvider.AssetTextureProvider(assetManager));
        Iterator<Disposable> it = model.getManagedDisposables().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof Texture) {
                it.remove();
            }
        }
        return model;
    }

    public Model loadModel(FileHandle fileHandle, P p) {
        return loadModel(fileHandle, new TextureProvider.FileTextureProvider(), p);
    }

    public Model loadModel(FileHandle fileHandle, TextureProvider textureProvider) {
        return loadModel(fileHandle, textureProvider, null);
    }

    public Model loadModel(FileHandle fileHandle) {
        return loadModel(fileHandle, new TextureProvider.FileTextureProvider(), null);
    }
}
