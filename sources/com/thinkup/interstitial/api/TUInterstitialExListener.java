package com.thinkup.interstitial.api;

import android.content.Context;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface TUInterstitialExListener extends TUInterstitialListener {
    void onDeeplinkCallback(TUAdInfo tUAdInfo, boolean z2);

    void onDownloadConfirm(Context context, TUAdInfo tUAdInfo, TUNetworkConfirmInfo tUNetworkConfirmInfo);
}
