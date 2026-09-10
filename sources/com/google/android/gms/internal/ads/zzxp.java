package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes4.dex */
final class zzxp implements zzaag {
    public long zza;
    public long zzb;
    public zzaaf zzc;
    public zzxp zzd;

    public zzxp(long j, int i2) {
        zza(j, 65536);
    }

    public final void zza(long j, int i2) {
        zzgqa.zzi(this.zzc == null);
        this.zza = j;
        this.zzb = j + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }

    public final int zzb(long j) {
        long j2 = j - this.zza;
        int i2 = this.zzc.zzb;
        return (int) j2;
    }

    public final zzxp zzc() {
        this.zzc = null;
        zzxp zzxpVar = this.zzd;
        this.zzd = null;
        return zzxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaag
    public final zzaaf zzd() {
        zzaaf zzaafVar = this.zzc;
        zzaafVar.getClass();
        return zzaafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaag
    public final zzaag zze() {
        zzxp zzxpVar = this.zzd;
        if (zzxpVar == null || zzxpVar.zzc == null) {
            return null;
        }
        return zzxpVar;
    }
}
