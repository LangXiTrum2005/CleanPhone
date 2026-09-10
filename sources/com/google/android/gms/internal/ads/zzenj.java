package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public class zzenj extends zzeok {
    private final zzdja zza;

    public zzenj(zzdai zzdaiVar, zzdip zzdipVar, zzdbc zzdbcVar, zzdbr zzdbrVar, zzdbw zzdbwVar, zzdax zzdaxVar, zzdfo zzdfoVar, zzdjn zzdjnVar, zzdcv zzdcvVar, zzdja zzdjaVar, zzdfk zzdfkVar) {
        super(zzdaiVar, zzdipVar, zzdbcVar, zzdbrVar, zzdbwVar, zzdfoVar, zzdcvVar, zzdjnVar, zzdfkVar, zzdaxVar);
        this.zza = zzdjaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeok, com.google.android.gms.internal.ads.zzbtf
    public final void zzn() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzeok, com.google.android.gms.internal.ads.zzbtf
    public final void zzo() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeok, com.google.android.gms.internal.ads.zzbtf
    public final void zzp(zzbzy zzbzyVar) {
        this.zza.zzb(zzbzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeok, com.google.android.gms.internal.ads.zzbtf
    public final void zzr(zzcac zzcacVar) throws RemoteException {
        this.zza.zzb(new zzbzy(zzcacVar.zze(), zzcacVar.zzf()));
    }

    @Override // com.google.android.gms.internal.ads.zzeok, com.google.android.gms.internal.ads.zzbtf
    public final void zzt() throws RemoteException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzeok, com.google.android.gms.internal.ads.zzbtf
    public final void zzz() throws RemoteException {
        this.zza.zzb(null);
    }
}
