package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class os0 implements bs0 {
    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        be1 be1Var = be1.f12743b;
        ((Boolean) zzba.zzc().a(am.U6)).getClass();
        ya1 ya1VarZ = ca1.z(new ListenableFuture[]{be1Var, be1Var});
        ns0 ns0Var = new ns0(be1Var);
        k00 k00Var = l00.f16608a;
        sd1 sd1Var = new sd1(ya1VarZ, true, false);
        sd1Var.f19937p = new rd1(sd1Var, ns0Var, k00Var);
        sd1Var.v();
        return sd1Var;
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        return 47;
    }
}
