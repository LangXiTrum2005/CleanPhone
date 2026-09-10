package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcnw implements zzfhl {
    final zzijp zza;
    final zzijp zzb;
    final zzijp zzc;
    final zzijp zzd;
    final zzijp zze;
    final zzijp zzf;
    final zzijp zzg;
    final zzijp zzh;
    private final zzcmv zzi;

    public zzcnw(zzcmv zzcmvVar, Context context, String str) {
        this.zzi = zzcmvVar;
        zzijg zzijgVarZza = zzijh.zza(context);
        this.zza = zzijgVarZza;
        zzijp zzijpVar = zzcmvVar.zzbu;
        zzffm zzffmVarZzc = zzffm.zzc(zzijgVarZza, zzijpVar, zzcmvVar.zzbv);
        this.zzb = zzffmVarZzc;
        zzijp zzijpVarZza = zzijf.zza(zzfgw.zza(zzijpVar));
        this.zzc = zzijpVarZza;
        zzijp zzijpVarZza2 = zzijf.zza(zzfii.zza());
        this.zzd = zzijpVarZza2;
        zzijp zzijpVarZza3 = zzijf.zza(zzfhf.zza(zzijgVarZza, zzcmvVar.zza, zzcmvVar.zzX, zzffmVarZzc, zzijpVarZza, zzfim.zza(), zzijpVarZza2));
        this.zze = zzijpVarZza3;
        this.zzf = zzijf.zza(zzfhp.zza(zzijpVarZza3, zzijpVarZza, zzijpVarZza2));
        zzijg zzijgVarZzc = zzijh.zzc(str);
        this.zzg = zzijgVarZzc;
        this.zzh = zzijf.zza(zzfhj.zza(zzijgVarZzc, zzijpVarZza3, zzijgVarZza, zzijpVarZza, zzijpVarZza2, zzcmvVar.zzi, zzcmvVar.zzaa, zzcmvVar.zzl));
    }

    @Override // com.google.android.gms.internal.ads.zzfhl
    public final zzfho zza() {
        return (zzfho) this.zzf.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfhl
    public final zzfhi zzb() {
        return (zzfhi) this.zzh.zzb();
    }
}
