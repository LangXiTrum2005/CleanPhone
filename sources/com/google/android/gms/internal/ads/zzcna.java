package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcna implements zzfcv {
    final zzijp zza;
    final zzijp zzb;
    final zzijp zzc;
    final zzijp zzd;
    final zzijp zze;
    final zzijp zzf;
    private final zzcmv zzg;

    public zzcna(zzcmv zzcmvVar, Context context, String str) {
        this.zzg = zzcmvVar;
        zzijg zzijgVarZza = zzijh.zza(context);
        this.zza = zzijgVarZza;
        zzijg zzijgVarZza2 = zzijh.zza(str);
        this.zzb = zzijgVarZza2;
        zzijp zzijpVar = zzcmvVar.zzbu;
        zzffl zzfflVarZzc = zzffl.zzc(zzijgVarZza, zzijpVar, zzcmvVar.zzbv);
        this.zzc = zzfflVarZzc;
        zzijp zzijpVarZza = zzijf.zza(zzfds.zza(zzijpVar));
        this.zzd = zzijpVarZza;
        zzijp zzijpVar2 = zzcmvVar.zza;
        zzijp zzijpVar3 = zzcmvVar.zzX;
        zzfim zzfimVarZza = zzfim.zza();
        zzijp zzijpVar4 = zzcmvVar.zzi;
        zzijp zzijpVarZza2 = zzijf.zza(zzfdu.zza(zzijgVarZza, zzijpVar2, zzijpVar3, zzfflVarZzc, zzijpVarZza, zzfimVarZza, zzijpVar4));
        this.zze = zzijpVarZza2;
        this.zzf = zzijf.zza(zzfea.zza(zzijpVar3, zzijgVarZza, zzijgVarZza2, zzijpVarZza2, zzijpVarZza, zzijpVar4, zzcmvVar.zzl));
    }

    @Override // com.google.android.gms.internal.ads.zzfcv
    public final zzfdz zza() {
        return (zzfdz) this.zzf.zzb();
    }
}
