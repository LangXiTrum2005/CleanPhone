package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public class zzzy implements zzzw {
    private final zzzw zza;

    public zzzy(zzzw zzzwVar) {
        this.zza = zzzwVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzzy) {
            return this.zza.equals(((zzzy) obj).zza);
        }
        return false;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public zzbg zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public zzv zzb(int i2) {
        return this.zza.zzb(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public zzv zzc() {
        return this.zza.zzc();
    }

    public final zzzw zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final int zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final int zzf(int i2) {
        return this.zza.zzf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final int zzg(int i2) {
        return this.zza.zzg(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final int zzh() {
        return this.zza.zzh();
    }
}
