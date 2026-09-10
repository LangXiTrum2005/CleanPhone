package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t9 implements j9, u3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20252k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f20254n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20255o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f20256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f20258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f20259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f20260t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f20261u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f20262v;

    public t9(String str, int i10, int i11) {
        switch (i11) {
            case 1:
                this.f20242a = str;
                this.f20243b = i10;
                l1.q qVar = new l1.q(1024);
                this.f20259s = qVar;
                byte[] bArr = qVar.f44813a;
                this.f20260t = new xd1(bArr, bArr.length);
                this.f20249h = C.TIME_UNSET;
                break;
            default:
                this.f20242a = str;
                this.f20243b = i10;
                np0 np0Var = new np0(1024);
                this.f20259s = np0Var;
                byte[] bArr2 = np0Var.f17880a;
                this.f20260t = new gp0(bArr2, bArr2.length);
                this.f20249h = C.TIME_UNSET;
                break;
        }
    }

    @Override // u3.f
    public void b(l1.q qVar) throws i1.e0 {
        int i10;
        boolean zH;
        l1.q qVar2 = (l1.q) this.f20259s;
        xd1 xd1Var = (xd1) this.f20260t;
        ((n2.a0) this.f20261u).getClass();
        while (qVar.a() > 0) {
            int i11 = this.f20245d;
            if (i11 != 0) {
                if (i11 == 1) {
                    int iZ = qVar.z();
                    if ((iZ & 224) == 224) {
                        this.f20248g = iZ;
                        this.f20245d = 2;
                    } else if (iZ != 86) {
                        this.f20245d = 0;
                    }
                } else if (i11 == 2) {
                    int iZ2 = ((this.f20248g & (-225)) << 8) | qVar.z();
                    this.f20247f = iZ2;
                    if (iZ2 > qVar2.f44813a.length) {
                        qVar2.J(iZ2);
                        byte[] bArr = qVar2.f44813a;
                        xd1Var.getClass();
                        xd1Var.p(bArr, bArr.length);
                    }
                    this.f20246e = 0;
                    this.f20245d = 3;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(qVar.a(), this.f20247f - this.f20246e);
                    qVar.k(xd1Var.f21843b, this.f20246e, iMin);
                    int i12 = this.f20246e + iMin;
                    this.f20246e = i12;
                    if (i12 == this.f20247f) {
                        xd1Var.q(0);
                        if (xd1Var.h()) {
                            if (this.f20250i) {
                            }
                            this.f20245d = 0;
                        } else {
                            this.f20250i = true;
                            int i13 = xd1Var.i(1);
                            int i14 = i13 == 1 ? xd1Var.i(1) : 0;
                            this.f20251j = i14;
                            if (i14 != 0) {
                                throw i1.e0.a(null, null);
                            }
                            if (i13 == 1) {
                                xd1Var.i((xd1Var.i(2) + 1) * 8);
                            }
                            if (!xd1Var.h()) {
                                throw i1.e0.a(null, null);
                            }
                            this.f20252k = xd1Var.i(6);
                            int i15 = xd1Var.i(4);
                            int i16 = xd1Var.i(3);
                            if (i15 != 0 || i16 != 0) {
                                throw i1.e0.a(null, null);
                            }
                            if (i13 == 0) {
                                int iG = xd1Var.g();
                                int iB = xd1Var.b();
                                n2.a aVarS = n2.b.s(xd1Var, true);
                                this.f20258r = aVarS.f46420a;
                                this.f20255o = aVarS.f46421b;
                                this.f20257q = aVarS.f46422c;
                                int iB2 = iB - xd1Var.b();
                                xd1Var.q(iG);
                                byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                xd1Var.j(iB2, bArr2);
                                i1.o oVar = new i1.o();
                                oVar.f42589a = this.f20244c;
                                oVar.l = i1.d0.n("video/mp2t");
                                oVar.f42600m = i1.d0.n(MimeTypes.AUDIO_AAC);
                                oVar.f42598j = this.f20258r;
                                oVar.E = this.f20257q;
                                oVar.F = this.f20255o;
                                oVar.f42603p = Collections.singletonList(bArr2);
                                oVar.f42592d = this.f20242a;
                                oVar.f42594f = this.f20243b;
                                i1.p pVar = new i1.p(oVar);
                                if (!pVar.equals((i1.p) this.f20262v)) {
                                    this.f20262v = pVar;
                                    this.f20256p = 1024000000 / ((long) pVar.G);
                                    ((n2.a0) this.f20261u).b(pVar);
                                }
                            } else {
                                int i17 = xd1Var.i((xd1Var.i(2) + 1) * 8);
                                int iB3 = xd1Var.b();
                                n2.a aVarS2 = n2.b.s(xd1Var, true);
                                this.f20258r = aVarS2.f46420a;
                                this.f20255o = aVarS2.f46421b;
                                this.f20257q = aVarS2.f46422c;
                                xd1Var.t(i17 - (iB3 - xd1Var.b()));
                            }
                            int i18 = xd1Var.i(3);
                            this.l = i18;
                            if (i18 == 0) {
                                xd1Var.t(8);
                            } else if (i18 == 1) {
                                xd1Var.t(9);
                            } else if (i18 == 3 || i18 == 4 || i18 == 5) {
                                xd1Var.t(6);
                            } else {
                                if (i18 != 6 && i18 != 7) {
                                    throw new IllegalStateException();
                                }
                                xd1Var.t(1);
                            }
                            boolean zH2 = xd1Var.h();
                            this.f20253m = zH2;
                            this.f20254n = 0L;
                            if (zH2) {
                                if (i13 == 1) {
                                    this.f20254n = xd1Var.i((xd1Var.i(2) + 1) * 8);
                                } else {
                                    do {
                                        zH = xd1Var.h();
                                        this.f20254n = (this.f20254n << 8) + ((long) xd1Var.i(8));
                                    } while (zH);
                                }
                            }
                            if (xd1Var.h()) {
                                xd1Var.t(8);
                            }
                        }
                        if (this.f20251j != 0) {
                            throw i1.e0.a(null, null);
                        }
                        if (this.f20252k != 0) {
                            throw i1.e0.a(null, null);
                        }
                        if (this.l != 0) {
                            throw i1.e0.a(null, null);
                        }
                        int i19 = 0;
                        do {
                            i10 = xd1Var.i(8);
                            i19 += i10;
                        } while (i10 == 255);
                        int iG2 = xd1Var.g();
                        if ((iG2 & 7) == 0) {
                            qVar2.M(iG2 >> 3);
                        } else {
                            xd1Var.j(i19 * 8, qVar2.f44813a);
                            qVar2.M(0);
                        }
                        ((n2.a0) this.f20261u).g(i19, qVar2);
                        go.k.t(this.f20249h != C.TIME_UNSET);
                        ((n2.a0) this.f20261u).a(this.f20249h, 1, i19, 0, null);
                        this.f20249h += this.f20256p;
                        if (this.f20253m) {
                            xd1Var.t((int) this.f20254n);
                        }
                        this.f20245d = 0;
                    } else {
                        continue;
                    }
                }
            } else if (qVar.z() == 86) {
                this.f20245d = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void c(int i10, long j10) {
        this.f20249h = j10;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void e(o2 o2Var, ga gaVar) {
        gaVar.c();
        gaVar.d();
        this.f20261u = o2Var.e(gaVar.f14805d, 1);
        gaVar.d();
        this.f20244c = gaVar.f14806e;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void f(np0 np0Var) throws ab {
        int iH;
        int i10;
        int iH2;
        boolean zG;
        int i11;
        gp0 gp0Var = (gp0) this.f20260t;
        np0 np0Var2 = (np0) this.f20259s;
        ((h3) this.f20261u).getClass();
        while (np0Var.B() > 0) {
            int i12 = this.f20245d;
            if (i12 != 0) {
                if (i12 == 1) {
                    int iK = np0Var.K();
                    if ((iK & 224) == 224) {
                        this.f20248g = iK;
                        this.f20245d = 2;
                    } else if (iK != 86) {
                        this.f20245d = 0;
                    }
                } else if (i12 != 2) {
                    int iMin = Math.min(np0Var.B(), this.f20247f - this.f20246e);
                    np0Var.H(gp0Var.f14921a, this.f20246e, iMin);
                    int i13 = this.f20246e + iMin;
                    this.f20246e = i13;
                    if (i13 == this.f20247f) {
                        gp0Var.d(0);
                        if (gp0Var.g()) {
                            if (this.f20250i) {
                            }
                            this.f20245d = 0;
                        } else {
                            this.f20250i = true;
                            int iH3 = gp0Var.h(1);
                            if (iH3 == 1) {
                                iH2 = gp0Var.h(1);
                                i10 = 1;
                            } else {
                                i10 = iH3;
                                iH2 = 0;
                            }
                            this.f20251j = iH2;
                            if (iH2 != 0) {
                                throw ab.a(null, null);
                            }
                            if (i10 == 1) {
                                gp0Var.h((gp0Var.h(2) + 1) * 8);
                                i10 = 1;
                            }
                            if (!gp0Var.g()) {
                                throw ab.a(null, null);
                            }
                            this.f20252k = gp0Var.h(6);
                            int iH4 = gp0Var.h(4);
                            int iH5 = gp0Var.h(3);
                            if (iH4 != 0 || iH5 != 0) {
                                throw ab.a(null, null);
                            }
                            if (i10 == 0) {
                                int i14 = (gp0Var.f14922b * 8) + gp0Var.f14923c;
                                int iB = gp0Var.b();
                                v1 v1VarP = dv.p(gp0Var, true);
                                this.f20258r = v1VarP.f20993a;
                                this.f20255o = v1VarP.f20994b;
                                this.f20257q = v1VarP.f20995c;
                                int iB2 = iB - gp0Var.b();
                                gp0Var.d(i14);
                                byte[] bArr = new byte[(iB2 + 7) / 8];
                                gp0Var.j(iB2, bArr);
                                i12 i12Var = new i12();
                                i12Var.f15499a = this.f20244c;
                                i12Var.d("video/mp2t");
                                i12Var.e(MimeTypes.AUDIO_AAC);
                                i12Var.f15508j = this.f20258r;
                                i12Var.F = this.f20257q;
                                i12Var.H = this.f20255o;
                                i12Var.f15514q = Collections.singletonList(bArr);
                                i12Var.f15502d = this.f20242a;
                                i12Var.f15504f = this.f20243b;
                                g22 g22Var = new g22(i12Var);
                                if (!g22Var.equals((g22) this.f20262v)) {
                                    this.f20262v = g22Var;
                                    this.f20256p = 1024000000 / ((long) g22Var.I);
                                    ((h3) this.f20261u).f(g22Var);
                                }
                            } else {
                                int iH6 = gp0Var.h((gp0Var.h(2) + 1) * 8);
                                int iB3 = gp0Var.b();
                                v1 v1VarP2 = dv.p(gp0Var, true);
                                this.f20258r = v1VarP2.f20993a;
                                this.f20255o = v1VarP2.f20994b;
                                this.f20257q = v1VarP2.f20995c;
                                gp0Var.f(iH6 - (iB3 - gp0Var.b()));
                            }
                            int iH7 = gp0Var.h(3);
                            this.l = iH7;
                            if (iH7 == 0) {
                                gp0Var.f(8);
                            } else if (iH7 == 1) {
                                gp0Var.f(9);
                            } else if (iH7 == 3 || iH7 == 4 || iH7 == 5) {
                                gp0Var.f(6);
                            } else {
                                if (iH7 != 6 && iH7 != 7) {
                                    throw new IllegalStateException();
                                }
                                gp0Var.f(1);
                            }
                            boolean zG2 = gp0Var.g();
                            this.f20253m = zG2;
                            this.f20254n = 0L;
                            if (zG2) {
                                if (i10 != 1) {
                                    do {
                                        zG = gp0Var.g();
                                        this.f20254n = (this.f20254n << 8) + ((long) gp0Var.h(8));
                                    } while (zG);
                                } else {
                                    this.f20254n = gp0Var.h((gp0Var.h(2) + 1) * 8);
                                }
                            }
                            if (gp0Var.g()) {
                                gp0Var.f(8);
                            }
                        }
                        if (this.f20251j != 0) {
                            throw ab.a(null, null);
                        }
                        if (this.f20252k != 0) {
                            throw ab.a(null, null);
                        }
                        if (this.l != 0) {
                            throw ab.a(null, null);
                        }
                        int i15 = 0;
                        do {
                            iH = gp0Var.h(8);
                            i15 += iH;
                        } while (iH == 255);
                        int i16 = (gp0Var.f14922b * 8) + gp0Var.f14923c;
                        if ((i16 & 7) == 0) {
                            np0Var2.E(i16 >> 3);
                        } else {
                            gp0Var.j(i15 * 8, np0Var2.f17880a);
                            np0Var2.E(0);
                        }
                        ((h3) this.f20261u).b(i15, np0Var2);
                        ps1.c0(this.f20249h != C.TIME_UNSET);
                        ((h3) this.f20261u).c(this.f20249h, 1, i15, 0, null);
                        this.f20249h += this.f20256p;
                        if (this.f20253m) {
                            gp0Var.f((int) this.f20254n);
                        }
                        this.f20245d = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iK2 = ((this.f20248g & (-225)) << 8) | np0Var.K();
                    this.f20247f = iK2;
                    if (iK2 > np0Var2.f17880a.length) {
                        np0Var2.y(iK2);
                        byte[] bArr2 = np0Var2.f17880a;
                        int length = bArr2.length;
                        gp0Var.f14921a = bArr2;
                        i11 = 0;
                        gp0Var.f14922b = 0;
                        gp0Var.f14923c = 0;
                        gp0Var.f14924d = length;
                    } else {
                        i11 = 0;
                    }
                    this.f20246e = i11;
                    this.f20245d = 3;
                }
            } else if (np0Var.K() == 86) {
                this.f20245d = 1;
            }
        }
    }

    @Override // u3.f
    public void g(n2.m mVar, ga gaVar) {
        gaVar.a();
        gaVar.b();
        this.f20261u = mVar.track(gaVar.f14805d, 1);
        gaVar.b();
        this.f20244c = gaVar.f14806e;
    }

    @Override // u3.f
    public void h(int i10, long j10) {
        this.f20249h = j10;
    }

    @Override // u3.f
    public void seek() {
        this.f20245d = 0;
        this.f20249h = C.TIME_UNSET;
        this.f20250i = false;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void zza() {
        this.f20245d = 0;
        this.f20249h = C.TIME_UNSET;
        this.f20250i = false;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void a(boolean z10) {
    }

    @Override // u3.f
    public void d(boolean z10) {
    }
}
