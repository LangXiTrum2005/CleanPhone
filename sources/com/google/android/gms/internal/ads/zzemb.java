package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzemb {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcvn zzc;
    private final zzemr zzd;
    private final zzfpe zze;
    private final zzgzf zzf = zzgzf.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzemc zzh;
    private zzfic zzi;

    public zzemb(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcvn zzcvnVar, zzemr zzemrVar, zzfpe zzfpeVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcvnVar;
        this.zzd = zzemrVar;
        this.zze = zzfpeVar;
    }

    private final synchronized ListenableFuture zzd(zzfhr zzfhrVar) {
        Iterator it = zzfhrVar.zza.iterator();
        while (it.hasNext()) {
            zzejg zzejgVarZza = this.zzc.zza(zzfhrVar.zzb, (String) it.next());
            if (zzejgVarZza != null && zzejgVarZza.zza(this.zzi, zzfhrVar)) {
                return zzgym.zzi(zzejgVarZza.zzb(this.zzi, zzfhrVar), zzfhrVar.zzR, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgym.zzc(new zzebr(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzb(zzfhr zzfhrVar) {
        ListenableFuture listenableFutureZzd = zzd(zzfhrVar);
        this.zzd.zze(this.zzi, zzfhrVar, listenableFutureZzd, this.zze);
        zzgym.zzr(listenableFutureZzd, new zzema(this, zzfhrVar), this.zza);
    }

    public final synchronized ListenableFuture zza(zzfic zzficVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                List list = zzficVar.zzb.zza;
                if (list.isEmpty()) {
                    this.zzf.zzb(new zzemv(3, zzemy.zzb(zzficVar)));
                } else {
                    this.zzi = zzficVar;
                    zzemr zzemrVar = this.zzd;
                    this.zzh = new zzemc(zzficVar, zzemrVar, this.zzf);
                    zzemrVar.zzc(list);
                    zzfhr zzfhrVarZza = this.zzh.zza();
                    while (zzfhrVarZza != null) {
                        zzb(zzfhrVarZza);
                        zzfhrVarZza = this.zzh.zza();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzf;
    }

    public final /* synthetic */ zzemc zzc() {
        return this.zzh;
    }
}
