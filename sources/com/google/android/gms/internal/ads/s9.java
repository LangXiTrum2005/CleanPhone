package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s9 implements j9, u3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f19900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f19902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f19903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f19904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f19905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f19906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f19907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f19908k;
    public final Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f19909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f19910n;

    public s9(da daVar) {
        this.f19903f = daVar;
        this.f19900c = new boolean[3];
        this.f19906i = new w9(32, 0);
        this.f19907j = new w9(33, 0);
        this.f19908k = new w9(34, 0);
        this.l = new w9(39, 0);
        this.f19909m = new w9(40, 0);
        this.f19902e = C.TIME_UNSET;
        this.f19910n = new np0();
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void a(boolean z10) {
        ((h3) this.f19904g).getClass();
        String str = uu0.f20901a;
        if (z10) {
            ((da) this.f19903f).f13475d.w(0);
            n(0, 0, this.f19901d, this.f19902e);
            l(0, 48, this.f19901d, this.f19902e);
        }
    }

    @Override // u3.f
    public void b(l1.q qVar) {
        int i10;
        ((n2.a0) this.f19904g).getClass();
        String str = l1.y.f44830a;
        while (qVar.a() > 0) {
            int i11 = qVar.f44814b;
            int i12 = qVar.f44815c;
            byte[] bArr = qVar.f44813a;
            this.f19901d += (long) qVar.a();
            ((n2.a0) this.f19904g).g(qVar.a(), qVar);
            while (i11 < i12) {
                int iB = m1.n.b(bArr, i11, i12, this.f19900c);
                if (iB == i12) {
                    j(bArr, i11, i12);
                    return;
                }
                int i13 = (bArr[iB + 3] & 126) >> 1;
                if (iB <= 0 || bArr[iB - 1] != 0) {
                    i10 = 3;
                } else {
                    iB--;
                    i10 = 4;
                }
                int i14 = iB;
                int i15 = i10;
                int i16 = i14 - i11;
                if (i16 > 0) {
                    j(bArr, i11, i14);
                }
                int i17 = i12 - i14;
                long j10 = this.f19901d - ((long) i17);
                i(i17, i16 < 0 ? -i16 : 0, j10, this.f19902e);
                k(j10, i17, i13, this.f19902e);
                i11 = i14 + i15;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void c(int i10, long j10) {
        this.f19902e = j10;
    }

    @Override // u3.f
    public void d(boolean z10) {
        ((n2.a0) this.f19904g).getClass();
        String str = l1.y.f44830a;
        if (z10) {
            ((kj1) ((r1.s) this.f19903f).f49340d).o(0);
            i(0, 0, this.f19901d, this.f19902e);
            k(this.f19901d, 0, 48, this.f19902e);
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void e(o2 o2Var, ga gaVar) {
        gaVar.c();
        gaVar.d();
        this.f19898a = gaVar.f14806e;
        gaVar.d();
        h3 h3VarE = o2Var.e(gaVar.f14805d, 2);
        this.f19904g = h3VarE;
        this.f19905h = new r9(h3VarE);
        ((da) this.f19903f).a(o2Var, gaVar);
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void f(np0 np0Var) {
        ((h3) this.f19904g).getClass();
        String str = uu0.f20901a;
        while (np0Var.B() > 0) {
            int i10 = np0Var.f17881b;
            int i11 = np0Var.f17882c;
            byte[] bArr = np0Var.f17880a;
            this.f19901d += (long) np0Var.B();
            ((h3) this.f19904g).b(np0Var.B(), np0Var);
            while (i10 < i11) {
                int iK = dv.K(bArr, i10, i11, this.f19900c);
                if (iK == i11) {
                    m(bArr, i10, i11);
                    return;
                }
                int i12 = bArr[iK + 3] & 126;
                int i13 = 3;
                if (iK > 0) {
                    int i14 = iK - 1;
                    if (bArr[i14] == 0) {
                        i13 = 4;
                        iK = i14;
                    }
                }
                int i15 = iK - i10;
                if (i15 > 0) {
                    m(bArr, i10, iK);
                }
                int i16 = i11 - iK;
                long j10 = this.f19901d - ((long) i16);
                n(i16, i15 < 0 ? -i15 : 0, j10, this.f19902e);
                l(i16, i12 >> 1, j10, this.f19902e);
                i10 = iK + i13;
            }
        }
    }

    @Override // u3.f
    public void g(n2.m mVar, ga gaVar) {
        gaVar.a();
        gaVar.b();
        this.f19898a = gaVar.f14806e;
        gaVar.b();
        n2.a0 a0VarTrack = mVar.track(gaVar.f14805d, 2);
        this.f19904g = a0VarTrack;
        this.f19905h = new r9(a0VarTrack);
        ((r1.s) this.f19903f).i(mVar, gaVar);
    }

    @Override // u3.f
    public void h(int i10, long j10) {
        this.f19902e = j10;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x014e  */
    public void i(int i10, int i11, long j10, long j11) {
        w9 w9Var = (w9) this.f19908k;
        w9 w9Var2 = (w9) this.f19907j;
        w9 w9Var3 = (w9) this.f19906i;
        w9 w9Var4 = (w9) this.f19909m;
        w9 w9Var5 = (w9) this.l;
        kj1 kj1Var = (kj1) ((r1.s) this.f19903f).f49340d;
        l1.q qVar = (l1.q) this.f19910n;
        r9 r9Var = (r9) this.f19905h;
        boolean z10 = this.f19899b;
        if (r9Var.f19475i && r9Var.f19472f) {
            r9Var.l = r9Var.f19468b;
            r9Var.f19475i = false;
        } else if (r9Var.f19473g || r9Var.f19472f) {
            if (z10 && r9Var.f19474h) {
                r9Var.a(i10 + ((int) (j10 - r9Var.f19467a)));
            }
            r9Var.f19476j = r9Var.f19467a;
            r9Var.f19477k = r9Var.f19470d;
            r9Var.l = r9Var.f19468b;
            r9Var.f19474h = true;
        }
        if (!this.f19899b) {
            w9Var3.b(i11);
            w9Var2.b(i11);
            w9Var.b(i11);
            if (w9Var3.f21459c && w9Var2.f21459c && w9Var.f21459c) {
                String str = this.f19898a;
                int i12 = w9Var3.f21461e;
                byte[] bArr = new byte[w9Var2.f21461e + i12 + w9Var.f21461e];
                System.arraycopy(w9Var3.f21460d, 0, bArr, 0, i12);
                System.arraycopy(w9Var2.f21460d, 0, bArr, w9Var3.f21461e, w9Var2.f21461e);
                System.arraycopy(w9Var.f21460d, 0, bArr, w9Var3.f21461e + w9Var2.f21461e, w9Var.f21461e);
                h51 h51VarI = m1.n.i(w9Var2.f21460d, 3, w9Var2.f21461e, null);
                m1.h hVar = (m1.h) h51VarI.f15178m;
                String strB = hVar != null ? l1.c.b(hVar.f45784a, hVar.f45785b, hVar.f45786c, hVar.f45787d, hVar.f45788e, hVar.f45789f) : null;
                i1.o oVar = new i1.o();
                oVar.f42589a = str;
                oVar.l = i1.d0.n("video/mp2t");
                oVar.f42600m = i1.d0.n("video/hevc");
                oVar.f42598j = strB;
                oVar.f42607t = h51VarI.f15170d;
                oVar.f42608u = h51VarI.f15171e;
                oVar.f42609v = h51VarI.f15172f;
                oVar.f42610w = h51VarI.f15173g;
                oVar.C = new i1.h(h51VarI.f15176j, h51VarI.f15177k, h51VarI.l, h51VarI.f15168b + 8, h51VarI.f15169c + 8, null);
                oVar.f42613z = h51VarI.f15174h;
                oVar.f42602o = h51VarI.f15175i;
                oVar.D = h51VarI.f15167a + 1;
                oVar.f42603p = Collections.singletonList(bArr);
                i1.p pVar = new i1.p(oVar);
                ((n2.a0) this.f19904g).b(pVar);
                int i13 = pVar.f42645p;
                go.k.t(i13 != -1);
                kj1Var.r(i13);
                this.f19899b = true;
            }
        }
        if (w9Var5.b(i11)) {
            qVar.K(w9Var5.f21460d, m1.n.n(w9Var5.f21460d, w9Var5.f21461e));
            qVar.N(5);
            kj1Var.a(j11, qVar);
        }
        if (w9Var4.b(i11)) {
            qVar.K(w9Var4.f21460d, m1.n.n(w9Var4.f21460d, w9Var4.f21461e));
            qVar.N(5);
            kj1Var.a(j11, qVar);
        }
    }

    public void j(byte[] bArr, int i10, int i11) {
        r9 r9Var = (r9) this.f19905h;
        if (r9Var.f19471e) {
            int i12 = r9Var.f19469c;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                r9Var.f19472f = (bArr[i13] & 128) != 0;
                r9Var.f19471e = false;
            } else {
                r9Var.f19469c = (i11 - i10) + i12;
            }
        }
        if (!this.f19899b) {
            ((w9) this.f19906i).a(bArr, i10, i11);
            ((w9) this.f19907j).a(bArr, i10, i11);
            ((w9) this.f19908k).a(bArr, i10, i11);
        }
        ((w9) this.l).a(bArr, i10, i11);
        ((w9) this.f19909m).a(bArr, i10, i11);
    }

    public void k(long j10, int i10, int i11, long j11) {
        r9 r9Var = (r9) this.f19905h;
        boolean z10 = this.f19899b;
        r9Var.f19472f = false;
        r9Var.f19473g = false;
        r9Var.f19470d = j11;
        r9Var.f19469c = 0;
        r9Var.f19467a = j10;
        if (i11 >= 32 && i11 != 40) {
            if (r9Var.f19474h && !r9Var.f19475i) {
                if (z10) {
                    r9Var.a(i10);
                }
                r9Var.f19474h = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                r9Var.f19473g = !r9Var.f19475i;
                r9Var.f19475i = true;
            }
        }
        boolean z11 = i11 >= 16 && i11 <= 21;
        r9Var.f19468b = z11;
        r9Var.f19471e = z11 || i11 <= 9;
        if (!this.f19899b) {
            ((w9) this.f19906i).d(i11);
            ((w9) this.f19907j).d(i11);
            ((w9) this.f19908k).d(i11);
        }
        ((w9) this.l).d(i11);
        ((w9) this.f19909m).d(i11);
    }

    public void l(int i10, int i11, long j10, long j11) {
        r9 r9Var = (r9) this.f19905h;
        boolean z10 = this.f19899b;
        r9Var.f19472f = false;
        r9Var.f19473g = false;
        r9Var.f19470d = j11;
        r9Var.f19469c = 0;
        r9Var.f19467a = j10;
        if (i11 >= 32 && i11 != 40) {
            if (r9Var.f19474h && !r9Var.f19475i) {
                if (z10) {
                    r9Var.b(i10);
                }
                r9Var.f19474h = false;
            }
            if (i11 <= 35 || i11 == 39) {
                r9Var.f19473g = !r9Var.f19475i;
                r9Var.f19475i = true;
            }
        }
        boolean z11 = i11 >= 16 && i11 <= 21;
        r9Var.f19468b = z11;
        r9Var.f19471e = z11 || i11 <= 9;
        if (!this.f19899b) {
            ((w9) this.f19906i).f(i11);
            ((w9) this.f19907j).f(i11);
            ((w9) this.f19908k).f(i11);
        }
        ((w9) this.l).f(i11);
        ((w9) this.f19909m).f(i11);
    }

    public void m(byte[] bArr, int i10, int i11) {
        r9 r9Var = (r9) this.f19905h;
        if (r9Var.f19471e) {
            int i12 = r9Var.f19469c;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                r9Var.f19472f = (bArr[i13] & 128) != 0;
                r9Var.f19471e = false;
            } else {
                r9Var.f19469c = (i11 - i10) + i12;
            }
        }
        if (!this.f19899b) {
            ((w9) this.f19906i).g(bArr, i10, i11);
            ((w9) this.f19907j).g(bArr, i10, i11);
            ((w9) this.f19908k).g(bArr, i10, i11);
        }
        ((w9) this.l).g(bArr, i10, i11);
        ((w9) this.f19909m).g(bArr, i10, i11);
    }

    public void n(int i10, int i11, long j10, long j11) {
        np0 np0Var = (np0) this.f19910n;
        kj1 kj1Var = ((da) this.f19903f).f13475d;
        r9 r9Var = (r9) this.f19905h;
        boolean z10 = this.f19899b;
        if (r9Var.f19475i && r9Var.f19472f) {
            r9Var.l = r9Var.f19468b;
            r9Var.f19475i = false;
        } else if (r9Var.f19473g || r9Var.f19472f) {
            if (z10 && r9Var.f19474h) {
                r9Var.b(i10 + ((int) (j10 - r9Var.f19467a)));
            }
            r9Var.f19476j = r9Var.f19467a;
            r9Var.f19477k = r9Var.f19470d;
            r9Var.l = r9Var.f19468b;
            r9Var.f19474h = true;
        }
        if (!this.f19899b) {
            w9 w9Var = (w9) this.f19906i;
            w9Var.h(i11);
            w9 w9Var2 = (w9) this.f19907j;
            w9Var2.h(i11);
            w9 w9Var3 = (w9) this.f19908k;
            w9Var3.h(i11);
            if (w9Var.f21459c && w9Var2.f21459c && w9Var3.f21459c) {
                String str = this.f19898a;
                int i12 = w9Var.f21461e;
                byte[] bArr = new byte[w9Var2.f21461e + i12 + w9Var3.f21461e];
                System.arraycopy(w9Var.f21460d, 0, bArr, 0, i12);
                System.arraycopy(w9Var2.f21460d, 0, bArr, w9Var.f21461e, w9Var2.f21461e);
                System.arraycopy(w9Var3.f21460d, 0, bArr, w9Var.f21461e + w9Var2.f21461e, w9Var3.f21461e);
                String strA = null;
                h51 h51VarJ = dv.J(w9Var2.f21460d, 3, w9Var2.f21461e, null);
                j31 j31Var = (j31) h51VarJ.f15178m;
                if (j31Var != null) {
                    int i13 = j31Var.f15960f;
                    int[] iArr = j31Var.f15959e;
                    int i14 = j31Var.f15958d;
                    strA = re0.a(j31Var.f15955a, j31Var.f15956b, j31Var.f15957c, i14, iArr, i13);
                }
                i12 i12Var = new i12();
                i12Var.f15499a = str;
                i12Var.d("video/mp2t");
                i12Var.e("video/hevc");
                i12Var.f15508j = strA;
                i12Var.f15518u = h51VarJ.f15170d;
                i12Var.f15519v = h51VarJ.f15171e;
                i12Var.f15520w = h51VarJ.f15172f;
                i12Var.f15521x = h51VarJ.f15173g;
                i12Var.D = new lq1(h51VarJ.f15176j, h51VarJ.f15177k, h51VarJ.l, h51VarJ.f15168b + 8, h51VarJ.f15169c + 8, null);
                i12Var.A = h51VarJ.f15174h;
                i12Var.f15513p = h51VarJ.f15175i;
                i12Var.E = h51VarJ.f15167a + 1;
                i12Var.f15514q = Collections.singletonList(bArr);
                g22 g22Var = new g22(i12Var);
                ((h3) this.f19904g).f(g22Var);
                int i15 = g22Var.f14680q;
                ps1.c0(i15 != -1);
                kj1Var.u(i15);
                this.f19899b = true;
            }
        }
        w9 w9Var4 = (w9) this.l;
        if (w9Var4.h(i11)) {
            np0Var.z(dv.b(w9Var4.f21461e, w9Var4.f21460d), w9Var4.f21460d);
            np0Var.G(5);
            kj1Var.v(j11, np0Var);
        }
        w9 w9Var5 = (w9) this.f19909m;
        if (w9Var5.h(i11)) {
            np0Var.z(dv.b(w9Var5.f21461e, w9Var5.f21460d), w9Var5.f21460d);
            np0Var.G(5);
            kj1Var.v(j11, np0Var);
        }
    }

    @Override // u3.f
    public void seek() {
        this.f19901d = 0L;
        this.f19902e = C.TIME_UNSET;
        m1.n.a(this.f19900c);
        ((w9) this.f19906i).c();
        ((w9) this.f19907j).c();
        ((w9) this.f19908k).c();
        ((w9) this.l).c();
        ((w9) this.f19909m).c();
        ((kj1) ((r1.s) this.f19903f).f49340d).o(0);
        r9 r9Var = (r9) this.f19905h;
        if (r9Var != null) {
            r9Var.f19471e = false;
            r9Var.f19472f = false;
            r9Var.f19473g = false;
            r9Var.f19474h = false;
            r9Var.f19475i = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void zza() {
        this.f19901d = 0L;
        this.f19902e = C.TIME_UNSET;
        dv.L(this.f19900c);
        ((w9) this.f19906i).e();
        ((w9) this.f19907j).e();
        ((w9) this.f19908k).e();
        ((w9) this.l).e();
        ((w9) this.f19909m).e();
        ((da) this.f19903f).f13475d.w(0);
        r9 r9Var = (r9) this.f19905h;
        if (r9Var != null) {
            r9Var.f19471e = false;
            r9Var.f19472f = false;
            r9Var.f19473g = false;
            r9Var.f19474h = false;
            r9Var.f19475i = false;
        }
    }

    public s9(r1.s sVar) {
        this.f19903f = sVar;
        this.f19900c = new boolean[3];
        this.f19906i = new w9(32, 1);
        this.f19907j = new w9(33, 1);
        this.f19908k = new w9(34, 1);
        this.l = new w9(39, 1);
        this.f19909m = new w9(40, 1);
        this.f19902e = C.TIME_UNSET;
        this.f19910n = new l1.q();
    }
}
