package com.badlogic.gdx.maps;

import com.badlogic.gdx.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public class MapObject {
    private String name = "";
    private float opacity = 1.0f;
    private boolean visible = true;
    private MapProperties properties = new MapProperties();
    private Color color = Color.WHITE.cpy();

    public Color getColor() {
        return this.color;
    }

    public String getName() {
        return this.name;
    }

    public float getOpacity() {
        return this.opacity;
    }

    public MapProperties getProperties() {
        return this.properties;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOpacity(float f) {
        this.opacity = f;
    }

    public void setVisible(boolean z) {
        this.visible = z;
    }
}
