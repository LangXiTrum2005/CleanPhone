package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6 f23013b;

    public /* synthetic */ f(g6 g6Var, int i10) {
        this.f23012a = i10;
        this.f23013b = g6Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l7
    public final Object zzb() {
        switch (this.f23012a) {
            case 0:
                return new e((Application) this.f23013b.f23023b);
            case 1:
                return new h((Application) this.f23013b.f23023b);
            default:
                return new b0((Application) this.f23013b.f23023b);
        }
    }
}
