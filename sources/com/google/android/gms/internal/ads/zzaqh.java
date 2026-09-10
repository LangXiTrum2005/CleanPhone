package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
final class zzaqh implements zzafr {
    private final zzaqe zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaqh(zzaqe zzaqeVar, int i2, long j, long j2) {
        this.zza = zzaqeVar;
        this.zzb = i2;
        this.zzc = j;
        long j3 = (j2 - j) / ((long) zzaqeVar.zzd);
        this.zzd = j3;
        this.zze = zzd(j3);
    }

    private final long zzd(long j) {
        return zzfj.zzt(j * ((long) this.zzb), 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final zzafp zzc(long j) {
        long j2 = this.zzb;
        zzaqe zzaqeVar = this.zza;
        long j3 = (((long) zzaqeVar.zzc) * j) / (j2 * 1000000);
        String str = zzfj.zza;
        long j4 = this.zzd - 1;
        long jMax = Math.max(0L, Math.min(j3, j4));
        long j5 = zzaqeVar.zzd;
        long jZzd = zzd(jMax);
        long j6 = this.zzc;
        zzafs zzafsVar = new zzafs(jZzd, (jMax * j5) + j6);
        if (jZzd >= j || jMax == j4) {
            return new zzafp(zzafsVar, zzafsVar);
        }
        long j7 = jMax + 1;
        return new zzafp(zzafsVar, new zzafs(zzd(j7), (j5 * j7) + j6));
    }
}
