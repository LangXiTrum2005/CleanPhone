package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzehh implements zzedc {
    private final Context zza;
    private final zzdof zzb;

    public zzehh(Context context, zzdof zzdofVar) {
        this.zza = context;
        this.zzb = zzdofVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar) throws zzfcq, zzegu {
        zzefb zzefbVar = new zzefb(zzfboVar, (zzbrd) zzeczVar.zzb, AdFormat.REWARDED);
        zzdob zzdobVarZze = this.zzb.zze(new zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza), new zzdoc(zzefbVar));
        zzefbVar.zzb(zzdobVarZze.zzc());
        ((zzees) zzeczVar.zzc).zzc(zzdobVarZze.zzo());
        return zzdobVarZze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar) throws zzfcq {
        try {
            ((zzbrd) zzeczVar.zzb).zzq(zzfboVar.zzZ);
            if (zzfcaVar.zza.zza.zzo.zza == 3) {
                ((zzbrd) zzeczVar.zzb).zzo(zzfboVar.zzU, zzfboVar.zzv.toString(), zzfcaVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehf(this, zzeczVar, null), (zzbpk) zzeczVar.zzc);
            } else {
                ((zzbrd) zzeczVar.zzb).zzp(zzfboVar.zzU, zzfboVar.zzv.toString(), zzfcaVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehf(this, zzeczVar, null), (zzbpk) zzeczVar.zzc);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
