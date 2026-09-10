package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.NumberUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class Quaternion implements Serializable {
    private static final long serialVersionUID = -7661875440774897168L;
    private static Quaternion tmp1 = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f);
    private static Quaternion tmp2 = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f);
    public float w;
    public float x;
    public float y;
    public float z;

    public Quaternion(float f, float f2, float f3, float f4) {
        set(f, f2, f3, f4);
    }

    public static final float dot(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return (f4 * f8) + (f3 * f7) + (f2 * f6) + (f * f5);
    }

    public static final float len(float f, float f2, float f3, float f4) {
        return (float) Math.sqrt((f4 * f4) + (f3 * f3) + (f2 * f2) + (f * f));
    }

    public static final float len2(float f, float f2, float f3, float f4) {
        return (f4 * f4) + (f3 * f3) + (f2 * f2) + (f * f);
    }

    public Quaternion add(Quaternion quaternion) {
        this.x += quaternion.x;
        this.y += quaternion.y;
        this.z += quaternion.z;
        this.w += quaternion.w;
        return this;
    }

    public Quaternion conjugate() {
        this.x = -this.x;
        this.y = -this.y;
        this.z = -this.z;
        return this;
    }

    public Quaternion cpy() {
        return new Quaternion(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Quaternion)) {
            return false;
        }
        Quaternion quaternion = (Quaternion) obj;
        return NumberUtils.floatToRawIntBits(this.w) == NumberUtils.floatToRawIntBits(quaternion.w) && NumberUtils.floatToRawIntBits(this.x) == NumberUtils.floatToRawIntBits(quaternion.x) && NumberUtils.floatToRawIntBits(this.y) == NumberUtils.floatToRawIntBits(quaternion.y) && NumberUtils.floatToRawIntBits(this.z) == NumberUtils.floatToRawIntBits(quaternion.z);
    }

    public Quaternion exp(float f) {
        float fSin;
        float fLen = len();
        double d = fLen;
        float fPow = (float) Math.pow(d, f);
        float fAcos = (float) Math.acos(this.w / fLen);
        if (Math.abs(fAcos) < 0.001d) {
            fSin = (fPow * f) / fLen;
        } else {
            fSin = (float) ((Math.sin(f * fAcos) * ((double) fPow)) / (Math.sin(fAcos) * d));
        }
        this.w = (float) (Math.cos(f * fAcos) * ((double) fPow));
        this.x *= fSin;
        this.y *= fSin;
        this.z *= fSin;
        nor();
        return this;
    }

    public float getAngle() {
        return getAngleRad() * 57.295776f;
    }

    public float getAngleAround(float f, float f2, float f3) {
        return getAngleAroundRad(f, f2, f3) * 57.295776f;
    }

    public float getAngleAroundRad(float f, float f2, float f3) {
        float fDot = Vector3.dot(this.x, this.y, this.z, f, f2, f3);
        float fLen2 = len2(f * fDot, f2 * fDot, f3 * fDot, this.w);
        if (MathUtils.isZero(fLen2)) {
            return 0.0f;
        }
        return (float) (Math.acos(MathUtils.clamp((float) (((double) (fDot < 0.0f ? -this.w : this.w)) / Math.sqrt(fLen2)), -1.0f, 1.0f)) * 2.0d);
    }

    public float getAngleRad() {
        float fLen = this.w;
        if (fLen > 1.0f) {
            fLen /= len();
        }
        return (float) (Math.acos(fLen) * 2.0d);
    }

    public float getAxisAngle(Vector3 vector3) {
        return getAxisAngleRad(vector3) * 57.295776f;
    }

    public float getAxisAngleRad(Vector3 vector3) {
        if (this.w > 1.0f) {
            nor();
        }
        float fAcos = (float) (Math.acos(this.w) * 2.0d);
        float f = this.w;
        double dSqrt = Math.sqrt(1.0f - (f * f));
        if (dSqrt < 9.999999974752427E-7d) {
            vector3.x = this.x;
            vector3.y = this.y;
            vector3.z = this.z;
        } else {
            vector3.x = (float) (((double) this.x) / dSqrt);
            vector3.y = (float) (((double) this.y) / dSqrt);
            vector3.z = (float) (((double) this.z) / dSqrt);
        }
        return fAcos;
    }

    public int getGimbalPole() {
        float f = (this.z * this.w) + (this.y * this.x);
        if (f > 0.499f) {
            return 1;
        }
        return f < -0.499f ? -1 : 0;
    }

    public float getPitch() {
        return getPitchRad() * 57.295776f;
    }

    public float getPitchRad() {
        int gimbalPole = getGimbalPole();
        return gimbalPole == 0 ? (float) Math.asin(MathUtils.clamp(((this.w * this.x) - (this.z * this.y)) * 2.0f, -1.0f, 1.0f)) : gimbalPole * 3.1415927f * 0.5f;
    }

    public float getRoll() {
        return getRollRad() * 57.295776f;
    }

    public float getRollRad() {
        int gimbalPole = getGimbalPole();
        if (gimbalPole != 0) {
            return gimbalPole * 2.0f * MathUtils.atan2(this.y, this.w);
        }
        float f = this.w;
        float f2 = this.z;
        float f3 = this.y;
        float f4 = this.x;
        return MathUtils.atan2(((f3 * f4) + (f * f2)) * 2.0f, 1.0f - (((f2 * f2) + (f4 * f4)) * 2.0f));
    }

    public void getSwingTwist(float f, float f2, float f3, Quaternion quaternion, Quaternion quaternion2) {
        float fDot = Vector3.dot(this.x, this.y, this.z, f, f2, f3);
        quaternion2.set(f * fDot, f2 * fDot, f3 * fDot, this.w).nor();
        if (fDot < 0.0f) {
            quaternion2.mul(-1.0f);
        }
        quaternion.set(quaternion2).conjugate().mulLeft(this);
    }

    public float getYaw() {
        return getYawRad() * 57.295776f;
    }

    public float getYawRad() {
        if (getGimbalPole() != 0) {
            return 0.0f;
        }
        float f = this.y;
        float f2 = this.w * f;
        float f3 = this.x;
        return MathUtils.atan2(((this.z * f3) + f2) * 2.0f, 1.0f - (((f3 * f3) + (f * f)) * 2.0f));
    }

    public int hashCode() {
        return NumberUtils.floatToRawIntBits(this.z) + ((NumberUtils.floatToRawIntBits(this.y) + ((NumberUtils.floatToRawIntBits(this.x) + ((NumberUtils.floatToRawIntBits(this.w) + 31) * 31)) * 31)) * 31);
    }

    public Quaternion idt() {
        return set(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public boolean isIdentity() {
        return MathUtils.isZero(this.x) && MathUtils.isZero(this.y) && MathUtils.isZero(this.z) && MathUtils.isEqual(this.w, 1.0f);
    }

    public Quaternion mul(Quaternion quaternion) {
        float f = this.w;
        float f2 = quaternion.x;
        float f3 = this.x;
        float f4 = quaternion.w;
        float f5 = this.y;
        float f6 = quaternion.z;
        float f7 = (f5 * f6) + (f3 * f4) + (f * f2);
        float f8 = this.z;
        float f9 = quaternion.y;
        float f10 = ((f8 * f2) + ((f5 * f4) + (f * f9))) - (f3 * f6);
        this.x = f7 - (f8 * f9);
        this.y = f10;
        this.z = ((f3 * f9) + ((f8 * f4) + (f * f6))) - (f5 * f2);
        this.w = (((f * f4) - (f3 * f2)) - (f5 * f9)) - (f8 * f6);
        return this;
    }

    public Quaternion mulLeft(Quaternion quaternion) {
        float f = quaternion.w;
        float f2 = this.x;
        float f3 = quaternion.x;
        float f4 = this.w;
        float f5 = quaternion.y;
        float f6 = this.z;
        float f7 = (f5 * f6) + (f3 * f4) + (f * f2);
        float f8 = quaternion.z;
        float f9 = this.y;
        float f10 = ((f8 * f2) + ((f5 * f4) + (f * f9))) - (f3 * f6);
        this.x = f7 - (f8 * f9);
        this.y = f10;
        this.z = ((f3 * f9) + ((f8 * f4) + (f * f6))) - (f5 * f2);
        this.w = (((f * f4) - (f3 * f2)) - (f5 * f9)) - (f8 * f6);
        return this;
    }

    public Quaternion nor() {
        float fLen2 = len2();
        if (fLen2 != 0.0f && !MathUtils.isEqual(fLen2, 1.0f)) {
            float fSqrt = (float) Math.sqrt(fLen2);
            this.w /= fSqrt;
            this.x /= fSqrt;
            this.y /= fSqrt;
            this.z /= fSqrt;
        }
        return this;
    }

    public Quaternion set(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.w = f4;
        return this;
    }

    public Quaternion setEulerAngles(float f, float f2, float f3) {
        return setEulerAnglesRad(f * 0.017453292f, f2 * 0.017453292f, f3 * 0.017453292f);
    }

    public Quaternion setEulerAnglesRad(float f, float f2, float f3) {
        double d = f3 * 0.5f;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d);
        double d2 = f2 * 0.5f;
        float fSin2 = (float) Math.sin(d2);
        float fCos2 = (float) Math.cos(d2);
        double d3 = f * 0.5f;
        float fSin3 = (float) Math.sin(d3);
        float fCos3 = (float) Math.cos(d3);
        float f4 = fCos3 * fSin2;
        float f5 = fSin3 * fCos2;
        float f6 = fCos3 * fCos2;
        float f7 = fSin3 * fSin2;
        this.x = (f5 * fSin) + (f4 * fCos);
        this.y = (f5 * fCos) - (f4 * fSin);
        this.z = (f6 * fSin) - (f7 * fCos);
        this.w = (f7 * fSin) + (f6 * fCos);
        return this;
    }

    public Quaternion setFromAxes(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return setFromAxes(false, f, f2, f3, f4, f5, f6, f7, f8, f9);
    }

    public Quaternion setFromAxis(Vector3 vector3, float f) {
        return setFromAxis(vector3.x, vector3.y, vector3.z, f);
    }

    public Quaternion setFromAxisRad(Vector3 vector3, float f) {
        return setFromAxisRad(vector3.x, vector3.y, vector3.z, f);
    }

    public Quaternion setFromCross(Vector3 vector3, Vector3 vector4) {
        float fAcos = (float) Math.acos(MathUtils.clamp(vector3.dot(vector4), -1.0f, 1.0f));
        float f = vector3.y;
        float f2 = vector4.z;
        float f3 = vector3.z;
        float f4 = vector4.y;
        float f5 = vector4.x;
        float f6 = vector3.x;
        return setFromAxisRad((f * f2) - (f3 * f4), (f3 * f5) - (f2 * f6), (f6 * f4) - (f * f5), fAcos);
    }

    public Quaternion setFromMatrix(boolean z, Matrix4 matrix4) {
        float[] fArr = matrix4.val;
        return setFromAxes(z, fArr[0], fArr[4], fArr[8], fArr[1], fArr[5], fArr[9], fArr[2], fArr[6], fArr[10]);
    }

    public Quaternion slerp(Quaternion quaternion, float f) {
        float f2 = (this.w * quaternion.w) + (this.z * quaternion.z) + (this.y * quaternion.y) + (this.x * quaternion.x);
        if (f2 < 0.0f) {
            f2 = -f2;
        }
        float fSin = 1.0f - f;
        if (1.0f - f2 > 0.1d) {
            float fAcos = (float) Math.acos(f2);
            float fSin2 = 1.0f / ((float) Math.sin(fAcos));
            fSin = ((float) Math.sin(fSin * fAcos)) * fSin2;
            f = ((float) Math.sin(f * fAcos)) * fSin2;
        }
        if (f2 < 0.0f) {
            f = -f;
        }
        this.x = (quaternion.x * f) + (this.x * fSin);
        this.y = (quaternion.y * f) + (this.y * fSin);
        this.z = (quaternion.z * f) + (this.z * fSin);
        this.w = (f * quaternion.w) + (fSin * this.w);
        return this;
    }

    public void toMatrix(float[] fArr) {
        float f = this.x;
        float f2 = f * f;
        float f3 = this.y;
        float f4 = f * f3;
        float f5 = this.z;
        float f6 = f * f5;
        float f7 = this.w;
        float f8 = f * f7;
        float f9 = f3 * f3;
        float f10 = f3 * f5;
        float f11 = f3 * f7;
        float f12 = f5 * f5;
        float f13 = f5 * f7;
        fArr[0] = 1.0f - ((f9 + f12) * 2.0f);
        fArr[4] = (f4 - f13) * 2.0f;
        fArr[8] = (f6 + f11) * 2.0f;
        fArr[12] = 0.0f;
        fArr[1] = (f4 + f13) * 2.0f;
        fArr[5] = 1.0f - ((f12 + f2) * 2.0f);
        fArr[9] = (f10 - f8) * 2.0f;
        fArr[13] = 0.0f;
        fArr[2] = (f6 - f11) * 2.0f;
        fArr[6] = (f10 + f8) * 2.0f;
        fArr[10] = 1.0f - ((f2 + f9) * 2.0f);
        fArr[14] = 0.0f;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[15] = 1.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.x);
        sb.append("|");
        sb.append(this.y);
        sb.append("|");
        sb.append(this.z);
        sb.append("|");
        return DM.j(sb, this.w, "]");
    }

    public Vector3 transform(Vector3 vector3) {
        tmp2.set(this);
        tmp2.conjugate();
        tmp2.mulLeft(tmp1.set(vector3.x, vector3.y, vector3.z, 0.0f)).mulLeft(this);
        Quaternion quaternion = tmp2;
        vector3.x = quaternion.x;
        vector3.y = quaternion.y;
        vector3.z = quaternion.z;
        return vector3;
    }

    public float dot(Quaternion quaternion) {
        return (this.w * quaternion.w) + (this.z * quaternion.z) + (this.y * quaternion.y) + (this.x * quaternion.x);
    }

    public float getAngleAround(Vector3 vector3) {
        return getAngleAround(vector3.x, vector3.y, vector3.z);
    }

    public boolean isIdentity(float f) {
        return MathUtils.isZero(this.x, f) && MathUtils.isZero(this.y, f) && MathUtils.isZero(this.z, f) && MathUtils.isEqual(this.w, 1.0f, f);
    }

    public float len() {
        float f = this.x;
        float f2 = this.y;
        float f3 = (f2 * f2) + (f * f);
        float f4 = this.z;
        float f5 = (f4 * f4) + f3;
        float f6 = this.w;
        return (float) Math.sqrt((f6 * f6) + f5);
    }

    public float len2() {
        float f = this.x;
        float f2 = this.y;
        float f3 = (f2 * f2) + (f * f);
        float f4 = this.z;
        float f5 = (f4 * f4) + f3;
        float f6 = this.w;
        return (f6 * f6) + f5;
    }

    public Quaternion setFromAxes(boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (z) {
            float fLen = 1.0f / Vector3.len(f, f2, f3);
            float fLen2 = 1.0f / Vector3.len(f4, f5, f6);
            float fLen3 = 1.0f / Vector3.len(f7, f8, f9);
            f *= fLen;
            f2 *= fLen;
            f3 *= fLen;
            f4 *= fLen2;
            f5 *= fLen2;
            f6 *= fLen2;
            f7 *= fLen3;
            f8 *= fLen3;
            f9 *= fLen3;
        }
        float f10 = f + f5 + f9;
        if (f10 >= 0.0f) {
            float fSqrt = (float) Math.sqrt(f10 + 1.0f);
            this.w = fSqrt * 0.5f;
            float f11 = 0.5f / fSqrt;
            this.x = (f8 - f6) * f11;
            this.y = (f3 - f7) * f11;
            this.z = (f4 - f2) * f11;
        } else if (f > f5 && f > f9) {
            float fSqrt2 = (float) Math.sqrt(((((double) f) + 1.0d) - ((double) f5)) - ((double) f9));
            this.x = fSqrt2 * 0.5f;
            float f12 = 0.5f / fSqrt2;
            this.y = (f4 + f2) * f12;
            this.z = (f3 + f7) * f12;
            this.w = (f8 - f6) * f12;
        } else if (f5 > f9) {
            float fSqrt3 = (float) Math.sqrt(((((double) f5) + 1.0d) - ((double) f)) - ((double) f9));
            this.y = fSqrt3 * 0.5f;
            float f13 = 0.5f / fSqrt3;
            this.x = (f4 + f2) * f13;
            this.z = (f8 + f6) * f13;
            this.w = (f3 - f7) * f13;
        } else {
            float fSqrt4 = (float) Math.sqrt(((((double) f9) + 1.0d) - ((double) f)) - ((double) f5));
            this.z = fSqrt4 * 0.5f;
            float f14 = 0.5f / fSqrt4;
            this.x = (f3 + f7) * f14;
            this.y = (f8 + f6) * f14;
            this.w = (f4 - f2) * f14;
        }
        return this;
    }

    public Quaternion setFromAxis(float f, float f2, float f3, float f4) {
        return setFromAxisRad(f, f2, f3, f4 * 0.017453292f);
    }

    public Quaternion setFromAxisRad(float f, float f2, float f3, float f4) {
        float fLen = Vector3.len(f, f2, f3);
        if (fLen == 0.0f) {
            return idt();
        }
        float f5 = 1.0f / fLen;
        double d = (f4 < 0.0f ? 6.2831855f - ((-f4) % 6.2831855f) : f4 % 6.2831855f) / 2.0f;
        float fSin = (float) Math.sin(d);
        return set(f * f5 * fSin, f2 * f5 * fSin, f5 * f3 * fSin, (float) Math.cos(d)).nor();
    }

    public Quaternion setFromMatrix(Matrix4 matrix4) {
        return setFromMatrix(false, matrix4);
    }

    public Quaternion() {
        idt();
    }

    public float dot(float f, float f2, float f3, float f4) {
        return (this.w * f4) + (this.z * f3) + (this.y * f2) + (this.x * f);
    }

    public Quaternion setFromMatrix(boolean z, Matrix3 matrix3) {
        float[] fArr = matrix3.val;
        return setFromAxes(z, fArr[0], fArr[3], fArr[6], fArr[1], fArr[4], fArr[7], fArr[2], fArr[5], fArr[8]);
    }

    public Quaternion setFromCross(float f, float f2, float f3, float f4, float f5, float f6) {
        return setFromAxisRad((f2 * f6) - (f3 * f5), (f3 * f4) - (f6 * f), (f * f5) - (f2 * f4), (float) Math.acos(MathUtils.clamp(Vector3.dot(f, f2, f3, f4, f5, f6), -1.0f, 1.0f)));
    }

    public Quaternion setFromMatrix(Matrix3 matrix3) {
        return setFromMatrix(false, matrix3);
    }

    public Quaternion(Quaternion quaternion) {
        set(quaternion);
    }

    public Quaternion add(float f, float f2, float f3, float f4) {
        this.x += f;
        this.y += f2;
        this.z += f3;
        this.w += f4;
        return this;
    }

    public float getAngleAroundRad(Vector3 vector3) {
        return getAngleAroundRad(vector3.x, vector3.y, vector3.z);
    }

    public void getSwingTwist(Vector3 vector3, Quaternion quaternion, Quaternion quaternion2) {
        getSwingTwist(vector3.x, vector3.y, vector3.z, quaternion, quaternion2);
    }

    public Quaternion set(Quaternion quaternion) {
        return set(quaternion.x, quaternion.y, quaternion.z, quaternion.w);
    }

    public Quaternion mul(float f, float f2, float f3, float f4) {
        float f5 = this.w;
        float f6 = this.x;
        float f7 = this.y;
        float f8 = (f7 * f3) + (f6 * f4) + (f5 * f);
        float f9 = this.z;
        float f10 = ((f9 * f) + ((f7 * f4) + (f5 * f2))) - (f6 * f3);
        this.x = f8 - (f9 * f2);
        this.y = f10;
        this.z = ((f6 * f2) + ((f9 * f4) + (f5 * f3))) - (f7 * f);
        this.w = (((f5 * f4) - (f6 * f)) - (f7 * f2)) - (f9 * f3);
        return this;
    }

    public Quaternion mulLeft(float f, float f2, float f3, float f4) {
        float f5 = this.x;
        float f6 = this.w;
        float f7 = this.z;
        float f8 = (f2 * f7) + (f * f6) + (f4 * f5);
        float f9 = this.y;
        float f10 = ((f3 * f5) + ((f2 * f6) + (f4 * f9))) - (f * f7);
        this.x = f8 - (f3 * f9);
        this.y = f10;
        this.z = ((f * f9) + ((f3 * f6) + (f4 * f7))) - (f2 * f5);
        this.w = (((f4 * f6) - (f * f5)) - (f2 * f9)) - (f3 * f7);
        return this;
    }

    public Quaternion set(Vector3 vector3, float f) {
        return setFromAxis(vector3.x, vector3.y, vector3.z, f);
    }

    public Quaternion(Vector3 vector3, float f) {
        set(vector3, f);
    }

    public Quaternion slerp(Quaternion[] quaternionArr) {
        float length = 1.0f / quaternionArr.length;
        set(quaternionArr[0]).exp(length);
        for (int i = 1; i < quaternionArr.length; i++) {
            mul(tmp1.set(quaternionArr[i]).exp(length));
        }
        nor();
        return this;
    }

    public Quaternion mul(float f) {
        this.x *= f;
        this.y *= f;
        this.z *= f;
        this.w *= f;
        return this;
    }

    public Quaternion slerp(Quaternion[] quaternionArr, float[] fArr) {
        set(quaternionArr[0]).exp(fArr[0]);
        for (int i = 1; i < quaternionArr.length; i++) {
            mul(tmp1.set(quaternionArr[i]).exp(fArr[i]));
        }
        nor();
        return this;
    }
}
