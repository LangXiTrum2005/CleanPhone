package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeru implements zzezx {
    private final Clock zza;
    private final zzfik zzb;
    private final long zzc;

    public zzeru(Clock clock, zzfik zzfikVar, long j) {
        this.zza = clock;
        this.zzb = zzfikVar;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return zzgym.zza(new zzerv(this.zzb, this.zza.currentTimeMillis(), this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 4;
    }
}
