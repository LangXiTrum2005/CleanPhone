package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f19260b;

    public r0(u0 u0Var) {
        this.f19260b = u0Var;
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final void zza() {
        sy1 sy1Var = this.f19260b.J;
        if (sy1Var != null) {
            sy1Var.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final void zzb() {
        u0 u0Var = this.f19260b;
        Surface surface = u0Var.Q0;
        if (surface != null) {
            md0 md0Var = u0Var.B0;
            Handler handler = (Handler) md0Var.f17399b;
            if (handler != null) {
                handler.post(new q1(md0Var, surface, SystemClock.elapsedRealtime()));
            }
            u0Var.T0 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.s1
    public final void zzc() {
        u0 u0Var = this.f19260b;
        if (u0Var.Q0 != null) {
            u0Var.s0(0, 1);
        }
    }
}
