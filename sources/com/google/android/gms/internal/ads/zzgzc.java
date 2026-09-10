package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class zzgzc extends zzgyy implements zzgyx {
    final ScheduledExecutorService zza;

    public zzgzc(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzd */
    public final zzgyv schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzgzl zzgzlVarZze = zzgzl.zze(runnable, null);
        return new zzgza(zzgzlVarZze, scheduledExecutorService.schedule(zzgzlVarZze, j, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgyx, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zze */
    public final zzgyv schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzgzl zzgzlVar = new zzgzl(callable);
        return new zzgza(zzgzlVar, this.zza.schedule(zzgzlVar, j, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgyx, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzf */
    public final zzgyv scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzgzb zzgzbVar = new zzgzb(runnable);
        return new zzgza(zzgzbVar, this.zza.scheduleAtFixedRate(zzgzbVar, j, j2, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgyx, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzg */
    public final zzgyv scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzgzb zzgzbVar = new zzgzb(runnable);
        return new zzgza(zzgzbVar, this.zza.scheduleWithFixedDelay(zzgzbVar, j, j2, timeUnit));
    }
}
