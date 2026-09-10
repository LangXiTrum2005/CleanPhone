package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbwn extends zzbll {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbwn(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zze(zzbls zzblsVar) {
        this.zza.onNativeAdLoaded(new zzbwi(zzblsVar));
    }
}
