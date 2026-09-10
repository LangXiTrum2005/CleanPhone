package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public class zzgyh extends zzgyi {
    private final ListenableFuture zza;

    public zzgyh(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgyi, com.google.android.gms.internal.ads.zzgyg
    public final /* synthetic */ Future zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgyg, com.google.android.gms.internal.ads.zzgsu
    public final /* synthetic */ Object zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgyi
    public final ListenableFuture zzc() {
        return this.zza;
    }
}
