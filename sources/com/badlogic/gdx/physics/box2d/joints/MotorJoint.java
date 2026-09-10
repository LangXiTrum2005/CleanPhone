package com.badlogic.gdx.physics.box2d.joints;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Joint;
import com.badlogic.gdx.physics.box2d.World;

/* JADX INFO: loaded from: classes.dex */
public class MotorJoint extends Joint {
    private final Vector2 linearOffset;
    private final float[] tmp;

    public MotorJoint(World world, long j) {
        super(world, j);
        this.tmp = new float[2];
        this.linearOffset = new Vector2();
    }

    private native float jniGetAngularOffset(long j);

    private native float jniGetCorrectionFactor(long j);

    private native void jniGetLinearOffset(long j, float[] fArr);

    private native float jniGetMaxForce(long j);

    private native float jniGetMaxTorque(long j);

    private native void jniSetAngularOffset(long j, float f);

    private native void jniSetCorrectionFactor(long j, float f);

    private native void jniSetLinearOffset(long j, float f, float f2);

    private native void jniSetMaxForce(long j, float f);

    private native void jniSetMaxTorque(long j, float f);

    public float getAngularOffset() {
        return jniGetAngularOffset(this.addr);
    }

    public float getCorrectionFactor() {
        return jniGetCorrectionFactor(this.addr);
    }

    public Vector2 getLinearOffset() {
        jniGetLinearOffset(this.addr, this.tmp);
        Vector2 vector2 = this.linearOffset;
        float[] fArr = this.tmp;
        vector2.set(fArr[0], fArr[1]);
        return this.linearOffset;
    }

    public float getMaxForce() {
        return jniGetMaxForce(this.addr);
    }

    public float getMaxTorque() {
        return jniGetMaxTorque(this.addr);
    }

    public void setAngularOffset(float f) {
        jniSetAngularOffset(this.addr, f);
    }

    public void setCorrectionFactor(float f) {
        jniSetCorrectionFactor(this.addr, f);
    }

    public void setLinearOffset(Vector2 vector2) {
        jniSetLinearOffset(this.addr, vector2.x, vector2.y);
    }

    public void setMaxForce(float f) {
        jniSetMaxForce(this.addr, f);
    }

    public void setMaxTorque(float f) {
        jniSetMaxTorque(this.addr, f);
    }
}
