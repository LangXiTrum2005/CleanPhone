package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexq implements zzezx {
    private final zzgyw zza;

    public zzexq(zzgyw zzgywVar) {
        this.zza = zzgywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zza.submit(zzexp.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 24;
    }
}
