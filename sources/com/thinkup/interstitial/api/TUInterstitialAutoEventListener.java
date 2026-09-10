package com.thinkup.interstitial.api;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TUInterstitialAutoEventListener {
    public void onDeeplinkCallback(TUAdInfo tUAdInfo, boolean z2) {
    }

    public void onDownloadConfirm(Context context, TUAdInfo tUAdInfo, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
    }

    public abstract void onInterstitialAdClicked(TUAdInfo tUAdInfo);

    public abstract void onInterstitialAdClose(TUAdInfo tUAdInfo);

    public abstract void onInterstitialAdShow(TUAdInfo tUAdInfo);

    public abstract void onInterstitialAdVideoEnd(TUAdInfo tUAdInfo);

    public abstract void onInterstitialAdVideoError(AdError adError);

    public abstract void onInterstitialAdVideoStart(TUAdInfo tUAdInfo);
}
