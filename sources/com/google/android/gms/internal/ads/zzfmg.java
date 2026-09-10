package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfmg implements zzgyj {
    final /* synthetic */ zzfmb zza;
    final /* synthetic */ zzfml zzb;

    public zzfmg(zzfml zzfmlVar, zzfmb zzfmbVar) {
        this.zza = zzfmbVar;
        Objects.requireNonNull(zzfmlVar);
        this.zzb = zzfmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        this.zzb.zza.zzg().zzc(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zzb(Object obj) {
        this.zzb.zza.zzg().zzd(this.zza);
    }
}
