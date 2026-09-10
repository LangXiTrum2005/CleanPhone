package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3412f80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4355a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    public C3412f80(int i, int i2, float f, float f2, int i3) {
        this.f4355a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 * 2;
        this.h = i5;
        this.i = new short[i5];
        this.j = new short[i5 * i2];
        this.l = new short[i5 * i2];
        this.n = new short[i5 * i2];
    }

    public static void e(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final void a(short[] sArr, int i, int i2) {
        short[] sArrC = c(this.l, this.m, i2);
        this.l = sArrC;
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, sArrC, this.m * i3, i3 * i2);
        this.m += i2;
    }

    public final void b(short[] sArr, int i, int i2) {
        int i3 = this.h / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.i[i7] = (short) (i8 / i5);
        }
    }

    public final short[] c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int d(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.u = i6 / i7;
        this.v = i8 / i5;
        return i7;
    }

    public final void f() {
        int i;
        int i2;
        float f;
        int iD;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = this.m;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = f2 / f3;
        float f5 = this.e * f3;
        double d = f4;
        int i12 = this.f4355a;
        int i13 = this.b;
        int i14 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i15 = this.k;
            int i16 = this.h;
            if (i15 >= i16) {
                int i17 = 0;
                while (true) {
                    int i18 = this.r;
                    if (i18 > 0) {
                        int iMin = Math.min(i16, i18);
                        a(this.j, i17, iMin);
                        this.r -= iMin;
                        i17 += iMin;
                        i2 = i11;
                        f = f5;
                        i = i12;
                    } else {
                        short[] sArr = this.j;
                        int i19 = i12 > 4000 ? i12 / 4000 : 1;
                        int i20 = this.g;
                        int i21 = this.f;
                        if (i13 == i14 && i19 == i14) {
                            iD = d(sArr, i17, i21, i20);
                            i2 = i11;
                            f = f5;
                            i = i12;
                        } else {
                            b(sArr, i17, i19);
                            i = i12;
                            i2 = i11;
                            short[] sArr2 = this.i;
                            f = f5;
                            int iD2 = d(sArr2, 0, i21 / i19, i20 / i19);
                            if (i19 != 1) {
                                int i22 = iD2 * i19;
                                int i23 = i19 * 4;
                                int i24 = i22 - i23;
                                int i25 = i22 + i23;
                                if (i24 >= i21) {
                                    i21 = i24;
                                }
                                if (i25 <= i20) {
                                    i20 = i25;
                                }
                                if (i13 == 1) {
                                    iD = d(sArr, i17, i21, i20);
                                } else {
                                    b(sArr, i17, 1);
                                    iD = d(sArr2, 0, i21, i20);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i26 = this.u;
                        int i27 = this.v;
                        if (i26 == 0 || (i3 = this.s) == 0 || i27 > i26 * 3 || i26 * 2 <= this.t * 3) {
                            i3 = iD;
                        }
                        this.t = i26;
                        this.s = iD;
                        if (d > 1.0d) {
                            short[] sArr3 = this.j;
                            if (f4 >= 2.0f) {
                                i5 = (int) (i3 / (f4 - 1.0f));
                            } else {
                                this.r = (int) (((2.0f - f4) * i3) / (f4 - 1.0f));
                                i5 = i3;
                            }
                            short[] sArrC = c(this.l, this.m, i5);
                            this.l = sArrC;
                            int i28 = i17;
                            e(i5, this.b, sArrC, this.m, sArr3, i28, sArr3, i17 + i3);
                            this.m += i5;
                            i17 = i3 + i5 + i28;
                        } else {
                            int i29 = i17;
                            short[] sArr4 = this.j;
                            if (f4 < 0.5f) {
                                i4 = (int) ((i3 * f4) / (1.0f - f4));
                            } else {
                                this.r = (int) ((((2.0f * f4) - 1.0f) * i3) / (1.0f - f4));
                                i4 = i3;
                            }
                            int i30 = i3 + i4;
                            short[] sArrC2 = c(this.l, this.m, i30);
                            this.l = sArrC2;
                            System.arraycopy(sArr4, i29 * i13, sArrC2, this.m * i13, i3 * i13);
                            e(i4, this.b, this.l, this.m + i3, sArr4, i29 + i3, sArr4, i29);
                            this.m += i30;
                            i17 = i29 + i4;
                        }
                    }
                    if (i17 + i16 > i15) {
                        break;
                    }
                    i12 = i;
                    i11 = i2;
                    f5 = f;
                    i14 = 1;
                }
                int i31 = this.k - i17;
                short[] sArr5 = this.j;
                System.arraycopy(sArr5, i17 * i13, sArr5, 0, i31 * i13);
                this.k = i31;
            }
            if (f != 1.0f || this.m == (i6 = i2)) {
            }
            int i32 = i;
            int i33 = (int) (i32 / f);
            int i34 = i32;
            while (true) {
                if (i33 <= 16384 && i34 <= 16384) {
                    break;
                }
                i33 /= 2;
                i34 /= 2;
            }
            int i35 = this.m - i6;
            short[] sArrC3 = c(this.n, this.o, i35);
            this.n = sArrC3;
            System.arraycopy(this.l, i6 * i13, sArrC3, this.o * i13, i35 * i13);
            this.m = i6;
            this.o += i35;
            int i36 = 0;
            while (true) {
                i7 = this.o;
                i8 = i7 - 1;
                if (i36 >= i8) {
                    break;
                }
                while (true) {
                    i9 = this.p + 1;
                    int i37 = i9 * i33;
                    i10 = this.q;
                    if (i37 <= i10 * i34) {
                        break;
                    }
                    this.l = c(this.l, this.m, 1);
                    for (int i38 = 0; i38 < i13; i38++) {
                        short[] sArr6 = this.l;
                        int i39 = (this.m * i13) + i38;
                        short[] sArr7 = this.n;
                        int i40 = (i36 * i13) + i38;
                        short s = sArr7[i40];
                        short s2 = sArr7[i40 + i13];
                        int i41 = this.q * i34;
                        int i42 = this.p;
                        int i43 = i42 * i33;
                        int i44 = (i42 + 1) * i33;
                        int i45 = i44 - i41;
                        int i46 = i44 - i43;
                        sArr6[i39] = (short) ((((i46 - i45) * s2) + (s * i45)) / i46);
                    }
                    this.q++;
                    this.m++;
                }
                this.p = i9;
                if (i9 == i34) {
                    this.p = 0;
                    FW.s(i10 == i33);
                    this.q = 0;
                }
                i36++;
            }
            if (i8 == 0) {
                return;
            }
            short[] sArr8 = this.n;
            System.arraycopy(sArr8, i8 * i13, sArr8, 0, (i7 - i8) * i13);
            this.o -= i8;
            return;
        }
        a(this.j, 0, this.k);
        this.k = 0;
        i2 = i11;
        f = f5;
        i = i12;
        if (f != 1.0f) {
        }
    }
}
