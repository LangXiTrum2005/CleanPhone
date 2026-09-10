package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcro {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final AI zzc;
    private volatile boolean zzd = true;

    public zzcro(Executor executor, ScheduledExecutorService scheduledExecutorService, AI ai) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = ai;
    }

    public static /* bridge */ /* synthetic */ void zzb(final zzcro zzcroVar, List list, final zzgcd zzgcdVar) {
        if (list == null || list.isEmpty()) {
            zzcroVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrj
                @Override // java.lang.Runnable
                public final void run() {
                    zzgcdVar.zza(new zzdvy(3));
                }
            });
            return;
        }
        AI aiZzh = zzgch.zzh(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final AI ai = (AI) it.next();
            aiZzh = zzgch.zzn(zzgch.zzf(aiZzh, Throwable.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzcrk
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final AI zza(Object obj) {
                    zzgcdVar.zza((Throwable) obj);
                    return zzgch.zzh(null);
                }
            }, zzcroVar.zza), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzcrl
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final AI zza(Object obj) {
                    return this.zza.zza(zzgcdVar, ai, (zzcqz) obj);
                }
            }, zzcroVar.zza);
        }
        zzgch.zzr(aiZzh, new zzcrn(zzcroVar, zzgcdVar), zzcroVar.zza);
    }

    public final /* synthetic */ AI zza(zzgcd zzgcdVar, AI ai, zzcqz zzcqzVar) throws Exception {
        if (zzcqzVar != null) {
            zzgcdVar.zzb(zzcqzVar);
        }
        return zzgch.zzo(ai, ((Long) zzbey.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgcd zzgcdVar) {
        zzgch.zzr(this.zzc, new zzcrm(this, zzgcdVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
