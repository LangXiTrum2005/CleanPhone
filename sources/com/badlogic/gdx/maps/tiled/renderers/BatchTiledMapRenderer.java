package com.badlogic.gdx.maps.tiled.renderers;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.MapGroupLayer;
import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.MapLayers;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapImageLayer;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.tiles.AnimatedTiledMapTile;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Disposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class BatchTiledMapRenderer implements TiledMapRenderer, Disposable {
    protected static final int NUM_VERTICES = 20;
    protected Batch batch;
    protected Rectangle imageBounds;
    protected TiledMap map;
    protected boolean ownsBatch;
    protected Rectangle repeatedImageBounds;
    protected float unitScale;
    protected float[] vertices;
    protected Rectangle viewBounds;

    public BatchTiledMapRenderer(TiledMap tiledMap) {
        this(tiledMap, 1.0f);
    }

    public void beginRender() {
        AnimatedTiledMapTile.updateAnimationBaseTime();
        this.batch.begin();
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        if (this.ownsBatch) {
            this.batch.dispose();
        }
    }

    public void endRender() {
        this.batch.end();
    }

    public Batch getBatch() {
        return this.batch;
    }

    public float getImageLayerColor(TiledMapImageLayer tiledMapImageLayer, Color color) {
        Color combinedTintColor = tiledMapImageLayer.getCombinedTintColor();
        boolean zSupportsTransparency = tiledMapImageLayer.supportsTransparency();
        float f = zSupportsTransparency ? 1.0f : combinedTintColor.f202a;
        return Color.toFloatBits(combinedTintColor.r * f * color.r, combinedTintColor.g * f * color.g, combinedTintColor.b * f * color.b, tiledMapImageLayer.getOpacity() * (zSupportsTransparency ? combinedTintColor.f202a : 1.0f) * color.f202a);
    }

    public TiledMap getMap() {
        return this.map;
    }

    public float getTileLayerColor(TiledMapTileLayer tiledMapTileLayer, Color color) {
        return Color.toFloatBits(color.r * tiledMapTileLayer.getCombinedTintColor().r, color.g * tiledMapTileLayer.getCombinedTintColor().g, color.b * tiledMapTileLayer.getCombinedTintColor().b, tiledMapTileLayer.getOpacity() * color.f202a * tiledMapTileLayer.getCombinedTintColor().f202a);
    }

    public float getUnitScale() {
        return this.unitScale;
    }

    public Rectangle getViewBounds() {
        return this.viewBounds;
    }

    @Override // com.badlogic.gdx.maps.MapRenderer
    public void render() {
        beginRender();
        Iterator<MapLayer> it = this.map.getLayers().iterator();
        while (it.hasNext()) {
            renderMapLayer(it.next());
        }
        endRender();
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapRenderer
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
        float x = tiledMapImageLayer.getX();
        float y = tiledMapImageLayer.getY();
        float parallaxX = (x * this.unitScale) - ((tiledMapImageLayer.getParallaxX() - 1.0f) * this.viewBounds.x);
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
                    f2 = f11 + f10;
                    f = f11;
                } else {
                    f = parallaxX;
                    f2 = regionWidth;
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
                this.repeatedImageBounds.set(f, f3, f2 - f, f5 - f3);
                if (this.viewBounds.contains(this.repeatedImageBounds) || this.viewBounds.overlaps(this.repeatedImageBounds)) {
                    float u3 = textureRegion.getU();
                    float v3 = textureRegion.getV2();
                    float u4 = textureRegion.getU2();
                    float v4 = textureRegion.getV();
                    fArr[0] = f;
                    fArr[1] = f3;
                    fArr[2] = imageLayerColor;
                    fArr[3] = u3;
                    fArr[4] = v3;
                    fArr[5] = f;
                    fArr[6] = f5;
                    fArr[7] = imageLayerColor;
                    fArr[8] = u3;
                    fArr[9] = v4;
                    fArr[10] = f2;
                    fArr[11] = f5;
                    fArr[12] = imageLayerColor;
                    fArr[13] = u4;
                    fArr[14] = v4;
                    fArr[15] = f2;
                    fArr[16] = f3;
                    fArr[17] = imageLayerColor;
                    fArr[18] = u4;
                    fArr[19] = v3;
                    this.batch.draw(textureRegion.getTexture(), fArr, 0, 20);
                }
                i2++;
                parallaxX = parallaxX;
                regionWidth = regionWidth;
                parallaxY = f4;
                regionHeight = f14;
                iCeil = i3;
            }
            i++;
            parallaxX = parallaxX;
            regionWidth = regionWidth;
            parallaxY = parallaxY;
            iCeil = iCeil;
        }
    }

    public void renderMapLayer(MapLayer mapLayer) {
        if (mapLayer.isVisible()) {
            if (mapLayer instanceof MapGroupLayer) {
                MapLayers layers = ((MapGroupLayer) mapLayer).getLayers();
                for (int i = 0; i < layers.size(); i++) {
                    MapLayer mapLayer2 = layers.get(i);
                    if (mapLayer2.isVisible()) {
                        renderMapLayer(mapLayer2);
                    }
                }
                return;
            }
            if (mapLayer instanceof TiledMapTileLayer) {
                renderTileLayer((TiledMapTileLayer) mapLayer);
            } else if (mapLayer instanceof TiledMapImageLayer) {
                renderImageLayer((TiledMapImageLayer) mapLayer);
            } else {
                renderObjects(mapLayer);
            }
        }
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapRenderer
    public void renderObject(MapObject mapObject) {
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapRenderer
    public void renderObjects(MapLayer mapLayer) {
        Iterator<MapObject> it = mapLayer.getObjects().iterator();
        while (it.hasNext()) {
            renderObject(it.next());
        }
    }

    public void setMap(TiledMap tiledMap) {
        this.map = tiledMap;
    }

    @Override // com.badlogic.gdx.maps.MapRenderer
    public void setView(OrthographicCamera orthographicCamera) {
        this.batch.setProjectionMatrix(orthographicCamera.combined);
        float f = orthographicCamera.viewportWidth;
        float f2 = orthographicCamera.zoom;
        float f3 = f * f2;
        float f4 = orthographicCamera.viewportHeight * f2;
        float fAbs = (Math.abs(orthographicCamera.up.x) * f4) + (Math.abs(orthographicCamera.up.y) * f3);
        float fAbs2 = (Math.abs(orthographicCamera.up.x) * f3) + (Math.abs(orthographicCamera.up.y) * f4);
        Rectangle rectangle = this.viewBounds;
        Vector3 vector3 = orthographicCamera.position;
        rectangle.set(vector3.x - (fAbs / 2.0f), vector3.y - (fAbs2 / 2.0f), fAbs, fAbs2);
    }

    public BatchTiledMapRenderer(TiledMap tiledMap, float f) {
        this.imageBounds = new Rectangle();
        this.repeatedImageBounds = new Rectangle();
        this.vertices = new float[20];
        this.map = tiledMap;
        this.unitScale = f;
        this.viewBounds = new Rectangle();
        this.batch = new SpriteBatch();
        this.ownsBatch = true;
    }

    @Override // com.badlogic.gdx.maps.MapRenderer
    public void render(int[] iArr) {
        beginRender();
        for (int i : iArr) {
            renderMapLayer(this.map.getLayers().get(i));
        }
        endRender();
    }

    @Override // com.badlogic.gdx.maps.MapRenderer
    public void setView(Matrix4 matrix4, float f, float f2, float f3, float f4) {
        this.batch.setProjectionMatrix(matrix4);
        this.viewBounds.set(f, f2, f3, f4);
    }

    public BatchTiledMapRenderer(TiledMap tiledMap, Batch batch) {
        this(tiledMap, 1.0f, batch);
    }

    public BatchTiledMapRenderer(TiledMap tiledMap, float f, Batch batch) {
        this.imageBounds = new Rectangle();
        this.repeatedImageBounds = new Rectangle();
        this.vertices = new float[20];
        this.map = tiledMap;
        this.unitScale = f;
        this.viewBounds = new Rectangle();
        this.batch = batch;
        this.ownsBatch = false;
    }
}
