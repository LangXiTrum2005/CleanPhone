package com.unity3d.ironsourceads.interstitial;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterstitialAdListener {
    void onInterstitialAdClicked(InterstitialAd interstitialAd);

    void onInterstitialAdDismissed(InterstitialAd interstitialAd);

    void onInterstitialAdFailedToShow(InterstitialAd interstitialAd, IronSourceError ironSourceError);

    void onInterstitialAdShown(InterstitialAd interstitialAd);
}
