package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;

/* JADX INFO: loaded from: classes.dex */
public class Transform {
    public static final int COS = 2;
    public static final int POS_X = 0;
    public static final int POS_Y = 1;
    public static final int SIN = 3;
    private Vector2 orientation;
    private Vector2 position;
    public float[] vals;

    public Transform() {
        this.vals = new float[4];
        this.position = new Vector2();
        this.orientation = new Vector2();
    }

    public Vector2 getOrientation() {
        Vector2 vector2 = this.orientation;
        float[] fArr = this.vals;
        return vector2.set(fArr[2], fArr[3]);
    }

    public Vector2 getPosition() {
        Vector2 vector2 = this.position;
        float[] fArr = this.vals;
        return vector2.set(fArr[0], fArr[1]);
    }

    public float getRotation() {
        float[] fArr = this.vals;
        return (float) Math.atan2(fArr[3], fArr[2]);
    }

    public Vector2 mul(Vector2 vector2) {
        float[] fArr = this.vals;
        float f = fArr[0];
        float f2 = fArr[2];
        float f3 = vector2.x;
        float f4 = (f2 * f3) + f;
        float f5 = fArr[3];
        float f6 = vector2.y;
        float f7 = ((-f5) * f6) + f4;
        float f8 = f2 * f6;
        float f9 = f8 + (f5 * f3) + fArr[1];
        vector2.x = f7;
        vector2.y = f9;
        return vector2;
    }

    public void setOrientation(Vector2 vector2) {
        float[] fArr = this.vals;
        fArr[2] = vector2.x;
        fArr[3] = vector2.y;
    }

    public void setPosition(Vector2 vector2) {
        float[] fArr = this.vals;
        fArr[0] = vector2.x;
        fArr[1] = vector2.y;
    }

    public void setRotation(float f) {
        double d = f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float[] fArr = this.vals;
        fArr[2] = fCos;
        fArr[3] = fSin;
    }

    public Transform(Vector2 vector2, float f) {
        this.vals = new float[4];
        this.position = new Vector2();
        this.orientation = new Vector2();
        setPosition(vector2);
        setRotation(f);
    }

    public Transform(Vector2 vector2, Vector2 vector3) {
        this.vals = new float[4];
        this.position = new Vector2();
        this.orientation = new Vector2();
        setPosition(vector2);
        setOrientation(vector3);
    }
}
