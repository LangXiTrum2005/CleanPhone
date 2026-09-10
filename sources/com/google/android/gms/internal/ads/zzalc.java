package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzalc implements zzali {
    private final zzafb zza;
    private final zzafa zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzalc(zzafb zzafbVar, zzafa zzafaVar) {
        this.zza = zzafbVar;
        this.zzb = zzafaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final long zza(zzaep zzaepVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final void zzb(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzfj.zzm(jArr, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final zzafr zzc() {
        zzgqa.zzi(this.zzc != -1);
        return new zzaez(this.zza, this.zzc);
    }

    public final void zzd(long j) {
        this.zzc = j;
    }
}
