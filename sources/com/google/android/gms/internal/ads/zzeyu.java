package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeyu implements zzezx {
    private final String zza;
    private final int zzb;

    public zzeyu(String str, int i2) {
        this.zza = str;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return zzgym.zza(new zzeyv(this.zza, this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 31;
    }
}
