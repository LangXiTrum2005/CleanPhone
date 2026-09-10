package com.badlogic.gdx.maps;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public class MapLayer {
    private MapObjects objects;
    private float offsetX;
    private float offsetY;
    private float parallaxX;
    private float parallaxY;
    private MapLayer parent;
    private MapProperties properties;
    private boolean renderOffsetDirty;
    private float renderOffsetX;
    private float renderOffsetY;
    private Color tempColor;
    private Color tintColor;
    private boolean visible;
    private String name = "";
    private float opacity = 1.0f;

    public MapLayer() {
        Color color = Color.WHITE;
        this.tintColor = new Color(color);
        this.tempColor = new Color(color);
        this.visible = true;
        this.parallaxX = 1.0f;
        this.parallaxY = 1.0f;
        this.renderOffsetDirty = true;
        this.objects = new MapObjects();
        this.properties = new MapProperties();
    }

    public void calculateRenderOffsets() {
        MapLayer mapLayer = this.parent;
        if (mapLayer != null) {
            mapLayer.calculateRenderOffsets();
            this.renderOffsetX = this.parent.getRenderOffsetX() + this.offsetX;
            this.renderOffsetY = this.parent.getRenderOffsetY() + this.offsetY;
        } else {
            this.renderOffsetX = this.offsetX;
            this.renderOffsetY = this.offsetY;
        }
        this.renderOffsetDirty = false;
    }

    public Color getCombinedTintColor() {
        return this.parent != null ? this.tempColor.set(this.tintColor).mul(this.parent.getCombinedTintColor()) : this.tempColor.set(this.tintColor);
    }

    public String getName() {
        return this.name;
    }

    public MapObjects getObjects() {
        return this.objects;
    }

    public float getOffsetX() {
        return this.offsetX;
    }

    public float getOffsetY() {
        return this.offsetY;
    }

    public float getOpacity() {
        MapLayer mapLayer = this.parent;
        if (mapLayer == null) {
            return this.opacity;
        }
        return mapLayer.getOpacity() * this.opacity;
    }

    public float getParallaxX() {
        return this.parallaxX;
    }

    public float getParallaxY() {
        return this.parallaxY;
    }

    public MapLayer getParent() {
        return this.parent;
    }

    public MapProperties getProperties() {
        return this.properties;
    }

    public float getRenderOffsetX() {
        if (this.renderOffsetDirty) {
            calculateRenderOffsets();
        }
        return this.renderOffsetX;
    }

    public float getRenderOffsetY() {
        if (this.renderOffsetDirty) {
            calculateRenderOffsets();
        }
        return this.renderOffsetY;
    }

    public Color getTintColor() {
        return this.tintColor;
    }

    public void invalidateRenderOffset() {
        this.renderOffsetDirty = true;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOffsetX(float f) {
        this.offsetX = f;
        invalidateRenderOffset();
    }

    public void setOffsetY(float f) {
        this.offsetY = f;
        invalidateRenderOffset();
    }

    public void setOpacity(float f) {
        this.opacity = f;
    }

    public void setParallaxX(float f) {
        this.parallaxX = f;
    }

    public void setParallaxY(float f) {
        this.parallaxY = f;
    }

    public void setParent(MapLayer mapLayer) {
        if (mapLayer == this) {
            throw new GdxRuntimeException("Can't set self as the parent");
        }
        this.parent = mapLayer;
    }

    public void setTintColor(Color color) {
        this.tintColor.set(color);
    }

    public void setVisible(boolean z) {
        this.visible = z;
    }
}
