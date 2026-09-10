package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcba implements zzgyj {
    final /* synthetic */ ListenableFuture zza;

    public zzcba(zzcbf zzcbfVar, ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
        Objects.requireNonNull(zzcbfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        zzcbf.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcbf.zzc.remove(this.zza);
    }
}
