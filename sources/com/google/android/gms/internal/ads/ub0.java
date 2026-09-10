package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ub0 implements mb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20718b;

    @Override // com.google.android.gms.internal.ads.mb0
    public final synchronized void z(ju0 ju0Var) {
        if (((Boolean) zzba.zzc().a(am.Y1)).booleanValue()) {
            try {
                fu0 fu0Var = (fu0) ju0Var.f16196b.f20920d;
                this.f20717a = fu0Var.f14547c;
                this.f20718b = fu0Var.f14548d;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void q0(mx mxVar) {
    }
}
