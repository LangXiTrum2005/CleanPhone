package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfbz implements zzezx {
    final ScheduledExecutorService zza;

    public zzfbz(zzbxc zzbxcVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return zzgym.zzk(zzgym.zzi(zzgym.zza(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfb)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzfby.zza, zzcdo.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 49;
    }
}
