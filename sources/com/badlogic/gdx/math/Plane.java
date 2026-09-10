package com.badlogic.gdx.math;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class Plane implements Serializable {
    private static final long serialVersionUID = -1240652082930747866L;
    public float d;
    public final Vector3 normal;

    public enum PlaneSide {
        OnPlane,
        Back,
        Front
    }

    public Plane() {
        this.normal = new Vector3();
        this.d = 0.0f;
    }

    public float distance(Vector3 vector3) {
        return this.normal.dot(vector3) + this.d;
    }

    public float getD() {
        return this.d;
    }

    public Vector3 getNormal() {
        return this.normal;
    }

    public boolean isFrontFacing(Vector3 vector3) {
        return this.normal.dot(vector3) <= 0.0f;
    }

    public void set(Vector3 vector3, Vector3 vector4, Vector3 vector5) {
        this.normal.set(vector3).sub(vector4).crs(vector4.x - vector5.x, vector4.y - vector5.y, vector4.z - vector5.z).nor();
        this.d = -vector3.dot(this.normal);
    }

    public PlaneSide testPoint(Vector3 vector3) {
        float fDot = this.normal.dot(vector3) + this.d;
        if (fDot == 0.0f) {
            return PlaneSide.OnPlane;
        }
        return fDot < 0.0f ? PlaneSide.Back : PlaneSide.Front;
    }

    public String toString() {
        return this.normal.toString() + ", " + this.d;
    }

    public void set(float f, float f2, float f3, float f4) {
        this.normal.set(f, f2, f3);
        this.d = f4;
    }

    public Plane(Vector3 vector3, float f) {
        Vector3 vector4 = new Vector3();
        this.normal = vector4;
        this.d = 0.0f;
        vector4.set(vector3).nor();
        this.d = f;
    }

    public void set(Vector3 vector3, Vector3 vector4) {
        this.normal.set(vector4);
        this.d = -vector3.dot(vector4);
    }

    public PlaneSide testPoint(float f, float f2, float f3) {
        float fDot = this.normal.dot(f, f2, f3) + this.d;
        if (fDot == 0.0f) {
            return PlaneSide.OnPlane;
        }
        if (fDot < 0.0f) {
            return PlaneSide.Back;
        }
        return PlaneSide.Front;
    }

    public void set(float f, float f2, float f3, float f4, float f5, float f6) {
        this.normal.set(f4, f5, f6);
        float f7 = f3 * f6;
        this.d = -(f7 + (f2 * f5) + (f * f4));
    }

    public Plane(Vector3 vector3, Vector3 vector4) {
        Vector3 vector5 = new Vector3();
        this.normal = vector5;
        this.d = 0.0f;
        vector5.set(vector3).nor();
        this.d = -vector5.dot(vector4);
    }

    public void set(Plane plane) {
        this.normal.set(plane.normal);
        this.d = plane.d;
    }

    public Plane(Vector3 vector3, Vector3 vector4, Vector3 vector5) {
        this.normal = new Vector3();
        this.d = 0.0f;
        set(vector3, vector4, vector5);
    }
}
