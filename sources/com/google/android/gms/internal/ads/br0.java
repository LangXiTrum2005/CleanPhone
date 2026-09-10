package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class br0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f12866i;

    public /* synthetic */ br0(Object obj, int i10) {
        this.f12866i = obj;
        this.f12858a = i10;
    }

    public void a() {
        int i10 = this.f12858a;
        z40 z40Var = (z40) this.f12866i;
        if (((p1.b0) z40Var.f22491a).U0() == 2 && ((p1.b0) z40Var.f22491a).T0()) {
            p1.b0 b0Var = (p1.b0) z40Var.f22491a;
            b0Var.l1();
            if (b0Var.f47941h0.f48191n == 0) {
                i1.p0 p0VarQ0 = ((p1.b0) z40Var.f22491a).Q0();
                Object objL = p0VarQ0.p() ? null : p0VarQ0.l(((p1.b0) z40Var.f22491a).N0());
                int iK0 = ((p1.b0) z40Var.f22491a).K0();
                int iL0 = ((p1.b0) z40Var.f22491a).L0();
                long jI0 = ((p1.b0) z40Var.f22491a).I0();
                long jMax = Math.max(0L, jI0 - ((p1.b0) z40Var.f22491a).O0());
                p1.b0 b0Var2 = (p1.b0) z40Var.f22491a;
                b0Var2.l1();
                long jMax2 = Math.max(0L, l1.y.Z(b0Var2.f47941h0.f48195r) - jMax);
                if (objL != null && iK0 == -1) {
                    jI0 -= l1.y.Z(p0VarQ0.g(objL, (i1.n0) z40Var.f22495e).f42586e);
                }
                ((l1.u) z40Var.f22494d).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f12864g && Objects.equals(objL, this.f12859b) && iK0 == this.f12860c && iL0 == this.f12861d && jI0 == this.f12862e && jMax2 == this.f12863f) {
                    if (jElapsedRealtime - this.f12865h >= i10) {
                        ((p1.v) z40Var.f22493c).f48170a.g1(new p1.h(2, new l1.t(1, i10), 1003));
                        return;
                    }
                    return;
                }
                this.f12864g = true;
                this.f12865h = jElapsedRealtime;
                this.f12859b = objL;
                this.f12860c = iK0;
                this.f12861d = iL0;
                this.f12862e = jI0;
                this.f12863f = jMax2;
                ((l1.w) z40Var.f22496f).d(1);
                ((l1.w) z40Var.f22496f).f44825a.sendEmptyMessageDelayed(1, i10);
                return;
            }
        }
        if (this.f12864g) {
            ((l1.w) z40Var.f22496f).d(1);
        }
        this.f12864g = false;
    }

    public void b() {
        Object obj;
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f12866i;
        ry1 ry1Var = (ry1) dVar.f22981a;
        ys0 ys0Var = (ys0) dVar.f22985e;
        if (ry1Var.J0() != 2 || !ry1Var.L0() || ry1Var.K0() != 0) {
            if (this.f12864g) {
                ys0Var.d(1);
            }
            this.f12864g = false;
            return;
        }
        ci ciVarO0 = ry1Var.O0();
        Object objF = ciVarO0.g() ? null : ciVarO0.f(ry1Var.Q0());
        int iC = ry1Var.c();
        int iW0 = ry1Var.W0();
        long jP1 = ry1Var.p1();
        long jMax = Math.max(0L, ry1Var.U0() - Math.max(0L, jP1 - ry1Var.T0()));
        if (objF != null && iC == -1) {
            ciVarO0.o(objF, (ug) dVar.f22984d);
            jP1 -= uu0.s(0L);
            iC = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f12864g;
        int i10 = this.f12858a;
        if (z10 && Objects.equals(objF, this.f12859b) && iC == this.f12860c && iW0 == this.f12861d) {
            obj = objF;
            if (jP1 == this.f12862e && jMax == this.f12863f) {
                if (jElapsedRealtime - this.f12865h >= i10) {
                    ((jy1) dVar.f22983c).f16219a.b1(new dy1(2, new ks0(1, i10), 1003));
                    return;
                }
                return;
            }
        } else {
            obj = objF;
        }
        this.f12864g = true;
        this.f12865h = jElapsedRealtime;
        this.f12859b = obj;
        this.f12860c = iC;
        this.f12861d = iW0;
        this.f12862e = jP1;
        this.f12863f = jMax;
        ys0Var.d(1);
        ys0Var.f22362a.sendEmptyMessageDelayed(1, i10);
    }
}
