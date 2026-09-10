package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;

/* JADX INFO: loaded from: classes.dex */
public class Contact {
    protected long addr;
    protected World world;
    protected final WorldManifold worldManifold = new WorldManifold();
    private final float[] tmp = new float[8];

    public Contact(World world, long j) {
        this.addr = j;
        this.world = world;
    }

    private native int jniGetChildIndexA(long j);

    private native int jniGetChildIndexB(long j);

    private native long jniGetFixtureA(long j);

    private native long jniGetFixtureB(long j);

    private native float jniGetFriction(long j);

    private native float jniGetRestitution(long j);

    private native float jniGetTangentSpeed(long j);

    private native int jniGetWorldManifold(long j, float[] fArr);

    private native boolean jniIsEnabled(long j);

    private native boolean jniIsTouching(long j);

    private native void jniResetFriction(long j);

    private native void jniResetRestitution(long j);

    private native void jniSetEnabled(long j, boolean z);

    private native void jniSetFriction(long j, float f);

    private native void jniSetRestitution(long j, float f);

    private native void jniSetTangentSpeed(long j, float f);

    public void ResetRestitution() {
        jniResetRestitution(this.addr);
    }

    public int getChildIndexA() {
        return jniGetChildIndexA(this.addr);
    }

    public int getChildIndexB() {
        return jniGetChildIndexB(this.addr);
    }

    public Fixture getFixtureA() {
        return this.world.fixtures.get(jniGetFixtureA(this.addr));
    }

    public Fixture getFixtureB() {
        return this.world.fixtures.get(jniGetFixtureB(this.addr));
    }

    public float getFriction() {
        return jniGetFriction(this.addr);
    }

    public float getRestitution() {
        return jniGetRestitution(this.addr);
    }

    public float getTangentSpeed() {
        return jniGetTangentSpeed(this.addr);
    }

    public WorldManifold getWorldManifold() {
        int iJniGetWorldManifold = jniGetWorldManifold(this.addr, this.tmp);
        WorldManifold worldManifold = this.worldManifold;
        worldManifold.numContactPoints = iJniGetWorldManifold;
        Vector2 vector2 = worldManifold.normal;
        float[] fArr = this.tmp;
        vector2.set(fArr[0], fArr[1]);
        for (int i = 0; i < iJniGetWorldManifold; i++) {
            Vector2 vector3 = this.worldManifold.points[i];
            float[] fArr2 = this.tmp;
            int i2 = i * 2;
            vector3.x = fArr2[i2 + 2];
            vector3.y = fArr2[i2 + 3];
        }
        WorldManifold worldManifold2 = this.worldManifold;
        float[] fArr3 = worldManifold2.separations;
        float[] fArr4 = this.tmp;
        fArr3[0] = fArr4[6];
        fArr3[1] = fArr4[7];
        return worldManifold2;
    }

    public boolean isEnabled() {
        return jniIsEnabled(this.addr);
    }

    public boolean isTouching() {
        return jniIsTouching(this.addr);
    }

    public void resetFriction() {
        jniResetFriction(this.addr);
    }

    public void setEnabled(boolean z) {
        jniSetEnabled(this.addr, z);
    }

    public void setFriction(float f) {
        jniSetFriction(this.addr, f);
    }

    public void setRestitution(float f) {
        jniSetRestitution(this.addr, f);
    }

    public void setTangentSpeed(float f) {
        jniSetTangentSpeed(this.addr, f);
    }
}
