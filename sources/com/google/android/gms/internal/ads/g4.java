package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g4 implements m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o2 f14742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n2 f14743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.c f14744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r6 f14745e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f14748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14749i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final np0 f14741a = new np0(16);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f14750j = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14746f = 0;

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) {
        return rb0.l(n2Var, true);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        if (j10 != 0) {
            if (this.f14746f == 3) {
                r6 r6Var = this.f14745e;
                r6Var.getClass();
                r6Var.e(j10, j11);
                return;
            }
            return;
        }
        this.f14746f = 0;
        this.f14749i = 0;
        this.f14750j = -1L;
        if (this.f14745e != null) {
            this.f14745e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) throws ab {
        while (true) {
            int i10 = this.f14746f;
            if (i10 == 0) {
                int i11 = this.f14749i;
                np0 np0Var = this.f14741a;
                if (i11 == 0) {
                    if (!n2Var.x(np0Var.f17880a, 0, 8, true)) {
                        o2 o2Var = this.f14742b;
                        o2Var.getClass();
                        o2Var.zzv();
                        this.f14742b.o(new r2(C.TIME_UNSET, 0L));
                        this.f14746f = 4;
                        return -1;
                    }
                    this.f14749i = 8;
                    np0Var.E(0);
                    this.f14748h = np0Var.P();
                    this.f14747g = np0Var.b();
                }
                long j10 = this.f14748h;
                if (j10 == 1) {
                    n2Var.p(np0Var.f17880a, 8, 8);
                    this.f14749i += 8;
                    j10 = np0Var.j();
                    this.f14748h = j10;
                }
                if (this.f14747g == 1836086884) {
                    long jZzn = n2Var.zzn();
                    this.f14750j = jZzn;
                    long j11 = this.f14749i;
                    m4 m4Var = new m4(0L, jZzn - j11, C.TIME_UNSET, jZzn, j10 - j11);
                    o2 o2Var2 = this.f14742b;
                    o2Var2.getClass();
                    h3 h3VarE = o2Var2.e(1024, 4);
                    i12 i12Var = new i12();
                    i12Var.d("image/heic");
                    i12Var.f15509k = new s8(m4Var);
                    h3VarE.f(new g22(i12Var));
                    this.f14746f = 2;
                } else {
                    this.f14746f = 1;
                }
            } else if (i10 == 1) {
                n2Var.zzf((int) (this.f14748h - ((long) this.f14749i)));
                this.f14749i = 0;
                this.f14746f = 0;
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return -1;
                    }
                    if (this.f14744d == null || n2Var != this.f14743c) {
                        this.f14743c = n2Var;
                        this.f14744d = new androidx.recyclerview.widget.c(n2Var, this.f14750j);
                    }
                    r6 r6Var = this.f14745e;
                    r6Var.getClass();
                    int iF = r6Var.f(this.f14744d, q2Var);
                    if (iF == 1) {
                        q2Var.f18888a += this.f14750j;
                    }
                    return iF;
                }
                if (this.f14745e == null) {
                    this.f14745e = new r6(p7.R8, 8);
                }
                androidx.recyclerview.widget.c cVar = new androidx.recyclerview.widget.c(n2Var, this.f14750j);
                this.f14744d = cVar;
                if (this.f14745e.d(cVar)) {
                    r6 r6Var2 = this.f14745e;
                    long j12 = this.f14750j;
                    o2 o2Var3 = this.f14742b;
                    o2Var3.getClass();
                    r6Var2.g(new androidx.recyclerview.widget.c(j12, o2Var3, 2));
                    this.f14746f = 3;
                } else {
                    o2 o2Var4 = this.f14742b;
                    o2Var4.getClass();
                    o2Var4.zzv();
                    this.f14742b.o(new r2(C.TIME_UNSET, 0L));
                    this.f14746f = 4;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        this.f14742b = o2Var;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
        if (this.f14745e != null) {
            this.f14745e = null;
        }
    }
}
