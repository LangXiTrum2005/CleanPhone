package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f17928g;

    public /* synthetic */ nr0(Object obj, int i10) {
        this.f17928g = obj;
        this.f17922a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    public void a() {
        long jS0;
        boolean z10;
        z40 z40Var = (z40) this.f17928g;
        i1.n0 n0Var = (i1.n0) z40Var.f22495e;
        l1.w wVar = (l1.w) z40Var.f22496f;
        p1.b0 b0Var = (p1.b0) z40Var.f22491a;
        i1.p0 p0VarQ0 = b0Var.Q0();
        Object objL = p0VarQ0.p() ? null : p0VarQ0.l(b0Var.N0());
        int iK0 = b0Var.K0();
        int iL0 = b0Var.L0();
        long jO0 = b0Var.O0();
        if (objL == null || iK0 != -1) {
            jS0 = iK0 != -1 ? b0Var.S0() : C.TIME_UNSET;
        } else {
            p0VarQ0.g(objL, n0Var);
            jO0 -= l1.y.Z(n0Var.f42586e);
            jS0 = l1.y.Z(n0Var.f42585d);
        }
        if (b0Var.U0() == 3 && b0Var.T0()) {
            b0Var.l1();
            if (b0Var.f47941h0.f48191n == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (!z10 || jS0 == C.TIME_UNSET || jO0 < jS0) {
            wVar.d(3);
            if (z10 && jS0 != C.TIME_UNSET) {
                b0Var.l1();
                wVar.f44825a.sendEmptyMessageDelayed(3, (int) Math.ceil((jS0 - jO0) / b0Var.f47941h0.f48192o.f42544a));
            }
            this.f17926e = false;
            return;
        }
        ((l1.u) z40Var.f22494d).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z11 = this.f17926e;
        int i10 = this.f17922a;
        if (z11 && Objects.equals(objL, this.f17923b) && iK0 == this.f17924c && iL0 == this.f17925d) {
            if (jElapsedRealtime - this.f17927f >= i10) {
                ((p1.v) z40Var.f22493c).f48170a.g1(new p1.h(2, new l1.t(3, i10), 1003));
                return;
            }
            return;
        }
        this.f17926e = true;
        this.f17927f = jElapsedRealtime;
        this.f17923b = objL;
        this.f17924c = iK0;
        this.f17925d = iL0;
        wVar.d(3);
        wVar.f44825a.sendEmptyMessageDelayed(3, i10);
    }

    public void b() {
        long jO1;
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f17928g;
        ry1 ry1Var = (ry1) dVar.f22981a;
        ug ugVar = (ug) dVar.f22984d;
        ys0 ys0Var = (ys0) dVar.f22985e;
        ci ciVarO0 = ry1Var.O0();
        Object objF = ciVarO0.g() ? null : ciVarO0.f(ry1Var.Q0());
        int iC = ry1Var.c();
        int iW0 = ry1Var.W0();
        long jT0 = ry1Var.T0();
        if (objF == null || iC != -1) {
            jO1 = iC != -1 ? ry1Var.o1() : C.TIME_UNSET;
        } else {
            ciVarO0.o(objF, ugVar);
            jT0 -= uu0.s(0L);
            jO1 = uu0.s(ugVar.f20773d);
            iC = -1;
        }
        boolean z10 = ry1Var.J0() == 3 && ry1Var.L0() && ry1Var.K0() == 0;
        if (!z10 || jO1 == C.TIME_UNSET || jT0 < jO1) {
            ys0Var.d(3);
            if (z10 && jO1 != C.TIME_UNSET) {
                ry1Var.l0();
                ys0Var.f22362a.sendEmptyMessageDelayed(3, (int) Math.ceil((jO1 - jT0) / ry1Var.f19708a0.f18051o.f13130a));
            }
            this.f17926e = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z11 = this.f17926e;
        int i10 = this.f17922a;
        if (z11 && Objects.equals(objF, this.f17923b) && iC == this.f17924c && iW0 == this.f17925d) {
            if (jElapsedRealtime - this.f17927f >= i10) {
                ((jy1) dVar.f22983c).f16219a.b1(new dy1(2, new ks0(3, i10), 1003));
                return;
            }
            return;
        }
        this.f17926e = true;
        this.f17927f = jElapsedRealtime;
        this.f17923b = objF;
        this.f17924c = iC;
        this.f17925d = iW0;
        ys0Var.d(3);
        ys0Var.f22362a.sendEmptyMessageDelayed(3, i10);
    }
}
