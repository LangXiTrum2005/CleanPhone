package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcns implements zzeex {
    final zzijp zza;
    final zzijp zzb;
    private final zzcmv zzc;
    private final zzcns zzd = this;

    public zzcns(zzcmv zzcmvVar, Context context) {
        this.zzc = zzcmvVar;
        zzegf zzegfVarZzc = zzegf.zzc(zzcmvVar.zzay);
        this.zza = zzegfVarZzc;
        this.zzb = zzefx.zza(zzcmvVar.zzf, zzflk.zza(), zzcmp.zza, zzcmvVar.zzax, zzegfVarZzc, zzcmvVar.zzaz, zzcmm.zza, zzcmvVar.zzC);
    }

    @Override // com.google.android.gms.internal.ads.zzeex
    public final zzefb zza() {
        zzcmv zzcmvVar = this.zzc;
        zzijp zzijpVar = zzcmvVar.zzl;
        zzcli zzcliVarZzI = zzcmvVar.zzI();
        return zzefc.zza(zzclp.zzd(zzcmvVar.zzI()), zzflq.zzc(), zzflk.zzc(), zzijf.zzc(this.zzb), zzcmg.zzd(zzcliVarZzI), this, (zzdxe) zzijpVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzeex
    public final zzefd zzb() {
        return new zzcnt(this.zzc, this.zzd, null);
    }
}
