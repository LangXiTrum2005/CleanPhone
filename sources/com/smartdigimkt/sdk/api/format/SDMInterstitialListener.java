package com.smartdigimkt.sdk.api.format;

import com.smartdigimkt.sdk.api.AdError;

/* JADX INFO: loaded from: classes6.dex */
public interface SDMInterstitialListener {
    void onAdClick();

    void onAdClose();

    void onAdLoadFail(AdError adError);

    void onAdLoaded();

    void onAdShow();

    void onAdShowFail(AdError adError);

    void onAdVideoEnd();

    void onAdVideoStart();

    void onDeeplinkCallback(boolean z2);
}
