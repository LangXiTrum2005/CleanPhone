package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.zzd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class aq extends hp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vu0 f12491a;

    public /* synthetic */ aq(vu0 vu0Var) {
        this.f12491a = vu0Var;
    }

    @Override // com.google.android.gms.internal.ads.ip
    public final void K0(ap apVar, String str) {
        bp bpVar;
        vu0 vu0Var = this.f12491a;
        if (((zzd) vu0Var.f21275c) == null) {
            return;
        }
        synchronized (vu0Var) {
            bpVar = (bp) vu0Var.f21276d;
            if (bpVar == null) {
                bpVar = new bp(apVar);
                vu0Var.f21276d = bpVar;
            }
        }
        ((zzd) vu0Var.f21275c).zzc(bpVar, str);
    }
}
