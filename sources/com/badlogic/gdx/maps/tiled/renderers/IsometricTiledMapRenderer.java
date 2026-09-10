package com.badlogic.gdx.maps.tiled.renderers;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapImageLayer;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class IsometricTiledMapRenderer extends BatchTiledMapRenderer {
    private Vector2 bottomLeft;
    private Vector2 bottomRight;
    private Matrix4 invIsotransform;
    private Matrix4 isoTransform;
    private Vector3 screenPos;
    private Vector2 topLeft;
    private Vector2 topRight;

    public IsometricTiledMapRenderer(TiledMap tiledMap) {
        super(tiledMap);
        this.screenPos = new Vector3();
        this.topRight = new Vector2();
        this.bottomLeft = new Vector2();
        this.topLeft = new Vector2();
        this.bottomRight = new Vector2();
        init();
    }

    private void init() {
        Matrix4 matrix4 = new Matrix4();
        this.isoTransform = matrix4;
        matrix4.idt();
        this.isoTransform.scale((float) (Math.sqrt(2.0d) / 2.0d), (float) (Math.sqrt(2.0d) / 4.0d), 1.0f);
        this.isoTransform.rotate(0.0f, 0.0f, 1.0f, -45.0f);
        Matrix4 matrix5 = new Matrix4(this.isoTransform);
        this.invIsotransform = matrix5;
        matrix5.inv();
    }

    private Vector3 translateScreenToIso(Vector2 vector2) {
        this.screenPos.set(vector2.x, vector2.y, 0.0f);
        this.screenPos.mul(this.invIsotransform);
        return this.screenPos;
    }

    @Override // com.badlogic.gdx.maps.tiled.renderers.BatchTiledMapRenderer, com.badlogic.gdx.maps.tiled.TiledMapRenderer
    public void renderImageLayer(TiledMapImageLayer tiledMapImageLayer) {
        float f;
        float f2;
        float f3;
        float imageLayerColor = getImageLayerColor(tiledMapImageLayer, this.batch.getColor());
        float[] fArr = this.vertices;
        TextureRegion textureRegion = tiledMapImageLayer.getTextureRegion();
        if (textureRegion == null) {
            return;
        }
        int iIntValue = ((Integer) getMap().getProperties().get("tileheight", Integer.class)).intValue();
        float fIntValue = ((Integer) getMap().getProperties().get("height", Integer.class)).intValue() * iIntValue;
        float f4 = this.unitScale;
        float f5 = fIntValue * f4;
        float f6 = iIntValue * 0.5f * f4;
        float x = tiledMapImageLayer.getX();
        float y = tiledMapImageLayer.getY();
        float parallaxX = (x * this.unitScale) - ((tiledMapImageLayer.getParallaxX() - 1.0f) * this.viewBounds.x);
        float parallaxY = (((y * this.unitScale) - ((tiledMapImageLayer.getParallaxY() - 1.0f) * this.viewBounds.y)) - (f5 * 0.5f)) + f6;
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
        float f7 = rectangle.x;
        float f8 = rectangle.y;
        Rectangle rectangle2 = this.imageBounds;
        float f9 = f7 - (f7 % rectangle2.width);
        float f10 = f8 - (f8 % rectangle2.height);
        int i = 0;
        while (i <= iCeil) {
            int i2 = 0;
            while (i2 <= iCeil2) {
                if (tiledMapImageLayer.isRepeatX()) {
                    float f11 = this.imageBounds.width;
                    float f12 = (parallaxX % f11) + ((i - 2) * f11) + f9;
                    f = f12 + f11;
                    f2 = f12;
                } else {
                    f = regionWidth;
                    f2 = parallaxX;
                }
                if (tiledMapImageLayer.isRepeatY()) {
                    float f13 = this.imageBounds.height;
                    float f14 = (parallaxY % f13) + ((i2 - 2) * f13) + f10;
                    regionHeight = f14 + f13;
                    f3 = f14;
                } else {
                    f3 = parallaxY;
                }
                int i3 = iCeil;
                float f15 = parallaxY;
                this.repeatedImageBounds.set(f2, f3, f - f2, regionHeight - f3);
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
                    fArr[6] = regionHeight;
                    fArr[7] = imageLayerColor;
                    fArr[8] = u3;
                    fArr[9] = v4;
                    fArr[10] = f;
                    fArr[11] = regionHeight;
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
                regionHeight = regionHeight;
                parallaxX = parallaxX;
                iCeil = i3;
                parallaxY = f15;
            }
            i++;
            regionWidth = regionWidth;
            regionHeight = regionHeight;
            parallaxX = parallaxX;
        }
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapRenderer
    public void renderTileLayer(TiledMapTileLayer tiledMapTileLayer) {
        TiledMapTile tile;
        TiledMapTileLayer tiledMapTileLayer2 = tiledMapTileLayer;
        float tileLayerColor = getTileLayerColor(tiledMapTileLayer2, this.batch.getColor());
        float tileWidth = tiledMapTileLayer.getTileWidth() * this.unitScale;
        float tileHeight = tiledMapTileLayer.getTileHeight() * this.unitScale;
        float renderOffsetX = (tiledMapTileLayer.getRenderOffsetX() * this.unitScale) - ((tiledMapTileLayer.getParallaxX() - 1.0f) * this.viewBounds.x);
        float parallaxY = ((-tiledMapTileLayer.getRenderOffsetY()) * this.unitScale) - ((tiledMapTileLayer.getParallaxY() - 1.0f) * this.viewBounds.y);
        float f = tileWidth * 0.5f;
        float f2 = tileHeight * 0.5f;
        Vector2 vector2 = this.topRight;
        Rectangle rectangle = this.viewBounds;
        vector2.set((rectangle.x + rectangle.width) - renderOffsetX, rectangle.y - parallaxY);
        Vector2 vector3 = this.bottomLeft;
        Rectangle rectangle2 = this.viewBounds;
        vector3.set(rectangle2.x - renderOffsetX, (rectangle2.y + rectangle2.height) - parallaxY);
        Vector2 vector4 = this.topLeft;
        Rectangle rectangle3 = this.viewBounds;
        vector4.set(rectangle3.x - renderOffsetX, rectangle3.y - parallaxY);
        Vector2 vector5 = this.bottomRight;
        Rectangle rectangle4 = this.viewBounds;
        vector5.set((rectangle4.x + rectangle4.width) - renderOffsetX, (rectangle4.y + rectangle4.height) - parallaxY);
        int i = ((int) (translateScreenToIso(this.topLeft).y / tileWidth)) - 2;
        int i2 = ((int) (translateScreenToIso(this.bottomRight).y / tileWidth)) + 2;
        int i3 = ((int) (translateScreenToIso(this.bottomLeft).x / tileWidth)) - 2;
        int i4 = ((int) (translateScreenToIso(this.topRight).x / tileWidth)) + 2;
        while (i2 >= i) {
            int i5 = i3;
            while (i5 <= i4) {
                float f3 = i5;
                float f4 = i2;
                float f5 = (f4 * f) + (f3 * f);
                float f6 = (f4 * f2) - (f3 * f2);
                TiledMapTileLayer.Cell cell = tiledMapTileLayer2.getCell(i5, i2);
                if (cell != null && (tile = cell.getTile()) != null) {
                    boolean flipHorizontally = cell.getFlipHorizontally();
                    boolean flipVertically = cell.getFlipVertically();
                    int rotation = cell.getRotation();
                    TextureRegion textureRegion = tile.getTextureRegion();
                    float fD = AbstractC5044xl.d(tile.getOffsetX(), this.unitScale, f5, renderOffsetX);
                    float fD2 = AbstractC5044xl.d(tile.getOffsetY(), this.unitScale, f6, parallaxY);
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
                            float f7 = fArr[4];
                            fArr[4] = fArr[9];
                            fArr[9] = fArr[14];
                            fArr[14] = fArr[19];
                            fArr[19] = f7;
                            float f8 = fArr[3];
                            fArr[3] = fArr[8];
                            fArr[8] = fArr[13];
                            fArr[13] = fArr[18];
                            fArr[18] = f8;
                        } else if (rotation == 2) {
                            float f9 = fArr[3];
                            fArr[3] = fArr[13];
                            fArr[13] = f9;
                            float f10 = fArr[8];
                            fArr[8] = fArr[18];
                            fArr[18] = f10;
                            float f11 = fArr[4];
                            fArr[4] = fArr[14];
                            fArr[14] = f11;
                            float f12 = fArr[9];
                            fArr[9] = fArr[19];
                            fArr[19] = f12;
                        } else if (rotation == 3) {
                            float f13 = fArr[4];
                            fArr[4] = fArr[19];
                            fArr[19] = fArr[14];
                            fArr[14] = fArr[9];
                            fArr[9] = f13;
                            float f14 = fArr[3];
                            fArr[3] = fArr[18];
                            fArr[18] = fArr[13];
                            fArr[13] = fArr[8];
                            fArr[8] = f14;
                        }
                    }
                    this.batch.draw(textureRegion.getTexture(), this.vertices, 0, 20);
                }
                i5++;
                tiledMapTileLayer2 = tiledMapTileLayer;
                i4 = i4;
                f2 = f2;
                renderOffsetX = renderOffsetX;
            }
            i2--;
            tiledMapTileLayer2 = tiledMapTileLayer;
            i4 = i4;
        }
    }

    public IsometricTiledMapRenderer(TiledMap tiledMap, Batch batch) {
        super(tiledMap, batch);
        this.screenPos = new Vector3();
        this.topRight = new Vector2();
        this.bottomLeft = new Vector2();
        this.topLeft = new Vector2();
        this.bottomRight = new Vector2();
        init();
    }

    public IsometricTiledMapRenderer(TiledMap tiledMap, float f) {
        super(tiledMap, f);
        this.screenPos = new Vector3();
        this.topRight = new Vector2();
        this.bottomLeft = new Vector2();
        this.topLeft = new Vector2();
        this.bottomRight = new Vector2();
        init();
    }

    public IsometricTiledMapRenderer(TiledMap tiledMap, float f, Batch batch) {
        super(tiledMap, f, batch);
        this.screenPos = new Vector3();
        this.topRight = new Vector2();
        this.bottomLeft = new Vector2();
        this.topLeft = new Vector2();
        this.bottomRight = new Vector2();
        init();
    }
}
