package com.badlogic.gdx.maps.tiled.renderers;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapImageLayer;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.tiles.AnimatedTiledMapTile;
import com.badlogic.gdx.math.Rectangle;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class HexagonalTiledMapRenderer extends BatchTiledMapRenderer {
    private float hexSideLength;
    private boolean staggerAxisX;
    private boolean staggerIndexEven;

    public HexagonalTiledMapRenderer(TiledMap tiledMap) {
        super(tiledMap);
        this.staggerAxisX = true;
        this.staggerIndexEven = false;
        this.hexSideLength = 0.0f;
        init(tiledMap);
    }

    private void init(TiledMap tiledMap) {
        String str = (String) tiledMap.getProperties().get("staggeraxis", String.class);
        if (str != null) {
            if (str.equals("x")) {
                this.staggerAxisX = true;
            } else {
                this.staggerAxisX = false;
            }
        }
        String str2 = (String) tiledMap.getProperties().get("staggerindex", String.class);
        if (str2 != null) {
            if (str2.equals("even")) {
                this.staggerIndexEven = true;
            } else {
                this.staggerIndexEven = false;
            }
        }
        if (!this.staggerAxisX && ((Integer) tiledMap.getProperties().get("height", Integer.class)).intValue() % 2 == 0) {
            this.staggerIndexEven = !this.staggerIndexEven;
        }
        Integer num = (Integer) tiledMap.getProperties().get("hexsidelength", Integer.class);
        if (num != null) {
            this.hexSideLength = num.intValue();
            return;
        }
        if (this.staggerAxisX) {
            Integer num2 = (Integer) tiledMap.getProperties().get("tilewidth", Integer.class);
            if (num2 != null) {
                this.hexSideLength = num2.intValue() * 0.5f;
                return;
            } else {
                this.hexSideLength = ((TiledMapTileLayer) tiledMap.getLayers().get(0)).getTileWidth() * 0.5f;
                return;
            }
        }
        Integer num3 = (Integer) tiledMap.getProperties().get("tileheight", Integer.class);
        if (num3 != null) {
            this.hexSideLength = num3.intValue() * 0.5f;
        } else {
            this.hexSideLength = ((TiledMapTileLayer) tiledMap.getLayers().get(0)).getTileHeight() * 0.5f;
        }
    }

    private void renderCell(TiledMapTileLayer.Cell cell, float f, float f2, float f3) {
        TiledMapTile tile;
        if (cell == null || (tile = cell.getTile()) == null || (tile instanceof AnimatedTiledMapTile)) {
            return;
        }
        boolean flipHorizontally = cell.getFlipHorizontally();
        boolean flipVertically = cell.getFlipVertically();
        int rotation = cell.getRotation();
        TextureRegion textureRegion = tile.getTextureRegion();
        float offsetX = (tile.getOffsetX() * this.unitScale) + f;
        float offsetY = (tile.getOffsetY() * this.unitScale) + f2;
        float regionWidth = (textureRegion.getRegionWidth() * this.unitScale) + offsetX;
        float regionHeight = (textureRegion.getRegionHeight() * this.unitScale) + offsetY;
        float u = textureRegion.getU();
        float v2 = textureRegion.getV2();
        float u2 = textureRegion.getU2();
        float v = textureRegion.getV();
        float[] fArr = this.vertices;
        fArr[0] = offsetX;
        fArr[1] = offsetY;
        fArr[2] = f3;
        fArr[3] = u;
        fArr[4] = v2;
        fArr[5] = offsetX;
        fArr[6] = regionHeight;
        fArr[7] = f3;
        fArr[8] = u;
        fArr[9] = v;
        fArr[10] = regionWidth;
        fArr[11] = regionHeight;
        fArr[12] = f3;
        fArr[13] = u2;
        fArr[14] = v;
        fArr[15] = regionWidth;
        fArr[16] = offsetY;
        fArr[17] = f3;
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
        if (rotation == 2) {
            float f4 = fArr[3];
            fArr[3] = fArr[13];
            fArr[13] = f4;
            float f5 = fArr[8];
            fArr[8] = fArr[18];
            fArr[18] = f5;
            float f6 = fArr[4];
            fArr[4] = fArr[14];
            fArr[14] = f6;
            float f7 = fArr[9];
            fArr[9] = fArr[19];
            fArr[19] = f7;
        }
        this.batch.draw(textureRegion.getTexture(), this.vertices, 0, 20);
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
        int iIntValue = ((Integer) getMap().getProperties().get("tileheight", Integer.class)).intValue();
        int iIntValue2 = ((Integer) getMap().getProperties().get("height", Integer.class)).intValue();
        float f6 = this.hexSideLength;
        float f7 = iIntValue2 * iIntValue;
        float f8 = this.unitScale;
        float f9 = f7 * f8;
        float f10 = ((f6 * 0.5f) + (f7 * 0.75f)) * f8;
        float f11 = iIntValue * f8 * 0.5f;
        if (!this.staggerAxisX) {
            f11 = -(f9 - f10);
        }
        float x = tiledMapImageLayer.getX();
        float y = tiledMapImageLayer.getY();
        float parallaxX = (x * this.unitScale) - ((tiledMapImageLayer.getParallaxX() - 1.0f) * this.viewBounds.x);
        float parallaxY = ((y * this.unitScale) - ((tiledMapImageLayer.getParallaxY() - 1.0f) * this.viewBounds.y)) + f11;
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
        float f12 = rectangle.x;
        float f13 = rectangle.y;
        Rectangle rectangle2 = this.imageBounds;
        float f14 = f12 - (f12 % rectangle2.width);
        float f15 = f13 - (f13 % rectangle2.height);
        int i = 0;
        while (i <= iCeil) {
            int i2 = 0;
            while (i2 <= iCeil2) {
                if (tiledMapImageLayer.isRepeatX()) {
                    float f16 = this.imageBounds.width;
                    float f17 = (parallaxX % f16) + ((i - 2) * f16) + f14;
                    f = f17 + f16;
                    f2 = f17;
                } else {
                    f = regionWidth;
                    f2 = parallaxX;
                }
                if (tiledMapImageLayer.isRepeatY()) {
                    float f18 = this.imageBounds.height;
                    float f19 = (parallaxY % f18) + ((i2 - 2) * f18) + f15;
                    f5 = f19 + f18;
                    f3 = f19;
                    f4 = parallaxY;
                } else {
                    f3 = parallaxY;
                    f4 = f3;
                    f5 = regionHeight;
                }
                float f20 = regionHeight;
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
                regionHeight = f20;
                iCeil = i3;
            }
            i++;
            regionWidth = regionWidth;
            parallaxX = parallaxX;
            parallaxY = parallaxY;
        }
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
        float f = this.hexSideLength * this.unitScale;
        if (!this.staggerAxisX) {
            float f2 = (tileHeight - f) / 2.0f;
            float f3 = (tileHeight + f) / 2.0f;
            float f4 = 0.5f * tileWidth;
            int iMax = Math.max(0, (int) (((this.viewBounds.y - f2) - renderOffsetX) / f3));
            Rectangle rectangle = this.viewBounds;
            int iMin = Math.min(height, (int) ((((rectangle.y + rectangle.height) + f3) - renderOffsetX) / f3));
            int iMax2 = Math.max(0, (int) (((this.viewBounds.x - f4) - parallaxY) / tileWidth));
            Rectangle rectangle2 = this.viewBounds;
            int iMin2 = Math.min(width, (int) ((((rectangle2.x + rectangle2.width) + tileWidth) - parallaxY) / tileWidth));
            int i = iMin - 1;
            while (i >= iMax) {
                float f5 = (i % 2 == 0) == this.staggerIndexEven ? f4 : 0.0f;
                int i2 = iMax2;
                while (i2 < iMin2) {
                    renderCell(tiledMapTileLayer2.getCell(i2, i), AbstractC5044xl.d(tileWidth, i2, f5, renderOffsetX), (i * f3) + parallaxY, tileLayerColor);
                    i2++;
                    tiledMapTileLayer2 = tiledMapTileLayer;
                }
                i--;
                tiledMapTileLayer2 = tiledMapTileLayer;
            }
            return;
        }
        float f6 = (tileWidth - f) / 2.0f;
        float f7 = (tileWidth + f) / 2.0f;
        float f8 = 0.5f * tileHeight;
        int iMax3 = Math.max(0, (int) (((this.viewBounds.y - f8) - renderOffsetX) / tileHeight));
        Rectangle rectangle3 = this.viewBounds;
        int iMin3 = Math.min(height, (int) ((((rectangle3.y + rectangle3.height) + tileHeight) - renderOffsetX) / tileHeight));
        int iMax4 = Math.max(0, (int) (((this.viewBounds.x - f6) - parallaxY) / f7));
        Rectangle rectangle4 = this.viewBounds;
        int iMin4 = Math.min(width, (int) ((((rectangle4.x + rectangle4.width) + f7) - parallaxY) / f7));
        boolean z = this.staggerIndexEven;
        int i3 = iMax4 % 2;
        int i4 = z == (i3 == 0) ? iMax4 + 1 : iMax4;
        if (z != (i3 == 0)) {
            iMax4++;
        }
        int i5 = iMin3 - 1;
        while (i5 >= iMax3) {
            int i6 = i4;
            while (i6 < iMin4) {
                renderCell(tiledMapTileLayer2.getCell(i6, i5), (i6 * f7) + renderOffsetX, AbstractC5044xl.d(tileHeight, i5, f8, parallaxY), tileLayerColor);
                i6 += 2;
                iMax3 = iMax3;
            }
            int i7 = iMax3;
            for (int i8 = iMax4; i8 < iMin4; i8 += 2) {
                renderCell(tiledMapTileLayer2.getCell(i8, i5), (i8 * f7) + renderOffsetX, (i5 * tileHeight) + parallaxY, tileLayerColor);
            }
            i5--;
            iMax3 = i7;
        }
    }

    public HexagonalTiledMapRenderer(TiledMap tiledMap, float f) {
        super(tiledMap, f);
        this.staggerAxisX = true;
        this.staggerIndexEven = false;
        this.hexSideLength = 0.0f;
        init(tiledMap);
    }

    public HexagonalTiledMapRenderer(TiledMap tiledMap, Batch batch) {
        super(tiledMap, batch);
        this.staggerAxisX = true;
        this.staggerIndexEven = false;
        this.hexSideLength = 0.0f;
        init(tiledMap);
    }

    public HexagonalTiledMapRenderer(TiledMap tiledMap, float f, Batch batch) {
        super(tiledMap, f, batch);
        this.staggerAxisX = true;
        this.staggerIndexEven = false;
        this.hexSideLength = 0.0f;
        init(tiledMap);
    }
}
