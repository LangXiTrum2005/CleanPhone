package com.thinkup.splashad.api;

import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface TUSplashAdListener {
    void onAdClick(TUAdInfo tUAdInfo);

    void onAdDismiss(TUAdInfo tUAdInfo, TUSplashAdExtraInfo tUSplashAdExtraInfo);

    void onAdLoadTimeout();

    void onAdLoaded(boolean z2);

    void onAdShow(TUAdInfo tUAdInfo);

    void onNoAdError(AdError adError);
}
