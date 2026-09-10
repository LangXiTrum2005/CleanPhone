package com.thinkup.interstitial.o;

import android.content.Context;
import com.thinkup.core.api.TUCommonImpressionListener;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes6.dex */
public class n implements TUCommonImpressionListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    om f42480n;

    public n(om omVar) {
        this.f42480n = omVar;
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onAdClick() {
        om omVar = this.f42480n;
        if (omVar != null) {
            omVar.onInterstitialAdClicked();
        }
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onAdDismiss() {
        om omVar = this.f42480n;
        if (omVar != null) {
            omVar.onInterstitialAdClose();
        }
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onAdImpression() {
        om omVar = this.f42480n;
        if (omVar != null) {
            omVar.onInterstitialAdShow();
        }
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onAdReward() {
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onAdRewardFailed() {
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onAdShowFail(String str, String str2) {
        om omVar = this.f42480n;
        if (omVar != null) {
            omVar.onInterstitialAdVideoError(str, str2);
        }
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onAdVideoPlayEnd() {
        om omVar = this.f42480n;
        if (omVar != null) {
            omVar.onInterstitialAdVideoEnd();
        }
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onAdVideoPlayStart() {
        om omVar = this.f42480n;
        if (omVar != null) {
            omVar.onInterstitialAdVideoStart();
        }
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onDeeplinkCallback(boolean z2) {
        om omVar = this.f42480n;
        if (omVar != null) {
            omVar.onDeeplinkCallback(z2);
        }
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public void onDownloadConfirm(Context context, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
        om omVar = this.f42480n;
        if (omVar != null) {
            omVar.onDownloadConfirm(context, tUNetworkConfirmInfo);
        }
    }
}
