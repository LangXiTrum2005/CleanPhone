package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzabs implements zzadj {
    final /* synthetic */ zzug zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzabw zzd;

    public zzabs(zzabw zzabwVar, zzug zzugVar, int i2, long j) {
        this.zza = zzugVar;
        this.zzb = i2;
        this.zzc = j;
        Objects.requireNonNull(zzabwVar);
        this.zzd = zzabwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadj
    public final void zza(long j) {
        this.zzd.zzay(this.zza, this.zzb, this.zzc, j);
    }

    @Override // com.google.android.gms.internal.ads.zzadj
    public final void zzb() {
        this.zzd.zzav(this.zza, this.zzb, this.zzc);
    }
}
