package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public class zzaee implements zzafr {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzaee(long j, long j2, int i2, int i3, boolean z2) {
        long jZze;
        this.zza = j;
        this.zzb = j2;
        this.zzc = i3 == -1 ? 1 : i3;
        this.zze = i2;
        if (j == -1) {
            this.zzd = -1L;
            jZze = -9223372036854775807L;
        } else {
            this.zzd = j - j2;
            jZze = zze(j, j2, i2);
        }
        this.zzf = jZze;
    }

    private static long zze(long j, long j2, int i2) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i2);
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zzb() {
        return this.zzd != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final zzafp zzc(long j) {
        long j2 = this.zzd;
        if (j2 == -1) {
            zzafs zzafsVar = new zzafs(0L, this.zzb);
            return new zzafp(zzafsVar, zzafsVar);
        }
        long j3 = ((long) this.zze) * j;
        long j4 = this.zzc;
        long jMin = ((j3 / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZzd = zzd(jMax);
        zzafs zzafsVar2 = new zzafs(jZzd, jMax);
        if (j2 != -1 && jZzd < j) {
            long j5 = jMax + j4;
            if (j5 < this.zza) {
                return new zzafp(zzafsVar2, new zzafs(zzd(j5), j5));
            }
        }
        return new zzafp(zzafsVar2, zzafsVar2);
    }

    public final long zzd(long j) {
        return zze(j, this.zzb, this.zze);
    }
}
