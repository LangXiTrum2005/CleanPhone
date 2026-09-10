package com.badlogic.gdx.maps.tiled.tiles;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.MapObjects;
import com.badlogic.gdx.maps.MapProperties;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.IntArray;
import com.badlogic.gdx.utils.TimeUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class AnimatedTiledMapTile implements TiledMapTile {
    private static final long initialTimeOffset = TimeUtils.millis();
    private static long lastTiledMapRenderTime;
    private int[] animationIntervals;
    private TiledMapTile.BlendMode blendMode = TiledMapTile.BlendMode.ALPHA;
    private StaticTiledMapTile[] frameTiles;
    private int id;
    private int loopDuration;
    private MapObjects objects;
    private MapProperties properties;

    public AnimatedTiledMapTile(float f, Array<StaticTiledMapTile> array) {
        int i = array.size;
        this.frameTiles = new StaticTiledMapTile[i];
        int i2 = (int) (f * 1000.0f);
        this.loopDuration = i * i2;
        this.animationIntervals = new int[i];
        for (int i3 = 0; i3 < array.size; i3++) {
            this.frameTiles[i3] = array.get(i3);
            this.animationIntervals[i3] = i2;
        }
    }

    public static void updateAnimationBaseTime() {
        lastTiledMapRenderTime = TimeUtils.millis() - initialTimeOffset;
    }

    public int[] getAnimationIntervals() {
        return this.animationIntervals;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public TiledMapTile.BlendMode getBlendMode() {
        return this.blendMode;
    }

    public TiledMapTile getCurrentFrame() {
        return this.frameTiles[getCurrentFrameIndex()];
    }

    public int getCurrentFrameIndex() {
        int i = (int) (lastTiledMapRenderTime % ((long) this.loopDuration));
        int i2 = 0;
        while (true) {
            int[] iArr = this.animationIntervals;
            if (i2 >= iArr.length) {
                throw new GdxRuntimeException("Could not determine current animation frame in AnimatedTiledMapTile.  This should never happen.");
            }
            int i3 = iArr[i2];
            if (i <= i3) {
                return i2;
            }
            i -= i3;
            i2++;
        }
    }

    public StaticTiledMapTile[] getFrameTiles() {
        return this.frameTiles;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public int getId() {
        return this.id;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public MapObjects getObjects() {
        if (this.objects == null) {
            this.objects = new MapObjects();
        }
        return this.objects;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public float getOffsetX() {
        return getCurrentFrame().getOffsetX();
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public float getOffsetY() {
        return getCurrentFrame().getOffsetY();
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public MapProperties getProperties() {
        if (this.properties == null) {
            this.properties = new MapProperties();
        }
        return this.properties;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public TextureRegion getTextureRegion() {
        return getCurrentFrame().getTextureRegion();
    }

    public void setAnimationIntervals(int[] iArr) {
        if (iArr.length != this.animationIntervals.length) {
            StringBuilder sb = new StringBuilder("Cannot set ");
            sb.append(iArr.length);
            sb.append(" frame intervals. The given int[] must have a size of ");
            throw new GdxRuntimeException(AbstractC5044xl.o(sb, this.animationIntervals.length, "."));
        }
        this.animationIntervals = iArr;
        this.loopDuration = 0;
        for (int i : iArr) {
            this.loopDuration += i;
        }
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public void setBlendMode(TiledMapTile.BlendMode blendMode) {
        this.blendMode = blendMode;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public void setId(int i) {
        this.id = i;
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public void setOffsetX(float f) {
        throw new GdxRuntimeException("Cannot set offset of AnimatedTiledMapTile.");
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public void setOffsetY(float f) {
        throw new GdxRuntimeException("Cannot set offset of AnimatedTiledMapTile.");
    }

    @Override // com.badlogic.gdx.maps.tiled.TiledMapTile
    public void setTextureRegion(TextureRegion textureRegion) {
        throw new GdxRuntimeException("Cannot set the texture region of AnimatedTiledMapTile.");
    }

    public AnimatedTiledMapTile(IntArray intArray, Array<StaticTiledMapTile> array) {
        this.frameTiles = new StaticTiledMapTile[array.size];
        this.animationIntervals = intArray.toArray();
        this.loopDuration = 0;
        for (int i = 0; i < intArray.size; i++) {
            this.frameTiles[i] = array.get(i);
            this.loopDuration = intArray.get(i) + this.loopDuration;
        }
    }
}
