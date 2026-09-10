package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bq extends kp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vu0 f12844a;

    public /* synthetic */ bq(vu0 vu0Var) {
        this.f12844a = vu0Var;
    }

    @Override // com.google.android.gms.internal.ads.lp
    public final void o0(ap apVar) {
        bp bpVar;
        vu0 vu0Var = this.f12844a;
        zze zzeVar = (zze) vu0Var.f21274b;
        synchronized (vu0Var) {
            bpVar = (bp) vu0Var.f21276d;
            if (bpVar == null) {
                bpVar = new bp(apVar);
                vu0Var.f21276d = bpVar;
            }
        }
        zzeVar.zzb(bpVar);
    }
}
