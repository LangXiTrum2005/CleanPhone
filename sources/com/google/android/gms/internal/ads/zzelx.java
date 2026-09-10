package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzelx implements zzejm {
    private final Context zza;
    private final zzdlv zzb;
    private zzbto zzc;
    private final VersionInfoParcel zzd;

    public zzelx(Context context, zzdlv zzdlvVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdlvVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final void zza(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir {
        try {
            zzbuy zzbuyVar = (zzbuy) zzejjVar.zzb;
            zzbuyVar.zzo(zzfhrVar.zzZ);
            if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcl)).intValue()) {
                zzbuyVar.zzn(zzfhrVar.zzU, zzfhrVar.zzv.toString(), zzficVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzelw(this, zzejjVar, null), (zzbtf) zzejjVar.zzc);
                return;
            }
            String str = zzfhrVar.zzU;
            String string = zzfhrVar.zzv.toString();
            zzfik zzfikVar = zzficVar.zza.zza;
            zzbuyVar.zzr(str, string, zzfikVar.zzd, ObjectWrapper.wrap(this.zza), new zzelw(this, zzejjVar, null), (zzbtf) zzejjVar.zzc, zzfikVar.zzj);
        } catch (RemoteException e2) {
            throw new zzfir(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejm
    public final /* bridge */ /* synthetic */ Object zzb(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir, zzemv {
        ArrayList arrayList = zzficVar.zza.zza.zzh;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new zzemv(2, "Unified must be used for RTB.");
        }
        zzdnm zzdnmVarZzaf = zzdnm.zzaf(this.zzc);
        if (!arrayList.contains(Integer.toString(zzdnmVarZzaf.zzx()))) {
            throw new zzemv(1, "No corresponding native ad listener");
        }
        zzdno zzdnoVarZze = this.zzb.zze(new zzcwa(zzficVar, zzfhrVar, zzejjVar.zza), new zzdnx(zzdnmVarZzaf), new zzdpq(null, null, this.zzc));
        ((zzekv) zzejjVar.zzc).zzc(zzdnoVarZze.zzg());
        return zzdnoVarZze.zzh();
    }

    public final /* synthetic */ void zzc(zzbto zzbtoVar) {
        this.zzc = zzbtoVar;
    }
}
