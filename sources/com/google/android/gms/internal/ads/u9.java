package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u9 implements j9, u3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f20705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f20707k;
    public final Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f20708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f20709n;

    public u9(int i10, int i11, String str, String str2) {
        switch (i11) {
            case 1:
                this.f20701e = 0;
                l1.q qVar = new l1.q(4);
                this.l = qVar;
                qVar.f44813a[0] = -1;
                this.f20708m = new y2();
                this.f20707k = C.TIME_UNSET;
                this.f20697a = str;
                this.f20698b = i10;
                this.f20699c = str2;
                break;
            default:
                this.f20701e = 0;
                np0 np0Var = new np0(4);
                this.l = np0Var;
                np0Var.f17880a[0] = -1;
                this.f20708m = new y2();
                this.f20707k = C.TIME_UNSET;
                this.f20697a = str;
                this.f20698b = i10;
                this.f20699c = str2;
                break;
        }
    }

    @Override // u3.f
    public void b(l1.q qVar) {
        l1.q qVar2 = (l1.q) this.l;
        ((n2.a0) this.f20709n).getClass();
        while (qVar.a() > 0) {
            int i10 = this.f20701e;
            if (i10 == 0) {
                byte[] bArr = qVar.f44813a;
                int i11 = qVar.f44814b;
                int i12 = qVar.f44815c;
                while (true) {
                    if (i11 >= i12) {
                        qVar.M(i12);
                        break;
                    }
                    byte b10 = bArr[i11];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.f20704h && (b10 & 224) == 224;
                    this.f20704h = z10;
                    if (z11) {
                        qVar.M(i11 + 1);
                        this.f20704h = false;
                        qVar2.f44813a[1] = bArr[i11];
                        this.f20702f = 2;
                        this.f20701e = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i10 == 1) {
                y2 y2Var = (y2) this.f20708m;
                int iMin = Math.min(qVar.a(), 4 - this.f20702f);
                qVar.k(qVar2.f44813a, this.f20702f, iMin);
                int i13 = this.f20702f + iMin;
                this.f20702f = i13;
                if (i13 >= 4) {
                    qVar2.M(0);
                    if (y2Var.a(qVar2.m())) {
                        this.f20706j = y2Var.f22084c;
                        if (!this.f20703g) {
                            this.f20705i = (((long) y2Var.f22088g) * 1000000) / ((long) y2Var.f22085d);
                            i1.o oVar = new i1.o();
                            oVar.f42589a = this.f20700d;
                            oVar.l = i1.d0.n(this.f20699c);
                            oVar.f42600m = i1.d0.n(y2Var.f22083b);
                            oVar.f42601n = 4096;
                            oVar.E = y2Var.f22086e;
                            oVar.F = y2Var.f22085d;
                            oVar.f42592d = this.f20697a;
                            oVar.f42594f = this.f20698b;
                            ((n2.a0) this.f20709n).b(new i1.p(oVar));
                            this.f20703g = true;
                        }
                        qVar2.M(0);
                        ((n2.a0) this.f20709n).g(4, qVar2);
                        this.f20701e = 2;
                    } else {
                        this.f20702f = 0;
                        this.f20701e = 1;
                    }
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(qVar.a(), this.f20706j - this.f20702f);
                ((n2.a0) this.f20709n).g(iMin2, qVar);
                int i14 = this.f20702f + iMin2;
                this.f20702f = i14;
                if (i14 >= this.f20706j) {
                    go.k.t(this.f20707k != C.TIME_UNSET);
                    ((n2.a0) this.f20709n).a(this.f20707k, 1, this.f20706j, 0, null);
                    this.f20707k += this.f20705i;
                    this.f20702f = 0;
                    this.f20701e = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void c(int i10, long j10) {
        this.f20707k = j10;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void e(o2 o2Var, ga gaVar) {
        gaVar.c();
        gaVar.d();
        this.f20700d = gaVar.f14806e;
        gaVar.d();
        this.f20709n = o2Var.e(gaVar.f14805d, 1);
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void f(np0 np0Var) {
        np0 np0Var2 = (np0) this.l;
        ((h3) this.f20709n).getClass();
        while (np0Var.B() > 0) {
            int i10 = this.f20701e;
            if (i10 == 0) {
                byte[] bArr = np0Var.f17880a;
                int i11 = np0Var.f17881b;
                int i12 = np0Var.f17882c;
                while (true) {
                    if (i11 >= i12) {
                        np0Var.E(i12);
                        break;
                    }
                    int i13 = i11 + 1;
                    byte b10 = bArr[i11];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.f20704h && (b10 & 224) == 224;
                    this.f20704h = z10;
                    if (z11) {
                        np0Var.E(i13);
                        this.f20704h = false;
                        np0Var2.f17880a[1] = bArr[i11];
                        this.f20702f = 2;
                        this.f20701e = 1;
                        break;
                    }
                    i11 = i13;
                }
            } else if (i10 != 1) {
                int iMin = Math.min(np0Var.B(), this.f20706j - this.f20702f);
                ((h3) this.f20709n).b(iMin, np0Var);
                int i14 = this.f20702f + iMin;
                this.f20702f = i14;
                if (i14 >= this.f20706j) {
                    ps1.c0(this.f20707k != C.TIME_UNSET);
                    ((h3) this.f20709n).c(this.f20707k, 1, this.f20706j, 0, null);
                    this.f20707k += this.f20705i;
                    this.f20702f = 0;
                    this.f20701e = 0;
                }
            } else {
                int iMin2 = Math.min(np0Var.B(), 4 - this.f20702f);
                np0Var.H(np0Var2.f17880a, this.f20702f, iMin2);
                int i15 = this.f20702f + iMin2;
                this.f20702f = i15;
                if (i15 >= 4) {
                    np0Var2.E(0);
                    y2 y2Var = (y2) this.f20708m;
                    if (y2Var.b(np0Var2.b())) {
                        this.f20706j = y2Var.f22084c;
                        if (!this.f20703g) {
                            this.f20705i = (((long) y2Var.f22088g) * 1000000) / ((long) y2Var.f22085d);
                            i12 i12Var = new i12();
                            i12Var.f15499a = this.f20700d;
                            i12Var.d(this.f20699c);
                            i12Var.e(y2Var.f22083b);
                            i12Var.f15512o = 4096;
                            i12Var.F = y2Var.f22086e;
                            i12Var.H = y2Var.f22085d;
                            i12Var.f15502d = this.f20697a;
                            i12Var.f15504f = this.f20698b;
                            ((h3) this.f20709n).f(new g22(i12Var));
                            this.f20703g = true;
                        }
                        np0Var2.E(0);
                        ((h3) this.f20709n).b(4, np0Var2);
                        this.f20701e = 2;
                    } else {
                        this.f20702f = 0;
                        this.f20701e = 1;
                    }
                }
            }
        }
    }

    @Override // u3.f
    public void g(n2.m mVar, ga gaVar) {
        gaVar.a();
        gaVar.b();
        this.f20700d = gaVar.f14806e;
        gaVar.b();
        this.f20709n = mVar.track(gaVar.f14805d, 1);
    }

    @Override // u3.f
    public void h(int i10, long j10) {
        this.f20707k = j10;
    }

    @Override // u3.f
    public void seek() {
        this.f20701e = 0;
        this.f20702f = 0;
        this.f20704h = false;
        this.f20707k = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void zza() {
        this.f20701e = 0;
        this.f20702f = 0;
        this.f20704h = false;
        this.f20707k = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void a(boolean z10) {
    }

    @Override // u3.f
    public void d(boolean z10) {
    }
}
