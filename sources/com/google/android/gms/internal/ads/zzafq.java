package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public class zzafq implements zzafr {
    private final long zza;
    private final zzafp zzb;

    public zzafq(long j, long j2) {
        this.zza = j;
        zzafs zzafsVar = j2 == 0 ? zzafs.zza : new zzafs(0L, j2);
        this.zzb = new zzafp(zzafsVar, zzafsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final zzafp zzc(long j) {
        return this.zzb;
    }
}
