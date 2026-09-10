package com.smartdigimkt.y3;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
final class s {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f40158w = 65;
    private static final int x = 400;
    private static final int y = 4000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f40159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f40161c;
    private final float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f40162e;
    private final int f;
    private final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f40163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f40164i;
    private short[] j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f40165l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f40166n;
    private int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f40167p;
    private int q;
    private int r;
    private int s;
    private int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f40168u;
    private int v;

    public s(int i2, int i3, float f, float f2, int i4) {
        this.f40159a = i2;
        this.f40160b = i3;
        this.f40161c = f;
        this.d = f2;
        this.f40162e = i2 / i4;
        this.f = i2 / 400;
        int i5 = i2 / 65;
        this.g = i5;
        int i6 = i5 * 2;
        this.f40163h = i6;
        this.f40164i = new short[i6];
        int i7 = i6 * i3;
        this.j = new short[i7];
        this.f40165l = new short[i7];
        this.f40166n = new short[i7];
    }

    private short[] c(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.f40160b;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    public void a(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f40160b, this.m);
        shortBuffer.put(this.f40165l, 0, this.f40160b * iMin);
        int i2 = this.m - iMin;
        this.m = i2;
        short[] sArr = this.f40165l;
        int i3 = this.f40160b;
        System.arraycopy(sArr, iMin * i3, sArr, 0, i2 * i3);
    }

    public void b(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i2 = this.f40160b;
        int i3 = iRemaining / i2;
        short[] sArrC = c(this.j, this.k, i3);
        this.j = sArrC;
        shortBuffer.get(sArrC, this.k * this.f40160b, ((i2 * i3) * 2) / 2);
        this.k += i3;
        c();
    }

    public void d() {
        int i2;
        int i3 = this.k;
        float f = this.f40161c;
        float f2 = this.d;
        int i4 = this.m + ((int) ((((i3 / (f / f2)) + this.o) / (this.f40162e * f2)) + 0.5f));
        this.j = c(this.j, i3, (this.f40163h * 2) + i3);
        int i5 = 0;
        while (true) {
            i2 = this.f40163h * 2;
            int i6 = this.f40160b;
            if (i5 >= i2 * i6) {
                break;
            }
            this.j[(i6 * i3) + i5] = 0;
            i5++;
        }
        this.k += i2;
        c();
        if (this.m > i4) {
            this.m = i4;
        }
        this.k = 0;
        this.r = 0;
        this.o = 0;
    }

    private void c(int i2) {
        if (i2 == 0) {
            return;
        }
        short[] sArr = this.f40166n;
        int i3 = this.f40160b;
        System.arraycopy(sArr, i2 * i3, sArr, 0, (this.o - i2) * i3);
        this.o -= i2;
    }

    public void a() {
        this.k = 0;
        this.m = 0;
        this.o = 0;
        this.f40167p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.f40168u = 0;
        this.v = 0;
    }

    private void c() {
        int i2 = this.m;
        float f = this.f40161c;
        float f2 = this.d;
        float f3 = f / f2;
        float f4 = this.f40162e * f2;
        double d = f3;
        if (d <= 1.00001d && d >= 0.99999d) {
            a(this.j, 0, this.k);
            this.k = 0;
        } else {
            a(f3);
        }
        if (f4 != 1.0f) {
            a(f4, i2);
        }
    }

    public int b() {
        return this.m;
    }

