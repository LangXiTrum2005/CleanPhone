package com.p004ironsource.mediationsdk.sdk;

import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public interface RewardedVideoSmashListener {
    void onRewardedVideoAdClicked();

    void onRewardedVideoAdClosed();

    void onRewardedVideoAdEnded();

    void onRewardedVideoAdOpened();

    void onRewardedVideoAdRewarded();

    void onRewardedVideoAdShowFailed(IronSourceError ironSourceError);

    void onRewardedVideoAdStarted();

    void onRewardedVideoAdVisible();

    void onRewardedVideoAvailabilityChanged(boolean z2);

    void onRewardedVideoInitFailed(IronSourceError ironSourceError);

    void onRewardedVideoInitSuccess();

    void onRewardedVideoLoadFailed(IronSourceError ironSourceError);

    void onRewardedVideoLoadSuccess();
}
