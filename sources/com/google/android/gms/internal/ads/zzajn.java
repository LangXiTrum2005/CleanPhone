package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzajn implements zzajk {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzajn(long j, int i2, long j2, int i3, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i2;
        this.zzc = j2;
        this.zzd = i3;
        this.zze = j3;
        this.zzg = jArr;
        this.zzf = j3 != -1 ? j + j3 : -1L;
    }

    public static zzajn zzd(zzajm zzajmVar, long j) {
        long jZzb = zzajmVar.zzb();
        if (jZzb == -9223372036854775807L) {
            return null;
        }
        zzafk zzafkVar = zzajmVar.zza;
        return new zzajn(j, zzafkVar.zzc, jZzb, zzafkVar.zzf, zzajmVar.zzc, zzajmVar.zzf);
    }

    private final long zzh(int i2) {
        return (this.zzc * ((long) i2)) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zzb() {
        return this.zzg != null;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final zzafp zzc(long j) {
        if (!zzb()) {
            zzafs zzafsVar = new zzafs(0L, this.zza + ((long) this.zzb));
            return new zzafp(zzafsVar, zzafsVar);
        }
        long j2 = this.zzc;
        String str = zzfj.zza;
        long jMax = Math.max(0L, Math.min(j, j2));
        double d = (jMax * 100.0d) / j2;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i2 = (int) d;
                long[] jArr = this.zzg;
                jArr.getClass();
                double d3 = jArr[i2];
                d2 = (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d3) * (d - ((double) i2))) + d3;
            }
        }
        long j3 = this.zze;
        zzafs zzafsVar2 = new zzafs(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d2 / 256.0d) * j3), j3 - 1)));
        return new zzafp(zzafsVar2, zzafsVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final long zze(long j) {
        if (!zzb()) {
            return 0L;
        }
        long j2 = j - this.zza;
        if (j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.zze;
        int iZzm = zzfj.zzm(jArr, (long) d, true, true);
        long jZzh = zzh(iZzm);
        long j3 = jArr[iZzm];
        int i2 = iZzm + 1;
        long jZzh2 = zzh(i2);
        long j4 = iZzm == 99 ? 256L : jArr[i2];
        return Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (jZzh2 - jZzh)) + jZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final long zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final int zzg() {
        return this.zzd;
    }
}
