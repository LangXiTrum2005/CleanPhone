package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzege {
    private final zzbyt zza;

    public zzege(zzbyt zzbytVar) {
        this.zza = zzbytVar;
    }

    public final void zza() {
        ListenableFuture listenableFutureZza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziG)).booleanValue()) {
            zzcdr.zzb(listenableFutureZza, "persistFlags");
        } else {
            zzcdr.zza(listenableFutureZza, "persistFlags");
        }
    }
}
