package com.thinkup.splashad.unitgroup.api;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface CustomSplashEventListener {
    void onDeeplinkCallback(boolean z2);

    void onDownloadConfirm(Context context, TUNetworkConfirmInfo tUNetworkConfirmInfo);

    void onSplashAdClicked();

    void onSplashAdDismiss();

    void onSplashAdShow();

    void onSplashAdShowFail(AdError adError);
}
