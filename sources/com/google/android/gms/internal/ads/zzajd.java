package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzajd extends zzaee implements zzajk {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzajd(long j, long j2, int i2, int i3, boolean z2) {
        super(j, j2, i2, i3, false);
        this.zza = j2;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j != -1 ? j : -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final long zze(long j) {
        return zzd(j);
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final int zzg() {
        return this.zzb;
    }

    public final zzajd zzh(long j) {
        return new zzajd(j, this.zza, this.zzb, this.zzc, false);
    }
}
