package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcvz {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcvz(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    public final void zza(zzgyj zzgyjVar) {
        zzgym.zzr(this.zzc, new zzcvt(this, zzgyjVar), this.zza);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final /* synthetic */ ListenableFuture zzc(zzgyj zzgyjVar, ListenableFuture listenableFuture, zzcvk zzcvkVar) {
        if (zzcvkVar != null) {
            zzgyjVar.zzb(zzcvkVar);
        }
        return zzgym.zzi(listenableFuture, ((Long) zzbiy.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final /* synthetic */ void zze(List list, final zzgyj zzgyjVar) {
        if (list == null || list.isEmpty()) {
            this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgyjVar.zza(new zzebr(3));
                }
            });
            return;
        }
        ListenableFuture listenableFutureZza = zzgym.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it.next();
            zzgxu zzgxuVar = new zzgxu() { // from class: com.google.android.gms.internal.ads.zzcvv
                @Override // com.google.android.gms.internal.ads.zzgxu
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    zzgyjVar.zza((Throwable) obj);
                    return zzgym.zza(null);
                }
            };
            Executor executor = this.zza;
            listenableFutureZza = zzgym.zzj(zzgym.zzh(listenableFutureZza, Throwable.class, zzgxuVar, executor), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzcvw
                @Override // com.google.android.gms.internal.ads.zzgxu
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzc(zzgyjVar, listenableFuture, (zzcvk) obj);
                }
            }, executor);
        }
        zzgym.zzr(listenableFutureZza, new zzcvu(this, zzgyjVar), this.zza);
    }

    public final /* synthetic */ void zzf() {
        zzcdo.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }
}
