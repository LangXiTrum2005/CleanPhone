package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zziao implements zziaf {
    final int zza;
    final zzids zzb;
    final boolean zzc;
    final boolean zzd;

    public zziao(zziaw zziawVar, int i2, zzids zzidsVar, boolean z2, boolean z3) {
        this.zza = i2;
        this.zzb = zzidsVar;
        this.zzc = z2;
        this.zzd = z3;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zziao) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zziaf
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zziaf
    public final zzids zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zziaf
    public final zzidt zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zziaf
    public final boolean zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziaf
    public final boolean zze() {
        return this.zzd;
    }
}
