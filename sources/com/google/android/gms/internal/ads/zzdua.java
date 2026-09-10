package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdua {
    private final Context zza;
    private final zzayq zzb;
    private final zzbhr zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbfj zzf;
    private final zzddl zzg;
    private final zzeif zzh;
    private final zzfio zzi;
    private final zzdxe zzj;
    private final zzckq zzk;

    public zzdua(zzcjh zzcjhVar, Context context, zzayq zzayqVar, zzbhr zzbhrVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbfj zzbfjVar, zzddl zzddlVar, zzeif zzeifVar, zzfio zzfioVar, zzdxe zzdxeVar, zzckq zzckqVar) {
        this.zza = context;
        this.zzb = zzayqVar;
        this.zzc = zzbhrVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbfjVar;
        this.zzg = zzddlVar;
        this.zzh = zzeifVar;
        this.zzi = zzfioVar;
        this.zzj = zzdxeVar;
        this.zzk = zzckqVar;
    }

    public final zzcir zza(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfhr zzfhrVar, zzfhu zzfhuVar) throws zzcjg {
        zzclb zzclbVarZza = zzclb.zza(zzrVar);
        String str = zzrVar.zza;
        zzdtp zzdtpVar = new zzdtp(this);
        zzayq zzayqVar = this.zzb;
        zzeif zzeifVar = this.zzh;
        zzcir zzcirVarZza = zzcjh.zza(this.zza, zzclbVarZza, str, false, false, zzayqVar, this.zzc, this.zzd, null, zzdtpVar, this.zze, this.zzf, zzfhrVar, zzfhuVar, zzeifVar, this.zzi, this.zzj);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpt)).booleanValue()) {
            this.zzk.zza(zzcirVarZza.zzD());
        }
        return zzcirVarZza;
    }

    public final /* synthetic */ zzddl zzb() {
        return this.zzg;
    }
}
