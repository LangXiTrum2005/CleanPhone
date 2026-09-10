package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzelj implements zzejm {
    private final Context zza;
    private final zzdkz zzb;

    public zzelj(Context context, zzdkz zzdkzVar) {
        this.zza = context;
        this.zzb = zzdkzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final void zza(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir {
        try {
            zzbuy zzbuyVar = (zzbuy) zzejjVar.zzb;
            zzbuyVar.zzo(zzfhrVar.zzZ);
            zzbuyVar.zzj(zzfhrVar.zzU, zzfhrVar.zzv.toString(), zzficVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeli(this, zzejjVar, null), (zzbtf) zzejjVar.zzc);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e2);
            throw new zzfir(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final /* bridge */ /* synthetic */ Object zzb(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir, zzemv {
        zzele zzeleVar = new zzele(zzfhrVar, (zzbuy) zzejjVar.zzb, AdFormat.INTERSTITIAL);
        zzdjt zzdjtVarZzd = this.zzb.zzd(new zzcwa(zzficVar, zzfhrVar, zzejjVar.zza), new zzdjw(zzeleVar, null));
        zzeleVar.zzc(zzdjtVarZzd.zzd());
        ((zzekv) zzejjVar.zzc).zzc(zzdjtVarZzd.zzg());
        return zzdjtVarZzd.zzh();
    }
}
