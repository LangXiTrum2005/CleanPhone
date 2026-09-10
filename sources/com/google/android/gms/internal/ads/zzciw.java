package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzciw implements zzdsz {
    private final Long zza;
    private final String zzb;
    private final zzcih zzc;
    private final zzciy zzd;

    public /* synthetic */ zzciw(zzcih zzcihVar, zzciy zzciyVar, Long l, String str, zzcjm zzcjmVar) {
        this.zzc = zzcihVar;
        this.zzd = zzciyVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdsz
    public final zzdtj zza() {
        zzciy zzciyVar = this.zzd;
        return zzdtk.zza(this.zza.longValue(), zzciyVar.zza, zzdtd.zzc(zzciyVar.zzb), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdsz
    public final zzdtn zzb() {
        zzciy zzciyVar = this.zzd;
        return zzdto.zza(this.zza.longValue(), zzciyVar.zza, zzdtd.zzc(zzciyVar.zzb), this.zzc, this.zzb);
    }
}
