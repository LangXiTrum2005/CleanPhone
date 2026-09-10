package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzenz implements zzejm {
    private final Context zza;
    private final Executor zzb;
    private final zzdtj zzc;

    public zzenz(Context context, Executor executor, zzdtj zzdtjVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdtjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) {
        try {
            ((zzfji) zzejjVar.zzb).zzl(zzficVar.zza.zza.zzd, zzfhrVar.zzv.toString());
        } catch (Exception e2) {
            String str = zzejjVar.zza;
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final void zza(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir {
        zzfji zzfjiVar = (zzfji) zzejjVar.zzb;
        if (zzfjiVar.zzn()) {
            zze(zzficVar, zzfhrVar, zzejjVar);
            return;
        }
        zzenw zzenwVar = new zzenw(this, zzficVar, zzfhrVar, zzejjVar);
        zzdbu zzdbuVar = zzejjVar.zzc;
        ((zzekw) zzdbuVar).zzd(zzenwVar);
        Context context = this.zza;
        zzfik zzfikVar = zzficVar.zza.zza;
        String string = zzfhrVar.zzv.toString();
        zzfjiVar.zzk(context, zzfikVar.zzd, null, (zzbzx) zzdbuVar, string);
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final /* bridge */ /* synthetic */ Object zzb(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir, zzemv {
        zzdtf zzdtfVarZzf = this.zzc.zzf(new zzcwa(zzficVar, zzfhrVar, zzejjVar.zza), new zzdtg(new zzenx(this, zzejjVar, zzfhrVar)));
        zzdtfVarZzf.zza().zzq(new zzcqq((zzfji) zzejjVar.zzb), this.zzb);
        zzdbr zzdbrVarZzb = zzdtfVarZzf.zzb();
        zzdai zzdaiVarZzc = zzdtfVarZzf.zzc();
        ((zzekw) zzejjVar.zzc).zzc(new zzeny(this, zzdtfVarZzf.zzi(), zzdaiVarZzc, zzdbrVarZzb, zzdtfVarZzf.zzk()));
        return zzdtfVarZzf.zzh();
    }

    public final /* synthetic */ Executor zzc() {
        return this.zzb;
    }
}
