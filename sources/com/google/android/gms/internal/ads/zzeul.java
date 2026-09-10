package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import com.p004ironsource.ne;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeul implements zzezx {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb = new AtomicReference(Boolean.FALSE);
    private final Clock zzc;
    private final Executor zzd;
    private final zzezx zze;
    private final long zzf;
    private final zzdxe zzg;

    public zzeul(zzezx zzezxVar, long j, Clock clock, Executor executor, zzdxe zzdxeVar) {
        this.zzc = clock;
        this.zze = zzezxVar;
        this.zzf = j;
        this.zzd = executor;
        this.zzg = zzdxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        zzeui zzeuiVar;
        zzeui zzeuiVar2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznf)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzne)).booleanValue() && !((Boolean) this.zzb.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzcdo.zzd;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzc();
                    }
                };
                long j = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.zza;
                    zzeuiVar = (zzeui) atomicReference.get();
                    if (zzeuiVar == null) {
                        zzeui zzeuiVar3 = new zzeui(this.zze.zza(), this.zzf, this.zzc);
                        atomicReference.set(zzeuiVar3);
                        return zzeuiVar3.zza;
                    }
                    if (!((Boolean) this.zzb.get()).booleanValue() && zzeuiVar.zza()) {
                        ListenableFuture listenableFuture = zzeuiVar.zza;
                        zzezx zzezxVar = this.zze;
                        zzeuiVar2 = new zzeui(zzezxVar.zza(), this.zzf, this.zzc);
                        this.zza.set(zzeuiVar2);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzng)).booleanValue()) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznh)).booleanValue()) {
                                zzdxd zzdxdVarZza = this.zzg.zza();
                                zzdxdVarZza.zzc("action", "scs");
                                zzdxdVarZza.zzc(ne.b1, String.valueOf(zzezxVar.zzb()));
                                zzdxdVarZza.zzd();
                            }
                            return listenableFuture;
                        }
                        zzeuiVar = zzeuiVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.zza;
            zzeuiVar = (zzeui) atomicReference2.get();
            if (zzeuiVar == null || zzeuiVar.zza()) {
                zzezx zzezxVar2 = this.zze;
                zzeuiVar2 = new zzeui(zzezxVar2.zza(), this.zzf, this.zzc);
                atomicReference2.set(zzeuiVar2);
                zzeuiVar = zzeuiVar2;
            }
        }
        return zzeuiVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return this.zze.zzb();
    }

    public final /* synthetic */ void zzc() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }

    public final /* synthetic */ void zzd() {
        this.zza.set(new zzeui(this.zze.zza(), this.zzf, this.zzc));
    }
}
