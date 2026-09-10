package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Vector;

/* JADX INFO: loaded from: classes.dex */
public class CatmullRomSpline<T extends Vector<T>> implements Path<T> {
    public boolean continuous;
    public T[] controlPoints;
    public int spanCount;
    private T tmp;
    private T tmp2;
    private T tmp3;

    public CatmullRomSpline() {
    }

    public static <T extends Vector<T>> T calculate(T t, float f, T[] tArr, boolean z, T t2) {
        int length = tArr.length;
        if (!z) {
            length -= 3;
        }
        float f2 = length * f;
        int i = f >= 1.0f ? length - 1 : (int) f2;
        return (T) calculate(t, i, f2 - i, tArr, z, t2);
    }

    public static <T extends Vector<T>> T derivative(T t, float f, T[] tArr, boolean z, T t2) {
        int length = tArr.length;
        if (!z) {
            length -= 3;
        }
        float f2 = length * f;
        int i = f >= 1.0f ? length - 1 : (int) f2;
        return (T) derivative(t, i, f2 - i, tArr, z, t2);
    }

    @Override // com.badlogic.gdx.math.Path
    public float approxLength(int i) {
        float fDst = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            this.tmp2.set(this.tmp3);
            valueAt((Vector) this.tmp3, i2 / (i - 1.0f));
            if (i2 > 0) {
                fDst = this.tmp2.dst(this.tmp3) + fDst;
            }
        }
        return fDst;
    }

    public int nearest(T t) {
        return nearest(t, 0, this.spanCount);
    }

    public CatmullRomSpline set(T[] tArr, boolean z) {
        if (this.tmp == null) {
            this.tmp = (T) tArr[0].cpy();
        }
        if (this.tmp2 == null) {
            this.tmp2 = (T) tArr[0].cpy();
        }
        if (this.tmp3 == null) {
            this.tmp3 = (T) tArr[0].cpy();
        }
        this.controlPoints = tArr;
        this.continuous = z;
        int length = tArr.length;
        if (!z) {
            length -= 3;
        }
        this.spanCount = length;
        return this;
    }

    public CatmullRomSpline(T[] tArr, boolean z) {
        set(tArr, z);
    }

    @Override // com.badlogic.gdx.math.Path
    public float approximate(T t) {
        return approximate(t, nearest(t));
    }

    @Override // com.badlogic.gdx.math.Path
    public T derivativeAt(T t, float f) {
        int i = this.spanCount;
        float f2 = i * f;
        int i2 = f >= 1.0f ? i - 1 : (int) f2;
        return (T) derivativeAt(t, i2, f2 - i2);
    }

    @Override // com.badlogic.gdx.math.Path
    public float locate(T t) {
        return approximate((Vector) t);
    }

    public int nearest(T t, int i, int i2) {
        while (i < 0) {
            i += this.spanCount;
        }
        int i3 = i % this.spanCount;
        float fDst2 = t.dst2(this.controlPoints[i3]);
        for (int i4 = 1; i4 < i2; i4++) {
            int i5 = (i + i4) % this.spanCount;
            float fDst3 = t.dst2(this.controlPoints[i5]);
            if (fDst3 < fDst2) {
                i3 = i5;
                fDst2 = fDst3;
            }
        }
        return i3;
    }

    @Override // com.badlogic.gdx.math.Path
    public T valueAt(T t, float f) {
        int i = this.spanCount;
        float f2 = i * f;
        int i2 = f >= 1.0f ? i - 1 : (int) f2;
        return (T) valueAt(t, i2, f2 - i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Vector<T>> T calculate(T t, int i, float f, T[] tArr, boolean z, T t2) {
        int length = tArr.length;
        float f2 = f * f;
        float f3 = f2 * f;
        t.set(tArr[i]).scl(((1.5f * f3) - (2.5f * f2)) + 1.0f);
        if (z || i > 0) {
            t.add(t2.set(tArr[((length + i) - 1) % length]).scl((((-0.5f) * f3) + f2) - (f * 0.5f)));
        }
        if (z || i < length - 1) {
            t.add(t2.set(tArr[(i + 1) % length]).scl((f * 0.5f) + (2.0f * f2) + ((-1.5f) * f3)));
        }
        if (z || i < length - 2) {
            t.add(t2.set(tArr[(i + 2) % length]).scl((f3 * 0.5f) - (f2 * 0.5f)));
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Vector<T>> T derivative(T t, int i, float f, T[] tArr, boolean z, T t2) {
        int length = tArr.length;
        float f2 = f * f;
        float f3 = -f;
        float f4 = 4.5f * f2;
        t.set(tArr[i]).scl((5.0f * f3) + f4);
        if (z || i > 0) {
            t.add(t2.set(tArr[((length + i) - 1) % length]).scl(((2.0f * f) - 0.5f) - (f2 * 1.5f)));
        }
        if (z || i < length - 1) {
            t.add(t2.set(tArr[(i + 1) % length]).scl(((f * 4.0f) + 0.5f) - f4));
        }
        if (z || i < length - 2) {
            t.add(t2.set(tArr[(i + 2) % length]).scl((f2 * 1.5f) + f3));
        }
        return t;
    }

    public float approximate(T t, int i, int i2) {
        return approximate(t, nearest(t, i, i2));
    }

    public float approximate(T t, int i) {
        T[] tArr = this.controlPoints;
        T t2 = tArr[i];
        T t3 = tArr[i > 0 ? i - 1 : this.spanCount - 1];
        T t4 = tArr[(i + 1) % this.spanCount];
        if (t.dst2(t4) >= t.dst2(t3)) {
            if (i <= 0) {
                i = this.spanCount;
            }
            i--;
            t4 = t2;
            t2 = t3;
        }
        float fDst2 = t2.dst2(t4);
        float fDst3 = t.dst2(t4);
        float fDst4 = t.dst2(t2);
        float fSqrt = (float) Math.sqrt(fDst2);
        return (i + MathUtils.clamp((fSqrt - (((fDst3 + fDst2) - fDst4) / (2.0f * fSqrt))) / fSqrt, 0.0f, 1.0f)) / this.spanCount;
    }

    public T derivativeAt(T t, int i, float f) {
        boolean z = this.continuous;
        if (!z) {
            i++;
        }
        return (T) derivative(t, i, f, this.controlPoints, z, this.tmp);
    }

    public T valueAt(T t, int i, float f) {
        boolean z = this.continuous;
        if (!z) {
            i++;
        }
        return (T) calculate(t, i, f, this.controlPoints, z, this.tmp);
    }
}
