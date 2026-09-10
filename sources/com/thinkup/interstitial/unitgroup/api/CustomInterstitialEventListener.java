package com.thinkup.interstitial.unitgroup.api;

import android.content.Context;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface CustomInterstitialEventListener {
    void onDeeplinkCallback(boolean z2);

    void onDownloadConfirm(Context context, TUNetworkConfirmInfo tUNetworkConfirmInfo);

    void onInterstitialAdClicked();

    void onInterstitialAdClose();

    void onInterstitialAdShow();

    void onInterstitialAdVideoEnd();

    void onInterstitialAdVideoError(String str, String str2);

    void onInterstitialAdVideoStart();
}
