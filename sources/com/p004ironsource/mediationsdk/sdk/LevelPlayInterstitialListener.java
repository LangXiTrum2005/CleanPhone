package com.p004ironsource.mediationsdk.sdk;

import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface LevelPlayInterstitialListener {
    @Deprecated
    void onAdClicked(AdInfo adInfo);

    @Deprecated
    void onAdClosed(AdInfo adInfo);

    @Deprecated
    void onAdLoadFailed(IronSourceError ironSourceError);

    @Deprecated
    void onAdOpened(AdInfo adInfo);

    @Deprecated
    void onAdReady(AdInfo adInfo);

    @Deprecated
    void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo);

    @Deprecated
    void onAdShowSucceeded(AdInfo adInfo);
}
