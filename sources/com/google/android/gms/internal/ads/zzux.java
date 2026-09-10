package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes4.dex */
final class zzux implements zzuv {
    private final int zza;
    private MediaCodecInfo[] zzb;

    public zzux(boolean z2, boolean z3, boolean z4) {
        int i2 = 1;
        if (!z2 && !z3 && !z4) {
            i2 = 0;
        }
        this.zza = i2;
    }

    @EnsuresNonNull
    private final void zzf() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuv
    public final int zza() {
        zzf();
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzuv
    public final MediaCodecInfo zzb(int i2) {
        zzf();
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzuv
    public final boolean zzc() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuv
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.zzuv
    public final boolean zze(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}
