package com.badlogic.gdx.math;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class Matrix4 implements Serializable {
    public static final int M00 = 0;
    public static final int M01 = 4;
    public static final int M02 = 8;
    public static final int M03 = 12;
    public static final int M10 = 1;
    public static final int M11 = 5;
    public static final int M12 = 9;
    public static final int M13 = 13;
    public static final int M20 = 2;
    public static final int M21 = 6;
    public static final int M22 = 10;
    public static final int M23 = 14;
    public static final int M30 = 3;
    public static final int M31 = 7;
    public static final int M32 = 11;
    public static final int M33 = 15;
    private static final long serialVersionUID = -2717655254359579617L;
    public final float[] val;
    static final Quaternion quat = new Quaternion();
    static final Quaternion quat2 = new Quaternion();
    static final Vector3 l_vez = new Vector3();
    static final Vector3 l_vex = new Vector3();
    static final Vector3 l_vey = new Vector3();
    static final Vector3 tmpVec = new Vector3();
    static final Matrix4 tmpMat = new Matrix4();
    static final Vector3 right = new Vector3();
    static final Vector3 tmpForward = new Vector3();
    static final Vector3 tmpUp = new Vector3();

    public Matrix4() {
        float[] fArr = new float[16];
        this.val = fArr;
        fArr[0] = 1.0f;
        fArr[5] = 1.0f;
        fArr[10] = 1.0f;
        fArr[15] = 1.0f;
    }

    public static void mulVec(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr[0] * f;
        float f3 = fArr2[1];
        float f4 = (fArr[4] * f3) + f2;
        float f5 = fArr2[2];
        float f6 = (fArr[8] * f5) + f4 + fArr[12];
        float f7 = (fArr[9] * f5) + (fArr[5] * f3) + (fArr[1] * f) + fArr[13];
        float f8 = (f5 * fArr[10]) + (f3 * fArr[6]) + (f * fArr[2]) + fArr[14];
        fArr2[0] = f6;
        fArr2[1] = f7;
        fArr2[2] = f8;
    }

    public static native void mulVec(float[] fArr, float[] fArr2, int i, int i2, int i3);

    public static void prj(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr[3] * f;
        float f3 = fArr2[1];
        float f4 = (fArr[7] * f3) + f2;
        float f5 = fArr2[2];
        float f6 = 1.0f / (((fArr[11] * f5) + f4) + fArr[15]);
        float f7 = ((fArr[8] * f5) + (fArr[4] * f3) + (fArr[0] * f) + fArr[12]) * f6;
        float f8 = ((fArr[9] * f5) + (fArr[5] * f3) + (fArr[1] * f) + fArr[13]) * f6;
        float f9 = ((f5 * fArr[10]) + (f3 * fArr[6]) + (f * fArr[2]) + fArr[14]) * f6;
        fArr2[0] = f7;
        fArr2[1] = f8;
        fArr2[2] = f9;
    }

    public static native void prj(float[] fArr, float[] fArr2, int i, int i2, int i3);

    public static void rot(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr[0] * f;
        float f3 = fArr2[1];
        float f4 = (fArr[4] * f3) + f2;
        float f5 = fArr2[2];
        float f6 = (fArr[8] * f5) + f4;
        float f7 = (fArr[9] * f5) + (fArr[5] * f3) + (fArr[1] * f);
        float f8 = (f5 * fArr[10]) + (f3 * fArr[6]) + (f * fArr[2]);
        fArr2[0] = f6;
        fArr2[1] = f7;
        fArr2[2] = f8;
    }

    public static native void rot(float[] fArr, float[] fArr2, int i, int i2, int i3);

    public Matrix4 avg(Matrix4 matrix4, float f) {
        Vector3 vector3 = tmpVec;
        getScale(vector3);
        Vector3 vector4 = tmpForward;
        matrix4.getScale(vector4);
        Quaternion quaternion = quat;
        getRotation(quaternion);
        Quaternion quaternion2 = quat2;
        matrix4.getRotation(quaternion2);
        Vector3 vector5 = tmpUp;
        getTranslation(vector5);
        Vector3 vector6 = right;
        matrix4.getTranslation(vector6);
        Vector3 vector3Scl = vector3.scl(f);
        float f2 = 1.0f - f;
        setToScaling(vector3Scl.add(vector4.scl(f2)));
        rotate(quaternion.slerp(quaternion2, f2));
        setTranslation(vector5.scl(f).add(vector6.scl(f2)));
        return this;
    }

    public Matrix4 cpy() {
        return new Matrix4(this);
    }

    public float det() {
        float[] fArr = this.val;
        float f = fArr[3];
        float f2 = fArr[6];
        float f3 = fArr[9];
        float f4 = fArr[12];
        float f5 = fArr[2];
        float f6 = fArr[7];
        float fC = AbstractC3950lJ.C(f5, f6, f3, f4, f * f2 * f3 * f4);
        float f7 = fArr[5];
        float f8 = fArr[10];
        float fX = AbstractC5044xl.x(f * f7, f8, f4, fC);
        float f9 = fArr[1];
        float fH = AbstractC3950lJ.h(f9, f6, f8, f4, fX);
        float f10 = fArr[11];
        float fC2 = AbstractC3950lJ.C(f9, f2, f10, f4, DM.A(f5 * f7, f10, f4, fH));
        float f11 = fArr[8];
        float f12 = fArr[13];
        float fH2 = AbstractC3950lJ.h(f5, f6, f11, f12, fC2 - (((f * f2) * f11) * f12));
        float f13 = fArr[4];
        float fH3 = AbstractC3950lJ.h(f, f13, f8, f12, fH2);
        float f14 = fArr[0];
        float fH4 = AbstractC3950lJ.h(f14, f2, f10, f12, AbstractC3950lJ.C(f5, f13, f10, f12, AbstractC3950lJ.C(f14, f6, f8, f12, fH3)));
        float f15 = fArr[14];
        float fC3 = AbstractC3950lJ.C(f14, f7, f10, f15, AbstractC3950lJ.h(f9, f13, f10, f15, AbstractC3950lJ.h(f14, f6, f3, f15, AbstractC3950lJ.C(f, f13, f3, f15, AbstractC3950lJ.C(f9, f6, f11, f15, (f * f7 * f11 * f15) + fH4)))));
        float f16 = fArr[15];
        return AbstractC3950lJ.h(f14, f7, f8, f16, AbstractC3950lJ.C(f9, f13, f8, f16, AbstractC3950lJ.C(f14, f2, f3, f16, AbstractC3950lJ.h(f5, f13, f3, f16, AbstractC3950lJ.h(f9, f2, f11, f16, fC3 - (((f5 * f7) * f11) * f16))))));
    }

    public float det3x3() {
        float[] fArr = this.val;
        float f = fArr[0];
        float f2 = fArr[5];
        float f3 = fArr[10];
        float f4 = fArr[4];
        float f5 = fArr[9];
        float f6 = fArr[2];
        float f7 = (f4 * f5 * f6) + (f * f2 * f3);
        float f8 = fArr[8];
        float f9 = fArr[1];
        float f10 = fArr[6];
        return AbstractC5044xl.x(f8, f2, f6, AbstractC5044xl.x(f4, f9, f3, AbstractC5044xl.x(f, f5, f10, (f8 * f9 * f10) + f7)));
    }

    public void extract4x3Matrix(float[] fArr) {
        float[] fArr2 = this.val;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[4];
        fArr[4] = fArr2[5];
        fArr[5] = fArr2[6];
        fArr[6] = fArr2[8];
        fArr[7] = fArr2[9];
        fArr[8] = fArr2[10];
        fArr[9] = fArr2[12];
        fArr[10] = fArr2[13];
        fArr[11] = fArr2[14];
    }

    public Quaternion getRotation(Quaternion quaternion, boolean z) {
        return quaternion.setFromMatrix(z, this);
    }

    public Vector3 getScale(Vector3 vector3) {
        return vector3.set(getScaleX(), getScaleY(), getScaleZ());
    }

    public float getScaleX() {
        return (MathUtils.isZero(this.val[4]) && MathUtils.isZero(this.val[8])) ? Math.abs(this.val[0]) : (float) Math.sqrt(getScaleXSquared());
    }

    public float getScaleXSquared() {
        float[] fArr = this.val;
        float f = fArr[0];
        float f2 = fArr[4];
        float f3 = f2 * f2;
        float f4 = fArr[8];
        return (f4 * f4) + f3 + (f * f);
    }

    public float getScaleY() {
        return (MathUtils.isZero(this.val[1]) && MathUtils.isZero(this.val[9])) ? Math.abs(this.val[5]) : (float) Math.sqrt(getScaleYSquared());
    }

    public float getScaleYSquared() {
        float[] fArr = this.val;
        float f = fArr[1];
        float f2 = fArr[5];
        float f3 = f2 * f2;
        float f4 = fArr[9];
        return (f4 * f4) + f3 + (f * f);
    }

    public float getScaleZ() {
        return (MathUtils.isZero(this.val[2]) && MathUtils.isZero(this.val[6])) ? Math.abs(this.val[10]) : (float) Math.sqrt(getScaleZSquared());
    }

    public float getScaleZSquared() {
        float[] fArr = this.val;
        float f = fArr[2];
        float f2 = fArr[6];
        float f3 = f2 * f2;
        float f4 = fArr[10];
        return (f4 * f4) + f3 + (f * f);
    }

    public Vector3 getTranslation(Vector3 vector3) {
        float[] fArr = this.val;
        vector3.x = fArr[12];
        vector3.y = fArr[13];
        vector3.z = fArr[14];
        return vector3;
    }

    public float[] getValues() {
        return this.val;
    }

    public boolean hasRotationOrScaling() {
        return (MathUtils.isEqual(this.val[0], 1.0f) && MathUtils.isEqual(this.val[5], 1.0f) && MathUtils.isEqual(this.val[10], 1.0f) && MathUtils.isZero(this.val[4]) && MathUtils.isZero(this.val[8]) && MathUtils.isZero(this.val[1]) && MathUtils.isZero(this.val[9]) && MathUtils.isZero(this.val[2]) && MathUtils.isZero(this.val[6])) ? false : true;
    }

    public Matrix4 idt() {
        float[] fArr = this.val;
        fArr[0] = 1.0f;
        fArr[4] = 0.0f;
        fArr[8] = 0.0f;
        fArr[12] = 0.0f;
        fArr[1] = 0.0f;
        fArr[5] = 1.0f;
        fArr[9] = 0.0f;
        fArr[13] = 0.0f;
        fArr[2] = 0.0f;
        fArr[6] = 0.0f;
        fArr[10] = 1.0f;
        fArr[14] = 0.0f;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        return this;
    }

    public Matrix4 inv() {
        float[] fArr = this.val;
        float f = fArr[3];
        float f2 = fArr[6];
        float f3 = fArr[9];
        float f4 = fArr[12];
        float f5 = fArr[2];
        float f6 = fArr[7];
        float fC = AbstractC3950lJ.C(f5, f6, f3, f4, f * f2 * f3 * f4);
        float f7 = fArr[5];
        float f8 = fArr[10];
        float fX = AbstractC5044xl.x(f * f7, f8, f4, fC);
        float f9 = fArr[1];
        float fH = AbstractC3950lJ.h(f9, f6, f8, f4, fX);
        float f10 = fArr[11];
        float fC2 = AbstractC3950lJ.C(f9, f2, f10, f4, DM.A(f5 * f7, f10, f4, fH));
        float f11 = fArr[8];
        float f12 = fArr[13];
        float fH2 = AbstractC3950lJ.h(f5, f6, f11, f12, fC2 - (((f * f2) * f11) * f12));
        float f13 = fArr[4];
        float fH3 = AbstractC3950lJ.h(f, f13, f8, f12, fH2);
        float f14 = fArr[0];
        float fH4 = AbstractC3950lJ.h(f14, f2, f10, f12, AbstractC3950lJ.C(f5, f13, f10, f12, AbstractC3950lJ.C(f14, f6, f8, f12, fH3)));
        float f15 = fArr[14];
        float fC3 = AbstractC3950lJ.C(f14, f7, f10, f15, AbstractC3950lJ.h(f9, f13, f10, f15, AbstractC3950lJ.h(f14, f6, f3, f15, AbstractC3950lJ.C(f, f13, f3, f15, AbstractC3950lJ.C(f9, f6, f11, f15, (f * f7 * f11 * f15) + fH4)))));
        float f16 = fArr[15];
        float fH5 = AbstractC3950lJ.h(f14, f7, f8, f16, AbstractC3950lJ.C(f9, f13, f8, f16, AbstractC3950lJ.C(f14, f2, f3, f16, AbstractC3950lJ.h(f5, f13, f3, f16, AbstractC3950lJ.h(f9, f2, f11, f16, fC3 - (((f5 * f7) * f11) * f16))))));
        if (fH5 == 0.0f) {
            throw new RuntimeException("non-invertible matrix");
        }
        float fA = DM.A(f7, f8, f16, AbstractC5044xl.x(f3, f2, f16, AbstractC5044xl.x(f7, f15, f10, DM.A(f12, f2, f10, AbstractC5044xl.x(f12, f8, f6, f3 * f15 * f6)))));
        float fX2 = AbstractC5044xl.x(f13, f8, f16, DM.A(f11, f2, f16, DM.A(f13, f15, f10, AbstractC5044xl.x(f4, f2, f10, AbstractC5044xl.x(f11, f15, f6, f4 * f8 * f6)))));
        float fA2 = DM.A(f13, f3, f16, AbstractC5044xl.x(f11, f7, f16, AbstractC5044xl.x(f13, f12, f10, DM.A(f4, f7, f10, AbstractC5044xl.x(f4, f3, f6, f11 * f12 * f6)))));
        float fX3 = AbstractC5044xl.x(f13, f3, f15, DM.A(f11, f7, f15, DM.A(f13, f12, f8, AbstractC5044xl.x(f4, f7, f8, AbstractC5044xl.x(f11, f12, f2, f4 * f3 * f2)))));
        float fX4 = AbstractC5044xl.x(f9, f8, f16, DM.A(f3, f5, f16, DM.A(f9, f15, f10, AbstractC5044xl.x(f12, f5, f10, AbstractC5044xl.x(f3, f15, f, f12 * f8 * f)))));
        float fA3 = DM.A(f14, f8, f16, AbstractC5044xl.x(f11, f5, f16, AbstractC5044xl.x(f14, f15, f10, DM.A(f4, f5, f10, AbstractC5044xl.x(f4, f8, f, f11 * f15 * f)))));
        float fX5 = AbstractC5044xl.x(f14, f3, f16, DM.A(f11, f9, f16, DM.A(f14, f12, f10, AbstractC5044xl.x(f4, f9, f10, AbstractC5044xl.x(f11, f12, f, f4 * f3 * f)))));
        float fA4 = DM.A(f14, f3, f15, AbstractC5044xl.x(f11, f9, f15, AbstractC5044xl.x(f14, f12, f8, DM.A(f4, f9, f8, AbstractC5044xl.x(f4, f3, f5, f11 * f12 * f5)))));
        float fA5 = DM.A(f9, f2, f16, AbstractC5044xl.x(f7, f5, f16, AbstractC5044xl.x(f9, f15, f6, DM.A(f12, f5, f6, AbstractC5044xl.x(f12, f2, f, f7 * f15 * f)))));
        float fX6 = AbstractC5044xl.x(f14, f2, f16, DM.A(f13, f5, f16, DM.A(f14, f15, f6, AbstractC5044xl.x(f4, f5, f6, AbstractC5044xl.x(f13, f15, f, f4 * f2 * f)))));
        float fA6 = DM.A(f14, f7, f16, AbstractC5044xl.x(f13, f9, f16, AbstractC5044xl.x(f14, f12, f6, DM.A(f4, f9, f6, AbstractC5044xl.x(f4, f7, f, f13 * f12 * f)))));
        float fX7 = AbstractC5044xl.x(f14, f7, f15, DM.A(f13, f9, f15, DM.A(f14, f12, f2, AbstractC5044xl.x(f4, f9, f2, AbstractC5044xl.x(f13, f12, f5, f4 * f7 * f5)))));
        float fX8 = AbstractC5044xl.x(f9, f2, f10, DM.A(f7, f5, f10, DM.A(f9, f8, f6, AbstractC5044xl.x(f3, f5, f6, AbstractC5044xl.x(f7, f8, f, f3 * f2 * f)))));
        float fA7 = DM.A(f14, f2, f10, AbstractC5044xl.x(f13, f5, f10, AbstractC5044xl.x(f14, f8, f6, DM.A(f11, f5, f6, AbstractC5044xl.x(f11, f2, f, f13 * f8 * f)))));
        float fX9 = AbstractC5044xl.x(f14, f7, f10, DM.A(f13, f9, f10, DM.A(f14, f3, f6, AbstractC5044xl.x(f11, f9, f6, AbstractC5044xl.x(f13, f3, f, f11 * f7 * f)))));
        float fA8 = DM.A(f14, f7, f8, AbstractC5044xl.x(f13, f9, f8, AbstractC5044xl.x(f14, f3, f2, DM.A(f11, f9, f2, AbstractC5044xl.x(f11, f7, f5, f13 * f3 * f5)))));
        float f17 = 1.0f / fH5;
        fArr[0] = fA * f17;
        fArr[1] = fX4 * f17;
        fArr[2] = fA5 * f17;
        fArr[3] = fX8 * f17;
        fArr[4] = fX2 * f17;
        fArr[5] = fA3 * f17;
        fArr[6] = fX6 * f17;
        fArr[7] = fA7 * f17;
        fArr[8] = fA2 * f17;
        fArr[9] = fX5 * f17;
        fArr[10] = fA6 * f17;
        fArr[11] = fX9 * f17;
        fArr[12] = fX3 * f17;
        fArr[13] = fA4 * f17;
        fArr[14] = fX7 * f17;
        fArr[15] = fA8 * f17;
        return this;
    }

    public Matrix4 lerp(Matrix4 matrix4, float f) {
        for (int i = 0; i < 16; i++) {
            float[] fArr = this.val;
            fArr[i] = (matrix4.val[i] * f) + ((1.0f - f) * fArr[i]);
        }
        return this;
    }

    public Matrix4 mul(Matrix4 matrix4) {
        mul(this.val, matrix4.val);
        return this;
    }

    public Matrix4 mulLeft(Matrix4 matrix4) {
        Matrix4 matrix5 = tmpMat;
        matrix5.set(matrix4);
        mul(matrix5.val, this.val);
        return set(matrix5);
    }

    public Matrix4 rotate(Vector3 vector3, float f) {
        if (f == 0.0f) {
            return this;
        }
        Quaternion quaternion = quat;
        quaternion.set(vector3, f);
        return rotate(quaternion);
    }

    public Matrix4 rotateRad(Vector3 vector3, float f) {
        if (f == 0.0f) {
            return this;
        }
        Quaternion quaternion = quat;
        quaternion.setFromAxisRad(vector3, f);
        return rotate(quaternion);
    }

    public Matrix4 rotateTowardDirection(Vector3 vector3, Vector3 vector4) {
        Vector3 vector5 = l_vez;
        vector5.set(vector3).nor();
        Vector3 vector6 = l_vex;
        vector6.set(vector3).crs(vector4).nor();
        Vector3 vector7 = l_vey;
        vector7.set(vector6).crs(vector5).nor();
        float[] fArr = this.val;
        float f = fArr[0];
        float f2 = vector6.x;
        float f3 = fArr[4];
        float f4 = vector6.y;
        float f5 = fArr[8];
        float f6 = vector6.z;
        float f7 = f5 * f6;
        float f8 = f7 + (f3 * f4) + (f * f2);
        float f9 = vector7.x;
        float f10 = vector7.y;
        float f11 = vector7.z;
        float f12 = (f5 * f11) + (f3 * f10) + (f * f9);
        float f13 = vector5.x;
        float f14 = vector5.y;
        float f15 = vector5.z;
        float f16 = (f5 * (-f15)) + (f3 * (-f14)) + (f * (-f13));
        float f17 = fArr[1];
        float f18 = fArr[5];
        float f19 = fArr[9];
        float f20 = f19 * f6;
        float f21 = f20 + (f18 * f4) + (f17 * f2);
        float f22 = (f19 * f11) + (f18 * f10) + (f17 * f9);
        float f23 = fArr[2];
        float f24 = fArr[6];
        float f25 = fArr[10];
        float f26 = f25 * f6;
        float f27 = f26 + (f24 * f4) + (f23 * f2);
        float f28 = (f25 * f11) + (f24 * f10) + (f23 * f9);
        float f29 = (f25 * (-f15)) + (f24 * (-f14)) + (f23 * (-f13));
        float f30 = fArr[3];
        float f31 = fArr[7];
        float f32 = fArr[11];
        float f33 = f6 * f32;
        float f34 = f33 + (f4 * f31) + (f2 * f30);
        float f35 = f11 * f32;
        float f36 = f35 + (f10 * f31) + (f9 * f30);
        float f37 = f32 * (-f15);
        fArr[0] = f8;
        fArr[1] = f21;
        fArr[2] = f27;
        fArr[3] = f34;
        fArr[4] = f12;
        fArr[5] = f22;
        fArr[6] = f28;
        fArr[7] = f36;
        fArr[8] = f16;
        fArr[9] = (f19 * (-f15)) + (f18 * (-f14)) + (f17 * (-f13));
        fArr[10] = f29;
        fArr[11] = f37 + (f31 * (-f14)) + (f30 * (-f13));
        return this;
    }

    public Matrix4 rotateTowardTarget(Vector3 vector3, Vector3 vector4) {
        Vector3 vector5 = tmpVec;
        float f = vector3.x;
        float[] fArr = this.val;
        vector5.set(f - fArr[12], vector3.y - fArr[13], vector3.z - fArr[14]);
        return rotateTowardDirection(vector5, vector4);
    }

    public Matrix4 scale(float f, float f2, float f3) {
        float[] fArr = this.val;
        fArr[0] = fArr[0] * f;
        fArr[4] = fArr[4] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[1] = fArr[1] * f;
        fArr[5] = fArr[5] * f2;
        fArr[9] = fArr[9] * f3;
        fArr[2] = fArr[2] * f;
        fArr[6] = fArr[6] * f2;
        fArr[10] = fArr[10] * f3;
        fArr[3] = fArr[3] * f;
        fArr[7] = fArr[7] * f2;
        fArr[11] = fArr[11] * f3;
        return this;
    }

    public Matrix4 scl(Vector3 vector3) {
        float[] fArr = this.val;
        fArr[0] = fArr[0] * vector3.x;
        fArr[5] = fArr[5] * vector3.y;
        fArr[10] = fArr[10] * vector3.z;
        return this;
    }

    public Matrix4 set(Matrix4 matrix4) {
        return set(matrix4.val);
    }

    public Matrix4 setAsAffine(Affine2 affine2) {
        float[] fArr = this.val;
        fArr[0] = affine2.m00;
        fArr[1] = affine2.m10;
        fArr[4] = affine2.m01;
        fArr[5] = affine2.m11;
        fArr[12] = affine2.m02;
        fArr[13] = affine2.m12;
        return this;
    }

    public Matrix4 setFromEulerAngles(float f, float f2, float f3) {
        Quaternion quaternion = quat;
        quaternion.setEulerAngles(f, f2, f3);
        return set(quaternion);
    }

    public Matrix4 setFromEulerAnglesRad(float f, float f2, float f3) {
        Quaternion quaternion = quat;
        quaternion.setEulerAnglesRad(f, f2, f3);
        return set(quaternion);
    }

    public Matrix4 setToLookAt(Vector3 vector3, Vector3 vector4) {
        Vector3 vector5 = l_vez;
        vector5.set(vector3).nor();
        Vector3 vector6 = l_vex;
        vector6.set(vector3).crs(vector4).nor();
        Vector3 vector7 = l_vey;
        vector7.set(vector6).crs(vector5).nor();
        idt();
        float[] fArr = this.val;
        fArr[0] = vector6.x;
        fArr[4] = vector6.y;
        fArr[8] = vector6.z;
        fArr[1] = vector7.x;
        fArr[5] = vector7.y;
        fArr[9] = vector7.z;
        fArr[2] = -vector5.x;
        fArr[6] = -vector5.y;
        fArr[10] = -vector5.z;
        return this;
    }

    public Matrix4 setToOrtho(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 - f;
        float f8 = f4 - f3;
        float f9 = f6 - f5;
        float f10 = (-(f2 + f)) / f7;
        float f11 = (-(f4 + f3)) / f8;
        float[] fArr = this.val;
        fArr[0] = 2.0f / f7;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 2.0f / f8;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = (-2.0f) / f9;
        fArr[11] = 0.0f;
        fArr[12] = f10;
        fArr[13] = f11;
        fArr[14] = (-(f6 + f5)) / f9;
        fArr[15] = 1.0f;
        return this;
    }

    public Matrix4 setToOrtho2D(float f, float f2, float f3, float f4) {
        setToOrtho(f, f + f3, f2, f2 + f4, 0.0f, 1.0f);
        return this;
    }

    public Matrix4 setToProjection(float f, float f2, float f3, float f4) {
        idt();
        float fTan = (float) (1.0d / Math.tan((((double) f3) * 0.017453292519943295d) / 2.0d));
        float f5 = f - f2;
        float f6 = (f2 + f) / f5;
        float f7 = ((f2 * 2.0f) * f) / f5;
        float[] fArr = this.val;
        fArr[0] = fTan / f4;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = fTan;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = f6;
        fArr[11] = -1.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = f7;
        fArr[15] = 0.0f;
        return this;
    }

    public Matrix4 setToRotation(Vector3 vector3, float f) {
        if (f != 0.0f) {
            return set(quat.set(vector3, f));
        }
        idt();
        return this;
    }

    public Matrix4 setToRotationRad(Vector3 vector3, float f) {
        if (f != 0.0f) {
            return set(quat.setFromAxisRad(vector3, f));
        }
        idt();
        return this;
    }

    public Matrix4 setToScaling(Vector3 vector3) {
        idt();
        float[] fArr = this.val;
        fArr[0] = vector3.x;
        fArr[5] = vector3.y;
        fArr[10] = vector3.z;
        return this;
    }

    public Matrix4 setToTranslation(Vector3 vector3) {
        idt();
        float[] fArr = this.val;
        fArr[12] = vector3.x;
        fArr[13] = vector3.y;
        fArr[14] = vector3.z;
        return this;
    }

    public Matrix4 setToTranslationAndScaling(Vector3 vector3, Vector3 vector4) {
        idt();
        float[] fArr = this.val;
        fArr[12] = vector3.x;
        fArr[13] = vector3.y;
        fArr[14] = vector3.z;
        fArr[0] = vector4.x;
        fArr[5] = vector4.y;
        fArr[10] = vector4.z;
        return this;
    }

    public Matrix4 setToWorld(Vector3 vector3, Vector3 vector4, Vector3 vector5) {
        Vector3 vector6 = tmpForward;
        vector6.set(vector4).nor();
        Vector3 vector7 = right;
        vector7.set(vector6).crs(vector5).nor();
        Vector3 vector8 = tmpUp;
        vector8.set(vector7).crs(vector6).nor();
        set(vector7, vector8, vector6.scl(-1.0f), vector3);
        return this;
    }

    public Matrix4 setTranslation(Vector3 vector3) {
        float[] fArr = this.val;
        fArr[12] = vector3.x;
        fArr[13] = vector3.y;
        fArr[14] = vector3.z;
        return this;
    }

    public Matrix4 toNormalMatrix() {
        float[] fArr = this.val;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        return inv().tra();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.val[0]);
        sb.append("|");
        sb.append(this.val[4]);
        sb.append("|");
        sb.append(this.val[8]);
        sb.append("|");
        sb.append(this.val[12]);
        sb.append("]\n[");
        sb.append(this.val[1]);
        sb.append("|");
        sb.append(this.val[5]);
        sb.append("|");
        sb.append(this.val[9]);
        sb.append("|");
        sb.append(this.val[13]);
        sb.append("]\n[");
        sb.append(this.val[2]);
        sb.append("|");
        sb.append(this.val[6]);
        sb.append("|");
        sb.append(this.val[10]);
        sb.append("|");
        sb.append(this.val[14]);
        sb.append("]\n[");
        sb.append(this.val[3]);
        sb.append("|");
        sb.append(this.val[7]);
        sb.append("|");
        sb.append(this.val[11]);
        sb.append("|");
        return DM.j(sb, this.val[15], "]\n");
    }

    public Matrix4 tra() {
        float[] fArr = this.val;
        float f = fArr[4];
        float f2 = fArr[8];
        float f3 = fArr[12];
        float f4 = fArr[9];
        float f5 = fArr[13];
        float f6 = fArr[14];
        fArr[4] = fArr[1];
        fArr[8] = fArr[2];
        fArr[12] = fArr[3];
        fArr[1] = f;
        fArr[9] = fArr[6];
        fArr[13] = fArr[7];
        fArr[2] = f2;
        fArr[6] = f4;
        fArr[14] = fArr[11];
        fArr[3] = f3;
        fArr[7] = f5;
        fArr[11] = f6;
        return this;
    }

    public Matrix4 translate(Vector3 vector3) {
        return translate(vector3.x, vector3.y, vector3.z);
    }

    public Matrix4 trn(Vector3 vector3) {
        float[] fArr = this.val;
        fArr[12] = fArr[12] + vector3.x;
        fArr[13] = fArr[13] + vector3.y;
        fArr[14] = fArr[14] + vector3.z;
        return this;
    }

    public static float det(float[] fArr) {
        float f = fArr[3];
        float f2 = fArr[6];
        float f3 = fArr[9];
        float f4 = fArr[12];
        float f5 = fArr[2];
        float f6 = fArr[7];
        float fC = AbstractC3950lJ.C(f5, f6, f3, f4, f * f2 * f3 * f4);
        float f7 = fArr[5];
        float f8 = fArr[10];
        float fX = AbstractC5044xl.x(f * f7, f8, f4, fC);
        float f9 = fArr[1];
        float fH = AbstractC3950lJ.h(f9, f6, f8, f4, fX);
        float f10 = fArr[11];
        float fC2 = AbstractC3950lJ.C(f9, f2, f10, f4, DM.A(f5 * f7, f10, f4, fH));
        float f11 = fArr[8];
        float f12 = fArr[13];
        float fH2 = AbstractC3950lJ.h(f5, f6, f11, f12, fC2 - (((f * f2) * f11) * f12));
        float f13 = fArr[4];
        float fH3 = AbstractC3950lJ.h(f, f13, f8, f12, fH2);
        float f14 = fArr[0];
        float fH4 = AbstractC3950lJ.h(f14, f2, f10, f12, AbstractC3950lJ.C(f5, f13, f10, f12, AbstractC3950lJ.C(f14, f6, f8, f12, fH3)));
        float f15 = fArr[14];
        float fC3 = AbstractC3950lJ.C(f14, f7, f10, f15, AbstractC3950lJ.h(f9, f13, f10, f15, AbstractC3950lJ.h(f14, f6, f3, f15, AbstractC3950lJ.C(f, f13, f3, f15, AbstractC3950lJ.C(f9, f6, f11, f15, (f * f7 * f11 * f15) + fH4)))));
        float f16 = fArr[15];
        return AbstractC3950lJ.h(f14, f7, f8, f16, AbstractC3950lJ.C(f9, f13, f8, f16, AbstractC3950lJ.C(f14, f2, f3, f16, AbstractC3950lJ.h(f5, f13, f3, f16, AbstractC3950lJ.h(f9, f2, f11, f16, fC3 - (((f5 * f7) * f11) * f16))))));
    }

    public static void mul(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[4];
        float f4 = fArr2[1];
        float f5 = fArr[8];
        float f6 = fArr2[2];
        float f7 = f5 * f6;
        float f8 = fArr[12];
        float f9 = fArr2[3];
        float f10 = f8 * f9;
        float f11 = f10 + f7 + (f3 * f4) + (f * f2);
        float f12 = fArr2[4];
        float f13 = fArr2[5];
        float f14 = fArr2[6];
        float f15 = f5 * f14;
        float f16 = fArr2[7];
        float f17 = f8 * f16;
        float f18 = f17 + f15 + (f3 * f13) + (f * f12);
        float f19 = fArr2[8];
        float f20 = fArr2[9];
        float f21 = fArr2[10];
        float f22 = f5 * f21;
        float f23 = fArr2[11];
        float f24 = f8 * f23;
        float f25 = f24 + f22 + (f3 * f20) + (f * f19);
        float f26 = fArr2[12];
        float f27 = fArr2[13];
        float f28 = fArr2[14];
        float f29 = f5 * f28;
        float f30 = fArr2[15];
        float f31 = f8 * f30;
        float f32 = f31 + f29 + (f3 * f27) + (f * f26);
        float f33 = fArr[1];
        float f34 = fArr[5];
        float f35 = fArr[9];
        float f36 = (f35 * f6) + (f34 * f4) + (f33 * f2);
        float f37 = fArr[13];
        float f38 = (f37 * f9) + f36;
        float f39 = (f37 * f16) + (f35 * f14) + (f34 * f13) + (f33 * f12);
        float f40 = (f37 * f23) + (f35 * f21) + (f34 * f20) + (f33 * f19);
        float f41 = f35 * f28;
        float f42 = f37 * f30;
        float f43 = f42 + f41 + (f34 * f27) + (f33 * f26);
        float f44 = fArr[2];
        float f45 = fArr[6];
        float f46 = fArr[10];
        float f47 = (f46 * f6) + (f45 * f4) + (f44 * f2);
        float f48 = fArr[14];
        float f49 = (f48 * f9) + f47;
        float f50 = (f48 * f16) + (f46 * f14) + (f45 * f13) + (f44 * f12);
        float f51 = (f48 * f23) + (f46 * f21) + (f45 * f20) + (f44 * f19);
        float f52 = f46 * f28;
        float f53 = f48 * f30;
        float f54 = f53 + f52 + (f45 * f27) + (f44 * f26);
        float f55 = fArr[3];
        float f56 = fArr[7];
        float f57 = (f4 * f56) + (f2 * f55);
        float f58 = fArr[11];
        float f59 = (f6 * f58) + f57;
        float f60 = fArr[15];
        float f61 = (f9 * f60) + f59;
        float f62 = f14 * f58;
        float f63 = f16 * f60;
        float f64 = f63 + f62 + (f13 * f56) + (f12 * f55);
        float f65 = f21 * f58;
        float f66 = f23 * f60;
        float f67 = f66 + f65 + (f20 * f56) + (f19 * f55);
        float f68 = f58 * f28;
        float f69 = f60 * f30;
        fArr[0] = f11;
        fArr[1] = f38;
        fArr[2] = f49;
        fArr[3] = f61;
        fArr[4] = f18;
        fArr[5] = f39;
        fArr[6] = f50;
        fArr[7] = f64;
        fArr[8] = f25;
        fArr[9] = f40;
        fArr[10] = f51;
        fArr[11] = f67;
        fArr[12] = f32;
        fArr[13] = f43;
        fArr[14] = f54;
        fArr[15] = f69 + f68 + (f56 * f27) + (f55 * f26);
    }

    public Quaternion getRotation(Quaternion quaternion) {
        return quaternion.setFromMatrix(this);
    }

    public Matrix4 set(float[] fArr) {
        float[] fArr2 = this.val;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        return this;
    }

    public Matrix4 setToOrtho2D(float f, float f2, float f3, float f4, float f5, float f6) {
        setToOrtho(f, f + f3, f2, f2 + f4, f5, f6);
        return this;
    }

    public Matrix4 translate(float f, float f2, float f3) {
        float[] fArr = this.val;
        float f4 = fArr[12];
        fArr[12] = AbstractC5044xl.d(fArr[8], f3, (fArr[4] * f2) + (fArr[0] * f), f4);
        float f5 = fArr[13];
        fArr[13] = AbstractC5044xl.d(fArr[9], f3, (fArr[5] * f2) + (fArr[1] * f), f5);
        float f6 = fArr[14];
        fArr[14] = AbstractC5044xl.d(fArr[10], f3, (fArr[6] * f2) + (fArr[2] * f), f6);
        float f7 = fArr[15];
        fArr[15] = AbstractC5044xl.d(fArr[11], f3, (fArr[7] * f2) + (fArr[3] * f), f7);
        return this;
    }

    public Matrix4 rotate(float f, float f2, float f3, float f4) {
        if (f4 == 0.0f) {
            return this;
        }
        Quaternion quaternion = quat;
        quaternion.setFromAxis(f, f2, f3, f4);
        return rotate(quaternion);
    }

    public Matrix4 rotateRad(float f, float f2, float f3, float f4) {
        if (f4 == 0.0f) {
            return this;
        }
        Quaternion quaternion = quat;
        quaternion.setFromAxisRad(f, f2, f3, f4);
        return rotate(quaternion);
    }

    public Matrix4 set(Quaternion quaternion) {
        return set(quaternion.x, quaternion.y, quaternion.z, quaternion.w);
    }

    public Matrix4 setToRotation(float f, float f2, float f3, float f4) {
        if (f4 == 0.0f) {
            idt();
            return this;
        }
        return set(quat.setFromAxis(f, f2, f3, f4));
    }

    public Matrix4 setToRotationRad(float f, float f2, float f3, float f4) {
        if (f4 == 0.0f) {
            idt();
            return this;
        }
        return set(quat.setFromAxisRad(f, f2, f3, f4));
    }

    public Matrix4 scl(float f, float f2, float f3) {
        float[] fArr = this.val;
        fArr[0] = fArr[0] * f;
        fArr[5] = fArr[5] * f2;
        fArr[10] = fArr[10] * f3;
        return this;
    }

    public Matrix4 set(float f, float f2, float f3, float f4) {
        return set(0.0f, 0.0f, 0.0f, f, f2, f3, f4);
    }

    public Matrix4 setTranslation(float f, float f2, float f3) {
        float[] fArr = this.val;
        fArr[12] = f;
        fArr[13] = f2;
        fArr[14] = f3;
        return this;
    }

    public Matrix4 trn(float f, float f2, float f3) {
        float[] fArr = this.val;
        fArr[12] = fArr[12] + f;
        fArr[13] = fArr[13] + f2;
        fArr[14] = fArr[14] + f3;
        return this;
    }

    public Matrix4 rotate(Quaternion quaternion) {
        float f = quaternion.x;
        float f2 = quaternion.y;
        float f3 = quaternion.z;
        float f4 = quaternion.w;
        float f5 = f * f;
        float f6 = f * f2;
        float f7 = f * f3;
        float f8 = f * f4;
        float f9 = f2 * f2;
        float f10 = f2 * f3;
        float f11 = f2 * f4;
        float f12 = f3 * f3;
        float f13 = f3 * f4;
        float f14 = 1.0f - ((f9 + f12) * 2.0f);
        float f15 = (f6 - f13) * 2.0f;
        float f16 = (f7 + f11) * 2.0f;
        float f17 = (f6 + f13) * 2.0f;
        float f18 = 1.0f - ((f12 + f5) * 2.0f);
        float f19 = (f10 - f8) * 2.0f;
        float f20 = (f7 - f11) * 2.0f;
        float f21 = (f10 + f8) * 2.0f;
        float f22 = 1.0f - ((f5 + f9) * 2.0f);
        float[] fArr = this.val;
        float f23 = fArr[0];
        float f24 = fArr[4];
        float f25 = fArr[8];
        float f26 = f25 * f20;
        float f27 = f26 + (f24 * f17) + (f23 * f14);
        float f28 = (f25 * f21) + (f24 * f18) + (f23 * f15);
        float f29 = f25 * f22;
        float f30 = f29 + (f24 * f19) + (f23 * f16);
        float f31 = fArr[1];
        float f32 = fArr[5];
        float f33 = fArr[9];
        float f34 = f33 * f20;
        float f35 = f34 + (f32 * f17) + (f31 * f14);
        float f36 = (f33 * f21) + (f32 * f18) + (f31 * f15);
        float f37 = f33 * f22;
        float f38 = f37 + (f32 * f19) + (f31 * f16);
        float f39 = fArr[2];
        float f40 = fArr[6];
        float f41 = fArr[10];
        float f42 = f41 * f20;
        float f43 = f42 + (f40 * f17) + (f39 * f14);
        float f44 = (f41 * f21) + (f40 * f18) + (f39 * f15);
        float f45 = f41 * f22;
        float f46 = f45 + (f40 * f19) + (f39 * f16);
        float f47 = fArr[3];
        float f48 = fArr[7];
        float f49 = fArr[11];
        float f50 = f20 * f49;
        float f51 = f50 + (f17 * f48) + (f14 * f47);
        float f52 = f21 * f49;
        float f53 = f52 + (f18 * f48) + (f15 * f47);
        float f54 = f49 * f22;
        fArr[0] = f27;
        fArr[1] = f35;
        fArr[2] = f43;
        fArr[3] = f51;
        fArr[4] = f28;
        fArr[5] = f36;
        fArr[6] = f44;
        fArr[7] = f53;
        fArr[8] = f30;
        fArr[9] = f38;
        fArr[10] = f46;
        fArr[11] = f54 + (f48 * f19) + (f47 * f16);
        return this;
    }

    public Matrix4 set(Vector3 vector3, Quaternion quaternion) {
        return set(vector3.x, vector3.y, vector3.z, quaternion.x, quaternion.y, quaternion.z, quaternion.w);
    }

    public Matrix4 setToRotation(Vector3 vector3, Vector3 vector4) {
        return set(quat.setFromCross(vector3, vector4));
    }

    public Matrix4 setToScaling(float f, float f2, float f3) {
        idt();
        float[] fArr = this.val;
        fArr[0] = f;
        fArr[5] = f2;
        fArr[10] = f3;
        return this;
    }

    public Matrix4 setToTranslation(float f, float f2, float f3) {
        idt();
        float[] fArr = this.val;
        fArr[12] = f;
        fArr[13] = f2;
        fArr[14] = f3;
        return this;
    }

    public Matrix4 set(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f4 * 2.0f;
        float f9 = f5 * 2.0f;
        float f10 = 2.0f * f6;
        float f11 = f7 * f8;
        float f12 = f7 * f9;
        float f13 = f7 * f10;
        float f14 = f8 * f4;
        float f15 = f4 * f9;
        float f16 = f4 * f10;
        float f17 = f9 * f5;
        float f18 = f5 * f10;
        float f19 = f10 * f6;
        float[] fArr = this.val;
        fArr[0] = 1.0f - (f17 + f19);
        fArr[4] = f15 - f13;
        fArr[8] = f16 + f12;
        fArr[12] = f;
        fArr[1] = f15 + f13;
        fArr[5] = 1.0f - (f19 + f14);
        fArr[9] = f18 - f11;
        fArr[13] = f2;
        fArr[2] = f16 - f12;
        fArr[6] = f18 + f11;
        fArr[10] = 1.0f - (f14 + f17);
        fArr[14] = f3;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        return this;
    }

    public Matrix4 setToRotation(float f, float f2, float f3, float f4, float f5, float f6) {
        return set(quat.setFromCross(f, f2, f3, f4, f5, f6));
    }

    public Matrix4(Matrix4 matrix4) {
        this.val = new float[16];
        set(matrix4);
    }

    public Matrix4 scl(float f) {
        float[] fArr = this.val;
        fArr[0] = fArr[0] * f;
        fArr[5] = fArr[5] * f;
        fArr[10] = fArr[10] * f;
        return this;
    }

    public Matrix4 setAsAffine(Matrix4 matrix4) {
        float[] fArr = this.val;
        float[] fArr2 = matrix4.val;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[4] = fArr2[4];
        fArr[5] = fArr2[5];
        fArr[12] = fArr2[12];
        fArr[13] = fArr2[13];
        return this;
    }

    public Matrix4 setToTranslationAndScaling(float f, float f2, float f3, float f4, float f5, float f6) {
        idt();
        float[] fArr = this.val;
        fArr[12] = f;
        fArr[13] = f2;
        fArr[14] = f3;
        fArr[0] = f4;
        fArr[5] = f5;
        fArr[10] = f6;
        return this;
    }

    public Matrix4(float[] fArr) {
        this.val = new float[16];
        set(fArr);
    }

    public Matrix4 avg(Matrix4[] matrix4Arr) {
        float length = 1.0f / matrix4Arr.length;
        Vector3 vector3 = tmpVec;
        Matrix4 matrix4 = matrix4Arr[0];
        Vector3 vector4 = tmpUp;
        vector3.set(matrix4.getScale(vector4).scl(length));
        quat.set(matrix4Arr[0].getRotation(quat2).exp(length));
        tmpForward.set(matrix4Arr[0].getTranslation(vector4).scl(length));
        for (int i = 1; i < matrix4Arr.length; i++) {
            Vector3 vector5 = tmpVec;
            Matrix4 matrix5 = matrix4Arr[i];
            Vector3 vector6 = tmpUp;
            vector5.add(matrix5.getScale(vector6).scl(length));
            quat.mul(matrix4Arr[i].getRotation(quat2).exp(length));
            tmpForward.add(matrix4Arr[i].getTranslation(vector6).scl(length));
        }
        Quaternion quaternion = quat;
        quaternion.nor();
        setToScaling(tmpVec);
        rotate(quaternion);
        setTranslation(tmpForward);
        return this;
    }

    public Matrix4(Quaternion quaternion) {
        this.val = new float[16];
        set(quaternion);
    }

    public Matrix4 setToLookAt(Vector3 vector3, Vector3 vector4, Vector3 vector5) {
        Vector3 vector6 = tmpVec;
        vector6.set(vector4).sub(vector3);
        setToLookAt(vector6, vector5);
        mul(tmpMat.setToTranslation(-vector3.x, -vector3.y, -vector3.z));
        return this;
    }

    public Matrix4(Vector3 vector3, Quaternion quaternion, Vector3 vector4) {
        this.val = new float[16];
        set(vector3, quaternion, vector4);
    }

    public Matrix4 setToProjection(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f5 * 2.0f;
        float f8 = f2 - f;
        float f9 = f4 - f3;
        float f10 = (f2 + f) / f8;
        float f11 = (f4 + f3) / f9;
        float f12 = f5 - f6;
        float f13 = (f6 + f5) / f12;
        float f14 = ((f6 * 2.0f) * f5) / f12;
        float[] fArr = this.val;
        fArr[0] = f7 / f8;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = f7 / f9;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = f10;
        fArr[9] = f11;
        fArr[10] = f13;
        fArr[11] = -1.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = f14;
        fArr[15] = 0.0f;
        return this;
    }

    public Matrix4 avg(Matrix4[] matrix4Arr, float[] fArr) {
        Vector3 vector3 = tmpVec;
        Matrix4 matrix4 = matrix4Arr[0];
        Vector3 vector4 = tmpUp;
        vector3.set(matrix4.getScale(vector4).scl(fArr[0]));
        quat.set(matrix4Arr[0].getRotation(quat2).exp(fArr[0]));
        tmpForward.set(matrix4Arr[0].getTranslation(vector4).scl(fArr[0]));
        for (int i = 1; i < matrix4Arr.length; i++) {
            Vector3 vector5 = tmpVec;
            Matrix4 matrix5 = matrix4Arr[i];
            Vector3 vector6 = tmpUp;
            vector5.add(matrix5.getScale(vector6).scl(fArr[i]));
            quat.mul(matrix4Arr[i].getRotation(quat2).exp(fArr[i]));
            tmpForward.add(matrix4Arr[i].getTranslation(vector6).scl(fArr[i]));
        }
        Quaternion quaternion = quat;
        quaternion.nor();
        setToScaling(tmpVec);
        rotate(quaternion);
        setTranslation(tmpForward);
        return this;
    }

    public Matrix4 rotate(Vector3 vector3, Vector3 vector4) {
        return rotate(quat.setFromCross(vector3, vector4));
    }

    public Matrix4 set(Vector3 vector3, Quaternion quaternion, Vector3 vector4) {
        return set(vector3.x, vector3.y, vector3.z, quaternion.x, quaternion.y, quaternion.z, quaternion.w, vector4.x, vector4.y, vector4.z);
    }

    public Matrix4 set(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        float f11 = f4 * 2.0f;
        float f12 = f5 * 2.0f;
        float f13 = 2.0f * f6;
        float f14 = f7 * f11;
        float f15 = f7 * f12;
        float f16 = f7 * f13;
        float f17 = f11 * f4;
        float f18 = f4 * f12;
        float f19 = f4 * f13;
        float f20 = f12 * f5;
        float f21 = f5 * f13;
        float f22 = f13 * f6;
        float[] fArr = this.val;
        fArr[0] = (1.0f - (f20 + f22)) * f8;
        fArr[4] = (f18 - f16) * f9;
        fArr[8] = (f19 + f15) * f10;
        fArr[12] = f;
        fArr[1] = (f18 + f16) * f8;
        fArr[5] = (1.0f - (f22 + f17)) * f9;
        fArr[9] = (f21 - f14) * f10;
        fArr[13] = f2;
        fArr[2] = (f19 - f15) * f8;
        fArr[6] = (f21 + f14) * f9;
        fArr[10] = (1.0f - (f17 + f20)) * f10;
        fArr[14] = f3;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        return this;
    }

    public static boolean inv(float[] fArr) {
        float fDet = det(fArr);
        if (fDet == 0.0f) {
            return false;
        }
        float f = fArr[9];
        float f2 = fArr[14];
        float f3 = fArr[7];
        float f4 = fArr[13];
        float f5 = fArr[10];
        float fX = AbstractC5044xl.x(f4, f5, f3, f * f2 * f3);
        float f6 = fArr[6];
        float f7 = fArr[11];
        float f8 = fArr[5];
        float fX2 = AbstractC5044xl.x(f8, f2, f7, (f4 * f6 * f7) + fX);
        float f9 = fArr[15];
        float fA = DM.A(f8, f5, f9, fX2 - ((f * f6) * f9));
        float f10 = fArr[12];
        float f11 = fArr[8];
        float fX3 = AbstractC5044xl.x(f10, f6, f7, AbstractC5044xl.x(f11, f2, f3, f10 * f5 * f3));
        float f12 = fArr[4];
        float fX4 = AbstractC5044xl.x(f12, f5, f9, DM.A(f11, f6, f9, DM.A(f12, f2, f7, fX3)));
        float fA2 = DM.A(f12, f, f9, AbstractC5044xl.x(f11, f8, f9, AbstractC5044xl.x(f12, f4, f7, DM.A(f10, f8, f7, AbstractC5044xl.x(f10, f, f3, f11 * f4 * f3)))));
        float fX5 = AbstractC5044xl.x(f12, f, f2, DM.A(f11, f8, f2, DM.A(f12, f4, f5, AbstractC5044xl.x(f10, f8, f5, AbstractC5044xl.x(f11, f4, f6, f10 * f * f6)))));
        float f13 = fArr[3];
        float fX6 = AbstractC5044xl.x(f, f2, f13, f4 * f5 * f13);
        float f14 = fArr[2];
        float fX7 = AbstractC5044xl.x(f4, f14, f7, fX6);
        float f15 = fArr[1];
        float fX8 = AbstractC5044xl.x(f15, f5, f9, DM.A(f, f14, f9, DM.A(f15, f2, f7, fX7)));
        float fA3 = DM.A(f10, f14, f7, AbstractC5044xl.x(f10, f5, f13, f11 * f2 * f13));
        float f16 = fArr[0];
        float fA4 = DM.A(f16, f5, f9, AbstractC5044xl.x(f11, f14, f9, AbstractC5044xl.x(f16, f2, f7, fA3)));
        float fX9 = AbstractC5044xl.x(f16, f, f9, DM.A(f11, f15, f9, DM.A(f16, f4, f7, AbstractC5044xl.x(f10, f15, f7, AbstractC5044xl.x(f11, f4, f13, f10 * f * f13)))));
        float fA5 = DM.A(f16, f, f2, AbstractC5044xl.x(f11, f15, f2, AbstractC5044xl.x(f16, f4, f5, DM.A(f10, f15, f5, AbstractC5044xl.x(f10, f, f14, f11 * f4 * f14)))));
        float fA6 = DM.A(f15, f6, f9, AbstractC5044xl.x(f8, f14, f9, AbstractC5044xl.x(f15, f2, f3, DM.A(f4, f14, f3, AbstractC5044xl.x(f4, f6, f13, f8 * f2 * f13)))));
        float fX10 = AbstractC5044xl.x(f16, f6, f9, DM.A(f12, f14, f9, DM.A(f16, f2, f3, AbstractC5044xl.x(f10, f14, f3, AbstractC5044xl.x(f12, f2, f13, f10 * f6 * f13)))));
        float fA7 = DM.A(f16, f8, f9, AbstractC5044xl.x(f12, f15, f9, AbstractC5044xl.x(f16, f4, f3, DM.A(f10, f15, f3, AbstractC5044xl.x(f10, f8, f13, f12 * f4 * f13)))));
        float fX11 = AbstractC5044xl.x(f16, f8, f2, DM.A(f12, f15, f2, DM.A(f16, f4, f6, AbstractC5044xl.x(f10, f15, f6, AbstractC5044xl.x(f12, f4, f14, f10 * f8 * f14)))));
        float fX12 = AbstractC5044xl.x(f15, f6, f7, DM.A(f8, f14, f7, DM.A(f15, f5, f3, AbstractC5044xl.x(f, f14, f3, AbstractC5044xl.x(f8, f5, f13, f * f6 * f13)))));
        float fA8 = DM.A(f16, f6, f7, AbstractC5044xl.x(f12, f14, f7, AbstractC5044xl.x(f16, f5, f3, DM.A(f11, f14, f3, AbstractC5044xl.x(f11, f6, f13, f12 * f5 * f13)))));
        float fX13 = AbstractC5044xl.x(f16, f8, f7, DM.A(f12, f15, f7, DM.A(f16, f, f3, AbstractC5044xl.x(f11, f15, f3, AbstractC5044xl.x(f12, f, f13, f11 * f8 * f13)))));
        float fA9 = DM.A(f16, f8, f5, AbstractC5044xl.x(f12, f15, f5, AbstractC5044xl.x(f16, f, f6, DM.A(f11, f15, f6, AbstractC5044xl.x(f11, f8, f14, f12 * f * f14)))));
        float f17 = 1.0f / fDet;
        fArr[0] = fA * f17;
        fArr[1] = fX8 * f17;
        fArr[2] = fA6 * f17;
        fArr[3] = fX12 * f17;
        fArr[4] = fX4 * f17;
        fArr[5] = fA4 * f17;
        fArr[6] = fX10 * f17;
        fArr[7] = fA8 * f17;
        fArr[8] = fA2 * f17;
        fArr[9] = fX9 * f17;
        fArr[10] = fA7 * f17;
        fArr[11] = fX13 * f17;
        fArr[12] = fX5 * f17;
        fArr[13] = fA5 * f17;
        fArr[14] = fX11 * f17;
        fArr[15] = fA9 * f17;
        return true;
    }

    public Matrix4 set(Vector3 vector3, Vector3 vector4, Vector3 vector5, Vector3 vector6) {
        float[] fArr = this.val;
        fArr[0] = vector3.x;
        fArr[4] = vector3.y;
        fArr[8] = vector3.z;
        fArr[1] = vector4.x;
        fArr[5] = vector4.y;
        fArr[9] = vector4.z;
        fArr[2] = vector5.x;
        fArr[6] = vector5.y;
        fArr[10] = vector5.z;
        fArr[12] = vector6.x;
        fArr[13] = vector6.y;
        fArr[14] = vector6.z;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
        return this;
    }

    public Matrix4 set(Matrix3 matrix3) {
        float[] fArr = this.val;
        float[] fArr2 = matrix3.val;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = 0.0f;
        fArr[4] = fArr2[3];
        fArr[5] = fArr2[4];
        fArr[6] = fArr2[5];
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = fArr2[6];
        fArr[13] = fArr2[7];
        fArr[14] = 0.0f;
        fArr[15] = fArr2[8];
        return this;
    }

    public Matrix4 set(Affine2 affine2) {
        float[] fArr = this.val;
        fArr[0] = affine2.m00;
        fArr[1] = affine2.m10;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = affine2.m01;
        fArr[5] = affine2.m11;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = affine2.m02;
        fArr[13] = affine2.m12;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
        return this;
    }
}
