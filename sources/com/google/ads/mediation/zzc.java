package com.google.ads.mediation;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: loaded from: classes3.dex */
final class zzc extends InterstitialAdLoadCallback {
    public final AbstractAdViewAdapter X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final MediationInterstitialListener f16667Y;

    public zzc(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.X = abstractAdViewAdapter;
        this.f16667Y = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f16667Y.onAdFailedToLoad(this.X, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        AbstractAdViewAdapter abstractAdViewAdapter = this.X;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd2;
        MediationInterstitialListener mediationInterstitialListener = this.f16667Y;
        interstitialAd2.setFullScreenContentCallback(new zzd(abstractAdViewAdapter, mediationInterstitialListener));
        mediationInterstitialListener.onAdLoaded(abstractAdViewAdapter);
    }
}
