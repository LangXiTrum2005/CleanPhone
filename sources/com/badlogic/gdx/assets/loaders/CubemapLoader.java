package com.badlogic.gdx.assets.loaders;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Cubemap;
import com.badlogic.gdx.graphics.CubemapData;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.KTXTextureData;
import com.badlogic.gdx.utils.Array;

/* JADX INFO: loaded from: classes.dex */
public class CubemapLoader extends AsynchronousAssetLoader<Cubemap, CubemapParameter> {
    CubemapLoaderInfo info;

    public static class CubemapLoaderInfo {
        Cubemap cubemap;
        CubemapData data;
        String filename;
    }

    public static class CubemapParameter extends AssetLoaderParameters<Cubemap> {
        public Texture.TextureFilter magFilter;
        public Texture.TextureFilter minFilter;
        public Texture.TextureWrap wrapU;
        public Texture.TextureWrap wrapV;
        public Pixmap.Format format = null;
        public Cubemap cubemap = null;
        public CubemapData cubemapData = null;

        public CubemapParameter() {
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
            this.minFilter = textureFilter;
            this.magFilter = textureFilter;
            Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
            this.wrapU = textureWrap;
            this.wrapV = textureWrap;
        }
    }

    public CubemapLoader(FileHandleResolver fileHandleResolver) {
        super(fileHandleResolver);
        this.info = new CubemapLoaderInfo();
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public Array<AssetDescriptor> getDependencies(String str, FileHandle fileHandle, CubemapParameter cubemapParameter) {
        return null;
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public void loadAsync(AssetManager assetManager, String str, FileHandle fileHandle, CubemapParameter cubemapParameter) {
        CubemapData cubemapData;
        CubemapLoaderInfo cubemapLoaderInfo = this.info;
        cubemapLoaderInfo.filename = str;
        if (cubemapParameter == null || (cubemapData = cubemapParameter.cubemapData) == null) {
            cubemapLoaderInfo.cubemap = null;
            if (cubemapParameter != null) {
                cubemapLoaderInfo.cubemap = cubemapParameter.cubemap;
            }
            if (str.contains(".ktx") || str.contains(".zktx")) {
                this.info.data = new KTXTextureData(fileHandle, false);
            }
        } else {
            cubemapLoaderInfo.data = cubemapData;
            cubemapLoaderInfo.cubemap = cubemapParameter.cubemap;
        }
        if (this.info.data.isPrepared()) {
            return;
        }
        this.info.data.prepare();
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public Cubemap loadSync(AssetManager assetManager, String str, FileHandle fileHandle, CubemapParameter cubemapParameter) {
        CubemapLoaderInfo cubemapLoaderInfo = this.info;
        if (cubemapLoaderInfo == null) {
            return null;
        }
        Cubemap cubemap = cubemapLoaderInfo.cubemap;
        if (cubemap != null) {
            cubemap.load(cubemapLoaderInfo.data);
        } else {
            cubemap = new Cubemap(this.info.data);
        }
        if (cubemapParameter != null) {
            cubemap.setFilter(cubemapParameter.minFilter, cubemapParameter.magFilter);
            cubemap.setWrap(cubemapParameter.wrapU, cubemapParameter.wrapV);
        }
        return cubemap;
    }
}
