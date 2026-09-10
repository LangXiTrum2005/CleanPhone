package com.badlogic.gdx.physics.box2d.joints;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Joint;
import com.badlogic.gdx.physics.box2d.World;

/* JADX INFO: loaded from: classes.dex */
public class DistanceJoint extends Joint {
    private final Vector2 localAnchorA;
    private final Vector2 localAnchorB;
    private final float[] tmp;

    public DistanceJoint(World world, long j) {
        super(world, j);
        this.tmp = new float[2];
        this.localAnchorA = new Vector2();
        this.localAnchorB = new Vector2();
    }

    private native float jniGetDampingRatio(long j);

    private native float jniGetFrequency(long j);

    private native float jniGetLength(long j);

    private native void jniGetLocalAnchorA(long j, float[] fArr);

    private native void jniGetLocalAnchorB(long j, float[] fArr);

    private native void jniSetDampingRatio(long j, float f);

    private native void jniSetFrequency(long j, float f);

    private native void jniSetLength(long j, float f);

    public float getDampingRatio() {
        return jniGetDampingRatio(this.addr);
    }

    public float getFrequency() {
        return jniGetFrequency(this.addr);
    }

    public float getLength() {
        return jniGetLength(this.addr);
    }

    public Vector2 getLocalAnchorA() {
        jniGetLocalAnchorA(this.addr, this.tmp);
        Vector2 vector2 = this.localAnchorA;
        float[] fArr = this.tmp;
        vector2.set(fArr[0], fArr[1]);
        return this.localAnchorA;
    }

    public Vector2 getLocalAnchorB() {
        jniGetLocalAnchorB(this.addr, this.tmp);
        Vector2 vector2 = this.localAnchorB;
        float[] fArr = this.tmp;
        vector2.set(fArr[0], fArr[1]);
        return this.localAnchorB;
    }

    public void setDampingRatio(float f) {
        jniSetDampingRatio(this.addr, f);
    }

    public void setFrequency(float f) {
        jniSetFrequency(this.addr, f);
    }

    public void setLength(float f) {
        jniSetLength(this.addr, f);
    }
}
