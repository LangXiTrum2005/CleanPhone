package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcnq implements zzffy {
    final zzijp zza;
    final zzijp zzb;
    final zzijp zzc;
    final zzijp zzd;
    final zzijp zze;
    final zzijp zzf;
    final zzijp zzg;
    private final zzcmv zzh;

    public zzcnq(zzcmv zzcmvVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzh = zzcmvVar;
        zzijg zzijgVarZza = zzijh.zza(context);
        this.zza = zzijgVarZza;
        zzijg zzijgVarZza2 = zzijh.zza(zzrVar);
        this.zzb = zzijgVarZza2;
        zzijg zzijgVarZza3 = zzijh.zza(str);
        this.zzc = zzijgVarZza3;
        zzijp zzijpVar = zzcmvVar.zzl;
        zzijp zzijpVarZza = zzijf.zza(zzeqq.zza(zzijpVar));
        this.zzd = zzijpVarZza;
        zzijp zzijpVarZza2 = zzijf.zza(zzfgw.zza(zzcmvVar.zzbu));
        this.zze = zzijpVarZza2;
        zzijp zzijpVarZza3 = zzijf.zza(zzffw.zza(zzijgVarZza, zzcmvVar.zza, zzcmvVar.zzX, zzijpVarZza, zzijpVarZza2, zzfim.zza()));
        this.zzf = zzijpVarZza3;
        this.zzg = zzijf.zza(zzeqy.zza(zzijgVarZza, zzijgVarZza2, zzijgVarZza3, zzijpVarZza3, zzijpVarZza, zzijpVarZza2, zzcmvVar.zzi, zzcmvVar.zzaa, zzijpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzffy
    public final zzeqx zza() {
        return (zzeqx) this.zzg.zzb();
    }
}
