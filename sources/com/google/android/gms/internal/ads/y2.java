package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22088g;

    public boolean a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.f22082a = i11;
        this.f22083b = n2.b.f46440s[3 - i12];
        int i15 = n2.b.f46441t[i14];
        this.f22085d = i15;
        if (i11 == 2) {
            this.f22085d = i15 / 2;
        } else if (i11 == 0) {
            this.f22085d = i15 / 4;
        }
        int i16 = (i10 >>> 9) & 1;
        int i17 = 1152;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalArgumentException();
                }
                i17 = 384;
            }
        } else if (i11 != 3) {
            i17 = 576;
        }
        this.f22088g = i17;
        if (i12 == 3) {
            int i18 = i11 == 3 ? n2.b.f46442u[i13 - 1] : n2.b.f46443v[i13 - 1];
            this.f22087f = i18;
            this.f22084c = (((i18 * 12) / this.f22085d) + i16) * 4;
        } else {
            if (i11 == 3) {
                int i19 = i12 == 2 ? n2.b.f46444w[i13 - 1] : n2.b.f46445x[i13 - 1];
                this.f22087f = i19;
                this.f22084c = ((i19 * 144) / this.f22085d) + i16;
            } else {
                int i20 = n2.b.f46446y[i13 - 1];
                this.f22087f = i20;
                this.f22084c = (((i12 == 1 ? 72 : 144) * i20) / this.f22085d) + i16;
            }
        }
        this.f22086e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public boolean b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i15 = i13 - 1;
        this.f22082a = i11;
        this.f22083b = pi1.f18667b[3 - i12];
        int i16 = pi1.f18668c[i14];
        this.f22085d = i16;
        if (i11 == 2) {
            i16 /= 2;
            this.f22085d = i16;
        } else if (i11 == 0) {
            i16 /= 4;
            this.f22085d = i16;
        }
        int i17 = (i10 >>> 9) & 1;
        int i18 = 1152;
        if (i12 != 1) {
            if (i12 != 2) {
                i18 = 384;
            }
        } else if (i11 != 3) {
            i18 = 576;
        }
        this.f22088g = i18;
        if (i12 == 3) {
            int i19 = i11 == 3 ? pi1.f18669d[i15] : pi1.f18670e[i15];
            this.f22087f = i19;
            this.f22084c = (((i19 * 12) / i16) + i17) * 4;
        } else {
            if (i11 == 3) {
                int i20 = i12 == 2 ? pi1.f18671f[i15] : pi1.f18672g[i15];
                this.f22087f = i20;
                this.f22084c = defpackage.e.D(i20, 144, i16, i17);
            } else {
                int i21 = pi1.f18673h[i15];
                this.f22087f = i21;
                this.f22084c = defpackage.e.D(i12 == 1 ? 72 : 144, i21, i16, i17);
            }
        }
        this.f22086e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
