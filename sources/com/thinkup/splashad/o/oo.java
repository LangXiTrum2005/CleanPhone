package com.thinkup.splashad.o;

import android.content.Context;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUCommonImpressionListener;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class oo implements TUCommonImpressionListener {
    om o;

    public oo(om omVar) {
        this.o = omVar;
    }

    public final void o(int i2) {
        om omVar = this.o;
        if (omVar != null) {
            omVar.o(i2);
        }
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public final void onAdClick() {
        om omVar = this.o;
        if (omVar != null) {
            omVar.onSplashAdClicked();
        }
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public final void onAdDismiss() {
        om omVar = this.o;
        if (omVar != null) {
            omVar.onSplashAdDismiss();
        }
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public final void onAdImpression() {
        om omVar = this.o;
        if (omVar != null) {
            omVar.onSplashAdShow();
        }
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public final void onAdReward() {
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public final void onAdRewardFailed() {
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public final void onAdShowFail(String str, String str2) {
        om omVar = this.o;
        if (omVar != null) {
            omVar.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2));
        }
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public final void onAdVideoPlayEnd() {
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public final void onAdVideoPlayStart() {
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public final void onDeeplinkCallback(boolean z2) {
        om omVar = this.o;
        if (omVar != null) {
            omVar.onDeeplinkCallback(z2);
        }
    }

    @Override // com.thinkup.core.api.TUCommonImpressionListener
    public final void onDownloadConfirm(Context context, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
        om omVar = this.o;
        if (omVar != null) {
            omVar.onDownloadConfirm(context, tUNetworkConfirmInfo);
        }
    }
}
