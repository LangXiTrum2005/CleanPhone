package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.GdxRuntimeException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class Affine2 implements Serializable {
    private static final long serialVersionUID = 1524569123485049187L;
    public float m00 = 1.0f;
    public float m01 = 0.0f;
    public float m02 = 0.0f;
    public float m10 = 0.0f;
    public float m11 = 1.0f;
    public float m12 = 0.0f;

    public Affine2() {
    }

    public void applyTo(Vector2 vector2) {
        float f = vector2.x;
        float f2 = vector2.y;
        vector2.x = (this.m01 * f2) + (this.m00 * f) + this.m02;
        vector2.y = (this.m11 * f2) + (this.m10 * f) + this.m12;
    }

    public float det() {
        return (this.m00 * this.m11) - (this.m01 * this.m10);
    }

    public Vector2 getTranslation(Vector2 vector2) {
        vector2.x = this.m02;
        vector2.y = this.m12;
        return vector2;
    }

    public Affine2 idt() {
        this.m00 = 1.0f;
        this.m01 = 0.0f;
        this.m02 = 0.0f;
        this.m10 = 0.0f;
        this.m11 = 1.0f;
        this.m12 = 0.0f;
        return this;
    }

    public Affine2 inv() {
        float fDet = det();
        if (fDet == 0.0f) {
            throw new GdxRuntimeException("Can't invert a singular affine matrix");
        }
        float f = 1.0f / fDet;
        float f2 = this.m11;
        float f3 = this.m01;
        float f4 = -f3;
        float f5 = this.m12;
        float f6 = this.m02;
        float f7 = this.m10;
        float f8 = -f7;
        float f9 = this.m00;
        this.m00 = f2 * f;
        this.m01 = f4 * f;
        this.m02 = ((f3 * f5) - (f2 * f6)) * f;
        this.m10 = f8 * f;
        this.m11 = f9 * f;
        this.m12 = f * ((f7 * f6) - (f5 * f9));
        return this;
    }

    public boolean isIdt() {
        return this.m00 == 1.0f && this.m02 == 0.0f && this.m12 == 0.0f && this.m11 == 1.0f && this.m01 == 0.0f && this.m10 == 0.0f;
    }

    public boolean isTranslation() {
        return this.m00 == 1.0f && this.m11 == 1.0f && this.m01 == 0.0f && this.m10 == 0.0f;
    }

    public Affine2 mul(Affine2 affine2) {
        float f = this.m00;
        float f2 = affine2.m00;
        float f3 = this.m01;
        float f4 = affine2.m10;
        float f5 = (f3 * f4) + (f * f2);
        float f6 = affine2.m01;
        float f7 = affine2.m11;
        float f8 = (f3 * f7) + (f * f6);
        float f9 = affine2.m02;
        float f10 = affine2.m12;
        float f11 = (f3 * f10) + (f * f9) + this.m02;
        float f12 = this.m10;
        float f13 = this.m11;
        float f14 = (f4 * f13) + (f2 * f12);
        float f15 = (f7 * f13) + (f6 * f12);
        float f16 = (f13 * f10) + (f12 * f9) + this.m12;
        this.m00 = f5;
        this.m01 = f8;
        this.m02 = f11;
        this.m10 = f14;
        this.m11 = f15;
        this.m12 = f16;
        return this;
    }

    public Affine2 preMul(Affine2 affine2) {
        float f = affine2.m00;
        float f2 = this.m00;
        float f3 = affine2.m01;
        float f4 = this.m10;
        float f5 = (f3 * f4) + (f * f2);
        float f6 = this.m01;
        float f7 = this.m11;
        float f8 = (f3 * f7) + (f * f6);
        float f9 = this.m02;
        float f10 = this.m12;
        float f11 = (f3 * f10) + (f * f9) + affine2.m02;
        float f12 = affine2.m10;
        float f13 = affine2.m11;
        float f14 = (f4 * f13) + (f2 * f12);
        float f15 = (f7 * f13) + (f6 * f12);
        float f16 = (f13 * f10) + (f12 * f9) + affine2.m12;
        this.m00 = f5;
        this.m01 = f8;
        this.m02 = f11;
        this.m10 = f14;
        this.m11 = f15;
        this.m12 = f16;
        return this;
    }

    public Affine2 preRotate(float f) {
        if (f == 0.0f) {
            return this;
        }
        float fCosDeg = MathUtils.cosDeg(f);
        float fSinDeg = MathUtils.sinDeg(f);
        float f2 = this.m00;
        float f3 = this.m10;
        float f4 = (fCosDeg * f2) - (fSinDeg * f3);
        float f5 = this.m01;
        float f6 = this.m11;
        float f7 = (fCosDeg * f5) - (fSinDeg * f6);
        float f8 = this.m02;
        float f9 = this.m12;
        float f10 = (fCosDeg * f8) - (fSinDeg * f9);
        float f11 = (f3 * fCosDeg) + (f2 * fSinDeg);
        float f12 = (f6 * fCosDeg) + (f5 * fSinDeg);
        this.m00 = f4;
        this.m01 = f7;
        this.m02 = f10;
        this.m10 = f11;
        this.m11 = f12;
        this.m12 = (fCosDeg * f9) + (fSinDeg * f8);
        return this;
    }

    public Affine2 preRotateRad(float f) {
        if (f == 0.0f) {
            return this;
        }
        float fCos = MathUtils.cos(f);
        float fSin = MathUtils.sin(f);
        float f2 = this.m00;
        float f3 = this.m10;
        float f4 = (fCos * f2) - (fSin * f3);
        float f5 = this.m01;
        float f6 = this.m11;
        float f7 = (fCos * f5) - (fSin * f6);
        float f8 = this.m02;
        float f9 = this.m12;
        float f10 = (fCos * f8) - (fSin * f9);
        float f11 = (f3 * fCos) + (f2 * fSin);
        float f12 = (f6 * fCos) + (f5 * fSin);
        this.m00 = f4;
        this.m01 = f7;
        this.m02 = f10;
        this.m10 = f11;
        this.m11 = f12;
        this.m12 = (fCos * f9) + (fSin * f8);
        return this;
    }

    public Affine2 preScale(float f, float f2) {
        this.m00 *= f;
        this.m01 *= f;
        this.m02 *= f;
        this.m10 *= f2;
        this.m11 *= f2;
        this.m12 *= f2;
        return this;
    }

    public Affine2 preShear(float f, float f2) {
        float f3 = this.m00;
        float f4 = this.m10;
        float f5 = (f * f4) + f3;
        float f6 = this.m01;
        float f7 = this.m11;
        float f8 = (f * f7) + f6;
        float f9 = this.m02;
        float f10 = this.m12;
        this.m00 = f5;
        this.m01 = f8;
        this.m02 = (f * f10) + f9;
        this.m10 = (f3 * f2) + f4;
        this.m11 = (f6 * f2) + f7;
        this.m12 = (f2 * f9) + f10;
        return this;
    }

    public Affine2 preTranslate(float f, float f2) {
        this.m02 += f;
        this.m12 += f2;
        return this;
    }

    public Affine2 rotate(float f) {
        if (f == 0.0f) {
            return this;
        }
        float fCosDeg = MathUtils.cosDeg(f);
        float fSinDeg = MathUtils.sinDeg(f);
        float f2 = this.m00;
        float f3 = this.m01;
        float f4 = (f3 * fSinDeg) + (f2 * fCosDeg);
        float f5 = -fSinDeg;
        float f6 = (f3 * fCosDeg) + (f2 * f5);
        float f7 = this.m10;
        float f8 = this.m11;
        float f9 = (fSinDeg * f8) + (f7 * fCosDeg);
        this.m00 = f4;
        this.m01 = f6;
        this.m10 = f9;
        this.m11 = (f8 * fCosDeg) + (f7 * f5);
        return this;
    }

    public Affine2 rotateRad(float f) {
        if (f == 0.0f) {
            return this;
        }
        float fCos = MathUtils.cos(f);
        float fSin = MathUtils.sin(f);
        float f2 = this.m00;
        float f3 = this.m01;
        float f4 = (f3 * fSin) + (f2 * fCos);
        float f5 = -fSin;
        float f6 = (f3 * fCos) + (f2 * f5);
        float f7 = this.m10;
        float f8 = this.m11;
        float f9 = (fSin * f8) + (f7 * fCos);
        this.m00 = f4;
        this.m01 = f6;
        this.m10 = f9;
        this.m11 = (f8 * fCos) + (f7 * f5);
        return this;
    }

    public Affine2 scale(float f, float f2) {
        this.m00 *= f;
        this.m01 *= f2;
        this.m10 *= f;
        this.m11 *= f2;
        return this;
    }

    public Affine2 set(Affine2 affine2) {
        this.m00 = affine2.m00;
        this.m01 = affine2.m01;
        this.m02 = affine2.m02;
        this.m10 = affine2.m10;
        this.m11 = affine2.m11;
        this.m12 = affine2.m12;
        return this;
    }

    public Affine2 setToProduct(Affine2 affine2, Affine2 affine3) {
        float f = affine2.m00 * affine3.m00;
        float f2 = affine2.m01;
        float f3 = affine3.m10;
        this.m00 = (f2 * f3) + f;
        float f4 = affine2.m00;
        float f5 = affine3.m01 * f4;
        float f6 = affine3.m11;
        this.m01 = (f2 * f6) + f5;
        float f7 = f4 * affine3.m02;
        float f8 = affine2.m01;
        float f9 = affine3.m12;
        this.m02 = (f8 * f9) + f7 + affine2.m02;
        float f10 = affine2.m10 * affine3.m00;
        float f11 = affine2.m11;
        this.m10 = (f3 * f11) + f10;
        float f12 = affine2.m10;
        this.m11 = (f11 * f6) + (affine3.m01 * f12);
        this.m12 = (affine2.m11 * f9) + (f12 * affine3.m02) + affine2.m12;
        return this;
    }

    public Affine2 setToRotation(float f) {
        float fCosDeg = MathUtils.cosDeg(f);
        float fSinDeg = MathUtils.sinDeg(f);
        this.m00 = fCosDeg;
        this.m01 = -fSinDeg;
        this.m02 = 0.0f;
        this.m10 = fSinDeg;
        this.m11 = fCosDeg;
        this.m12 = 0.0f;
        return this;
    }

    public Affine2 setToRotationRad(float f) {
        float fCos = MathUtils.cos(f);
        float fSin = MathUtils.sin(f);
        this.m00 = fCos;
        this.m01 = -fSin;
        this.m02 = 0.0f;
        this.m10 = fSin;
        this.m11 = fCos;
        this.m12 = 0.0f;
        return this;
    }

    public Affine2 setToScaling(float f, float f2) {
        this.m00 = f;
        this.m01 = 0.0f;
        this.m02 = 0.0f;
        this.m10 = 0.0f;
        this.m11 = f2;
        this.m12 = 0.0f;
        return this;
    }

    public Affine2 setToShearing(float f, float f2) {
        this.m00 = 1.0f;
        this.m01 = f;
        this.m02 = 0.0f;
        this.m10 = f2;
        this.m11 = 1.0f;
        this.m12 = 0.0f;
        return this;
    }

    public Affine2 setToTranslation(float f, float f2) {
        this.m00 = 1.0f;
        this.m01 = 0.0f;
        this.m02 = f;
        this.m10 = 0.0f;
        this.m11 = 1.0f;
        this.m12 = f2;
        return this;
    }

    public Affine2 setToTrnRotRadScl(float f, float f2, float f3, float f4, float f5) {
        this.m02 = f;
        this.m12 = f2;
        if (f3 == 0.0f) {
            this.m00 = f4;
            this.m01 = 0.0f;
            this.m10 = 0.0f;
            this.m11 = f5;
        } else {
            float fSin = MathUtils.sin(f3);
            float fCos = MathUtils.cos(f3);
            this.m00 = fCos * f4;
            this.m01 = (-fSin) * f5;
            this.m10 = fSin * f4;
            this.m11 = fCos * f5;
        }
        return this;
    }

    public Affine2 setToTrnRotScl(float f, float f2, float f3, float f4, float f5) {
        this.m02 = f;
        this.m12 = f2;
        if (f3 == 0.0f) {
            this.m00 = f4;
            this.m01 = 0.0f;
            this.m10 = 0.0f;
            this.m11 = f5;
        } else {
            float fSinDeg = MathUtils.sinDeg(f3);
            float fCosDeg = MathUtils.cosDeg(f3);
            this.m00 = fCosDeg * f4;
            this.m01 = (-fSinDeg) * f5;
            this.m10 = fSinDeg * f4;
            this.m11 = fCosDeg * f5;
        }
        return this;
    }

    public Affine2 setToTrnScl(float f, float f2, float f3, float f4) {
        this.m00 = f3;
        this.m01 = 0.0f;
        this.m02 = f;
        this.m10 = 0.0f;
        this.m11 = f4;
        this.m12 = f2;
        return this;
    }

    public Affine2 shear(float f, float f2) {
        float f3 = this.m00;
        float f4 = this.m01;
        this.m00 = (f2 * f4) + f3;
        this.m01 = (f3 * f) + f4;
        float f5 = this.m10;
        float f6 = this.m11;
        this.m10 = (f2 * f6) + f5;
        this.m11 = (f * f5) + f6;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.m00);
        sb.append("|");
        sb.append(this.m01);
        sb.append("|");
        sb.append(this.m02);
        sb.append("]\n[");
        sb.append(this.m10);
        sb.append("|");
        sb.append(this.m11);
        sb.append("|");
        return DM.j(sb, this.m12, "]\n[0.0|0.0|0.1]");
    }

    public Affine2 translate(float f, float f2) {
        float f3 = this.m02;
        this.m02 = AbstractC5044xl.d(this.m01, f2, this.m00 * f, f3);
        float f4 = this.m12;
        this.m12 = AbstractC5044xl.d(this.m11, f2, this.m10 * f, f4);
        return this;
    }

    public Affine2 preTranslate(Vector2 vector2) {
        return preTranslate(vector2.x, vector2.y);
    }

    public Affine2 translate(Vector2 vector2) {
        return translate(vector2.x, vector2.y);
    }

    public Affine2(Affine2 affine2) {
        set(affine2);
    }

    public Affine2 scale(Vector2 vector2) {
        return scale(vector2.x, vector2.y);
    }

    public Affine2 preScale(Vector2 vector2) {
        return preScale(vector2.x, vector2.y);
    }

    public Affine2 set(Matrix3 matrix3) {
        float[] fArr = matrix3.val;
        this.m00 = fArr[0];
        this.m01 = fArr[3];
        this.m02 = fArr[6];
        this.m10 = fArr[1];
        this.m11 = fArr[4];
        this.m12 = fArr[7];
        return this;
    }

    public Affine2 setToScaling(Vector2 vector2) {
        return setToScaling(vector2.x, vector2.y);
    }

    public Affine2 setToShearing(Vector2 vector2) {
        return setToShearing(vector2.x, vector2.y);
    }

    public Affine2 setToTranslation(Vector2 vector2) {
        return setToTranslation(vector2.x, vector2.y);
    }

    public Affine2 setToTrnScl(Vector2 vector2, Vector2 vector3) {
        return setToTrnScl(vector2.x, vector2.y, vector3.x, vector3.y);
    }

    public Affine2 shear(Vector2 vector2) {
        return shear(vector2.x, vector2.y);
    }

    public Affine2 setToRotation(float f, float f2) {
        this.m00 = f;
        this.m01 = -f2;
        this.m02 = 0.0f;
        this.m10 = f2;
        this.m11 = f;
        this.m12 = 0.0f;
        return this;
    }

    public Affine2 preShear(Vector2 vector2) {
        return preShear(vector2.x, vector2.y);
    }

    public Affine2 setToTrnRotRadScl(Vector2 vector2, float f, Vector2 vector3) {
        return setToTrnRotRadScl(vector2.x, vector2.y, f, vector3.x, vector3.y);
    }

    public Affine2 setToTrnRotScl(Vector2 vector2, float f, Vector2 vector3) {
        return setToTrnRotScl(vector2.x, vector2.y, f, vector3.x, vector3.y);
    }

    public Affine2 set(Matrix4 matrix4) {
        float[] fArr = matrix4.val;
        this.m00 = fArr[0];
        this.m01 = fArr[4];
        this.m02 = fArr[12];
        this.m10 = fArr[1];
        this.m11 = fArr[5];
        this.m12 = fArr[13];
        return this;
    }
}
