package com.thinkup.interstitial.api;

import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface TUInterstitialListener {
    void onInterstitialAdClicked(TUAdInfo tUAdInfo);

    void onInterstitialAdClose(TUAdInfo tUAdInfo);

    void onInterstitialAdLoadFail(AdError adError);

    void onInterstitialAdLoaded();

    void onInterstitialAdShow(TUAdInfo tUAdInfo);

    void onInterstitialAdVideoEnd(TUAdInfo tUAdInfo);

    void onInterstitialAdVideoError(AdError adError);

    void onInterstitialAdVideoStart(TUAdInfo tUAdInfo);
}
