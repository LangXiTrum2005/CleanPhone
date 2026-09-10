package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final class zzgxd extends zzgxe {
    public zzgxd(ListenableFuture listenableFuture, Class cls, zzgpr zzgprVar) {
        super(listenableFuture, cls, zzgprVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxe
    public final void zze(Object obj) {
        zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxe
    public final /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        return ((zzgpr) obj).apply(th);
    }
}
