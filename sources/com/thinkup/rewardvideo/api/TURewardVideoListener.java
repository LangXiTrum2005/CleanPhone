package com.thinkup.rewardvideo.api;

import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface TURewardVideoListener {
    void onReward(TUAdInfo tUAdInfo);

    void onRewardedVideoAdClosed(TUAdInfo tUAdInfo);

    void onRewardedVideoAdFailed(AdError adError);

    void onRewardedVideoAdLoaded();

    void onRewardedVideoAdPlayClicked(TUAdInfo tUAdInfo);

    void onRewardedVideoAdPlayEnd(TUAdInfo tUAdInfo);

    void onRewardedVideoAdPlayFailed(AdError adError, TUAdInfo tUAdInfo);

    void onRewardedVideoAdPlayStart(TUAdInfo tUAdInfo);
}
