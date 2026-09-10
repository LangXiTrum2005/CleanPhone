package com.thinkup.rewardvideo.api;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface TURewardVideoExListener extends TURewardVideoListener {
    void onAgainReward(TUAdInfo tUAdInfo);

    void onAgainRewardFailed(TUAdInfo tUAdInfo);

    void onDeeplinkCallback(TUAdInfo tUAdInfo, boolean z2);

    void onDownloadConfirm(Context context, TUAdInfo tUAdInfo, TUNetworkConfirmInfo tUNetworkConfirmInfo);

    void onRewardFailed(TUAdInfo tUAdInfo);

    void onRewardedVideoAdAgainPlayClicked(TUAdInfo tUAdInfo);

    void onRewardedVideoAdAgainPlayEnd(TUAdInfo tUAdInfo);

    void onRewardedVideoAdAgainPlayFailed(AdError adError, TUAdInfo tUAdInfo);

    void onRewardedVideoAdAgainPlayStart(TUAdInfo tUAdInfo);
}
