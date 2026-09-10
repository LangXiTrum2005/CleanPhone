package com.p004ironsource.mediationsdk.sdk;

import com.p004ironsource.mediationsdk.demandOnly.l;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public interface DemandOnlyRvManagerListener {
    void onRewardedVideoAdClicked(l lVar);

    void onRewardedVideoAdClosed(l lVar);

    void onRewardedVideoAdLoadFailed(IronSourceError ironSourceError, l lVar, long j);

    void onRewardedVideoAdOpened(l lVar);

    void onRewardedVideoAdRewarded(l lVar);

    void onRewardedVideoAdShowFailed(IronSourceError ironSourceError, l lVar);

    void onRewardedVideoAdVisible(l lVar);

    void onRewardedVideoLoadSuccess(l lVar, long j);
}
