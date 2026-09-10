package com.thinkup.core.api;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public interface TUCommonImpressionListener {
    void onAdClick();

    void onAdDismiss();

    void onAdImpression();

    void onAdReward();

    void onAdRewardFailed();

    void onAdShowFail(String str, String str2);

    void onAdVideoPlayEnd();

    void onAdVideoPlayStart();

    void onDeeplinkCallback(boolean z2);

    void onDownloadConfirm(Context context, TUNetworkConfirmInfo tUNetworkConfirmInfo);
}
