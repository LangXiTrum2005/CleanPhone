package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzblw extends zzblb {
    final /* synthetic */ zzbly zza;

    public /* synthetic */ zzblw(zzbly zzblyVar, byte[] bArr) {
        Objects.requireNonNull(zzblyVar);
        this.zza = zzblyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblc
    public final void zze(zzbks zzbksVar, String str) {
        zzbly zzblyVar = this.zza;
        if (zzblyVar.zzd() == null) {
            return;
        }
        zzblyVar.zzd().zzc(zzblyVar.zze(zzbksVar), str);
    }
}
