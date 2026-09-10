package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zr0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22701a;

    public zr0(nt0 nt0Var) {
        this.f22701a = nt0Var != null;
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        return zw1.d(new rp0(this.f22701a, 3));
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        return 36;
    }
}
