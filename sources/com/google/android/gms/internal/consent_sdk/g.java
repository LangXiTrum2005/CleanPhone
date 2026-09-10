package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6 f23015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j7 f23016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j7 f23017c;

    public g(g6 g6Var, j7 j7Var, j7 j7Var2) {
        this.f23015a = g6Var;
        this.f23016b = j7Var;
        this.f23017c = j7Var2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l7
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zc.u zzb() {
        Application application = (Application) this.f23015a.f23023b;
        h hVar = (h) this.f23016b.zzb();
        v3 v3Var = (v3) this.f23017c.zzb();
        g0 g0Var = h0.f23035b;
        j0.c(g0Var);
        return new zc.u(application, hVar, v3Var, g0Var, 1);
    }
}
