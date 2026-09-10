package com.badlogic.gdx.assets.loaders;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes.dex */
public class BitmapFontLoader extends AsynchronousAssetLoader<BitmapFont, BitmapFontParameter> {
    BitmapFont.BitmapFontData data;

    public static class BitmapFontParameter extends AssetLoaderParameters<BitmapFont> {
        public String atlasName;
        public BitmapFont.BitmapFontData bitmapFontData;
        public boolean flip = false;
        public boolean genMipMaps = false;
        public Texture.TextureFilter magFilter;
        public Texture.TextureFilter minFilter;

        public BitmapFontParameter() {
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
            this.minFilter = textureFilter;
            this.magFilter = textureFilter;
            this.bitmapFontData = null;
            this.atlasName = null;
        }
    }

    public BitmapFontLoader(FileHandleResolver fileHandleResolver) {
        super(fileHandleResolver);
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public void loadAsync(AssetManager assetManager, String str, FileHandle fileHandle, BitmapFontParameter bitmapFontParameter) {
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public Array<AssetDescriptor> getDependencies(String str, FileHandle fileHandle, BitmapFontParameter bitmapFontParameter) {
        String str2;
        BitmapFont.BitmapFontData bitmapFontData;
        Array<AssetDescriptor> array = new Array<>();
        if (bitmapFontParameter != null && (bitmapFontData = bitmapFontParameter.bitmapFontData) != null) {
            this.data = bitmapFontData;
            return array;
        }
        this.data = new BitmapFont.BitmapFontData(fileHandle, bitmapFontParameter != null && bitmapFontParameter.flip);
        if (bitmapFontParameter == null || (str2 = bitmapFontParameter.atlasName) == null) {
            for (int i = 0; i < this.data.getImagePaths().length; i++) {
                FileHandle fileHandleResolve = resolve(this.data.getImagePath(i));
                TextureLoader.TextureParameter textureParameter = new TextureLoader.TextureParameter();
                if (bitmapFontParameter != null) {
                    textureParameter.genMipMaps = bitmapFontParameter.genMipMaps;
                    textureParameter.minFilter = bitmapFontParameter.minFilter;
                    textureParameter.magFilter = bitmapFontParameter.magFilter;
                }
                array.add(new AssetDescriptor(fileHandleResolve, Texture.class, textureParameter));
            }
        } else {
            array.add(new AssetDescriptor(str2, TextureAtlas.class));
        }
        return array;
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public BitmapFont loadSync(AssetManager assetManager, String str, FileHandle fileHandle, BitmapFontParameter bitmapFontParameter) {
        String str2;
        if (bitmapFontParameter == null || (str2 = bitmapFontParameter.atlasName) == null) {
            int length = this.data.getImagePaths().length;
            Array array = new Array(length);
            for (int i = 0; i < length; i++) {
                array.add(new TextureRegion((Texture) assetManager.get(this.data.getImagePath(i), Texture.class)));
            }
            return new BitmapFont(this.data, (Array<TextureRegion>) array, true);
        }
        TextureAtlas textureAtlas = (TextureAtlas) assetManager.get(str2, TextureAtlas.class);
        String string = fileHandle.sibling(this.data.imagePaths[0]).nameWithoutExtension().toString();
        TextureAtlas.AtlasRegion atlasRegionFindRegion = textureAtlas.findRegion(string);
        if (atlasRegionFindRegion != null) {
            return new BitmapFont(fileHandle, atlasRegionFindRegion);
        }
        StringBuilder sbU = AbstractC3950lJ.u("Could not find font region ", string, " in atlas ");
        sbU.append(bitmapFontParameter.atlasName);
        throw new GdxRuntimeException(sbU.toString());
    }
}
