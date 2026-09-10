package com.badlogic.gdx.assets.loaders;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ObjectMap;

/* JADX INFO: loaded from: classes.dex */
public class SkinLoader extends AsynchronousAssetLoader<Skin, SkinParameter> {

    public static class SkinParameter extends AssetLoaderParameters<Skin> {
        public final ObjectMap<String, Object> resources;
        public final String textureAtlasPath;

        public SkinParameter() {
            this(null, null);
        }

        public SkinParameter(ObjectMap<String, Object> objectMap) {
            this(null, objectMap);
        }

        public SkinParameter(String str) {
            this(str, null);
        }

        public SkinParameter(String str, ObjectMap<String, Object> objectMap) {
            this.textureAtlasPath = str;
            this.resources = objectMap;
        }
    }

    public SkinLoader(FileHandleResolver fileHandleResolver) {
        super(fileHandleResolver);
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public void loadAsync(AssetManager assetManager, String str, FileHandle fileHandle, SkinParameter skinParameter) {
    }

    public Skin newSkin(TextureAtlas textureAtlas) {
        return new Skin(textureAtlas);
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public Array<AssetDescriptor> getDependencies(String str, FileHandle fileHandle, SkinParameter skinParameter) {
        String str2;
        Array<AssetDescriptor> array = new Array<>();
        if (skinParameter == null || (str2 = skinParameter.textureAtlasPath) == null) {
            array.add(new AssetDescriptor(fileHandle.pathWithoutExtension() + ".atlas", TextureAtlas.class));
        } else if (str2 != null) {
            array.add(new AssetDescriptor(str2, TextureAtlas.class));
        }
        return array;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public Skin loadSync(AssetManager assetManager, String str, FileHandle fileHandle, SkinParameter skinParameter) {
        String str2 = fileHandle.pathWithoutExtension() + ".atlas";
        ObjectMap<String, Object> objectMap = null;
        if (skinParameter != null) {
            String str3 = skinParameter.textureAtlasPath;
            if (str3 != null) {
                str2 = str3;
            }
            ObjectMap<String, Object> objectMap2 = skinParameter.resources;
            if (objectMap2 != null) {
                objectMap = objectMap2;
            }
        }
        Skin skinNewSkin = newSkin((TextureAtlas) assetManager.get(str2, TextureAtlas.class));
        if (objectMap != null) {
            ObjectMap.Entries<String, Object> it = objectMap.entries().iterator();
            while (it.hasNext()) {
                ObjectMap.Entry next = it.next();
                skinNewSkin.add((String) next.key, next.value);
            }
        }
        skinNewSkin.load(fileHandle);
        return skinNewSkin;
    }
}
