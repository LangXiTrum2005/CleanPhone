package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzfkx {
    private final long zza;
    private long zzc;
    private final zzfkw zzb = new zzfkw();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfkx() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zza = jCurrentTimeMillis;
        this.zzc = jCurrentTimeMillis;
    }

    public final void zza() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
        this.zzb.zza = true;
    }

    public final void zzc() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final long zzd() {
        return this.zza;
    }

    public final long zze() {
        return this.zzc;
    }

    public final int zzf() {
        return this.zzd;
    }

    public final zzfkw zzg() {
        zzfkw zzfkwVar = this.zzb;
        zzfkw zzfkwVarClone = zzfkwVar.clone();
        zzfkwVar.zza = false;
        zzfkwVar.zzb = 0;
        return zzfkwVarClone;
    }

    public final String zzh() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }
}
