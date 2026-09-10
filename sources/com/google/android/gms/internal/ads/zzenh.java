package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzenh implements zzejm {
    private final Context zza;
    private final zzdtj zzb;

    public zzenh(Context context, zzdtj zzdtjVar) {
        this.zza = context;
        this.zzb = zzdtjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final void zza(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir {
        try {
            zzbuy zzbuyVar = (zzbuy) zzejjVar.zzb;
            zzbuyVar.zzo(zzfhrVar.zzZ);
            zzfik zzfikVar = zzficVar.zza.zza;
            if (zzfikVar.zzp.zza == 3) {
                zzbuyVar.zzp(zzfhrVar.zzU, zzfhrVar.zzv.toString(), zzfikVar.zzd, ObjectWrapper.wrap(this.zza), new zzeng(this, zzejjVar, null), (zzbtf) zzejjVar.zzc);
            } else {
                zzbuyVar.zzl(zzfhrVar.zzU, zzfhrVar.zzv.toString(), zzfikVar.zzd, ObjectWrapper.wrap(this.zza), new zzeng(this, zzejjVar, null), (zzbtf) zzejjVar.zzc);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final /* bridge */ /* synthetic */ Object zzb(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir, zzemv {
        zzele zzeleVar = new zzele(zzfhrVar, (zzbuy) zzejjVar.zzb, AdFormat.REWARDED);
        zzdtf zzdtfVarZzf = this.zzb.zzf(new zzcwa(zzficVar, zzfhrVar, zzejjVar.zza), new zzdtg(zzeleVar));
        zzeleVar.zzc(zzdtfVarZzf.zzd());
        ((zzekv) zzejjVar.zzc).zzc(zzdtfVarZzf.zzn());
        return zzdtfVarZzf.zzh();
    }
}
