package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdsg implements zzgyj {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbnn zzb;

    public zzdsg(zzdsp zzdspVar, String str, zzbnn zzbnnVar) {
        this.zza = str;
        this.zzb = zzbnnVar;
        Objects.requireNonNull(zzdspVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcir) obj).zzac(this.zza, this.zzb);
    }
}
