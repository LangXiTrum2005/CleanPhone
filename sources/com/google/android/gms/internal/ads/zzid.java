package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes4.dex */
final class zzid {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public final /* synthetic */ void zza(int i2, int i3) {
        MediaCodec.CryptoInfo.Pattern pattern = this.zzb;
        pattern.set(i2, i3);
        this.zza.setPattern(pattern);
    }
}
