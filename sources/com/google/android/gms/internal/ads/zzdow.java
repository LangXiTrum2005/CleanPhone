package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdow {
    private final Context zza;
    private final zzava zzb;
    private final zzbds zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbbj zzf;
    private final zzcyl zzg;
    private final zzebv zzh;
    private final zzfcn zzi;

    public zzdow(zzcfk zzcfkVar, Context context, zzava zzavaVar, zzbds zzbdsVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbbj zzbbjVar, zzcyl zzcylVar, zzebv zzebvVar, zzfcn zzfcnVar) {
        this.zza = context;
        this.zzb = zzavaVar;
        this.zzc = zzbdsVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbbjVar;
        this.zzg = zzcylVar;
        this.zzh = zzebvVar;
        this.zzi = zzfcnVar;
    }

    public final zzcex zza(com.google.android.gms.ads.internal.client.zzs zzsVar, zzfbo zzfboVar, zzfbr zzfbrVar) throws zzcfj {
        zzcgr zzcgrVarZzc = zzcgr.zzc(zzsVar);
        String str = zzsVar.zza;
        zzdol zzdolVar = new zzdol(this);
        zzebv zzebvVar = this.zzh;
        zzfcn zzfcnVar = this.zzi;
        com.google.android.gms.ads.internal.zza zzaVar = this.zze;
        zzbbj zzbbjVar = this.zzf;
        return zzcfk.zza(this.zza, zzcgrVarZzc, str, false, false, this.zzb, this.zzc, this.zzd, null, zzdolVar, zzaVar, zzbbjVar, zzfboVar, zzfbrVar, zzebvVar, zzfcnVar);
    }
}
