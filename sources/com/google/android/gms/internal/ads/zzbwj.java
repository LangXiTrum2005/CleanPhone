package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbwj extends zzblb {
    final /* synthetic */ zzbwl zza;

    public /* synthetic */ zzbwj(zzbwl zzbwlVar, byte[] bArr) {
        Objects.requireNonNull(zzbwlVar);
        this.zza = zzbwlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblc
    public final void zze(zzbks zzbksVar, String str) {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar.zze() == null) {
            return;
        }
        zzbwlVar.zze().onCustomClick(zzbwlVar.zzc(zzbksVar), str);
    }
}
