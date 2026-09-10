package com.badlogic.gdx.maps.tiled.renderers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteCache;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.MapLayers;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapImageLayer;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Disposable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class OrthoCachedTiledMapRenderer implements TiledMapRenderer, Disposable {
    protected static final int NUM_VERTICES = 20;
    private static final float tolerance = 1.0E-5f;
    protected boolean blending;
    protected final Rectangle cacheBounds;
    protected boolean cached;
    protected boolean canCacheMoreE;
    protected boolean canCacheMoreN;
    protected boolean canCacheMoreS;
    protected boolean canCacheMoreW;
    protected int count;
    protected Rectangle imageBounds;
    protected final TiledMap map;
    protected float maxTileHeight;
    protected float maxTileWidth;
    protected float overCache;
    protected final SpriteCache spriteCache;
    protected float unitScale;
    protected final float[] vertices;
    protected final Rectangle viewBounds;

    public OrthoCachedTiledMapRenderer(TiledMap tiledMap) {
        this(tiledMap, 1.0f, 2000);
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        this.spriteCache.dispose();
    }

    public SpriteCache getSpriteCache() {
        return this.spriteCache;
    }

    public void invalidateCache() {
        this.cached = false;
    }

    public boolean isCached() {
        return this.cached;
    }

    @Override // com.badlogic.gdx.maps.MapRenderer
    public void render() {
        if (!this.cached) {
            this.cached = true;
            this.count = 0;
            this.spriteCache.clear();
            Rectangle rectangle = this.viewBounds;
            float f = rectangle.width;
            float f2 = this.overCache;
            float f3 = f * f2;
            float f4 = rectangle.height;
            float f5 = f2 * f4;
            Rectangle rectangle2 = this.cacheBounds;
            rectangle2.x = rectangle.x - f3;
            rectangle2.y = rectangle.y - f5;
            rectangle2.width = (f3 * 2.0f) + f;
            rectangle2.height = (f5 * 2.0f) + f4;
            for (MapLayer mapLayer : this.map.getLayers()) {
                this.spriteCache.beginCache();
                if (mapLayer instanceof TiledMapTileLayer) {
                    renderTileLayer((TiledMapTileLayer) mapLayer);
                } else if (mapLayer instanceof TiledMapImageLayer) {
                    renderImageLayer((TiledMapImageLayer) mapLayer);
                }
                this.spriteCache.endCache();
            }
        }
        if (this.blending) {
            Gdx.gl.glEnable(GL20.GL_BLEND);
            Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        }
        this.spriteCache.begin();
        MapLayers layers = this.map.getLayers();
        int count = layers.getCount();
        for (int i = 0; i < count; i++) {
            MapLayer mapLayer2 = layers.get(i);
            if (mapLayer2.isVisible()) {
                this.spriteCache.draw(i);
                renderObjects(mapLayer2);
            }
        }
        this.spriteCache.end();
        if (this.blending) {
            Gdx.gl.glDisable(GL20.GL_BLEND);
        }
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapRenderer
    public void renderImageLayer(TiledMapImageLayer tiledMapImageLayer) {
        float f;
        float f2;
        float f3;
        float f4;
        OrthoCachedTiledMapRenderer orthoCachedTiledMapRenderer = this;
        Color combinedTintColor = tiledMapImageLayer.getCombinedTintColor();
        boolean zSupportsTransparency = tiledMapImageLayer.supportsTransparency();
        float f5 = zSupportsTransparency ? 1.0f : combinedTintColor.f202a;
        float floatBits = Color.toFloatBits(combinedTintColor.r * f5, combinedTintColor.g * f5, combinedTintColor.b * f5, tiledMapImageLayer.getOpacity() * (zSupportsTransparency ? combinedTintColor.f202a : 1.0f));
        float[] fArr = orthoCachedTiledMapRenderer.vertices;
        TextureRegion textureRegion = tiledMapImageLayer.getTextureRegion();
        if (textureRegion == null) {
            return;
        }
        float x = tiledMapImageLayer.getX();
        float y = tiledMapImageLayer.getY();
        float parallaxX = (x * orthoCachedTiledMapRenderer.unitScale) - ((tiledMapImageLayer.getParallaxX() - 1.0f) * orthoCachedTiledMapRenderer.viewBounds.x);
        float parallaxY = (y * orthoCachedTiledMapRenderer.unitScale) - ((tiledMapImageLayer.getParallaxY() - 1.0f) * orthoCachedTiledMapRenderer.viewBounds.y);
        float regionWidth = (textureRegion.getRegionWidth() * orthoCachedTiledMapRenderer.unitScale) + parallaxX;
        float regionHeight = (textureRegion.getRegionHeight() * orthoCachedTiledMapRenderer.unitScale) + parallaxY;
        orthoCachedTiledMapRenderer.imageBounds.set(parallaxX, parallaxY, regionWidth - parallaxX, regionHeight - parallaxY);
        if (!tiledMapImageLayer.isRepeatX() && !tiledMapImageLayer.isRepeatY()) {
            float u = textureRegion.getU();
            float v2 = textureRegion.getV2();
            float u2 = textureRegion.getU2();
            float v = textureRegion.getV();
            fArr[0] = parallaxX;
            fArr[1] = parallaxY;
            fArr[2] = floatBits;
            fArr[3] = u;
            fArr[4] = v2;
            fArr[5] = parallaxX;
            fArr[6] = regionHeight;
            fArr[7] = floatBits;
            fArr[8] = u;
            fArr[9] = v;
            fArr[10] = regionWidth;
            fArr[11] = regionHeight;
            fArr[12] = floatBits;
            fArr[13] = u2;
            fArr[14] = v;
            fArr[15] = regionWidth;
            fArr[16] = parallaxY;
            fArr[17] = floatBits;
            fArr[18] = u2;
            fArr[19] = v2;
            orthoCachedTiledMapRenderer.spriteCache.add(textureRegion.getTexture(), fArr, 0, 20);
            return;
        }
        int iCeil = tiledMapImageLayer.isRepeatX() ? (int) Math.ceil((orthoCachedTiledMapRenderer.cacheBounds.width / orthoCachedTiledMapRenderer.imageBounds.width) + 4.0f) : 0;
        int iCeil2 = tiledMapImageLayer.isRepeatY() ? (int) Math.ceil((orthoCachedTiledMapRenderer.cacheBounds.height / orthoCachedTiledMapRenderer.imageBounds.height) + 4.0f) : 0;
        Rectangle rectangle = orthoCachedTiledMapRenderer.cacheBounds;
        float f6 = rectangle.x;
        float f7 = rectangle.y;
        Rectangle rectangle2 = orthoCachedTiledMapRenderer.imageBounds;
        float f8 = f6 - (f6 % rectangle2.width);
        float f9 = f7 - (f7 % rectangle2.height);
        int i = 0;
        while (i <= iCeil) {
            int i2 = 0;
            while (i2 <= iCeil2) {
                if (tiledMapImageLayer.isRepeatX()) {
                    float f10 = orthoCachedTiledMapRenderer.imageBounds.width;
                    f2 = (parallaxX % f10) + ((i - 2) * f10) + f8;
                    f = f2 + f10;
                } else {
                    f = regionWidth;
                    f2 = parallaxX;
                }
                if (tiledMapImageLayer.isRepeatY()) {
                    float f11 = orthoCachedTiledMapRenderer.imageBounds.height;
                    f3 = (parallaxY % f11) + ((i2 - 2) * f11) + f9;
                    f4 = f3 + f11;
                } else {
                    f3 = parallaxY;
                    f4 = regionHeight;
                }
                float u3 = textureRegion.getU();
                float v3 = textureRegion.getV2();
                float u4 = textureRegion.getU2();
                float v4 = textureRegion.getV();
                fArr[0] = f2;
                fArr[1] = f3;
                fArr[2] = floatBits;
                fArr[3] = u3;
                fArr[4] = v3;
                fArr[5] = f2;
                fArr[6] = f4;
                fArr[7] = floatBits;
                fArr[8] = u3;
                fArr[9] = v4;
                fArr[10] = f;
                fArr[11] = f4;
                fArr[12] = floatBits;
                fArr[13] = u4;
                fArr[14] = v4;
                fArr[15] = f;
                fArr[16] = f3;
                fArr[17] = floatBits;
                fArr[18] = u4;
                fArr[19] = v3;
                orthoCachedTiledMapRenderer.spriteCache.add(textureRegion.getTexture(), fArr, 0, 20);
                i2++;
                orthoCachedTiledMapRenderer = this;
                regionWidth = regionWidth;
            }
            i++;
            orthoCachedTiledMapRenderer = this;
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

    @Override // com.badlogic.gdx.maps.tiled.TiledMapRenderer
    public void renderTileLayer(TiledMapTileLayer tiledMapTileLayer) {
        TiledMapTile tile;
        float floatBits = Color.toFloatBits(tiledMapTileLayer.getCombinedTintColor().r, tiledMapTileLayer.getCombinedTintColor().g, tiledMapTileLayer.getCombinedTintColor().b, tiledMapTileLayer.getOpacity() * tiledMapTileLayer.getCombinedTintColor().f202a);
        int width = tiledMapTileLayer.getWidth();
        int height = tiledMapTileLayer.getHeight();
        float tileWidth = tiledMapTileLayer.getTileWidth() * this.unitScale;
        float tileHeight = tiledMapTileLayer.getTileHeight() * this.unitScale;
        float renderOffsetX = (tiledMapTileLayer.getRenderOffsetX() * this.unitScale) - ((tiledMapTileLayer.getParallaxX() - 1.0f) * this.viewBounds.x);
        float parallaxY = ((-tiledMapTileLayer.getRenderOffsetY()) * this.unitScale) - ((tiledMapTileLayer.getParallaxY() - 1.0f) * this.viewBounds.y);
        int iMax = Math.max(0, (int) ((this.cacheBounds.x - renderOffsetX) / tileWidth));
        Rectangle rectangle = this.cacheBounds;
        int iMin = Math.min(width, (int) ((((rectangle.x + rectangle.width) + tileWidth) - renderOffsetX) / tileWidth));
        int iMax2 = Math.max(0, (int) ((this.cacheBounds.y - parallaxY) / tileHeight));
        Rectangle rectangle2 = this.cacheBounds;
        int iMin2 = Math.min(height, (int) ((((rectangle2.y + rectangle2.height) + tileHeight) - parallaxY) / tileHeight));
        int i = 1;
        this.canCacheMoreN = iMin2 < height;
        this.canCacheMoreE = iMin < width;
        this.canCacheMoreW = iMax > 0;
        this.canCacheMoreS = iMax2 > 0;
        float[] fArr = this.vertices;
        while (iMin2 >= iMax2) {
            int i2 = iMax;
            while (i2 < iMin) {
                TiledMapTileLayer.Cell cell = tiledMapTileLayer.getCell(i2, iMin2);
                if (cell != null && (tile = cell.getTile()) != null) {
                    this.count += i;
                    boolean flipHorizontally = cell.getFlipHorizontally();
                    boolean flipVertically = cell.getFlipVertically();
                    int rotation = cell.getRotation();
                    TextureRegion textureRegion = tile.getTextureRegion();
                    Texture texture = textureRegion.getTexture();
                    float fD = AbstractC5044xl.d(tile.getOffsetX(), this.unitScale, i2 * tileWidth, renderOffsetX);
                    float fD2 = AbstractC5044xl.d(tile.getOffsetY(), this.unitScale, iMin2 * tileHeight, parallaxY);
                    float regionWidth = (textureRegion.getRegionWidth() * this.unitScale) + fD;
                    float regionHeight = (textureRegion.getRegionHeight() * this.unitScale) + fD2;
                    float width2 = 0.5f / texture.getWidth();
                    float height2 = 0.5f / texture.getHeight();
                    float u = textureRegion.getU() + width2;
                    float v2 = textureRegion.getV2() - height2;
                    float u2 = textureRegion.getU2() - width2;
                    float v = textureRegion.getV() + height2;
                    fArr[0] = fD;
                    fArr[1] = fD2;
                    fArr[2] = floatBits;
                    fArr[3] = u;
                    fArr[4] = v2;
                    fArr[5] = fD;
                    fArr[6] = regionHeight;
                    fArr[7] = floatBits;
                    fArr[8] = u;
                    fArr[9] = v;
                    fArr[10] = regionWidth;
                    fArr[11] = regionHeight;
                    fArr[12] = floatBits;
                    fArr[13] = u2;
                    fArr[14] = v;
                    fArr[15] = regionWidth;
                    fArr[16] = fD2;
                    fArr[17] = floatBits;
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
                            float f = fArr[4];
                            fArr[4] = fArr[9];
                            fArr[9] = fArr[14];
                            fArr[14] = fArr[19];
                            fArr[19] = f;
                            float f2 = fArr[3];
                            fArr[3] = fArr[8];
                            fArr[8] = fArr[13];
                            fArr[13] = fArr[18];
                            fArr[18] = f2;
                        } else if (rotation == 2) {
                            float f3 = fArr[3];
                            fArr[3] = fArr[13];
                            fArr[13] = f3;
                            float f4 = fArr[8];
                            fArr[8] = fArr[18];
                            fArr[18] = f4;
                            float f5 = fArr[4];
                            fArr[4] = fArr[14];
                            fArr[14] = f5;
                            float f6 = fArr[9];
                            fArr[9] = fArr[19];
                            fArr[19] = f6;
                        } else if (rotation == 3) {
                            float f7 = fArr[4];
                            fArr[4] = fArr[19];
                            fArr[19] = fArr[14];
                            fArr[14] = fArr[9];
                            fArr[9] = f7;
                            float f8 = fArr[3];
                            fArr[3] = fArr[18];
                            fArr[18] = fArr[13];
                            fArr[13] = fArr[8];
                            fArr[8] = f8;
                        }
                    }
                    this.spriteCache.add(texture, fArr, 0, 20);
                }
                i2++;
                tileHeight = tileHeight;
                iMax2 = iMax2;
                iMax = iMax;
                tileWidth = tileWidth;
                iMin = iMin;
                renderOffsetX = renderOffsetX;
                parallaxY = parallaxY;
                i = 1;
            }
            iMin2--;
            renderOffsetX = renderOffsetX;
            parallaxY = parallaxY;
            i = 1;
        }
    }

    public void setBlending(boolean z) {
        this.blending = z;
    }

    public void setMaxTileSize(float f, float f2) {
        this.maxTileWidth = f;
        this.maxTileHeight = f2;
    }

    public void setOverCache(float f) {
        this.overCache = f;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0073  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.badlogic.gdx.maps.MapRenderer
    public void setView(OrthographicCamera orthographicCamera) {
        float f;
        Rectangle rectangle;
        this.spriteCache.setProjectionMatrix(orthographicCamera.combined);
        float f2 = orthographicCamera.viewportWidth;
        float f3 = orthographicCamera.zoom;
        float f4 = this.maxTileWidth * 2.0f;
        float f5 = this.unitScale;
        float f6 = (f4 * f5) + (f2 * f3);
        float fA = DM.A(this.maxTileHeight, 2.0f, f5, orthographicCamera.viewportHeight * f3);
        Rectangle rectangle2 = this.viewBounds;
        Vector3 vector3 = orthographicCamera.position;
        rectangle2.set(vector3.x - (f6 / 2.0f), vector3.y - (fA / 2.0f), f6, fA);
        if ((!this.canCacheMoreW || this.viewBounds.x >= this.cacheBounds.x - tolerance) && (!this.canCacheMoreS || this.viewBounds.y >= this.cacheBounds.y - tolerance)) {
            if (this.canCacheMoreE) {
                Rectangle rectangle3 = this.viewBounds;
                float f7 = rectangle3.x + rectangle3.width;
                Rectangle rectangle4 = this.cacheBounds;
                if (f7 <= rectangle4.x + rectangle4.width + tolerance) {
                    if (this.canCacheMoreN) {
                        return;
                    }
                    Rectangle rectangle5 = this.viewBounds;
                    f = rectangle5.y + rectangle5.height;
                    rectangle = this.cacheBounds;
                    if (f <= rectangle.y + rectangle.height + tolerance) {
                        return;
                    }
                }
            } else {
                if (this.canCacheMoreN) {
                    return;
                }
                Rectangle rectangle6 = this.viewBounds;
                f = rectangle6.y + rectangle6.height;
                rectangle = this.cacheBounds;
                if (f <= rectangle.y + rectangle.height + tolerance) {
                    return;
                }
            }
        }
        this.cached = false;
    }

    public OrthoCachedTiledMapRenderer(TiledMap tiledMap, float f) {
        this(tiledMap, f, 2000);
    }

    public OrthoCachedTiledMapRenderer(TiledMap tiledMap, float f, int i) {
        this.vertices = new float[20];
        this.viewBounds = new Rectangle();
        this.cacheBounds = new Rectangle();
        this.overCache = 0.5f;
        this.imageBounds = new Rectangle();
        this.map = tiledMap;
        this.unitScale = f;
        this.spriteCache = new SpriteCache(i, true);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.badlogic.gdx.maps.MapRenderer
    public void setView(Matrix4 matrix4, float f, float f2, float f3, float f4) {
        float f5;
        Rectangle rectangle;
        this.spriteCache.setProjectionMatrix(matrix4);
        float f6 = this.maxTileWidth;
        float f7 = this.unitScale;
        float f8 = f - (f6 * f7);
        float f9 = this.maxTileHeight;
        float fA = DM.A(f6, 2.0f, f7, f3);
        float fA2 = DM.A(f9, 2.0f, f7, f4);
        this.viewBounds.set(f8, f2 - (f9 * f7), fA, fA2);
        if ((!this.canCacheMoreW || this.viewBounds.x >= this.cacheBounds.x - tolerance) && (!this.canCacheMoreS || this.viewBounds.y >= this.cacheBounds.y - tolerance)) {
            if (this.canCacheMoreE) {
                Rectangle rectangle2 = this.viewBounds;
                float f10 = rectangle2.x + rectangle2.width;
                Rectangle rectangle3 = this.cacheBounds;
                if (f10 <= rectangle3.x + rectangle3.width + tolerance) {
                    if (this.canCacheMoreN) {
                        return;
                    }
                    Rectangle rectangle4 = this.viewBounds;
                    f5 = rectangle4.y + rectangle4.height;
                    rectangle = this.cacheBounds;
                    if (f5 <= rectangle.y + rectangle.height + tolerance) {
                        return;
                    }
                }
            } else {
                if (this.canCacheMoreN) {
                    return;
                }
                Rectangle rectangle5 = this.viewBounds;
                f5 = rectangle5.y + rectangle5.height;
                rectangle = this.cacheBounds;
                if (f5 <= rectangle.y + rectangle.height + tolerance) {
                    return;
                }
            }
        }
        this.cached = false;
    }

    @Override // com.badlogic.gdx.maps.MapRenderer
    public void render(int[] iArr) {
        if (!this.cached) {
            this.cached = true;
            this.count = 0;
            this.spriteCache.clear();
            Rectangle rectangle = this.viewBounds;
            float f = rectangle.width;
            float f2 = this.overCache;
            float f3 = f * f2;
            float f4 = rectangle.height;
            float f5 = f2 * f4;
            Rectangle rectangle2 = this.cacheBounds;
            rectangle2.x = rectangle.x - f3;
            rectangle2.y = rectangle.y - f5;
            rectangle2.width = (f3 * 2.0f) + f;
            rectangle2.height = (f5 * 2.0f) + f4;
            for (MapLayer mapLayer : this.map.getLayers()) {
                this.spriteCache.beginCache();
                if (mapLayer instanceof TiledMapTileLayer) {
                    renderTileLayer((TiledMapTileLayer) mapLayer);
                } else if (mapLayer instanceof TiledMapImageLayer) {
                    renderImageLayer((TiledMapImageLayer) mapLayer);
                }
                this.spriteCache.endCache();
            }
        }
        if (this.blending) {
            Gdx.gl.glEnable(GL20.GL_BLEND);
            Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        }
        this.spriteCache.begin();
        MapLayers layers = this.map.getLayers();
        for (int i : iArr) {
            MapLayer mapLayer2 = layers.get(i);
            if (mapLayer2.isVisible()) {
                this.spriteCache.draw(i);
                renderObjects(mapLayer2);
            }
        }
        this.spriteCache.end();
        if (this.blending) {
            Gdx.gl.glDisable(GL20.GL_BLEND);
        }
    }
}
