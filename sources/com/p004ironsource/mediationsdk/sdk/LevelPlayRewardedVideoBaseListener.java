package com.p004ironsource.mediationsdk.sdk;

import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.Placement;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface LevelPlayRewardedVideoBaseListener {
    void onAdClicked(Placement placement, AdInfo adInfo);

    void onAdClosed(AdInfo adInfo);

    void onAdOpened(AdInfo adInfo);

    void onAdRewarded(Placement placement, AdInfo adInfo);

    void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo);
}
