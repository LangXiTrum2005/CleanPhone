package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final class zzgxk extends zzgxl {
    public zzgxk(ListenableFuture listenableFuture, zzgpr zzgprVar) {
        super(listenableFuture, zzgprVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final void zze(Object obj) {
        zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        return ((zzgpr) obj).apply(obj2);
    }
}
