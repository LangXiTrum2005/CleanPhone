package com.google.android.material.carousel;

import androidx.core.math.MathUtils;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes4.dex */
final class Arrangement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19171c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f19172e;
    public final float f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f19173h;

    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    public Arrangement(int i2, float f, float f2, float f3, int i3, float f4, int i4, float f5, int i5, float f6) {
        float fAbs;
        this.f19169a = i2;
        float fA = MathUtils.a(f, f2, f3);
        this.f19170b = fA;
        this.f19171c = i3;
        this.f19172e = f4;
        this.d = i4;
        this.f = f5;
        this.g = i5;
        float f7 = i5;
        float f8 = (f4 * i4) + (f5 * f7);
        float f9 = i3;
        float f10 = f6 - ((fA * f9) + f8);
        if (i3 > 0 && f10 > 0.0f) {
            this.f19170b = Math.min(f10 / f9, f3 - fA) + fA;
        } else if (i3 > 0 && f10 < 0.0f) {
            this.f19170b = Math.max(f10 / f9, f2 - fA) + fA;
        }
        int i6 = this.f19171c;
        float f11 = i6 > 0 ? this.f19170b : 0.0f;
        this.f19170b = f11;
        int i7 = this.d;
        float f12 = i7;
        float f13 = f12 / 2.0f;
        float f14 = (f6 - ((i6 + f13) * (i6 > 0 ? f11 : 0.0f))) / (f13 + f7);
        this.f = f14;
        float f15 = (f11 + f14) / 2.0f;
        this.f19172e = f15;
        if (i7 > 0 && f14 != f5) {
            float f16 = (f5 - f14) * f7;
            float fMin = Math.min(Math.abs(f16), f15 * 0.1f * f12);
            if (f16 > 0.0f) {
                this.f19172e -= fMin / this.d;
                this.f = (fMin / f7) + this.f;
            } else {
                this.f19172e = (fMin / this.d) + this.f19172e;
                this.f -= fMin / f7;
            }
        }
        if (i5 > 0 && this.f19171c > 0 && this.d > 0) {
            float f17 = this.f;
            float f18 = this.f19172e;
            if (f17 <= f18 || f18 <= this.f19170b) {
                fAbs = Float.MAX_VALUE;
            } else {
                fAbs = i2 * Math.abs(f5 - this.f);
            }
        } else if (i5 <= 0 || this.f19171c <= 0 || this.f > this.f19170b) {
            fAbs = i2 * Math.abs(f5 - this.f);
        } else {
            fAbs = Float.MAX_VALUE;
        }
        this.f19173h = fAbs;
    }

    public static Arrangement a(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        Arrangement arrangement = null;
        int i2 = 1;
        for (int i3 : iArr3) {
            int length = iArr2.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = iArr2[i4];
                int length2 = iArr.length;
                int i6 = 0;
                while (i6 < length2) {
                    int i7 = length;
                    int i8 = i4;
                    int i9 = i2;
                    int i10 = length2;
                    int i11 = i6;
                    Arrangement arrangement2 = new Arrangement(i9, f2, f3, f4, iArr[i6], f5, i5, f6, i3, f);
                    float f7 = arrangement2.f19173h;
                    if (arrangement == null || f7 < arrangement.f19173h) {
                        if (f7 == 0.0f) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    int i12 = i9 + 1;
                    i6 = i11 + 1;
                    i4 = i8;
                    i2 = i12;
                    length = i7;
                    length2 = i10;
                }
                i4++;
                i2 = i2;
                length = length;
            }
        }
        return arrangement;
    }

    public final String toString() {
        return "Arrangement [priority=" + this.f19169a + ", smallCount=" + this.f19171c + ", smallSize=" + this.f19170b + ", mediumCount=" + this.d + ", mediumSize=" + this.f19172e + ", largeCount=" + this.g + ", largeSize=" + this.f + ", cost=" + this.f19173h + d9.i.f24752e;
    }
}
