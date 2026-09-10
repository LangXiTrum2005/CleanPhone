package com.badlogic.gdx.maps;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ObjectMap;

/* JADX INFO: loaded from: classes.dex */
public interface ImageResolver {

    public static class AssetManagerImageResolver implements ImageResolver {
        private final AssetManager assetManager;

        public AssetManagerImageResolver(AssetManager assetManager) {
            this.assetManager = assetManager;
        }

        @Override // com.badlogic.gdx.maps.ImageResolver
        public TextureRegion getImage(String str) {
            return new TextureRegion((Texture) this.assetManager.get(str, Texture.class));
        }
    }

    public static class DirectImageResolver implements ImageResolver {
        private final ObjectMap<String, Texture> images;

        public DirectImageResolver(ObjectMap<String, Texture> objectMap) {
            this.images = objectMap;
        }

        @Override // com.badlogic.gdx.maps.ImageResolver
        public TextureRegion getImage(String str) {
            return new TextureRegion(this.images.get(str));
        }
    }

    public static class TextureAtlasImageResolver implements ImageResolver {
        private final TextureAtlas atlas;

        public TextureAtlasImageResolver(TextureAtlas textureAtlas) {
            this.atlas = textureAtlas;
        }

        @Override // com.badlogic.gdx.maps.ImageResolver
        public TextureRegion getImage(String str) {
            return this.atlas.findRegion(str);
        }
    }

    TextureRegion getImage(String str);
}
