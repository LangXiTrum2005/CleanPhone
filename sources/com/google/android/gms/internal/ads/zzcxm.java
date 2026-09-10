package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcxm implements zzdgf, zzdby {
    private final Clock zza;
    private final zzcxo zzb;
    private final zzfik zzc;
    private final String zzd;

    public zzcxm(Clock clock, zzcxo zzcxoVar, zzfik zzfikVar, String str) {
        this.zza = clock;
        this.zzb = zzcxoVar;
        this.zzc = zzfikVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zza() {
        this.zzb.zzd(this.zzd, this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final void zzg() {
        Clock clock = this.zza;
        this.zzb.zze(this.zzc.zzg, this.zzd, clock.elapsedRealtime());
    }
}