    private void b(short[] sArr, int i2, int i3) {
        int i4 = this.f40163h / i3;
        int i5 = this.f40160b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.f40164i[i8] = (short) (i9 / i6);
        }
    }

    private void b(int i2) {
        int i3 = this.m - i2;
        short[] sArrC = c(this.f40166n, this.o, i3);
        this.f40166n = sArrC;
        short[] sArr = this.f40165l;
        int i4 = this.f40160b;
        System.arraycopy(sArr, i2 * i4, sArrC, this.o * i4, i4 * i3);
        this.m = i2;
        this.o += i3;
    }

    private void a(short[] sArr, int i2, int i3) {
        short[] sArrC = c(this.f40165l, this.m, i3);
        this.f40165l = sArrC;
        int i4 = this.f40160b;
        System.arraycopy(sArr, i2 * i4, sArrC, this.m * i4, i4 * i3);
        this.m += i3;
    }

    private void d(int i2) {
        int i3 = this.k - i2;
        short[] sArr = this.j;
        int i4 = this.f40160b;
        System.arraycopy(sArr, i2 * i4, sArr, 0, i4 * i3);
        this.k = i3;
    }

    private short b(short[] sArr, int i2, int i3, int i4) {
        short s = sArr[i2];
        short s2 = sArr[i2 + this.f40160b];
        int i5 = this.q * i3;
        int i6 = this.f40167p;
        int i7 = i6 * i4;
        int i8 = (i6 + 1) * i4;
        int i9 = i8 - i5;
        int i10 = i8 - i7;
        return (short) ((((i10 - i9) * s2) + (s * i9)) / i10);
    }

    private int a(int i2) {
        int iMin = Math.min(this.f40163h, this.r);
        a(this.j, i2, iMin);
        this.r -= iMin;
        return iMin;
    }

    private int a(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f40160b;
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
        this.f40168u = i7 / i8;
        this.v = i9 / i6;
        return i8;
    }

    private int b(short[] sArr, int i2, float f, int i3) {
        int i4;
        if (f >= 2.0f) {
            i4 = (int) (i3 / (f - 1.0f));
        } else {
            this.r = (int) (((2.0f - f) * i3) / (f - 1.0f));
            i4 = i3;
        }
        short[] sArrC = c(this.f40165l, this.m, i4);
        this.f40165l = sArrC;
        a(i4, this.f40160b, sArrC, this.m, sArr, i2, sArr, i2 + i3);
        this.m += i4;
        return i4;
    }

    private boolean a(int i2, int i3) {
        return i2 != 0 && this.s != 0 && i3 <= i2 * 3 && i2 * 2 > this.t * 3;
    }

    private int a(short[] sArr, int i2) {
        int iA;
        int i3 = this.f40159a;
        int i4 = i3 > 4000 ? i3 / 4000 : 1;
        if (this.f40160b == 1 && i4 == 1) {
            iA = a(sArr, i2, this.f, this.g);
        } else {
            b(sArr, i2, i4);
            int iA2 = a(this.f40164i, 0, this.f / i4, this.g / i4);
            if (i4 != 1) {
                int i5 = iA2 * i4;
                int i6 = i4 * 4;
                int i7 = i5 - i6;
                int i8 = i5 + i6;
                int i9 = this.f;
                if (i7 < i9) {
                    i7 = i9;
                }
                int i10 = this.g;
                if (i8 > i10) {
                    i8 = i10;
                }
                if (this.f40160b == 1) {
                    iA = a(sArr, i2, i7, i8);
                } else {
                    b(sArr, i2, 1);
                    iA = a(this.f40164i, 0, i7, i8);
                }
            } else {
                iA = iA2;
            }
        }
        int i11 = a(this.f40168u, this.v) ? this.s : iA;
        this.t = this.f40168u;
        this.s = iA;
        return i11;
    }

    private void a(float f, int i2) {
        int i3;
        int i4;
        if (this.m == i2) {
            return;
        }
        int i5 = this.f40159a;
        int i6 = (int) (i5 / f);
        while (true) {
            if (i6 <= 16384 && i5 <= 16384) {
                break;
            }
            i6 /= 2;
            i5 /= 2;
        }
        b(i2);
        int i7 = 0;
        while (true) {
            int i8 = this.o - 1;
            if (i7 < i8) {
                while (true) {
                    i3 = this.f40167p + 1;
                    int i9 = i3 * i6;
                    i4 = this.q;
                    if (i9 <= i4 * i5) {
                        break;
                    }
                    this.f40165l = c(this.f40165l, this.m, 1);
                    int i10 = 0;
                    while (true) {
                        int i11 = this.f40160b;
                        if (i10 < i11) {
                            this.f40165l[(this.m * i11) + i10] = b(this.f40166n, (i11 * i7) + i10, i5, i6);
                            i10++;
                        }
                    }
                    this.q++;
                    this.m++;
                }
                this.f40167p = i3;
                if (i3 == i5) {
                    this.f40167p = 0;
                    com.smartdigimkt.p4.a.b(i4 == i6);
                    this.q = 0;
                }
                i7++;
            } else {
                c(i8);
                return;
            }
        }
    }

    private int a(short[] sArr, int i2, float f, int i3) {
        int i4;
        if (f < 0.5f) {
            i4 = (int) ((i3 * f) / (1.0f - f));
        } else {
            this.r = (int) ((((2.0f * f) - 1.0f) * i3) / (1.0f - f));
            i4 = i3;
        }
        int i5 = i3 + i4;
        short[] sArrC = c(this.f40165l, this.m, i5);
        this.f40165l = sArrC;
        int i6 = this.f40160b;
        System.arraycopy(sArr, i2 * i6, sArrC, this.m * i6, i6 * i3);
        a(i4, this.f40160b, this.f40165l, this.m + i3, sArr, i2 + i3, sArr, i2);
        this.m += i5;
        return i4;
    }

    private void a(float f) {
        int iA;
        int i2 = this.k;
        if (i2 < this.f40163h) {
            return;
        }
        int iB = 0;
        do {
            if (this.r > 0) {
                iA = a(iB);
            } else {
                int iA2 = a(this.j, iB);
                if (f > 1.0d) {
                    iB = iA2 + b(this.j, iB, f, iA2) + iB;
                } else {
                    iA = a(this.j, iB, f, iA2);
                }
            }
            iB += iA;
        } while (this.f40163h + iB <= i2);
        d(iB);
    }

    private static void a(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
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
}
