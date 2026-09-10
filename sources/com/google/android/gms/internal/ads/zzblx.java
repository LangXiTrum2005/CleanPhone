package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzblx extends zzble {
    final /* synthetic */ zzbly zza;

    public /* synthetic */ zzblx(zzbly zzblyVar, byte[] bArr) {
        Objects.requireNonNull(zzblyVar);
        this.zza = zzblyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zze(zzbks zzbksVar) {
        zzbly zzblyVar = this.zza;
        zzblyVar.zzc().zzb(zzblyVar.zze(zzbksVar));
    }
}
