package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public class Fixture {
    protected long addr;
    private Body body;
    protected Shape shape;
    protected Object userData;
    private final Filter filter = new Filter();
    private boolean dirtyFilter = true;
    private final short[] tmp = new short[3];

    public Fixture(Body body, long j) {
        this.body = body;
        this.addr = j;
    }

    private native float jniGetDensity(long j);

    private native void jniGetFilterData(long j, short[] sArr);

    private native float jniGetFriction(long j);

    private native float jniGetRestitution(long j);

    private native long jniGetShape(long j);

    private native int jniGetType(long j);

    private native boolean jniIsSensor(long j);

    private native void jniRefilter(long j);

    private native void jniSetDensity(long j, float f);

    private native void jniSetFilterData(long j, short s, short s2, short s3);

    private native void jniSetFriction(long j, float f);

    private native void jniSetRestitution(long j, float f);

    private native void jniSetSensor(long j, boolean z);

    private native boolean jniTestPoint(long j, float f, float f2);

    public Body getBody() {
        return this.body;
    }

    public float getDensity() {
        return jniGetDensity(this.addr);
    }

    public Filter getFilterData() {
        if (this.dirtyFilter) {
            jniGetFilterData(this.addr, this.tmp);
            Filter filter = this.filter;
            short[] sArr = this.tmp;
            filter.maskBits = sArr[0];
            filter.categoryBits = sArr[1];
            filter.groupIndex = sArr[2];
            this.dirtyFilter = false;
        }
        return this.filter;
    }

    public float getFriction() {
        return jniGetFriction(this.addr);
    }

    public float getRestitution() {
        return jniGetRestitution(this.addr);
    }

    public Shape getShape() {
        if (this.shape == null) {
            long jJniGetShape = jniGetShape(this.addr);
            if (jJniGetShape == 0) {
                throw new GdxRuntimeException("Null shape address!");
            }
            int iJniGetType = Shape.jniGetType(jJniGetShape);
            if (iJniGetType == 0) {
                this.shape = new CircleShape(jJniGetShape);
            } else if (iJniGetType == 1) {
                this.shape = new EdgeShape(jJniGetShape);
            } else if (iJniGetType == 2) {
                this.shape = new PolygonShape(jJniGetShape);
            } else {
                if (iJniGetType != 3) {
                    throw new GdxRuntimeException("Unknown shape type!");
                }
                this.shape = new ChainShape(jJniGetShape);
            }
        }
        return this.shape;
    }

    public Shape.Type getType() {
        int iJniGetType = jniGetType(this.addr);
        if (iJniGetType == 0) {
            return Shape.Type.Circle;
        }
        if (iJniGetType == 1) {
            return Shape.Type.Edge;
        }
        if (iJniGetType == 2) {
            return Shape.Type.Polygon;
        }
        if (iJniGetType == 3) {
            return Shape.Type.Chain;
        }
        throw new GdxRuntimeException("Unknown shape type!");
    }

    public Object getUserData() {
        return this.userData;
    }

    public boolean isSensor() {
        return jniIsSensor(this.addr);
    }

    public void refilter() {
        jniRefilter(this.addr);
    }

    public void reset(Body body, long j) {
        this.body = body;
        this.addr = j;
        this.shape = null;
        this.userData = null;
        this.dirtyFilter = true;
    }

    public void setDensity(float f) {
        jniSetDensity(this.addr, f);
    }

    public void setFilterData(Filter filter) {
        jniSetFilterData(this.addr, filter.categoryBits, filter.maskBits, filter.groupIndex);
        this.filter.set(filter);
        this.dirtyFilter = false;
    }

    public void setFriction(float f) {
        jniSetFriction(this.addr, f);
    }

    public void setRestitution(float f) {
        jniSetRestitution(this.addr, f);
    }

    public void setSensor(boolean z) {
        jniSetSensor(this.addr, z);
    }

    public void setUserData(Object obj) {
        this.userData = obj;
    }

    public boolean testPoint(Vector2 vector2) {
        return jniTestPoint(this.addr, vector2.x, vector2.y);
    }

    public boolean testPoint(float f, float f2) {
        return jniTestPoint(this.addr, f, f2);
    }
}
