package com.thinkup.splashad.unitgroup.api;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUCommonImpressionListener;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.splashad.api.ITUSplashEyeAd;
import com.thinkup.splashad.api.TUSplashSkipInfo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CustomSplashAdapter extends TUBaseAdAdapter {
    protected CustomSplashEventListener mImpressionListener;
    TUSplashSkipInfo mTUSplashSkipInfo;

    public final void cleanImpressionListener() {
    }

    public ITUSplashEyeAd getSplashEyeAd() {
        return null;
    }

    public final TUSplashSkipInfo getSplashSkipInfo() {
        return this.mTUSplashSkipInfo;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public final void internalFormatShow(Activity activity, ViewGroup viewGroup, final TUCommonImpressionListener tUCommonImpressionListener) {
        this.mImpressionListener = new CustomSplashEventListener() { // from class: com.thinkup.splashad.unitgroup.api.CustomSplashAdapter.1
            @Override // com.thinkup.splashad.unitgroup.api.CustomSplashEventListener
            public final void onDeeplinkCallback(boolean z2) {
                tUCommonImpressionListener.onDeeplinkCallback(z2);
            }

            @Override // com.thinkup.splashad.unitgroup.api.CustomSplashEventListener
            public final void onDownloadConfirm(Context context, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
                tUCommonImpressionListener.onDownloadConfirm(context, tUNetworkConfirmInfo);
            }

            @Override // com.thinkup.splashad.unitgroup.api.CustomSplashEventListener
            public final void onSplashAdClicked() {
                tUCommonImpressionListener.onAdClick();
            }

            @Override // com.thinkup.splashad.unitgroup.api.CustomSplashEventListener
            public final void onSplashAdDismiss() {
                tUCommonImpressionListener.onAdDismiss();
            }

            @Override // com.thinkup.splashad.unitgroup.api.CustomSplashEventListener
            public final void onSplashAdShow() {
                tUCommonImpressionListener.onAdImpression();
            }

            @Override // com.thinkup.splashad.unitgroup.api.CustomSplashEventListener
            public final void onSplashAdShowFail(AdError adError) {
                tUCommonImpressionListener.onAdShowFail(adError.getPlatformCode(), adError.getPlatformMSG());
            }
        };
        show(activity, viewGroup);
    }

    public final boolean isCustomSkipView() {
        TUSplashSkipInfo tUSplashSkipInfo = this.mTUSplashSkipInfo;
        if (tUSplashSkipInfo != null) {
            return tUSplashSkipInfo.canUseCustomSkipView();
        }
        return false;
    }

    public boolean isSupportCustomSkipView() {
        return isMixNative();
    }

    public final void setSplashSkipInfo(TUSplashSkipInfo tUSplashSkipInfo) {
        this.mTUSplashSkipInfo = tUSplashSkipInfo;
    }

    public abstract void show(Activity activity, ViewGroup viewGroup);

    public void startSplashCustomSkipViewClickEye() {
    }
}
