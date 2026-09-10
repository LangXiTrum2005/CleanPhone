package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.GdxRuntimeException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class Matrix3 implements Serializable {
    public static final int M00 = 0;
    public static final int M01 = 3;
    public static final int M02 = 6;
    public static final int M10 = 1;
    public static final int M11 = 4;
    public static final int M12 = 7;
    public static final int M20 = 2;
    public static final int M21 = 5;
    public static final int M22 = 8;
    private static final long serialVersionUID = 7907569533774959788L;
    private float[] tmp;
    public float[] val;

    public Matrix3() {
        this.val = new float[9];
        float[] fArr = new float[9];
        this.tmp = fArr;
        fArr[8] = 1.0f;
        idt();
    }

    public float det() {
        float[] fArr = this.val;
        float f = fArr[0];
        float f2 = fArr[4];
        float f3 = fArr[8];
        float f4 = fArr[3];
        float f5 = fArr[7];
        float f6 = fArr[2];
        float f7 = (f4 * f5 * f6) + (f * f2 * f3);
        float f8 = fArr[6];
        float f9 = fArr[1];
        float f10 = fArr[5];
        return AbstractC5044xl.x(f8, f2, f6, AbstractC5044xl.x(f4, f9, f3, AbstractC5044xl.x(f, f5, f10, (f8 * f9 * f10) + f7)));
    }

    public float getRotation() {
        float[] fArr = this.val;
        return ((float) Math.atan2(fArr[1], fArr[0])) * 57.295776f;
    }

    public float getRotationRad() {
        float[] fArr = this.val;
        return (float) Math.atan2(fArr[1], fArr[0]);
    }

    public Vector2 getScale(Vector2 vector2) {
        float[] fArr = this.val;
        float f = fArr[0];
        float f2 = fArr[3];
        vector2.x = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr[1];
        float f4 = fArr[4];
        vector2.y = (float) Math.sqrt((f4 * f4) + (f3 * f3));
        return vector2;
    }

    public Vector2 getTranslation(Vector2 vector2) {
        float[] fArr = this.val;
        vector2.x = fArr[6];
        vector2.y = fArr[7];
        return vector2;
    }

    public float[] getValues() {
        return this.val;
    }

    public Matrix3 idt() {
        float[] fArr = this.val;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        return this;
    }

    public Matrix3 inv() {
        float fDet = det();
        if (fDet == 0.0f) {
            throw new GdxRuntimeException("Can't invert a singular matrix");
        }
        float f = 1.0f / fDet;
        float[] fArr = this.val;
        float f2 = fArr[4];
        float f3 = fArr[8];
        float f4 = fArr[5];
        float f5 = fArr[7];
        float f6 = (f2 * f3) - (f4 * f5);
        float f7 = fArr[2];
        float f8 = fArr[1];
        float f9 = (f7 * f5) - (f8 * f3);
        float f10 = (f8 * f4) - (f7 * f2);
        float f11 = fArr[6];
        float f12 = fArr[3];
        float f13 = (f4 * f11) - (f12 * f3);
        float f14 = fArr[0];
        float f15 = (f3 * f14) - (f7 * f11);
        float f16 = (f7 * f12) - (f4 * f14);
        float f17 = (f12 * f5) - (f2 * f11);
        fArr[0] = f6 * f;
        fArr[1] = f9 * f;
        fArr[2] = f10 * f;
        fArr[3] = f13 * f;
        fArr[4] = f15 * f;
        fArr[5] = f16 * f;
        fArr[6] = f17 * f;
        fArr[7] = ((f11 * f8) - (f5 * f14)) * f;
        fArr[8] = f * ((f14 * f2) - (f8 * f12));
        return this;
    }

    public Matrix3 mul(Matrix3 matrix3) {
        float[] fArr = this.val;
        float f = fArr[0];
        float[] fArr2 = matrix3.val;
        float f2 = fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        float f7 = f5 * f6;
        float f8 = f7 + (f3 * f4) + (f * f2);
        float f9 = fArr2[3];
        float f10 = fArr2[4];
        float f11 = fArr2[5];
        float f12 = f5 * f11;
        float f13 = f12 + (f3 * f10) + (f * f9);
        float f14 = fArr2[6];
        float f15 = fArr2[7];
        float f16 = fArr2[8];
        float f17 = f5 * f16;
        float f18 = f17 + (f3 * f15) + (f * f14);
        float f19 = fArr[1];
        float f20 = fArr[4];
        float f21 = fArr[7];
        float f22 = (f21 * f6) + (f20 * f4) + (f19 * f2);
        float f23 = (f21 * f11) + (f20 * f10) + (f19 * f9);
        float f24 = f21 * f16;
        float f25 = f24 + (f20 * f15) + (f19 * f14);
        float f26 = fArr[2];
        float f27 = fArr[5];
        float f28 = (f4 * f27) + (f2 * f26);
        float f29 = fArr[8];
        float f30 = (f6 * f29) + f28;
        float f31 = f11 * f29;
        float f32 = f31 + (f10 * f27) + (f9 * f26);
        float f33 = f29 * f16;
        fArr[0] = f8;
        fArr[1] = f22;
        fArr[2] = f30;
        fArr[3] = f13;
        fArr[4] = f23;
        fArr[5] = f32;
        fArr[6] = f18;
        fArr[7] = f25;
        fArr[8] = f33 + (f27 * f15) + (f26 * f14);
        return this;
    }

    public Matrix3 mulLeft(Matrix3 matrix3) {
        float[] fArr = this.val;
        float[] fArr2 = matrix3.val;
        float f = fArr2[0];
        float f2 = fArr[0];
        float f3 = fArr2[3];
        float f4 = fArr[1];
        float f5 = fArr2[6];
        float f6 = fArr[2];
        float f7 = f5 * f6;
        float f8 = f7 + (f3 * f4) + (f * f2);
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = f5 * f11;
        float f13 = f12 + (f3 * f10) + (f * f9);
        float f14 = fArr[6];
        float f15 = fArr[7];
        float f16 = fArr[8];
        float f17 = f5 * f16;
        float f18 = f17 + (f3 * f15) + (f * f14);
        float f19 = fArr2[1];
        float f20 = fArr2[4];
        float f21 = fArr2[7];
        float f22 = (f21 * f6) + (f20 * f4) + (f19 * f2);
        float f23 = (f21 * f11) + (f20 * f10) + (f19 * f9);
        float f24 = f21 * f16;
        float f25 = f24 + (f20 * f15) + (f19 * f14);
        float f26 = fArr2[2];
        float f27 = fArr2[5];
        float f28 = fArr2[8];
        float f29 = f6 * f28;
        float f30 = f29 + (f4 * f27) + (f2 * f26);
        float f31 = f11 * f28;
        float f32 = f31 + (f10 * f27) + (f9 * f26);
        float f33 = f28 * f16;
        fArr[0] = f8;
        fArr[1] = f22;
        fArr[2] = f30;
        fArr[3] = f13;
        fArr[4] = f23;
        fArr[5] = f32;
        fArr[6] = f18;
        fArr[7] = f25;
        fArr[8] = f33 + (f27 * f15) + (f26 * f14);
        return this;
    }

    public Matrix3 rotate(float f) {
        return rotateRad(f * 0.017453292f);
    }

    public Matrix3 rotateRad(float f) {
        if (f == 0.0f) {
            return this;
        }
        double d = f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float[] fArr = this.tmp;
        fArr[0] = fCos;
        fArr[1] = fSin;
        fArr[3] = -fSin;
        fArr[4] = fCos;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        mul(this.val, fArr);
        return this;
    }

    public Matrix3 scale(float f, float f2) {
        float[] fArr = this.tmp;
        fArr[0] = f;
        fArr[1] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = f2;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        mul(this.val, fArr);
        return this;
    }

    public Matrix3 scl(float f) {
        float[] fArr = this.val;
        fArr[0] = fArr[0] * f;
        fArr[4] = fArr[4] * f;
        return this;
    }

    public Matrix3 set(Matrix3 matrix3) {
        float[] fArr = matrix3.val;
        float[] fArr2 = this.val;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        return this;
    }

    public Matrix3 setToRotation(float f) {
        return setToRotationRad(f * 0.017453292f);
    }

    public Matrix3 setToRotationRad(float f) {
        double d = f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float[] fArr = this.val;
        fArr[0] = fCos;
        fArr[1] = fSin;
        fArr[2] = 0.0f;
        fArr[3] = -fSin;
        fArr[4] = fCos;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        return this;
    }

    public Matrix3 setToScaling(float f, float f2) {
        float[] fArr = this.val;
        fArr[0] = f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = f2;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        return this;
    }

    public Matrix3 setToTranslation(float f, float f2) {
        float[] fArr = this.val;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = 0.0f;
        fArr[6] = f;
        fArr[7] = f2;
        fArr[8] = 1.0f;
        return this;
    }

    public String toString() {
        float[] fArr = this.val;
        StringBuilder sb = new StringBuilder("[");
        sb.append(fArr[0]);
        sb.append("|");
        sb.append(fArr[3]);
        sb.append("|");
        sb.append(fArr[6]);
        sb.append("]\n[");
        sb.append(fArr[1]);
        sb.append("|");
        sb.append(fArr[4]);
        sb.append("|");
        sb.append(fArr[7]);
        sb.append("]\n[");
        sb.append(fArr[2]);
        sb.append("|");
        sb.append(fArr[5]);
        sb.append("|");
        return DM.j(sb, fArr[8], "]");
    }

    public Matrix3 translate(float f, float f2) {
        float[] fArr = this.tmp;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[6] = f;
        fArr[7] = f2;
        mul(this.val, fArr);
        return this;
    }

    public Matrix3 transpose() {
        float[] fArr = this.val;
        float f = fArr[1];
        float f2 = fArr[2];
        float f3 = fArr[3];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[7];
        fArr[3] = f;
        fArr[6] = f2;
        fArr[1] = f3;
        fArr[7] = f4;
        fArr[2] = f5;
        fArr[5] = f6;
        return this;
    }

    public Matrix3 trn(Vector2 vector2) {
        float[] fArr = this.val;
        fArr[6] = fArr[6] + vector2.x;
        fArr[7] = fArr[7] + vector2.y;
        return this;
    }

    public Matrix3 set(Affine2 affine2) {
        float[] fArr = this.val;
        fArr[0] = affine2.m00;
        fArr[1] = affine2.m10;
        fArr[2] = 0.0f;
        fArr[3] = affine2.m01;
        fArr[4] = affine2.m11;
        fArr[5] = 0.0f;
        fArr[6] = affine2.m02;
        fArr[7] = affine2.m12;
        fArr[8] = 1.0f;
        return this;
    }

    public Matrix3 setToRotation(Vector3 vector3, float f) {
        return setToRotation(vector3, MathUtils.cosDeg(f), MathUtils.sinDeg(f));
    }

    public Matrix3 scl(Vector2 vector2) {
        float[] fArr = this.val;
        fArr[0] = fArr[0] * vector2.x;
        fArr[4] = fArr[4] * vector2.y;
        return this;
    }

    public Matrix3 setToRotation(Vector3 vector3, float f, float f2) {
        float[] fArr = this.val;
        float f3 = 1.0f - f;
        float f4 = vector3.x;
        fArr[0] = DM.A(f3, f4, f4, f);
        float f5 = vector3.y;
        float f6 = vector3.z;
        fArr[3] = ((f3 * f4) * f5) - (f6 * f2);
        fArr[6] = (f5 * f2) + (f3 * f6 * f4);
        fArr[1] = (f6 * f2) + (f3 * f4 * f5);
        fArr[4] = DM.A(f3, f5, f5, f);
        fArr[7] = ((f3 * f5) * f6) - (f4 * f2);
        fArr[2] = ((f3 * f6) * f4) - (f5 * f2);
        fArr[5] = (f4 * f2) + (f5 * f3 * f6);
        fArr[8] = DM.A(f3, f6, f6, f);
        return this;
    }

    public Matrix3 trn(float f, float f2) {
        float[] fArr = this.val;
        fArr[6] = fArr[6] + f;
        fArr[7] = fArr[7] + f2;
        return this;
    }

    public Matrix3 scl(Vector3 vector3) {
        float[] fArr = this.val;
        fArr[0] = fArr[0] * vector3.x;
        fArr[4] = fArr[4] * vector3.y;
        return this;
    }

    public Matrix3 trn(Vector3 vector3) {
        float[] fArr = this.val;
        fArr[6] = fArr[6] + vector3.x;
        fArr[7] = fArr[7] + vector3.y;
        return this;
    }

    public Matrix3(Matrix3 matrix3) {
        this.val = new float[9];
        float[] fArr = new float[9];
        this.tmp = fArr;
        fArr[8] = 1.0f;
        set(matrix3);
    }

    public Matrix3 scale(Vector2 vector2) {
        float[] fArr = this.tmp;
        fArr[0] = vector2.x;
        fArr[1] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = vector2.y;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        mul(this.val, fArr);
        return this;
    }

    public Matrix3 translate(Vector2 vector2) {
        float[] fArr = this.tmp;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[6] = vector2.x;
        fArr[7] = vector2.y;
        mul(this.val, fArr);
        return this;
    }

    public Matrix3(float[] fArr) {
        this.val = new float[9];
        float[] fArr2 = new float[9];
        this.tmp = fArr2;
        fArr2[8] = 1.0f;
        set(fArr);
    }

    public Matrix3 setToScaling(Vector2 vector2) {
        float[] fArr = this.val;
        fArr[0] = vector2.x;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = vector2.y;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        return this;
    }

    public Matrix3 setToTranslation(Vector2 vector2) {
        float[] fArr = this.val;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = 0.0f;
        fArr[6] = vector2.x;
        fArr[7] = vector2.y;
        fArr[8] = 1.0f;
        return this;
    }

    public Matrix3 set(Matrix4 matrix4) {
        float[] fArr = this.val;
        float[] fArr2 = matrix4.val;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[4];
        fArr[4] = fArr2[5];
        fArr[5] = fArr2[6];
        fArr[6] = fArr2[8];
        fArr[7] = fArr2[9];
        fArr[8] = fArr2[10];
        return this;
    }

    private static void mul(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        float f7 = f5 * f6;
        float f8 = f7 + (f3 * f4) + (f * f2);
        float f9 = fArr2[3];
        float f10 = fArr2[4];
        float f11 = fArr2[5];
        float f12 = f5 * f11;
        float f13 = f12 + (f3 * f10) + (f * f9);
        float f14 = fArr2[6];
        float f15 = fArr2[7];
        float f16 = fArr2[8];
        float f17 = f5 * f16;
        float f18 = f17 + (f3 * f15) + (f * f14);
        float f19 = fArr[1];
        float f20 = fArr[4];
        float f21 = fArr[7];
        float f22 = (f21 * f6) + (f20 * f4) + (f19 * f2);
        float f23 = (f21 * f11) + (f20 * f10) + (f19 * f9);
        float f24 = f21 * f16;
        float f25 = f24 + (f20 * f15) + (f19 * f14);
        float f26 = fArr[2];
        float f27 = fArr[5];
        float f28 = (f4 * f27) + (f2 * f26);
        float f29 = fArr[8];
        float f30 = (f6 * f29) + f28;
        float f31 = f11 * f29;
        float f32 = f31 + (f10 * f27) + (f9 * f26);
        float f33 = f29 * f16;
        fArr[0] = f8;
        fArr[1] = f22;
        fArr[2] = f30;
        fArr[3] = f13;
        fArr[4] = f23;
        fArr[5] = f32;
        fArr[6] = f18;
        fArr[7] = f25;
        fArr[8] = f33 + (f27 * f15) + (f26 * f14);
    }

    public Matrix3 set(float[] fArr) {
        float[] fArr2 = this.val;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        return this;
    }
}
