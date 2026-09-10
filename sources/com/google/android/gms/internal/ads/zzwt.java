package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzwt extends zzzy {
    private final zzbg zza;

    public zzwt(zzzw zzzwVar, zzbg zzbgVar) {
        super(zzzwVar);
        this.zza = zzbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof zzwt)) {
            return this.zza.equals(((zzwt) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final int hashCode() {
        return this.zza.hashCode() + (super.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzzy, com.google.android.gms.internal.ads.zzaab
    public final zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzy, com.google.android.gms.internal.ads.zzaab
    public final zzv zzb(int i2) {
        return this.zza.zza(zzd().zzf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzzy, com.google.android.gms.internal.ads.zzzw
    public final zzv zzc() {
        return this.zza.zza(zzd().zzh());
    }
}
