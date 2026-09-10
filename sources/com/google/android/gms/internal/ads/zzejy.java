package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzejy implements zzejm {
    private final Context zza;
    private final zzcsq zzb;

    public zzejy(Context context, zzcsq zzcsqVar) {
        this.zza = context;
        this.zzb = zzcsqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final void zza(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir {
        try {
            zzbuy zzbuyVar = (zzbuy) zzejjVar.zzb;
            zzbuyVar.zzo(zzfhrVar.zzZ);
            zzbuyVar.zzs(zzfhrVar.zzU, zzfhrVar.zzv.toString(), zzficVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzejx(zzejjVar, null), (zzbtf) zzejjVar.zzc);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e2);
            throw new zzfir(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final /* bridge */ /* synthetic */ Object zzb(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir, zzemv {
        zzele zzeleVar = new zzele(zzfhrVar, (zzbuy) zzejjVar.zzb, AdFormat.APP_OPEN_AD);
        zzcsn zzcsnVarZzf = this.zzb.zzf(new zzcwa(zzficVar, zzfhrVar, zzejjVar.zza), new zzdjw(zzeleVar, null), new zzcso(zzfhrVar.zzaa));
        zzeleVar.zzc(zzcsnVarZzf.zzd());
        ((zzekv) zzejjVar.zzc).zzc(zzcsnVarZzf.zzg());
        return zzcsnVarZzf.zzh();
    }
}
