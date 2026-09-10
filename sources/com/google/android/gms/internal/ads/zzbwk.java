package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbwk extends zzble {
    final /* synthetic */ zzbwl zza;

    public /* synthetic */ zzbwk(zzbwl zzbwlVar, byte[] bArr) {
        Objects.requireNonNull(zzbwlVar);
        this.zza = zzbwlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zze(zzbks zzbksVar) {
        zzbwl zzbwlVar = this.zza;
        zzbwlVar.zzd().onCustomFormatAdLoaded(zzbwlVar.zzc(zzbksVar));
    }
}
