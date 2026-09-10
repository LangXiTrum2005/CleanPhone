package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgzj extends zzgyt {
    final /* synthetic */ zzgzl zza;
    private final zzgxt zzb;

    public zzgzj(zzgzl zzgzlVar, zzgxt zzgxtVar) {
        Objects.requireNonNull(zzgzlVar);
        this.zza = zzgzlVar;
        this.zzb = zzgxtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgxt zzgxtVar = this.zzb;
        ListenableFuture listenableFutureZza = zzgxtVar.zza();
        zzgqa.zzl(listenableFutureZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgxtVar);
        return listenableFutureZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}
