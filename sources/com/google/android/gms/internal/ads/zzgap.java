package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgap implements zzgdl {
    final zzijp zza;
    final zzijp zzb;
    final zzijp zzc;
    final zzijp zzd;
    final zzijp zze;
    private final zzgaj zzf;
    private final zzgap zzg = this;

    public zzgap(zzgaj zzgajVar) {
        this.zzf = zzgajVar;
        zzijp zzijpVarZza = zzijf.zza(zzgdo.zza());
        this.zza = zzijpVarZza;
        zzijp zzijpVarZza2 = zzijf.zza(zzgey.zza(zzgajVar.zza, zzgajVar.zzc, zzgajVar.zzG, zzijpVarZza, zzgajVar.zzJ, zzgajVar.zzu, zzgajVar.zzj, zzgfb.zza()));
        this.zzb = zzijpVarZza2;
        zzijp zzijpVarZza3 = zzijf.zza(zzgdt.zza());
        this.zzc = zzijpVarZza3;
        zzgao zzgaoVar = new zzgao(this);
        this.zzd = zzgaoVar;
        this.zze = zzijf.zza(zzgdm.zza(zzgajVar.zzc, zzijpVarZza2, zzgajVar.zzG, zzgajVar.zzF, zzijpVarZza3, zzgaoVar, zzgajVar.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzgdl
    public final zzgct zza() {
        return (zzgct) this.zze.zzb();
    }

    public final /* synthetic */ zzgaj zzb() {
        return this.zzf;
    }

    public final /* synthetic */ zzgap zzc() {
        return this.zzg;
    }
}
