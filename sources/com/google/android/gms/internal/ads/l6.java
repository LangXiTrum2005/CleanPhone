package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3 f16744a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z6 f16747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h6 f16748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g22 f16753j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16755m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y6 f16745b = new y6(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final np0 f16746c = new np0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final np0 f16754k = new np0(1);
    public final np0 l = new np0();

    public l6(h3 h3Var, z6 z6Var, h6 h6Var, g22 g22Var) {
        this.f16744a = h3Var;
        this.f16747d = z6Var;
        this.f16748e = h6Var;
        this.f16753j = g22Var;
        this.f16747d = z6Var;
        this.f16748e = h6Var;
        h3Var.f(g22Var);
        a();
    }

    public final void a() {
        y6 y6Var = this.f16745b;
        y6Var.f22162c = 0;
        y6Var.f22171m = 0L;
        y6Var.f22172n = false;
        y6Var.f22169j = false;
        y6Var.l = false;
        y6Var.f22174p = null;
        this.f16749f = 0;
        this.f16751h = 0;
        this.f16750g = 0;
        this.f16752i = 0;
        this.f16755m = false;
    }

    public final int b() {
        int i10;
        if (this.f16755m) {
            i10 = this.f16745b.f22168i[this.f16749f] ? 1 : 0;
        } else {
            i10 = this.f16747d.f22516g[this.f16749f];
        }
        return e() != null ? 1073741824 | i10 : i10;
    }

    public final boolean c() {
        this.f16749f++;
        if (!this.f16755m) {
            return false;
        }
        int i10 = this.f16750g + 1;
        this.f16750g = i10;
        int[] iArr = this.f16745b.f22165f;
        int i11 = this.f16751h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.f16751h = i11 + 1;
        this.f16750g = 0;
        return false;
    }

    public final int d(int i10, int i11) {
        np0 np0Var;
        x6 x6VarE = e();
        if (x6VarE == null) {
            return 0;
        }
        int length = x6VarE.f21752d;
        y6 y6Var = this.f16745b;
        if (length != 0) {
            np0Var = (np0) y6Var.f22175q;
        } else {
            byte[] bArr = x6VarE.f21753e;
            String str = uu0.f20901a;
            length = bArr.length;
            np0 np0Var2 = this.l;
            np0Var2.z(length, bArr);
            np0Var = np0Var2;
        }
        boolean z10 = y6Var.f22169j && y6Var.f22170k[this.f16749f];
        boolean z11 = z10 || i11 != 0;
        int i12 = true != z11 ? 0 : 128;
        np0 np0Var3 = this.f16754k;
        np0Var3.f17880a[0] = (byte) (i12 | length);
        np0Var3.E(0);
        h3 h3Var = this.f16744a;
        h3Var.g(np0Var3, 1, 1);
        h3Var.g(np0Var, length, 1);
        if (!z11) {
            return length + 1;
        }
        np0 np0Var4 = this.f16746c;
        if (!z10) {
            np0Var4.y(8);
            byte[] bArr2 = np0Var4.f17880a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i11;
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            h3Var.g(np0Var4, 8, 1);
            return length + 9;
        }
        int i13 = length + 1;
        np0 np0Var5 = (np0) y6Var.f22175q;
        int iL = np0Var5.L();
        np0Var5.G(-2);
        int i14 = (iL * 6) + 2;
        if (i11 != 0) {
            np0Var4.y(i14);
            byte[] bArr3 = np0Var4.f17880a;
            np0Var5.H(bArr3, 0, i14);
            int i15 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i15 >> 8) & 255);
            bArr3[3] = (byte) (i15 & 255);
        } else {
            np0Var4 = np0Var5;
        }
        h3Var.g(np0Var4, i14, 1);
        return i13 + i14;
    }

    public final x6 e() {
        if (this.f16755m) {
            y6 y6Var = this.f16745b;
            h6 h6Var = (h6) y6Var.f22173o;
            String str = uu0.f20901a;
            int i10 = h6Var.f15179a;
            x6 x6Var = (x6) y6Var.f22174p;
            if (x6Var == null) {
                x6[] x6VarArr = this.f16747d.f22510a.f21428n;
                x6Var = x6VarArr == null ? null : x6VarArr[i10];
            }
            if (x6Var != null && x6Var.f21749a) {
                return x6Var;
            }
        }
        return null;
    }
}
