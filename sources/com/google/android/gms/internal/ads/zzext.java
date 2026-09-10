package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzext implements zzezx {
    private final zzfhq zza;

    public zzext(zzfhq zzfhqVar) {
        this.zza = zzfhqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return zzgym.zza(new zzexu(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 25;
    }
}
