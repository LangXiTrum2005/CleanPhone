package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21263e;

    public /* synthetic */ vr0(Object obj, int i10) {
        this.f21263e = obj;
        this.f21259a = i10;
    }

    public void a() {
        z40 z40Var = (z40) this.f21263e;
        l1.w wVar = (l1.w) z40Var.f22496f;
        p1.b0 b0Var = (p1.b0) z40Var.f22491a;
        b0Var.l1();
        int i10 = b0Var.f47941h0.f48191n;
        if (!b0Var.T0() || b0Var.U0() == 1 || b0Var.U0() == 4 || i10 == 0 || i10 == 1) {
            if (this.f21261c) {
                wVar.d(4);
            }
            this.f21261c = false;
            return;
        }
        ((l1.u) z40Var.f22494d).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f21261c;
        int i11 = this.f21259a;
        if (z10 && this.f21260b == i10) {
            if (jElapsedRealtime - this.f21262d >= i11) {
                ((p1.v) z40Var.f22493c).f48170a.g1(new p1.h(2, new l1.t(4, i11), 1003));
                return;
            }
            return;
        }
        this.f21261c = true;
        this.f21262d = jElapsedRealtime;
        this.f21260b = i10;
        wVar.d(4);
        wVar.f44825a.sendEmptyMessageDelayed(4, i11);
    }

    public void b() {
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f21263e;
        ry1 ry1Var = (ry1) dVar.f22981a;
        ys0 ys0Var = (ys0) dVar.f22985e;
        int iK0 = ry1Var.K0();
        ry1 ry1Var2 = (ry1) dVar.f22981a;
        if (!ry1Var2.L0() || ry1Var2.J0() == 1 || ry1Var2.J0() == 4 || iK0 == 0 || iK0 == 1) {
            if (this.f21261c) {
                ys0Var.d(4);
            }
            this.f21261c = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f21261c;
        int i10 = this.f21259a;
        if (z10 && this.f21260b == iK0) {
            if (jElapsedRealtime - this.f21262d >= i10) {
                ((jy1) dVar.f22983c).f16219a.b1(new dy1(2, new ks0(4, i10), 1003));
                return;
            }
            return;
        }
        this.f21261c = true;
        this.f21262d = jElapsedRealtime;
        this.f21260b = iK0;
        ys0Var.d(4);
        ys0Var.f22362a.sendEmptyMessageDelayed(4, i10);
    }
}
