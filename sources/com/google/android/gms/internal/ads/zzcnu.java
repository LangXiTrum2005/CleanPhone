package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzcnu implements zzefe {
    private final zzedk zza;
    private final zzcmv zzb;

    public zzcnu(zzcmv zzcmvVar, zzcns zzcnsVar, zzedk zzedkVar) {
        this.zzb = zzcmvVar;
        this.zza = zzedkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefe
    public final zzedl zza() {
        zzcmv zzcmvVar = this.zzb;
        return zzedm.zza(zzclp.zzd(zzcmvVar.zzI()), zzcmg.zzd(zzcmvVar.zzI()), this.zza, zzbye.zza());
    }
}
