package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzsv implements zzrc {
    final /* synthetic */ zzsw zza;

    public /* synthetic */ zzsv(zzsw zzswVar, byte[] bArr) {
        Objects.requireNonNull(zzswVar);
        this.zza = zzswVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrc
    public final void zza(Exception exc) {
        zzee.zzf("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzaw().zzi(exc);
    }
}
