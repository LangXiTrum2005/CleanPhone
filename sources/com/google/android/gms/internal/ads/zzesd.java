package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzesd implements zzezx {
    private final ListenableFuture zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzesd(ListenableFuture listenableFuture, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = listenableFuture;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        ListenableFuture listenableFuture = this.zza;
        zzesc zzescVar = zzesc.zza;
        Executor executor = this.zzb;
        ListenableFuture listenableFutureZzj = zzgym.zzj(listenableFuture, zzescVar, executor);
        zzbgb zzbgbVar = zzbgk.zznQ;
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).intValue() > 0) {
            listenableFutureZzj = zzgym.zzi(listenableFutureZzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgym.zzh(listenableFutureZzj, Throwable.class, zzesb.zza, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 6;
    }
}
