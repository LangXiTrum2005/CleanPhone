package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzezp implements zzezx {
    private final boolean zza;

    public zzezp(zzffn zzffnVar) {
        this.zza = zzffnVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return zzgym.zza(new zzezo(this.zza, null));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 36;
    }
}
