package com.google.android.gms.internal.ads;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m22 f19747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f19749c;

    public s0(u0 u0Var, m22 m22Var, int i10, long j10) {
        this.f19747a = m22Var;
        this.f19748b = i10;
        this.f19749c = u0Var;
    }

    public final void a() {
        u0 u0Var = this.f19749c;
        u0Var.getClass();
        Trace.beginSection("dropVideoBuffer");
        this.f19747a.zzc(this.f19748b);
        Trace.endSection();
        u0Var.s0(0, 1);
    }
}
