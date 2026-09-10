package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdsf implements zzgyj {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbnn zzb;

    public zzdsf(zzdsp zzdspVar, String str, zzbnn zzbnnVar) {
        this.zza = str;
        this.zzb = zzbnnVar;
        Objects.requireNonNull(zzdspVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcir) obj).zzab(this.zza, this.zzb);
    }
}
