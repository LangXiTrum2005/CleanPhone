package com.thinkup.nativead.api;

import com.thinkup.core.api.TUAdInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface TUNativeEventListener {
    void onAdClicked(TUNativeAdView tUNativeAdView, TUAdInfo tUAdInfo);

    void onAdImpressed(TUNativeAdView tUNativeAdView, TUAdInfo tUAdInfo);

    void onAdVideoEnd(TUNativeAdView tUNativeAdView);

    void onAdVideoProgress(TUNativeAdView tUNativeAdView, int i2);

    void onAdVideoStart(TUNativeAdView tUNativeAdView);
}
