package com.badlogic.gdx.maps.tiled.renderers;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapImageLayer;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.math.Rectangle;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class IsometricStaggeredTiledMapRenderer extends BatchTiledMapRenderer {
    public IsometricStaggeredTiledMapRenderer(TiledMap tiledMap) {
        super(tiledMap);
    }

    @Override // com.badlogic.gdx.maps.tiled.renderers.BatchTiledMapRenderer, com.badlogic.gdx.maps.tiled.TiledMapRenderer
    public void renderImageLayer(TiledMapImageLayer tiledMapImageLayer) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float imageLayerColor = getImageLayerColor(tiledMapImageLayer, this.batch.getColor());
        float[] fArr = this.vertices;
        TextureRegion textureRegion = tiledMapImageLayer.getTextureRegion();
        if (textureRegion == null) {
            return;
        }
        float fIntValue = ((Integer) getMap().getProperties().get("tilewidth", Integer.class)).intValue() * 0.5f * this.unitScale;
        float x = tiledMapImageLayer.getX();
        float y = tiledMapImageLayer.getY();
        float parallaxX = ((x * this.unitScale) - ((tiledMapImageLayer.getParallaxX() - 1.0f) * this.viewBounds.x)) - fIntValue;
        float parallaxY = (y * this.unitScale) - ((tiledMapImageLayer.getParallaxY() - 1.0f) * this.viewBounds.y);
        float regionWidth = (textureRegion.getRegionWidth() * this.unitScale) + parallaxX;
        float regionHeight = (textureRegion.getRegionHeight() * this.unitScale) + parallaxY;
        this.imageBounds.set(parallaxX, parallaxY, regionWidth - parallaxX, regionHeight - parallaxY);
        if (!tiledMapImageLayer.isRepeatX() && !tiledMapImageLayer.isRepeatY()) {
            if (this.viewBounds.contains(this.imageBounds) || this.viewBounds.overlaps(this.imageBounds)) {
                float u = textureRegion.getU();
                float v2 = textureRegion.getV2();
                float u2 = textureRegion.getU2();
                float v = textureRegion.getV();
                fArr[0] = parallaxX;
                fArr[1] = parallaxY;
                fArr[2] = imageLayerColor;
                fArr[3] = u;
                fArr[4] = v2;
                fArr[5] = parallaxX;
                fArr[6] = regionHeight;
                fArr[7] = imageLayerColor;
                fArr[8] = u;
                fArr[9] = v;
                fArr[10] = regionWidth;
                fArr[11] = regionHeight;
                fArr[12] = imageLayerColor;
                fArr[13] = u2;
                fArr[14] = v;
                fArr[15] = regionWidth;
                fArr[16] = parallaxY;
                fArr[17] = imageLayerColor;
                fArr[18] = u2;
                fArr[19] = v2;
                this.batch.draw(textureRegion.getTexture(), fArr, 0, 20);
                return;
            }
            return;
        }
        int iCeil = tiledMapImageLayer.isRepeatX() ? (int) Math.ceil((this.viewBounds.width / this.imageBounds.width) + 4.0f) : 0;
        int iCeil2 = tiledMapImageLayer.isRepeatY() ? (int) Math.ceil((this.viewBounds.height / this.imageBounds.height) + 4.0f) : 0;
        Rectangle rectangle = this.viewBounds;
        float f6 = rectangle.x;
        float f7 = rectangle.y;
        Rectangle rectangle2 = this.imageBounds;
        float f8 = f6 - (f6 % rectangle2.width);
        float f9 = f7 - (f7 % rectangle2.height);
        int i = 0;
        while (i <= iCeil) {
            int i2 = 0;
            while (i2 <= iCeil2) {
                if (tiledMapImageLayer.isRepeatX()) {
                    float f10 = this.imageBounds.width;
                    float f11 = (parallaxX % f10) + ((i - 2) * f10) + f8;
                    f = f11 + f10;
                    f2 = f11;
                } else {
                    f = regionWidth;
                    f2 = parallaxX;
                }
                if (tiledMapImageLayer.isRepeatY()) {
                    float f12 = this.imageBounds.height;
                    float f13 = (parallaxY % f12) + ((i2 - 2) * f12) + f9;
                    f5 = f13 + f12;
                    f3 = f13;
                    f4 = parallaxY;
                } else {
                    f3 = parallaxY;
                    f4 = f3;
                    f5 = regionHeight;
                }
                float f14 = regionHeight;
                int i3 = iCeil;
                this.repeatedImageBounds.set(f2, f3, f - f2, f5 - f3);
                if (this.viewBounds.contains(this.repeatedImageBounds) || this.viewBounds.overlaps(this.repeatedImageBounds)) {
                    float u3 = textureRegion.getU();
                    float v3 = textureRegion.getV2();
                    float u4 = textureRegion.getU2();
                    float v4 = textureRegion.getV();
                    fArr[0] = f2;
                    fArr[1] = f3;
                    fArr[2] = imageLayerColor;
                    fArr[3] = u3;
                    fArr[4] = v3;
                    fArr[5] = f2;
                    fArr[6] = f5;
                    fArr[7] = imageLayerColor;
                    fArr[8] = u3;
                    fArr[9] = v4;
                    fArr[10] = f;
                    fArr[11] = f5;
                    fArr[12] = imageLayerColor;
                    fArr[13] = u4;
                    fArr[14] = v4;
                    fArr[15] = f;
                    fArr[16] = f3;
                    fArr[17] = imageLayerColor;
                    fArr[18] = u4;
                    fArr[19] = v3;
                    this.batch.draw(textureRegion.getTexture(), fArr, 0, 20);
                }
                i2++;
                regionWidth = regionWidth;
                parallaxX = parallaxX;
                parallaxY = f4;
                regionHeight = f14;
                iCeil = i3;
            }
            i++;
            regionWidth = regionWidth;
            parallaxX = parallaxX;
            parallaxY = parallaxY;
            iCeil = iCeil;
        }
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapRenderer
    public void renderTileLayer(TiledMapTileLayer tiledMapTileLayer) {
        TiledMapTile tile;
        TiledMapTileLayer tiledMapTileLayer2 = tiledMapTileLayer;
        float tileLayerColor = getTileLayerColor(tiledMapTileLayer2, this.batch.getColor());
        int width = tiledMapTileLayer.getWidth();
        int height = tiledMapTileLayer.getHeight();
        float renderOffsetX = (tiledMapTileLayer.getRenderOffsetX() * this.unitScale) - ((tiledMapTileLayer.getParallaxX() - 1.0f) * this.viewBounds.x);
        float parallaxY = ((-tiledMapTileLayer.getRenderOffsetY()) * this.unitScale) - ((tiledMapTileLayer.getParallaxY() - 1.0f) * this.viewBounds.y);
        float tileWidth = tiledMapTileLayer.getTileWidth() * this.unitScale;
        float tileHeight = tiledMapTileLayer.getTileHeight() * this.unitScale;
        float f = tileWidth * 0.5f;
        float f2 = 0.5f * tileHeight;
        int iMax = Math.max(0, (int) (((this.viewBounds.x - f) - renderOffsetX) / tileWidth));
        Rectangle rectangle = this.viewBounds;
        int iMin = Math.min(width, (int) (((((rectangle.x + rectangle.width) + tileWidth) + f) - renderOffsetX) / tileWidth));
        int iMax2 = Math.max(0, (int) (((this.viewBounds.y - tileHeight) - parallaxY) / tileHeight));
        Rectangle rectangle2 = this.viewBounds;
        int iMin2 = Math.min(height, (int) ((((rectangle2.y + rectangle2.height) + tileHeight) - parallaxY) / f2));
        int i = 1;
        int i2 = iMin2 - 1;
        while (i2 >= iMax2) {
            float f3 = i2 % 2 == i ? f : 0.0f;
            int i3 = iMin - 1;
            while (i3 >= iMax) {
                TiledMapTileLayer.Cell cell = tiledMapTileLayer2.getCell(i3, i2);
                if (cell != null && (tile = cell.getTile()) != null) {
                    boolean flipHorizontally = cell.getFlipHorizontally();
                    boolean flipVertically = cell.getFlipVertically();
                    int rotation = cell.getRotation();
                    TextureRegion textureRegion = tile.getTextureRegion();
                    float fD = AbstractC5044xl.d(tile.getOffsetX(), this.unitScale, (i3 * tileWidth) - f3, renderOffsetX);
                    float fD2 = AbstractC5044xl.d(tile.getOffsetY(), this.unitScale, i2 * f2, parallaxY);
                    float regionWidth = (textureRegion.getRegionWidth() * this.unitScale) + fD;
                    float regionHeight = (textureRegion.getRegionHeight() * this.unitScale) + fD2;
                    float u = textureRegion.getU();
                    float v2 = textureRegion.getV2();
                    float u2 = textureRegion.getU2();
                    float v = textureRegion.getV();
                    float[] fArr = this.vertices;
                    fArr[0] = fD;
                    fArr[1] = fD2;
                    fArr[2] = tileLayerColor;
                    fArr[3] = u;
                    fArr[4] = v2;
                    fArr[5] = fD;
                    fArr[6] = regionHeight;
                    fArr[7] = tileLayerColor;
                    fArr[8] = u;
                    fArr[9] = v;
                    fArr[10] = regionWidth;
                    fArr[11] = regionHeight;
                    fArr[12] = tileLayerColor;
                    fArr[13] = u2;
                    fArr[14] = v;
                    fArr[15] = regionWidth;
                    fArr[16] = fD2;
                    fArr[17] = tileLayerColor;
                    fArr[18] = u2;
                    fArr[19] = v2;
                    if (flipHorizontally) {
                        fArr[3] = u2;
                        fArr[13] = u;
                        fArr[8] = u2;
                        fArr[18] = u;
                    }
                    if (flipVertically) {
                        fArr[4] = v;
                        fArr[14] = v2;
                        fArr[9] = v2;
                        fArr[19] = v;
                    }
                    if (rotation != 0) {
                        if (rotation == 1) {
                            float f4 = fArr[4];
                            fArr[4] = fArr[9];
                            fArr[9] = fArr[14];
                            fArr[14] = fArr[19];
                            fArr[19] = f4;
                            float f5 = fArr[3];
                            fArr[3] = fArr[8];
                            fArr[8] = fArr[13];
                            fArr[13] = fArr[18];
                            fArr[18] = f5;
                        } else if (rotation == 2) {
                            float f6 = fArr[3];
                            fArr[3] = fArr[13];
                            fArr[13] = f6;
                            float f7 = fArr[8];
                            fArr[8] = fArr[18];
                            fArr[18] = f7;
                            float f8 = fArr[4];
                            fArr[4] = fArr[14];
                            fArr[14] = f8;
                            float f9 = fArr[9];
                            fArr[9] = fArr[19];
                            fArr[19] = f9;
                        } else if (rotation == 3) {
                            float f10 = fArr[4];
                            fArr[4] = fArr[19];
                            fArr[19] = fArr[14];
                            fArr[14] = fArr[9];
                            fArr[9] = f10;
                            float f11 = fArr[3];
                            fArr[3] = fArr[18];
                            fArr[18] = fArr[13];
                            fArr[13] = fArr[8];
                            fArr[8] = f11;
                        }
                    }
                    this.batch.draw(textureRegion.getTexture(), this.vertices, 0, 20);
                }
                i3--;
                tiledMapTileLayer2 = tiledMapTileLayer;
                renderOffsetX = renderOffsetX;
                iMin = iMin;
                parallaxY = parallaxY;
                tileWidth = tileWidth;
                f2 = f2;
            }
            i2--;
            tiledMapTileLayer2 = tiledMapTileLayer;
            tileWidth = tileWidth;
            i = 1;
        }
    }

    public IsometricStaggeredTiledMapRenderer(TiledMap tiledMap, Batch batch) {
        super(tiledMap, batch);
    }

    public IsometricStaggeredTiledMapRenderer(TiledMap tiledMap, float f) {
        super(tiledMap, f);
    }

    public IsometricStaggeredTiledMapRenderer(TiledMap tiledMap, float f, Batch batch) {
        super(tiledMap, f, batch);
    }
}
