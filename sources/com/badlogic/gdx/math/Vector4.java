package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.NumberUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class Vector4 implements Serializable, Vector<Vector4> {
    private static final long serialVersionUID = -5394070284130414492L;
    public float w;
    public float x;
    public float y;
    public float z;
    public static final Vector4 X = new Vector4(1.0f, 0.0f, 0.0f, 0.0f);
    public static final Vector4 Y = new Vector4(0.0f, 1.0f, 0.0f, 0.0f);
    public static final Vector4 Z = new Vector4(0.0f, 0.0f, 1.0f, 0.0f);
    public static final Vector4 W = new Vector4(0.0f, 0.0f, 0.0f, 1.0f);
    public static final Vector4 Zero = new Vector4(0.0f, 0.0f, 0.0f, 0.0f);

    public Vector4() {
    }

    public static float dot(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return (f4 * f8) + (f3 * f7) + (f2 * f6) + (f * f5);
    }

    public static float dst2(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f5 - f;
        float f10 = f6 - f2;
        float f11 = f7 - f3;
        float f12 = f8 - f4;
        return (f12 * f12) + (f11 * f11) + (f10 * f10) + (f9 * f9);
    }

    public static float len(float f, float f2, float f3, float f4) {
        return (float) Math.sqrt((f4 * f4) + (f3 * f3) + (f2 * f2) + (f * f));
    }

    public static float len2(float f, float f2, float f3, float f4) {
        return (f4 * f4) + (f3 * f3) + (f2 * f2) + (f * f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vector4 vector4 = (Vector4) obj;
        return NumberUtils.floatToIntBits(this.x) == NumberUtils.floatToIntBits(vector4.x) && NumberUtils.floatToIntBits(this.y) == NumberUtils.floatToIntBits(vector4.y) && NumberUtils.floatToIntBits(this.z) == NumberUtils.floatToIntBits(vector4.z) && NumberUtils.floatToIntBits(this.w) == NumberUtils.floatToIntBits(vector4.w);
    }

    public Vector4 fromString(String str) {
        int iIndexOf = str.indexOf(44, 1);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(44, i);
        int i2 = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf(44, i2);
        if (iIndexOf != -1 && iIndexOf2 != -1 && str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            try {
                return set(Float.parseFloat(str.substring(1, iIndexOf)), Float.parseFloat(str.substring(i, iIndexOf2)), Float.parseFloat(str.substring(i2, iIndexOf3)), Float.parseFloat(str.substring(iIndexOf3 + 1, str.length() - 1)));
            } catch (NumberFormatException unused) {
            }
        }
        throw new GdxRuntimeException("Malformed Vector4: ".concat(str));
    }

    public int hashCode() {
        return NumberUtils.floatToIntBits(this.w) + ((NumberUtils.floatToIntBits(this.z) + ((NumberUtils.floatToIntBits(this.y) + ((NumberUtils.floatToIntBits(this.x) + 31) * 31)) * 31)) * 31);
    }

    public boolean idt(Vector4 vector4) {
        return this.x == vector4.x && this.y == vector4.y && this.z == vector4.z && this.w == vector4.w;
    }

    @Override // com.badlogic.gdx.math.Vector
    public boolean isUnit() {
        return isUnit(1.0E-9f);
    }

    @Override // com.badlogic.gdx.math.Vector
    public boolean isZero() {
        return this.x == 0.0f && this.y == 0.0f && this.z == 0.0f && this.w == 0.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.x);
        sb.append(",");
        sb.append(this.y);
        sb.append(",");
        sb.append(this.z);
        sb.append(",");
        return DM.j(sb, this.w, ")");
    }

    public Vector4(float f, float f2, float f3, float f4) {
        set(f, f2, f3, f4);
    }

    public static float dst(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f5 - f;
        float f10 = f6 - f2;
        float f11 = f7 - f3;
        float f12 = f8 - f4;
        return (float) Math.sqrt((f12 * f12) + (f11 * f11) + (f10 * f10) + (f9 * f9));
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 add(Vector4 vector4) {
        return add(vector4.x, vector4.y, vector4.z, vector4.w);
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 clamp(float f, float f2) {
        float fLen2 = len2();
        if (fLen2 == 0.0f) {
            return this;
        }
        float f3 = f2 * f2;
        if (fLen2 > f3) {
            return scl((float) Math.sqrt(f3 / fLen2));
        }
        float f4 = f * f;
        return fLen2 < f4 ? scl((float) Math.sqrt(f4 / fLen2)) : this;
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 cpy() {
        return new Vector4(this);
    }

    @Override // com.badlogic.gdx.math.Vector
    public boolean epsilonEquals(Vector4 vector4, float f) {
        return vector4 != null && Math.abs(vector4.x - this.x) <= f && Math.abs(vector4.y - this.y) <= f && Math.abs(vector4.z - this.z) <= f && Math.abs(vector4.w - this.w) <= f;
    }

    @Override // com.badlogic.gdx.math.Vector
    public boolean hasOppositeDirection(Vector4 vector4) {
        return dot(vector4) < 0.0f;
    }

    @Override // com.badlogic.gdx.math.Vector
    public boolean hasSameDirection(Vector4 vector4) {
        return dot(vector4) > 0.0f;
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 interpolate(Vector4 vector4, float f, Interpolation interpolation) {
        return lerp(vector4, interpolation.apply(f));
    }

    @Override // com.badlogic.gdx.math.Vector
    public boolean isUnit(float f) {
        return Math.abs(len2() - 1.0f) < f;
    }

    @Override // com.badlogic.gdx.math.Vector
    public boolean isZero(float f) {
        return len2() < f;
    }

    @Override // com.badlogic.gdx.math.Vector
    public float len() {
        float f = this.x;
        float f2 = this.y;
        float f3 = (f2 * f2) + (f * f);
        float f4 = this.z;
        float f5 = (f4 * f4) + f3;
        float f6 = this.w;
        return (float) Math.sqrt((f6 * f6) + f5);
    }

    @Override // com.badlogic.gdx.math.Vector
    public float len2() {
        float f = this.x;
        float f2 = this.y;
        float f3 = (f2 * f2) + (f * f);
        float f4 = this.z;
        float f5 = (f4 * f4) + f3;
        float f6 = this.w;
        return (f6 * f6) + f5;
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 lerp(Vector4 vector4, float f) {
        float f2 = this.x;
        this.x = AbstractC5044xl.w(vector4.x, f2, f, f2);
        float f3 = this.y;
        this.y = AbstractC5044xl.w(vector4.y, f3, f, f3);
        float f4 = this.z;
        this.z = AbstractC5044xl.w(vector4.z, f4, f, f4);
        float f5 = this.w;
        this.w = AbstractC5044xl.w(vector4.w, f5, f, f5);
        return this;
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 limit(float f) {
        return limit2(f * f);
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 limit2(float f) {
        float fLen2 = len2();
        if (fLen2 > f) {
            scl((float) Math.sqrt(f / fLen2));
        }
        return this;
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 nor() {
        float fLen2 = len2();
        return (fLen2 == 0.0f || fLen2 == 1.0f) ? this : scl(1.0f / ((float) Math.sqrt(fLen2)));
    }

    public Vector4 set(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.w = f4;
        return this;
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 setLength(float f) {
        return setLength2(f * f);
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 setLength2(float f) {
        float fLen2 = len2();
        return (fLen2 == 0.0f || fLen2 == f) ? this : scl((float) Math.sqrt(f / fLen2));
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 setToRandomDirection() {
        float fRandom;
        float fRandom2;
        float f;
        while (true) {
            fRandom = (MathUtils.random() - 0.5f) * 2.0f;
            fRandom2 = (MathUtils.random() - 0.5f) * 2.0f;
            f = (fRandom2 * fRandom2) + (fRandom * fRandom);
            if (f < 1.0f && f != 0.0f) {
                break;
            }
        }
        double d = f;
        float fSqrt = (float) Math.sqrt((Math.log(d) * (-2.0d)) / d);
        this.x = fRandom * fSqrt;
        this.y = fRandom2 * fSqrt;
        while (true) {
            float fRandom3 = (MathUtils.random() - 0.5f) * 2.0f;
            float fRandom4 = (MathUtils.random() - 0.5f) * 2.0f;
            float f2 = (fRandom4 * fRandom4) + (fRandom3 * fRandom3);
            if (f2 < 1.0f && f2 != 0.0f) {
                double d2 = f2;
                float fSqrt2 = (float) Math.sqrt((Math.log(d2) * (-2.0d)) / d2);
                this.z = fRandom3 * fSqrt2;
                this.w = fRandom4 * fSqrt2;
                return nor();
            }
        }
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 setZero() {
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
        this.w = 0.0f;
        return this;
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 sub(Vector4 vector4) {
        return sub(vector4.x, vector4.y, vector4.z, vector4.w);
    }

    public Vector4 add(float f, float f2, float f3, float f4) {
        return set(this.x + f, this.y + f2, this.z + f3, this.w + f4);
    }

    @Override // com.badlogic.gdx.math.Vector
    public float dot(Vector4 vector4) {
        return (this.w * vector4.w) + (this.z * vector4.z) + (this.y * vector4.y) + (this.x * vector4.x);
    }

    @Override // com.badlogic.gdx.math.Vector
    public float dst(Vector4 vector4) {
        float f = vector4.x - this.x;
        float f2 = vector4.y - this.y;
        float f3 = vector4.z - this.z;
        float f4 = vector4.w - this.w;
        return (float) Math.sqrt((f4 * f4) + (f3 * f3) + (f2 * f2) + (f * f));
    }

    @Override // com.badlogic.gdx.math.Vector
    public float dst2(Vector4 vector4) {
        float f = vector4.x - this.x;
        float f2 = vector4.y - this.y;
        float f3 = vector4.z - this.z;
        float f4 = vector4.w - this.w;
        return (f4 * f4) + (f3 * f3) + (f2 * f2) + (f * f);
    }

    @Override // com.badlogic.gdx.math.Vector
    public boolean isCollinear(Vector4 vector4, float f) {
        return isOnLine(vector4, f) && hasSameDirection(vector4);
    }

    @Override // com.badlogic.gdx.math.Vector
    public boolean isCollinearOpposite(Vector4 vector4, float f) {
        return isOnLine(vector4, f) && hasOppositeDirection(vector4);
    }

    @Override // com.badlogic.gdx.math.Vector
    public boolean isOnLine(Vector4 vector4, float f) {
        float f2;
        int i;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (MathUtils.isZero(this.x, f)) {
            if (!MathUtils.isZero(vector4.x, f)) {
                return false;
            }
            f2 = 0.0f;
            i = 0;
        } else {
            f2 = this.x / vector4.x;
            i = 1;
        }
        if (MathUtils.isZero(this.y, f)) {
            if (!MathUtils.isZero(vector4.y, f)) {
                return false;
            }
            f3 = 0.0f;
        } else {
            f3 = this.y / vector4.y;
            i |= 2;
        }
        if (MathUtils.isZero(this.z, f)) {
            if (!MathUtils.isZero(vector4.z, f)) {
                return false;
            }
            f4 = 0.0f;
        } else {
            f4 = this.z / vector4.z;
            i |= 4;
        }
        if (MathUtils.isZero(this.w, f)) {
            if (!MathUtils.isZero(vector4.w, f)) {
                return false;
            }
        } else {
            f5 = this.w / vector4.w;
            i |= 8;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 8:
                return true;
            case 3:
                return MathUtils.isEqual(f2, f3, f);
            case 5:
                return MathUtils.isEqual(f2, f4, f);
            case 6:
                return MathUtils.isEqual(f3, f4, f);
            case 7:
                return MathUtils.isEqual(f2, f3, f) && MathUtils.isEqual(f2, f4, f);
            case 9:
                return MathUtils.isEqual(f2, f5, f);
            case 10:
                return MathUtils.isEqual(f3, f5, f);
            case 11:
                return MathUtils.isEqual(f2, f3, f) && MathUtils.isEqual(f2, f5, f);
            case 12:
                return MathUtils.isEqual(f4, f5, f);
            case 13:
                return MathUtils.isEqual(f2, f4, f) && MathUtils.isEqual(f2, f5, f);
            case 14:
                return MathUtils.isEqual(f3, f4, f) && MathUtils.isEqual(f3, f5, f);
            default:
                return MathUtils.isEqual(f2, f3, f) && MathUtils.isEqual(f2, f4, f) && MathUtils.isEqual(f2, f5, f);
        }
    }

    @Override // com.badlogic.gdx.math.Vector
    public boolean isPerpendicular(Vector4 vector4) {
        return MathUtils.isZero(dot(vector4));
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 mulAdd(Vector4 vector4, float f) {
        this.x = (vector4.x * f) + this.x;
        this.y = (vector4.y * f) + this.y;
        this.z = (vector4.z * f) + this.z;
        this.w = (vector4.w * f) + this.w;
        return this;
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 scl(float f) {
        return set(this.x * f, this.y * f, this.z * f, this.w * f);
    }

    public Vector4 sub(float f, float f2, float f3, float f4) {
        return set(this.x - f, this.y - f2, this.z - f3, this.w - f4);
    }

    public Vector4(Vector4 vector4) {
        set(vector4.x, vector4.y, vector4.z, vector4.w);
    }

    public Vector4 add(float f) {
        return set(this.x + f, this.y + f, this.z + f, this.w + f);
    }

    public float dot(float f, float f2, float f3, float f4) {
        return (this.w * f4) + (this.z * f3) + (this.y * f2) + (this.x * f);
    }

    @Override // com.badlogic.gdx.math.Vector
    public boolean isCollinear(Vector4 vector4) {
        return isOnLine(vector4) && hasSameDirection(vector4);
    }

    @Override // com.badlogic.gdx.math.Vector
    public boolean isCollinearOpposite(Vector4 vector4) {
        return isOnLine(vector4) && hasOppositeDirection(vector4);
    }

    @Override // com.badlogic.gdx.math.Vector
    public boolean isPerpendicular(Vector4 vector4, float f) {
        return MathUtils.isZero(dot(vector4), f);
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 scl(Vector4 vector4) {
        return set(this.x * vector4.x, this.y * vector4.y, this.z * vector4.z, this.w * vector4.w);
    }

    public Vector4 sub(float f) {
        return set(this.x - f, this.y - f, this.z - f, this.w - f);
    }

    public Vector4 scl(float f, float f2, float f3, float f4) {
        return set(this.x * f, this.y * f2, this.z * f3, this.w * f4);
    }

    public Vector4(float[] fArr) {
        set(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public boolean epsilonEquals(float f, float f2, float f3, float f4, float f5) {
        return Math.abs(f - this.x) <= f5 && Math.abs(f2 - this.y) <= f5 && Math.abs(f3 - this.z) <= f5 && Math.abs(f4 - this.w) <= f5;
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 set(Vector4 vector4) {
        return set(vector4.x, vector4.y, vector4.z, vector4.w);
    }

    public float dst2(float f, float f2, float f3, float f4) {
        float f5 = f - this.x;
        float f6 = f2 - this.y;
        float f7 = f3 - this.z;
        float f8 = f4 - this.w;
        return (f8 * f8) + (f7 * f7) + (f6 * f6) + (f5 * f5);
    }

    @Override // com.badlogic.gdx.math.Vector
    public Vector4 mulAdd(Vector4 vector4, Vector4 vector5) {
        this.x = (vector4.x * vector5.x) + this.x;
        this.y = (vector4.y * vector5.y) + this.y;
        this.z = (vector4.z * vector5.z) + this.z;
        this.w = (vector4.w * vector5.w) + this.w;
        return this;
    }

    public Vector4 set(float[] fArr) {
        return set(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public Vector4(Vector2 vector2, float f, float f2) {
        set(vector2.x, vector2.y, f, f2);
    }

    public float dst(float f, float f2, float f3, float f4) {
        float f5 = f - this.x;
        float f6 = f2 - this.y;
        float f7 = f3 - this.z;
        float f8 = f4 - this.w;
        return (float) Math.sqrt((f8 * f8) + (f7 * f7) + (f6 * f6) + (f5 * f5));
    }

    public Vector4 set(Vector2 vector2, float f, float f2) {
        return set(vector2.x, vector2.y, f, f2);
    }

    public Vector4 set(Vector3 vector3, float f) {
        return set(vector3.x, vector3.y, vector3.z, f);
    }

    public Vector4(Vector3 vector3, float f) {
        set(vector3.x, vector3.y, vector3.z, f);
    }

    public boolean epsilonEquals(Vector4 vector4) {
        return epsilonEquals(vector4, 1.0E-6f);
    }

    public boolean epsilonEquals(float f, float f2, float f3, float f4) {
        return epsilonEquals(f, f2, f3, f4, 1.0E-6f);
    }

    @Override // com.badlogic.gdx.math.Vector
    public boolean isOnLine(Vector4 vector4) {
        return isOnLine(vector4, 1.0E-6f);
    }
}
