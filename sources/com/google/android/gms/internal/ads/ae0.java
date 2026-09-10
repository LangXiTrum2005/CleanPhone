package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ae0 implements ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ee0 f12002b;

    public ae0(ee0 ee0Var, String str) {
        this.f12001a = str;
        this.f12002b = ee0Var;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
    @Override // com.google.android.gms.internal.ads.ai
    public final void v(zh zhVar) {
        if (!((Boolean) zzba.zzc().a(am.f12448z2)).booleanValue()) {
            if (zhVar.f22617j) {
                ee0 ee0Var = this.f12002b;
                if (ee0Var.f13947w != null) {
                    ee0Var.H.put(this.f12001a, Boolean.TRUE);
                    ?? r10 = ee0Var.f13947w;
                    if (r10 == 0) {
                        return;
                    }
                    ee0Var.s(r10.w1(), r10.zzi(), r10.zzj(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (zhVar.f22617j) {
                    ee0 ee0Var2 = this.f12002b;
                    if (ee0Var2.f13947w != null) {
                        ee0Var2.H.put(this.f12001a, Boolean.TRUE);
                        ?? r0 = ee0Var2.f13947w;
                        if (r0 == 0) {
                        } else {
                            ee0Var2.s(r0.w1(), ee0Var2.f13947w.zzi(), ee0Var2.f13947w.zzj(), true);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
