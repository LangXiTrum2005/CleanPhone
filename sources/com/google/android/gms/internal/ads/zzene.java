package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzene implements zzejm {
    private final Context zza;
    private final Executor zzb;
    private final zzdtj zzc;

    public zzene(Context context, Executor executor, zzdtj zzdtjVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdtjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final void zza(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir {
        try {
            zzfik zzfikVar = zzficVar.zza.zza;
            if (zzfikVar.zzp.zza == 3) {
                ((zzfji) zzejjVar.zzb).zzx(this.zza, zzfikVar.zzd, zzfhrVar.zzv.toString(), (zzbtf) zzejjVar.zzc);
            } else {
                ((zzfji) zzejjVar.zzb).zzv(this.zza, zzfikVar.zzd, zzfhrVar.zzv.toString(), (zzbtf) zzejjVar.zzc);
            }
        } catch (Exception e2) {
            String str = zzejjVar.zza;
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final /* bridge */ /* synthetic */ Object zzb(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir, zzemv {
        zzdtf zzdtfVarZzf = this.zzc.zzf(new zzcwa(zzficVar, zzfhrVar, zzejjVar.zza), new zzdtg(new zzend(this, zzejjVar, zzfhrVar)));
        zzdtfVarZzf.zza().zzq(new zzcqq((zzfji) zzejjVar.zzb), this.zzb);
        ((zzekv) zzejjVar.zzc).zzc(zzdtfVarZzf.zzm());
        return zzdtfVarZzf.zzh();
    }
}
