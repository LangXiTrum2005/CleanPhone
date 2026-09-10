package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzetk implements zzezx {
    final zzcda zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgyw zzd;
    private final Context zze;

    public zzetk(Context context, zzcda zzcdaVar, ScheduledExecutorService scheduledExecutorService, zzgyw zzgywVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdM)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcdaVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdI)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdN)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdJ)).booleanValue()) {
                    return zzgym.zzk(zzfzr.zza(this.zzb.getAppSetIdInfo(), null), zzetj.zza, zzcdo.zzg);
                }
                Task<AppSetIdInfo> taskZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdM)).booleanValue() ? zzfjp.zzb(this.zze) : this.zzb.getAppSetIdInfo();
                if (taskZzb == null) {
                    return zzgym.zza(new zzetl(null, -1));
                }
                ListenableFuture listenableFutureZzj = zzgym.zzj(zzfzr.zza(taskZzb, null), zzeth.zza, zzcdo.zzg);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdK)).booleanValue()) {
                    listenableFutureZzj = zzgym.zzi(listenableFutureZzj, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdL)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgym.zzg(listenableFutureZzj, Exception.class, new zzgpr() { // from class: com.google.android.gms.internal.ads.zzeti
                    @Override // com.google.android.gms.internal.ads.zzgpr
                    public final /* synthetic */ Object apply(Object obj) {
                        this.zza.zza.zzg((Exception) obj, "AppSetIdInfoSignal");
                        return new zzetl(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgym.zza(new zzetl(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 11;
    }
}
