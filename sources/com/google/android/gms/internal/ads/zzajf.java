package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes4.dex */
final class zzajf implements zzajk {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzajf(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzfj.zzq(jArr2[jArr2.length - 1]) : j;
    }

    public static zzajf zzd(long j, zzaij zzaijVar, long j2) {
        int[] iArr = zzaijVar.zzd;
        int length = iArr.length;
        int i2 = length + 1;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i3 = 1; i3 <= length; i3++) {
            int i4 = i3 - 1;
            j += (long) (zzaijVar.zzb + iArr[i4]);
            j3 += (long) (zzaijVar.zzc + zzaijVar.zze[i4]);
            jArr[i3] = j;
            jArr2[i3] = j3;
        }
        return new zzajf(jArr, jArr2, j2);
    }

    private static Pair zzh(long j, long[] jArr, long[] jArr2) {
        int iZzm = zzfj.zzm(jArr, j, true, true);
        long j2 = jArr[iZzm];
        long j3 = jArr2[iZzm];
        int i2 = iZzm + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i2];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i2] - j3))) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final zzafp zzc(long j) {
        String str = zzfj.zza;
        Pair pairZzh = zzh(zzfj.zzp(Math.max(0L, Math.min(j, this.zzc))), this.zzb, this.zza);
        zzafs zzafsVar = new zzafs(zzfj.zzq(((Long) pairZzh.first).longValue()), ((Long) pairZzh.second).longValue());
        return new zzafp(zzafsVar, zzafsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final long zze(long j) {
        return zzfj.zzq(((Long) zzh(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final long zzf() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final int zzg() {
        return -2147483647;
    }
}
