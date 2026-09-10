package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaez implements zzafr {
    private final zzafb zza;
    private final long zzb;

    public zzaez(zzafb zzafbVar, long j) {
        this.zza = zzafbVar;
        this.zzb = j;
    }

    private final zzafs zzd(long j, long j2) {
        return new zzafs((j * 1000000) / ((long) this.zza.zze), this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final zzafp zzc(long j) {
        zzafb zzafbVar = this.zza;
        zzafa zzafaVar = zzafbVar.zzk;
        zzafaVar.getClass();
        long jZzb = zzafbVar.zzb(j);
        long[] jArr = zzafaVar.zza;
        int iZzm = zzfj.zzm(jArr, jZzb, true, false);
        long j2 = iZzm == -1 ? 0L : jArr[iZzm];
        long[] jArr2 = zzafaVar.zzb;
        zzafs zzafsVarZzd = zzd(j2, iZzm != -1 ? jArr2[iZzm] : 0L);
        if (zzafsVarZzd.zzb == j || iZzm == jArr.length - 1) {
            return new zzafp(zzafsVarZzd, zzafsVarZzd);
        }
        int i2 = iZzm + 1;
        return new zzafp(zzafsVarZzd, zzd(jArr[i2], jArr2[i2]));
    }
}
