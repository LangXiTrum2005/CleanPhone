package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeyj implements zzezx {
    private final zzezx zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzeyj(zzezx zzezxVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzezxVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        ListenableFuture listenableFutureZza = this.zza.zza();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcT)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            listenableFutureZza = zzgym.zzi(listenableFutureZza, j, timeUnit, this.zzc);
        }
        return zzgym.zzh(listenableFutureZza, Throwable.class, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzeyi
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, zzcdo.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return this.zza.zzb();
    }

    public final /* synthetic */ ListenableFuture zzc(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcR)).booleanValue()) {
            zzezx zzezxVar = this.zza;
            zzcda zzcdaVarZzh = com.google.android.gms.ads.internal.zzt.zzh();
            int iZzb = zzezxVar.zzb();
            StringBuilder sb = new StringBuilder(String.valueOf(iZzb).length() + 22);
            sb.append("OptionalSignalTimeout:");
            sb.append(iZzb);
            zzcdaVarZzh.zzg(th, sb.toString());
        }
        return zzgym.zza(null);
    }
}
