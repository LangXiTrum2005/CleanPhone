package com.thinkup.rewardvideo.api;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TURewardVideoAutoEventListener {
    public void onAgainReward(TUAdInfo tUAdInfo) {
    }

    public void onAgainRewardFailed(TUAdInfo tUAdInfo) {
    }

    public void onDeeplinkCallback(TUAdInfo tUAdInfo, boolean z2) {
    }

    public void onDownloadConfirm(Context context, TUAdInfo tUAdInfo, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
    }

    public abstract void onReward(TUAdInfo tUAdInfo);

    public void onRewardFailed(TUAdInfo tUAdInfo) {
    }

    public void onRewardedVideoAdAgainPlayClicked(TUAdInfo tUAdInfo) {
    }

    public void onRewardedVideoAdAgainPlayEnd(TUAdInfo tUAdInfo) {
    }

    public void onRewardedVideoAdAgainPlayFailed(AdError adError, TUAdInfo tUAdInfo) {
    }

    public void onRewardedVideoAdAgainPlayStart(TUAdInfo tUAdInfo) {
    }

    public abstract void onRewardedVideoAdClosed(TUAdInfo tUAdInfo);

    public abstract void onRewardedVideoAdPlayClicked(TUAdInfo tUAdInfo);

    public abstract void onRewardedVideoAdPlayEnd(TUAdInfo tUAdInfo);

    public abstract void onRewardedVideoAdPlayFailed(AdError adError, TUAdInfo tUAdInfo);

    public abstract void onRewardedVideoAdPlayStart(TUAdInfo tUAdInfo);
}
