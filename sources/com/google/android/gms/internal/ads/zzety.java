package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzety implements zzezx {
    private final zzfik zza;

    public zzety(zzfik zzfikVar) {
        this.zza = zzfikVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return zzgym.zza(new zzetz(this.zza.zzq));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 58;
    }
}
