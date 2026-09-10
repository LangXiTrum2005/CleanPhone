package com.p004ironsource.mediationsdk.sdk;

import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface LevelPlayBannerListener {
    @Deprecated
    void onAdClicked(AdInfo adInfo);

    @Deprecated
    void onAdLeftApplication(AdInfo adInfo);

    @Deprecated
    void onAdLoadFailed(IronSourceError ironSourceError);

    @Deprecated
    void onAdLoaded(AdInfo adInfo);

    @Deprecated
    void onAdScreenDismissed(AdInfo adInfo);

    @Deprecated
    void onAdScreenPresented(AdInfo adInfo);
}
