package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6 f23057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j7 f23058c;

    public /* synthetic */ j4(g6 g6Var, j7 j7Var, int i10) {
        this.f23056a = i10;
        this.f23057b = g6Var;
        this.f23058c = j7Var;
    }

    public t4 a() {
        return new t4((Application) this.f23057b.f23023b, (h) this.f23058c.zzb());
    }

    @Override // com.google.android.gms.internal.consent_sdk.l7
    public final Object zzb() {
        switch (this.f23056a) {
            case 0:
                return new v3((Application) this.f23057b.f23023b, (e) this.f23058c.zzb());
            default:
                return a();
        }
    }
}
