package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz1 f19250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oz1 f19251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f19253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f19254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19255f;

    public qz1(oz1 oz1Var, pz1 pz1Var, Looper looper) {
        this.f19251b = oz1Var;
        this.f19250a = pz1Var;
        this.f19254e = looper;
    }

    public final void a() {
        ps1.c0(!this.f19255f);
        this.f19255f = true;
        wy1 wy1Var = (wy1) this.f19251b;
        if (!wy1Var.H && wy1Var.f21634i.getThread().isAlive()) {
            wy1Var.f21632g.b(14, this).a();
        } else {
            v71.y("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }

    public final synchronized void b(boolean z10) {
        notifyAll();
    }
}
