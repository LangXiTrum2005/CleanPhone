package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r7 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3 f19442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7 f19443b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q7 f19448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g22 f19449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19450i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19445d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19446e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f19447f = uu0.f20902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final np0 f19444c = new np0();

    public r7(h3 h3Var, p7 p7Var) {
        this.f19442a = h3Var;
        this.f19443b = p7Var;
    }

    public final void a(int i10) {
        int length = this.f19447f.length;
        int i11 = this.f19446e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f19445d;
        int iMax = Math.max(i12 + i12, i10 + i12);
        byte[] bArr = this.f19447f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f19445d, bArr2, 0, i12);
        this.f19445d = 0;
        this.f19446e = i12;
        this.f19447f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.h3
    public final void c(long j10, int i10, int i11, int i12, g3 g3Var) {
        if (this.f19448g == null) {
            this.f19442a.c(j10, i10, i11, i12, g3Var);
            return;
        }
        ps1.C("DRM on subtitles is not supported", g3Var == null);
        int i13 = (this.f19446e - i12) - i11;
        try {
            this.f19448g.b(i13, i11, new b2.d0(this, j10, i10), this.f19447f);
        } catch (RuntimeException e10) {
            if (!this.f19450i) {
                throw e10;
            }
            v71.B("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e10);
        }
        int i14 = i13 + i11;
        this.f19445d = i14;
        if (i14 == this.f19446e) {
            this.f19445d = 0;
            this.f19446e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.h3
    public final int d(vx1 vx1Var, int i10, boolean z10) throws EOFException {
        if (this.f19448g == null) {
            return this.f19442a.d(vx1Var, i10, z10);
        }
        a(i10);
        int iT = vx1Var.t(this.f19447f, this.f19446e, i10);
        if (iT != -1) {
            this.f19446e += iT;
            return iT;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.h3
    public final void f(g22 g22Var) {
        String str = g22Var.f14678o;
        str.getClass();
        ps1.v(na.e(str) == 3);
        boolean zEquals = g22Var.equals(this.f19449h);
        p7 p7Var = this.f19443b;
        if (!zEquals) {
            this.f19449h = g22Var;
            this.f19448g = p7Var.g(g22Var) ? p7Var.i(g22Var) : null;
        }
        q7 q7Var = this.f19448g;
        h3 h3Var = this.f19442a;
        if (q7Var == null) {
            h3Var.f(g22Var);
            return;
        }
        i12 i12Var = new i12(g22Var);
        i12Var.e("application/x-media3-cues");
        i12Var.f15508j = str;
        i12Var.f15516s = Long.MAX_VALUE;
        i12Var.M = p7Var.h(g22Var);
        h3Var.f(new g22(i12Var));
    }

    @Override // com.google.android.gms.internal.ads.h3
    public final void g(np0 np0Var, int i10, int i11) {
        if (this.f19448g == null) {
            this.f19442a.g(np0Var, i10, i11);
            return;
        }
        a(i10);
        np0Var.H(this.f19447f, this.f19446e, i10);
        this.f19446e += i10;
    }
}
