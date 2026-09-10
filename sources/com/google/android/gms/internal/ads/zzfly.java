package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfly implements zzbde {
    private final ScheduledExecutorService zza;
    private final Executor zzb;
    private final Map zzc = new HashMap();
    private boolean zzd = false;

    public zzfly(ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zza = scheduledExecutorService;
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        Map map = this.zzc;
        ArrayList arrayList = new ArrayList(map.keySet());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i2);
            zzflx zzflxVar = (zzflx) map.get(scheduledFuture);
            if (zzflxVar != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                scheduledFuture.cancel(false);
                map.remove(scheduledFuture);
                zzb(zzflxVar.zza, Math.max(0L, zzflxVar.zzb - com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()), TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zza(boolean z2) {
        if (z2) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzflw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
    }

    public final synchronized void zzb(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            if (!this.zzd) {
                com.google.android.gms.ads.internal.zzt.zzg().zzb(this);
                this.zzd = true;
            }
            final zzflx zzflxVar = new zzflx(this, runnable, com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + timeUnit.toMillis(j));
            ScheduledFuture<?> scheduledFutureSchedule = this.zza.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzflv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzflx zzflxVar2;
                    zzflx zzflxVar3 = zzflxVar;
                    zzfly zzflyVar = zzflxVar3.zzd;
                    synchronized (zzflyVar) {
                        try {
                            ScheduledFuture scheduledFuture = zzflxVar3.zzc;
                            zzflxVar2 = scheduledFuture != null ? (zzflx) zzflyVar.zze().remove(scheduledFuture) : null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (zzflxVar2 != null) {
                        zzflxVar3.zzd.zzd().execute(zzflxVar3.zza);
                    }
                }
            }, j, timeUnit);
            zzflxVar.zzc = scheduledFutureSchedule;
            this.zzc.put(scheduledFutureSchedule, zzflxVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    public final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
