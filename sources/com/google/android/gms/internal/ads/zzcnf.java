package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcnf implements zzfei {
    final zzijp zza;
    final zzijp zzb;
    final zzijp zzc;
    final zzijp zzd;
    final zzijp zze;
    final zzijp zzf;
    private final Context zzg;
    private final com.google.android.gms.ads.internal.client.zzr zzh;
    private final String zzi;
    private final zzcmv zzj;

    public zzcnf(zzcmv zzcmvVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzj = zzcmvVar;
        this.zzg = context;
        this.zzh = zzrVar;
        this.zzi = str;
        zzijg zzijgVarZza = zzijh.zza(context);
        this.zza = zzijgVarZza;
        zzijg zzijgVarZza2 = zzijh.zza(zzrVar);
        this.zzb = zzijgVarZza2;
        zzijp zzijpVarZza = zzijf.zza(zzeqq.zza(zzcmvVar.zzl));
        this.zzc = zzijpVarZza;
        zzijp zzijpVarZza2 = zzijf.zza(zzeqv.zza());
        this.zzd = zzijpVarZza2;
        zzijp zzijpVarZza3 = zzijf.zza(zzdfs.zza());
        this.zze = zzijpVarZza3;
        this.zzf = zzijf.zza(zzfeg.zza(zzijgVarZza, zzcmvVar.zza, zzijgVarZza2, zzcmvVar.zzX, zzijpVarZza, zzijpVarZza2, zzfim.zza(), zzijpVarZza3));
    }

    @Override // com.google.android.gms.internal.ads.zzfei
    public final zzepu zza() {
        zzfef zzfefVar = (zzfef) this.zzf.zzb();
        zzeqp zzeqpVar = (zzeqp) this.zzc.zzb();
        zzcmv zzcmvVar = this.zzj;
        zzijp zzijpVar = zzcmvVar.zzl;
        return new zzepu(this.zzg, this.zzh, this.zzi, zzfefVar, zzeqpVar, zzcmg.zzd(zzcmvVar.zzI()), (zzdxe) zzijpVar.zzb());
    }
}
