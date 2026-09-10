package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcnl implements zzdyw {
    final zzijp zza;
    final zzijp zzb;
    final zzijp zzc;
    final zzijp zzd;
    private final Context zze;
    private final zzbon zzf;
    private final zzcmv zzg;
    private final zzcnl zzh = this;

    public zzcnl(zzcmv zzcmvVar, Context context, zzbon zzbonVar) {
        this.zzg = zzcmvVar;
        this.zze = context;
        this.zzf = zzbonVar;
        zzijg zzijgVarZza = zzijh.zza(this);
        this.zza = zzijgVarZza;
        zzijg zzijgVarZza2 = zzijh.zza(zzbonVar);
        this.zzb = zzijgVarZza2;
        zzdys zzdysVarZzc = zzdys.zzc(zzijgVarZza2);
        this.zzc = zzdysVarZzc;
        this.zzd = zzijf.zza(zzdyu.zza(zzijgVarZza, zzdysVarZzc));
    }

    public final zzdyr zza() {
        return zzdys.zzd(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdyw
    public final zzdyt zzb() {
        return (zzdyt) this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdyw
    public final zzdyo zzc() {
        return new zzcni(this.zzg, this.zzh, null);
    }

    public final /* synthetic */ Context zzd() {
        return this.zze;
    }
}
