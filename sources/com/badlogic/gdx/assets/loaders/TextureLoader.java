package com.badlogic.gdx.assets.loaders;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.utils.Array;

/* JADX INFO: loaded from: classes.dex */
public class TextureLoader extends AsynchronousAssetLoader<Texture, TextureParameter> {
    TextureLoaderInfo info;

    public static class TextureLoaderInfo {
        TextureData data;
        String filename;
        Texture texture;
    }

    public static class TextureParameter extends AssetLoaderParameters<Texture> {
        public Texture.TextureFilter magFilter;
        public Texture.TextureFilter minFilter;
        public Texture.TextureWrap wrapU;
        public Texture.TextureWrap wrapV;
        public Pixmap.Format format = null;
        public boolean genMipMaps = false;
        public Texture texture = null;
        public TextureData textureData = null;

        public TextureParameter() {
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
            this.minFilter = textureFilter;
            this.magFilter = textureFilter;
            Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
            this.wrapU = textureWrap;
            this.wrapV = textureWrap;
        }
    }

    public TextureLoader(FileHandleResolver fileHandleResolver) {
        super(fileHandleResolver);
        this.info = new TextureLoaderInfo();
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public Array<AssetDescriptor> getDependencies(String str, FileHandle fileHandle, TextureParameter textureParameter) {
        return null;
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public void loadAsync(AssetManager assetManager, String str, FileHandle fileHandle, TextureParameter textureParameter) {
        boolean z;
        TextureData textureData;
        TextureLoaderInfo textureLoaderInfo = this.info;
        textureLoaderInfo.filename = str;
        if (textureParameter == null || (textureData = textureParameter.textureData) == null) {
            Pixmap.Format format = null;
            textureLoaderInfo.texture = null;
            if (textureParameter != null) {
                format = textureParameter.format;
                z = textureParameter.genMipMaps;
                textureLoaderInfo.texture = textureParameter.texture;
            } else {
                z = false;
            }
            textureLoaderInfo.data = TextureData.Factory.loadFromFile(fileHandle, format, z);
        } else {
            textureLoaderInfo.data = textureData;
            textureLoaderInfo.texture = textureParameter.texture;
        }
        if (this.info.data.isPrepared()) {
            return;
        }
        this.info.data.prepare();
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public Texture loadSync(AssetManager assetManager, String str, FileHandle fileHandle, TextureParameter textureParameter) {
        TextureLoaderInfo textureLoaderInfo = this.info;
        if (textureLoaderInfo == null) {
            return null;
        }
        Texture texture = textureLoaderInfo.texture;
        if (texture != null) {
            texture.load(textureLoaderInfo.data);
        } else {
            texture = new Texture(this.info.data);
        }
        if (textureParameter != null) {
            texture.setFilter(textureParameter.minFilter, textureParameter.magFilter);
            texture.setWrap(textureParameter.wrapU, textureParameter.wrapV);
        }
        return texture;
    }
}
