package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class Sonic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f17395c;
    public final float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f17396e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f17398i;
    public short[] j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f17399l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f17400n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17401p;
    public int q;
    public int r;
    public int s;
    public int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17402u;
    public int v;

    public Sonic(int i2, int i3, float f, float f2, int i4) {
        this.f17393a = i2;
        this.f17394b = i3;
        this.f17395c = f;
        this.d = f2;
        this.f17396e = i2 / i4;
        this.f = i2 / 400;
        int i5 = i2 / 65;
        this.g = i5;
        int i6 = i5 * 2;
        this.f17397h = i6;
        this.f17398i = new short[i6];
        this.j = new short[i6 * i3];
        this.f17399l = new short[i6 * i3];
        this.f17400n = new short[i6 * i3];
    }

    public static void e(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr3[i9] * i11) + ((i2 - i11) * sArr2[i10])) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    public final void a(short[] sArr, int i2, int i3) {
        short[] sArrC = c(this.f17399l, this.m, i3);
        this.f17399l = sArrC;
        int i4 = this.f17394b;
        System.arraycopy(sArr, i2 * i4, sArrC, this.m * i4, i4 * i3);
        this.m += i3;
    }

    public final void b(short[] sArr, int i2, int i3) {
        int i4 = this.f17397h / i3;
        int i5 = this.f17394b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.f17398i[i8] = (short) (i9 / i6);
        }
    }

    public final short[] c(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.f17394b;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    public final int d(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f17394b;
        int i6 = 255;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int iAbs = 0;
            for (int i10 = 0; i10 < i3; i10++) {
                iAbs += Math.abs(sArr[i5 + i10] - sArr[(i5 + i3) + i10]);
            }
            if (iAbs * i8 < i7 * i3) {
                i8 = i3;
                i7 = iAbs;
            }
            if (iAbs * i6 > i9 * i3) {
                i6 = i3;
                i9 = iAbs;
            }
            i3++;
        }
        this.f17402u = i7 / i8;
        this.v = i9 / i6;
        return i8;
    }

    public final void f() {
        float f;
        float f2;
        float f3;
        double d;
        int iD;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.m;
        float f4 = this.f17395c;
        float f5 = this.d;
        float f6 = f4 / f5;
        float f7 = this.f17396e * f5;
        double d2 = f6;
        int i10 = this.f17393a;
        int i11 = this.f17394b;
        int i12 = 1;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            int i13 = this.k;
            int i14 = this.f17397h;
            if (i13 >= i14) {
                int i15 = 0;
                while (true) {
                    int i16 = this.r;
                    if (i16 > 0) {
                        int iMin = Math.min(i14, i16);
                        a(this.j, i15, iMin);
                        this.r -= iMin;
                        i15 += iMin;
                        f2 = f6;
                        f3 = f7;
                        d = d2;
                        f = 1.0f;
                    } else {
                        short[] sArr = this.j;
                        int i17 = i10 > 4000 ? i10 / 4000 : i12;
                        f = 1.0f;
                        int i18 = this.g;
                        int i19 = this.f;
                        if (i11 == i12 && i17 == i12) {
                            iD = d(sArr, i15, i19, i18);
                            f2 = f6;
                            f3 = f7;
                            d = d2;
                        } else {
                            b(sArr, i15, i17);
                            f2 = f6;
                            f3 = f7;
                            short[] sArr2 = this.f17398i;
                            d = d2;
                            int iD2 = d(sArr2, 0, i19 / i17, i18 / i17);
                            if (i17 != 1) {
                                int i20 = iD2 * i17;
                                int i21 = i17 * 4;
                                int i22 = i20 - i21;
                                int i23 = i20 + i21;
                                if (i22 >= i19) {
                                    i19 = i22;
                                }
                                if (i23 <= i18) {
                                    i18 = i23;
                                }
                                if (i11 == 1) {
                                    iD = d(sArr, i15, i19, i18);
                                } else {
                                    b(sArr, i15, 1);
                                    iD = d(sArr2, 0, i19, i18);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i24 = this.f17402u;
                        int i25 = this.v;
                        if (i24 == 0 || (i2 = this.s) == 0 || i25 > i24 * 3 || i24 * 2 <= this.t * 3) {
                            i2 = iD;
                        }
                        this.t = i24;
                        this.s = iD;
                        if (d > 1.0d) {
                            short[] sArr3 = this.j;
                            if (f2 >= 2.0f) {
                                i4 = (int) (i2 / (f2 - 1.0f));
                            } else {
                                this.r = (int) (((2.0f - f2) * i2) / (f2 - 1.0f));
                                i4 = i2;
                            }
                            short[] sArrC = c(this.f17399l, this.m, i4);
                            this.f17399l = sArrC;
                            int i26 = i15 + i2;
                            int i27 = i15;
                            int i28 = i4;
                            e(i28, this.f17394b, sArrC, this.m, sArr3, i27, sArr3, i26);
                            this.m += i28;
                            i15 = i2 + i28 + i27;
                        } else {
                            int i29 = i15;
                            short[] sArr4 = this.j;
                            if (f2 < 0.5f) {
                                i3 = (int) ((i2 * f2) / (1.0f - f2));
                            } else {
                                this.r = (int) ((((2.0f * f2) - 1.0f) * i2) / (1.0f - f2));
                                i3 = i2;
                            }
                            int i30 = i2 + i3;
                            short[] sArrC2 = c(this.f17399l, this.m, i30);
                            this.f17399l = sArrC2;
                            System.arraycopy(sArr4, i29 * i11, sArrC2, this.m * i11, i2 * i11);
                            e(i3, this.f17394b, this.f17399l, this.m + i2, sArr4, i29 + i2, sArr4, i29);
                            this.m += i30;
                            i15 = i29 + i3;
                        }
                    }
                    if (i15 + i14 > i13) {
                        break;
                    }
                    i12 = 1;
                    f6 = f2;
                    f7 = f3;
                    d2 = d;
                }
                int i31 = this.k - i15;
                short[] sArr5 = this.j;
                System.arraycopy(sArr5, i15 * i11, sArr5, 0, i31 * i11);
                this.k = i31;
            }
            if (f3 != f || this.m == i9) {
            }
            int i32 = (int) (i10 / f3);
            while (true) {
                if (i32 <= 16384 && i10 <= 16384) {
                    break;
                }
                i32 /= 2;
                i10 /= 2;
            }
            int i33 = this.m - i9;
            short[] sArrC3 = c(this.f17400n, this.o, i33);
            this.f17400n = sArrC3;
            System.arraycopy(this.f17399l, i9 * i11, sArrC3, this.o * i11, i33 * i11);
            this.m = i9;
            this.o += i33;
            int i34 = 0;
            while (true) {
                i5 = this.o;
                i6 = i5 - 1;
                if (i34 >= i6) {
                    break;
                }
                while (true) {
                    i7 = this.f17401p + 1;
                    int i35 = i7 * i32;
                    i8 = this.q;
                    if (i35 <= i8 * i10) {
                        break;
                    }
                    this.f17399l = c(this.f17399l, this.m, 1);
                    for (int i36 = 0; i36 < i11; i36++) {
                        short[] sArr6 = this.f17399l;
                        int i37 = (this.m * i11) + i36;
                        short[] sArr7 = this.f17400n;
                        int i38 = (i34 * i11) + i36;
                        short s = sArr7[i38];
                        short s2 = sArr7[i38 + i11];
                        int i39 = this.q * i10;
                        int i40 = this.f17401p;
                        int i41 = i40 * i32;
                        int i42 = (i40 + 1) * i32;
                        int i43 = i42 - i39;
                        int i44 = i42 - i41;
                        sArr6[i37] = (short) ((((i44 - i43) * s2) + (s * i43)) / i44);
                    }
                    this.q++;
                    this.m++;
                }
                this.f17401p = i7;
                if (i7 == i10) {
                    this.f17401p = 0;
                    Assertions.d(i8 == i32);
                    this.q = 0;
                }
                i34++;
            }
            if (i6 == 0) {
                return;
            }
            short[] sArr8 = this.f17400n;
            System.arraycopy(sArr8, i6 * i11, sArr8, 0, (i5 - i6) * i11);
            this.o -= i6;
            return;
        }
        a(this.j, 0, this.k);
        this.k = 0;
        f3 = f7;
        f = 1.0f;
        if (f3 != f) {
        }
    }
}
