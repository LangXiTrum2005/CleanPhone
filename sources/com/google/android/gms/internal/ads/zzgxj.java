package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final class zzgxj extends zzgxl {
    public zzgxj(ListenableFuture listenableFuture, zzgxu zzgxuVar) {
        super(listenableFuture, zzgxuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzgxu zzgxuVar = (zzgxu) obj;
        ListenableFuture listenableFutureZza = zzgxuVar.zza(obj2);
        zzgqa.zzl(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgxuVar);
        return listenableFutureZza;
    }
}
