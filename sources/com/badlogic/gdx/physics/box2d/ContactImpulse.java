package com.badlogic.gdx.physics.box2d;

/* JADX INFO: loaded from: classes.dex */
public class ContactImpulse {
    long addr;
    final World world;
    float[] tmp = new float[2];
    final float[] normalImpulses = new float[2];
    final float[] tangentImpulses = new float[2];

    public ContactImpulse(World world, long j) {
        this.world = world;
        this.addr = j;
    }

    private native int jniGetCount(long j);

    private native void jniGetNormalImpulses(long j, float[] fArr);

    private native void jniGetTangentImpulses(long j, float[] fArr);

    public int getCount() {
        return jniGetCount(this.addr);
    }

    public float[] getNormalImpulses() {
        jniGetNormalImpulses(this.addr, this.normalImpulses);
        return this.normalImpulses;
    }

    public float[] getTangentImpulses() {
        jniGetTangentImpulses(this.addr, this.tangentImpulses);
        return this.tangentImpulses;
    }
}
