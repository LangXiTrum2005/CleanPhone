package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final class zzgxc extends zzgxe {
    public zzgxc(ListenableFuture listenableFuture, Class cls, zzgxu zzgxuVar) {
        super(listenableFuture, cls, zzgxuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxe
    public final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxe
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzgxu zzgxuVar = (zzgxu) obj;
        ListenableFuture listenableFutureZza = zzgxuVar.zza(th);
        zzgqa.zzl(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgxuVar);
        return listenableFutureZza;
    }
}
