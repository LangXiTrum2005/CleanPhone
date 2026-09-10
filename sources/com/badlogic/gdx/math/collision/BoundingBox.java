package com.badlogic.gdx.math.collision;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BoundingBox implements Serializable {
    private static final long serialVersionUID = -1286036817192127343L;
    private static final Vector3 tmpVector = new Vector3();
    public final Vector3 min = new Vector3();
    public final Vector3 max = new Vector3();
    private final Vector3 cnt = new Vector3();
    private final Vector3 dim = new Vector3();

    public BoundingBox() {
        clr();
    }

    public static final float max(float f, float f2) {
        return f > f2 ? f : f2;
    }

    public static final float min(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public BoundingBox clr() {
        return set(this.min.set(0.0f, 0.0f, 0.0f), this.max.set(0.0f, 0.0f, 0.0f));
    }

    public boolean contains(BoundingBox boundingBox) {
        if (isValid()) {
            Vector3 vector3 = this.min;
            float f = vector3.x;
            Vector3 vector4 = boundingBox.min;
            if (f <= vector4.x && vector3.y <= vector4.y && vector3.z <= vector4.z) {
                Vector3 vector5 = this.max;
                float f2 = vector5.x;
                Vector3 vector6 = boundingBox.max;
                if (f2 < vector6.x || vector5.y < vector6.y || vector5.z < vector6.z) {
                }
            }
            return false;
        }
        return true;
    }

    public BoundingBox ext(Vector3 vector3) {
        Vector3 vector4 = this.min;
        Vector3 vector5 = vector4.set(min(vector4.x, vector3.x), min(this.min.y, vector3.y), min(this.min.z, vector3.z));
        Vector3 vector6 = this.max;
        return set(vector5, vector6.set(Math.max(vector6.x, vector3.x), Math.max(this.max.y, vector3.y), Math.max(this.max.z, vector3.z)));
    }

    public Vector3 getCenter(Vector3 vector3) {
        return vector3.set(this.cnt);
    }

    public float getCenterX() {
        return this.cnt.x;
    }

    public float getCenterY() {
        return this.cnt.y;
    }

    public float getCenterZ() {
        return this.cnt.z;
    }

    public Vector3 getCorner000(Vector3 vector3) {
        Vector3 vector4 = this.min;
        return vector3.set(vector4.x, vector4.y, vector4.z);
    }

    public Vector3 getCorner001(Vector3 vector3) {
        Vector3 vector4 = this.min;
        return vector3.set(vector4.x, vector4.y, this.max.z);
    }

    public Vector3 getCorner010(Vector3 vector3) {
        Vector3 vector4 = this.min;
        return vector3.set(vector4.x, this.max.y, vector4.z);
    }

    public Vector3 getCorner011(Vector3 vector3) {
        float f = this.min.x;
        Vector3 vector4 = this.max;
        return vector3.set(f, vector4.y, vector4.z);
    }

    public Vector3 getCorner100(Vector3 vector3) {
        float f = this.max.x;
        Vector3 vector4 = this.min;
        return vector3.set(f, vector4.y, vector4.z);
    }

    public Vector3 getCorner101(Vector3 vector3) {
        Vector3 vector4 = this.max;
        return vector3.set(vector4.x, this.min.y, vector4.z);
    }

    public Vector3 getCorner110(Vector3 vector3) {
        Vector3 vector4 = this.max;
        return vector3.set(vector4.x, vector4.y, this.min.z);
    }

    public Vector3 getCorner111(Vector3 vector3) {
        Vector3 vector4 = this.max;
        return vector3.set(vector4.x, vector4.y, vector4.z);
    }

    public float getDepth() {
        return this.dim.z;
    }

    public Vector3 getDimensions(Vector3 vector3) {
        return vector3.set(this.dim);
    }

    public float getHeight() {
        return this.dim.y;
    }

    public Vector3 getMax(Vector3 vector3) {
        return vector3.set(this.max);
    }

    public Vector3 getMin(Vector3 vector3) {
        return vector3.set(this.min);
    }

    public float getWidth() {
        return this.dim.x;
    }

    public BoundingBox inf() {
        this.min.set(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
        this.max.set(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        this.cnt.set(0.0f, 0.0f, 0.0f);
        this.dim.set(0.0f, 0.0f, 0.0f);
        return this;
    }

    public boolean intersects(BoundingBox boundingBox) {
        if (isValid()) {
            return Math.abs(this.cnt.x - boundingBox.cnt.x) <= (boundingBox.dim.x / 2.0f) + (this.dim.x / 2.0f) && Math.abs(this.cnt.y - boundingBox.cnt.y) <= (boundingBox.dim.y / 2.0f) + (this.dim.y / 2.0f) && Math.abs(this.cnt.z - boundingBox.cnt.z) <= (boundingBox.dim.z / 2.0f) + (this.dim.z / 2.0f);
        }
        return false;
    }

    public boolean isValid() {
        Vector3 vector3 = this.min;
        float f = vector3.x;
        Vector3 vector4 = this.max;
        return f <= vector4.x && vector3.y <= vector4.y && vector3.z <= vector4.z;
    }

    public BoundingBox mul(Matrix4 matrix4) {
        Vector3 vector3 = this.min;
        float f = vector3.x;
        float f2 = vector3.y;
        float f3 = vector3.z;
        Vector3 vector4 = this.max;
        float f4 = vector4.x;
        float f5 = vector4.y;
        float f6 = vector4.z;
        inf();
        Vector3 vector5 = tmpVector;
        ext(vector5.set(f, f2, f3).mul(matrix4));
        ext(vector5.set(f, f2, f6).mul(matrix4));
        ext(vector5.set(f, f5, f3).mul(matrix4));
        ext(vector5.set(f, f5, f6).mul(matrix4));
        ext(vector5.set(f4, f2, f3).mul(matrix4));
        ext(vector5.set(f4, f2, f6).mul(matrix4));
        ext(vector5.set(f4, f5, f3).mul(matrix4));
        ext(vector5.set(f4, f5, f6).mul(matrix4));
        return this;
    }

    public BoundingBox set(BoundingBox boundingBox) {
        return set(boundingBox.min, boundingBox.max);
    }

    public String toString() {
        return "[" + this.min + "|" + this.max + "]";
    }

    public void update() {
        this.cnt.set(this.min).add(this.max).scl(0.5f);
        this.dim.set(this.max).sub(this.min);
    }

    public boolean contains(OrientedBoundingBox orientedBoundingBox) {
        Vector3 vector3 = tmpVector;
        return contains(orientedBoundingBox.getCorner000(vector3)) && contains(orientedBoundingBox.getCorner001(vector3)) && contains(orientedBoundingBox.getCorner010(vector3)) && contains(orientedBoundingBox.getCorner011(vector3)) && contains(orientedBoundingBox.getCorner100(vector3)) && contains(orientedBoundingBox.getCorner101(vector3)) && contains(orientedBoundingBox.getCorner110(vector3)) && contains(orientedBoundingBox.getCorner111(vector3));
    }

    public BoundingBox set(Vector3 vector3, Vector3 vector4) {
        Vector3 vector5 = this.min;
        float f = vector3.x;
        float f2 = vector4.x;
        if (f >= f2) {
            f = f2;
        }
        float f3 = vector3.y;
        float f4 = vector4.y;
        if (f3 >= f4) {
            f3 = f4;
        }
        float f5 = vector3.z;
        float f6 = vector4.z;
        if (f5 >= f6) {
            f5 = f6;
        }
        vector5.set(f, f3, f5);
        Vector3 vector6 = this.max;
        float f7 = vector3.x;
        float f8 = vector4.x;
        if (f7 <= f8) {
            f7 = f8;
        }
        float f9 = vector3.y;
        float f10 = vector4.y;
        if (f9 <= f10) {
            f9 = f10;
        }
        float f11 = vector3.z;
        float f12 = vector4.z;
        if (f11 <= f12) {
            f11 = f12;
        }
        vector6.set(f7, f9, f11);
        update();
        return this;
    }

    public BoundingBox ext(BoundingBox boundingBox) {
        Vector3 vector3 = this.min;
        Vector3 vector4 = vector3.set(min(vector3.x, boundingBox.min.x), min(this.min.y, boundingBox.min.y), min(this.min.z, boundingBox.min.z));
        Vector3 vector5 = this.max;
        return set(vector4, vector5.set(max(vector5.x, boundingBox.max.x), max(this.max.y, boundingBox.max.y), max(this.max.z, boundingBox.max.z)));
    }

    public boolean contains(Vector3 vector3) {
        Vector3 vector4 = this.min;
        float f = vector4.x;
        float f2 = vector3.x;
        if (f <= f2) {
            Vector3 vector5 = this.max;
            if (vector5.x >= f2) {
                float f3 = vector4.y;
                float f4 = vector3.y;
                if (f3 <= f4 && vector5.y >= f4) {
                    float f5 = vector4.z;
                    float f6 = vector3.z;
                    if (f5 <= f6 && vector5.z >= f6) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public BoundingBox(BoundingBox boundingBox) {
        set(boundingBox);
    }

    public BoundingBox ext(Vector3 vector3, float f) {
        Vector3 vector4 = this.min;
        Vector3 vector5 = vector4.set(min(vector4.x, vector3.x - f), min(this.min.y, vector3.y - f), min(this.min.z, vector3.z - f));
        Vector3 vector6 = this.max;
        return set(vector5, vector6.set(max(vector6.x, vector3.x + f), max(this.max.y, vector3.y + f), max(this.max.z, vector3.z + f)));
    }

    public BoundingBox set(Vector3[] vector3Arr) {
        inf();
        for (Vector3 vector3 : vector3Arr) {
            ext(vector3);
        }
        return this;
    }

    public BoundingBox ext(BoundingBox boundingBox, Matrix4 matrix4) {
        Vector3 vector3 = tmpVector;
        Vector3 vector4 = boundingBox.min;
        ext(vector3.set(vector4.x, vector4.y, vector4.z).mul(matrix4));
        Vector3 vector5 = boundingBox.min;
        ext(vector3.set(vector5.x, vector5.y, boundingBox.max.z).mul(matrix4));
        Vector3 vector6 = boundingBox.min;
        ext(vector3.set(vector6.x, boundingBox.max.y, vector6.z).mul(matrix4));
        float f = boundingBox.min.x;
        Vector3 vector7 = boundingBox.max;
        ext(vector3.set(f, vector7.y, vector7.z).mul(matrix4));
        float f2 = boundingBox.max.x;
        Vector3 vector8 = boundingBox.min;
        ext(vector3.set(f2, vector8.y, vector8.z).mul(matrix4));
        Vector3 vector9 = boundingBox.max;
        ext(vector3.set(vector9.x, boundingBox.min.y, vector9.z).mul(matrix4));
        Vector3 vector10 = boundingBox.max;
        ext(vector3.set(vector10.x, vector10.y, boundingBox.min.z).mul(matrix4));
        Vector3 vector11 = boundingBox.max;
        ext(vector3.set(vector11.x, vector11.y, vector11.z).mul(matrix4));
        return this;
    }

    public BoundingBox set(List<Vector3> list) {
        inf();
        Iterator<Vector3> it = list.iterator();
        while (it.hasNext()) {
            ext(it.next());
        }
        return this;
    }

    public BoundingBox(Vector3 vector3, Vector3 vector4) {
        set(vector3, vector4);
    }

    public BoundingBox ext(float f, float f2, float f3) {
        Vector3 vector3 = this.min;
        Vector3 vector4 = vector3.set(min(vector3.x, f), min(this.min.y, f2), min(this.min.z, f3));
        Vector3 vector5 = this.max;
        return set(vector4, vector5.set(max(vector5.x, f), max(this.max.y, f2), max(this.max.z, f3)));
    }
}
