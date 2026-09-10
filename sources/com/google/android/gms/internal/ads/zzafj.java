package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzafj implements zzafr {
    private final zzef zza;
    private final zzef zzb;
    private long zzc;

    public zzafj(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzgqa.zza(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzef(length2);
            this.zzb = new zzef(length2);
        } else {
            int i2 = length2 + 1;
            zzef zzefVar = new zzef(i2);
            this.zza = zzefVar;
            zzef zzefVar2 = new zzef(i2);
            this.zzb = zzefVar2;
            zzefVar.zza(0L);
            zzefVar2.zza(0L);
        }
        this.zza.zzb(jArr);
        this.zzb.zzb(jArr2);
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zzb() {
        return this.zzb.zzd() > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final zzafp zzc(long j) {
        zzef zzefVar = this.zzb;
        if (zzefVar.zzd() == 0) {
            zzafs zzafsVar = zzafs.zza;
            return new zzafp(zzafsVar, zzafsVar);
        }
        int iZzn = zzfj.zzn(zzefVar, j, true, true);
        long jZzc = zzefVar.zzc(iZzn);
        zzef zzefVar2 = this.zza;
        zzafs zzafsVar2 = new zzafs(jZzc, zzefVar2.zzc(iZzn));
        if (zzafsVar2.zzb == j || iZzn == zzefVar.zzd() - 1) {
            return new zzafp(zzafsVar2, zzafsVar2);
        }
        int i2 = iZzn + 1;
        return new zzafp(zzafsVar2, new zzafs(zzefVar.zzc(i2), zzefVar2.zzc(i2)));
    }
}
