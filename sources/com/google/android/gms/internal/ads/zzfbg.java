package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfbg implements zzezx {
    private final zzcda zza;
    private final ScheduledExecutorService zzb;
    private final zzgyw zzc;

    public zzfbg(String str, zzbem zzbemVar, zzcda zzcdaVar, ScheduledExecutorService scheduledExecutorService, zzgyw zzgywVar) {
        this.zza = zzcdaVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdI)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdN)).booleanValue()) {
                ListenableFuture listenableFutureZza = zzfzr.zza(Tasks.forResult(null), null);
                zzgyw zzgywVar = this.zzc;
                ListenableFuture listenableFutureZzj = zzgym.zzj(listenableFutureZza, zzfbf.zza, zzgywVar);
                if (((Boolean) zzbhx.zza.zze()).booleanValue()) {
                    listenableFutureZzj = zzgym.zzi(listenableFutureZzj, ((Long) zzbhx.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgym.zzg(listenableFutureZzj, Exception.class, new zzgpr() { // from class: com.google.android.gms.internal.ads.zzfbe
                    @Override // com.google.android.gms.internal.ads.zzgpr
                    public final /* synthetic */ Object apply(Object obj) {
                        return this.zza.zzc((Exception) obj);
                    }
                }, zzgywVar);
            }
        }
        return zzgym.zza(new zzfbh(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 43;
    }

    public final /* synthetic */ zzfbh zzc(Exception exc) {
        this.zza.zzg(exc, "AppSetIdInfoGmscoreSignal");
        return new zzfbh(null, -1);
    }
}
