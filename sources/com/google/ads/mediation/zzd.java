package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: loaded from: classes3.dex */
final class zzd extends FullScreenContentCallback {
    public final AbstractAdViewAdapter X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final MediationInterstitialListener f16668Y;

    public zzd(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.X = abstractAdViewAdapter;
        this.f16668Y = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f16668Y.onAdClosed(this.X);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f16668Y.onAdOpened(this.X);
    }
}
