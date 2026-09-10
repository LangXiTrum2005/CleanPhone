package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f41461a;

    public s0(t0 t0Var) {
        this.f41461a = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t0 t0Var = this.f41461a;
        t0Var.getClass();
        try {
            e9.a(t0Var.f41495a, (List) t0.a(t0Var.f41496b), new TrackingParams().a("APP_PRESENCE"));
        } catch (Throwable th) {
            g9.a(th);
        }
    }
}
