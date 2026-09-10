package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzim {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    public /* synthetic */ zzim(float f, float f2, long j, float f3, long j2, long j3, float f4, byte[] bArr) {
        this.zza = j2;
        this.zzb = j3;
    }

    private final void zzf() {
        long j;
        long j2 = this.zzc;
        if (j2 != -9223372036854775807L) {
            j = this.zzd;
            if (j == -9223372036854775807L) {
                long j3 = this.zzf;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.zzg;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.zze == j) {
            return;
        }
        this.zze = j;
        this.zzh = j;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    private static long zzg(long j, long j2, float f) {
        return (long) ((j2 * 9.999871E-4f) + (j * 0.999f));
    }

    public final void zza(zzaf zzafVar) {
        long j = zzafVar.zza;
        this.zzc = zzfj.zzq(-9223372036854775807L);
        this.zzf = zzfj.zzq(-9223372036854775807L);
        this.zzg = zzfj.zzq(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzf();
    }

    public final void zzb(long j) {
        this.zzd = j;
        zzf();
    }

    public final void zzc() {
        long j = this.zzh;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.zzb;
        this.zzh = j2;
        long j3 = this.zzg;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.zzh = j3;
        }
        this.zzl = -9223372036854775807L;
    }

    public final float zzd(long j, long j2) {
        float f;
        long jMax;
        if (this.zzc == -9223372036854775807L) {
            return 1.0f;
        }
        long j3 = j - j2;
        long j4 = this.zzm;
        if (j4 == -9223372036854775807L) {
            this.zzm = j3;
            this.zzn = 0L;
        } else {
            long jMax2 = Math.max(j3, zzg(j4, j3, 0.999f));
            this.zzm = jMax2;
            this.zzn = zzg(this.zzn, Math.abs(j3 - jMax2), 0.999f);
        }
        if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j5 = (this.zzn * 3) + this.zzm;
        if (this.zzh > j5) {
            float fZzq = zzfj.zzq(1000L);
            f = 1.0E-7f;
            long[] jArr = {j5, this.zze, this.zzh - (((long) (fZzq * (this.zzk - 1.0f))) + ((long) ((this.zzi - 1.0f) * fZzq)))};
            jMax = jArr[0];
            for (int i2 = 1; i2 < 3; i2++) {
                long j6 = jArr[i2];
                if (j6 > jMax) {
                    jMax = j6;
                }
            }
            this.zzh = jMax;
        } else {
            f = 1.0E-7f;
            long jMax3 = j - ((long) (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f));
            long j7 = this.zzh;
            String str = zzfj.zza;
            jMax = Math.max(j7, Math.min(jMax3, j5));
            this.zzh = jMax;
            long j8 = this.zzg;
            if (j8 != -9223372036854775807L && jMax > j8) {
                this.zzh = j8;
                jMax = j8;
            }
        }
        long j9 = j - jMax;
        if (Math.abs(j9) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.zzj, Math.min((j9 * f) + 1.0f, this.zzi));
        this.zzk = fMax;
        return fMax;
    }

    public final long zze() {
        return this.zzh;
    }
}
