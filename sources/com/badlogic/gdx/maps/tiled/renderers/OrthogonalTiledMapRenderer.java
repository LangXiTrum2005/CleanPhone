package com.badlogic.gdx.maps.tiled.renderers;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.math.Rectangle;

/* JADX INFO: loaded from: classes.dex */
public class OrthogonalTiledMapRenderer extends BatchTiledMapRenderer {
    public OrthogonalTiledMapRenderer(TiledMap tiledMap) {
        super(tiledMap);
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapRenderer
    public void renderTileLayer(TiledMapTileLayer tiledMapTileLayer) {
        TiledMapTileLayer tiledMapTileLayer2 = tiledMapTileLayer;
        float tileLayerColor = getTileLayerColor(tiledMapTileLayer2, this.batch.getColor());
        int width = tiledMapTileLayer.getWidth();
        int height = tiledMapTileLayer.getHeight();
        float tileWidth = tiledMapTileLayer.getTileWidth() * this.unitScale;
        float tileHeight = tiledMapTileLayer.getTileHeight() * this.unitScale;
        float renderOffsetX = (tiledMapTileLayer.getRenderOffsetX() * this.unitScale) - ((tiledMapTileLayer.getParallaxX() - 1.0f) * this.viewBounds.x);
        float parallaxY = ((-tiledMapTileLayer.getRenderOffsetY()) * this.unitScale) - ((tiledMapTileLayer.getParallaxY() - 1.0f) * this.viewBounds.y);
        int iMax = Math.max(0, (int) ((this.viewBounds.x - renderOffsetX) / tileWidth));
        Rectangle rectangle = this.viewBounds;
        int iMin = Math.min(width, (int) ((((rectangle.x + rectangle.width) + tileWidth) - renderOffsetX) / tileWidth));
        int iMax2 = Math.max(0, (int) ((this.viewBounds.y - parallaxY) / tileHeight));
        Rectangle rectangle2 = this.viewBounds;
        int iMin2 = Math.min(height, (int) ((((rectangle2.y + rectangle2.height) + tileHeight) - parallaxY) / tileHeight));
        float f = (iMin2 * tileHeight) + parallaxY;
        float f2 = (iMax * tileWidth) + renderOffsetX;
        float[] fArr = this.vertices;
        while (iMin2 >= iMax2) {
            float f3 = f2;
            int i = iMax;
            while (i < iMin) {
                TiledMapTileLayer.Cell cell = tiledMapTileLayer2.getCell(i, iMin2);
                if (cell == null) {
                    f3 += tileWidth;
                    iMin = iMin;
                    f2 = f2;
                    iMax = iMax;
                } else {
                    TiledMapTile tile = cell.getTile();
                    if (tile != null) {
                        boolean flipHorizontally = cell.getFlipHorizontally();
                        boolean flipVertically = cell.getFlipVertically();
                        int rotation = cell.getRotation();
                        TextureRegion textureRegion = tile.getTextureRegion();
                        float offsetX = (tile.getOffsetX() * this.unitScale) + f3;
                        float offsetY = (tile.getOffsetY() * this.unitScale) + f;
                        float regionWidth = (textureRegion.getRegionWidth() * this.unitScale) + offsetX;
                        float regionHeight = (textureRegion.getRegionHeight() * this.unitScale) + offsetY;
                        float u = textureRegion.getU();
                        float v2 = textureRegion.getV2();
                        float u2 = textureRegion.getU2();
                        float v = textureRegion.getV();
                        fArr[0] = offsetX;
                        fArr[1] = offsetY;
                        fArr[2] = tileLayerColor;
                        fArr[3] = u;
                        fArr[4] = v2;
                        fArr[5] = offsetX;
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
                        fArr[16] = offsetY;
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
                        this.batch.draw(textureRegion.getTexture(), fArr, 0, 20);
                    }
                    f3 += tileWidth;
                }
                i++;
                tiledMapTileLayer2 = tiledMapTileLayer;
                iMin = iMin;
                f2 = f2;
                iMax = iMax;
            }
            f -= tileHeight;
            iMin2--;
            tiledMapTileLayer2 = tiledMapTileLayer;
            iMax = iMax;
        }
    }

    public OrthogonalTiledMapRenderer(TiledMap tiledMap, Batch batch) {
        super(tiledMap, batch);
    }

    public OrthogonalTiledMapRenderer(TiledMap tiledMap, float f) {
        super(tiledMap, f);
    }

    public OrthogonalTiledMapRenderer(TiledMap tiledMap, float f, Batch batch) {
        super(tiledMap, f, batch);
    }
}
