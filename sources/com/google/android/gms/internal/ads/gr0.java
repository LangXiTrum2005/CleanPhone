package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f14941h;

    public /* synthetic */ gr0(Object obj, int i10) {
        this.f14941h = obj;
        this.f14934a = i10;
    }

    public void a() {
        z40 z40Var = (z40) this.f14941h;
        l1.w wVar = (l1.w) z40Var.f22496f;
        p1.b0 b0Var = (p1.b0) z40Var.f22491a;
        if (b0Var.U0() == 3 && b0Var.T0()) {
            b0Var.l1();
            if (b0Var.f47941h0.f48191n == 0) {
                i1.p0 p0VarQ0 = b0Var.Q0();
                Object objL = p0VarQ0.p() ? null : p0VarQ0.l(b0Var.N0());
                int iK0 = b0Var.K0();
                int iL0 = b0Var.L0();
                long jO0 = b0Var.O0();
                if (objL != null && iK0 == -1) {
                    jO0 -= l1.y.Z(p0VarQ0.g(objL, (i1.n0) z40Var.f22495e).f42586e);
                }
                ((l1.u) z40Var.f22494d).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z10 = this.f14939f;
                int i10 = this.f14934a;
                if (z10 && Objects.equals(objL, this.f14935b) && iK0 == this.f14936c && iL0 == this.f14937d && jO0 == this.f14938e) {
                    if (jElapsedRealtime - this.f14940g >= i10) {
                        ((p1.v) z40Var.f22493c).f48170a.g1(new p1.h(2, new l1.t(2, i10), 1003));
                        return;
                    }
                    return;
                }
                this.f14939f = true;
                this.f14940g = jElapsedRealtime;
                this.f14935b = objL;
                this.f14936c = iK0;
                this.f14937d = iL0;
                this.f14938e = jO0;
                wVar.d(2);
                wVar.f44825a.sendEmptyMessageDelayed(2, i10);
                return;
            }
        }
        if (this.f14939f) {
            wVar.d(2);
        }
        this.f14939f = false;
    }

    public void b() {
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f14941h;
        ry1 ry1Var = (ry1) dVar.f22981a;
        ys0 ys0Var = (ys0) dVar.f22985e;
        if (ry1Var.J0() != 3 || !ry1Var.L0() || ry1Var.K0() != 0) {
            if (this.f14939f) {
                ys0Var.d(2);
            }
            this.f14939f = false;
            return;
        }
        ci ciVarO0 = ry1Var.O0();
        Object objF = ciVarO0.g() ? null : ciVarO0.f(ry1Var.Q0());
        int iC = ry1Var.c();
        int iW0 = ry1Var.W0();
        long jT0 = ry1Var.T0();
        if (objF != null && iC == -1) {
            ciVarO0.o(objF, (ug) dVar.f22984d);
            jT0 -= uu0.s(0L);
            iC = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f14939f;
        int i10 = this.f14934a;
        if (z10 && Objects.equals(objF, this.f14935b) && iC == this.f14936c && iW0 == this.f14937d && jT0 == this.f14938e) {
            if (jElapsedRealtime - this.f14940g >= i10) {
                ((jy1) dVar.f22983c).f16219a.b1(new dy1(2, new ks0(2, i10), 1003));
                return;
            }
            return;
        }
        this.f14939f = true;
        this.f14940g = jElapsedRealtime;
        this.f14935b = objF;
        this.f14936c = iC;
        this.f14937d = iW0;
        this.f14938e = jT0;
        ys0Var.d(2);
        ys0Var.f22362a.sendEmptyMessageDelayed(2, i10);
    }
}
