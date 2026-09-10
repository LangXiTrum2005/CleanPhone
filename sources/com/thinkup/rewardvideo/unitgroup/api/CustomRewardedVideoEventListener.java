package com.thinkup.rewardvideo.unitgroup.api;

import android.content.Context;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface CustomRewardedVideoEventListener {
    void onAgainReward();

    void onAgainRewardFailed();

    void onDeeplinkCallback(boolean z2);

    void onDownloadConfirm(Context context, TUNetworkConfirmInfo tUNetworkConfirmInfo);

    void onReward();

    void onRewardFailed();

    void onRewardedVideoAdAgainPlayClicked();

    void onRewardedVideoAdAgainPlayEnd();

    void onRewardedVideoAdAgainPlayFailed(String str, String str2);

    void onRewardedVideoAdAgainPlayStart();

    void onRewardedVideoAdClosed();

    void onRewardedVideoAdPlayClicked();

    void onRewardedVideoAdPlayEnd();

    void onRewardedVideoAdPlayFailed(String str, String str2);

    void onRewardedVideoAdPlayStart();
}
