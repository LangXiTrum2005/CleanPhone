package com.badlogic.gdx.maps.objects;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.math.Circle;

/* JADX INFO: loaded from: classes.dex */
public class CircleMapObject extends MapObject {
    private Circle circle;

    public CircleMapObject() {
        this(0.0f, 0.0f, 1.0f);
    }

    public Circle getCircle() {
        return this.circle;
    }

    public CircleMapObject(float f, float f2, float f3) {
        this.circle = new Circle(f, f2, f3);
    }
}
