package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wv extends qp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAd.OnNativeAdLoadedListener f21610a;

    public wv(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.f21610a = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.rp
    public final void C0(wp wpVar) {
        this.f21610a.onNativeAdLoaded(new rv(wpVar));
    }
}
