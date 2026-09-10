package com.thinkup.interstitial.unitgroup.api;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUCommonImpressionListener;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.common.n.m;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CustomInterstitialAdapter extends TUBaseAdAdapter {
    private static final String TAG = "CustomInterstitialAdapter";
    protected CustomInterstitialEventListener mImpressListener;

    public void clearImpressionListener() {
        this.mImpressListener = null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        try {
            if (isSupportAdCarousel()) {
                getNetworkName();
                m.n().m(this);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public final void internalFormatShow(Activity activity, ViewGroup viewGroup, final TUCommonImpressionListener tUCommonImpressionListener) {
        this.mImpressListener = new CustomInterstitialEventListener() { // from class: com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter.1
            @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener
            public final void onDeeplinkCallback(boolean z2) {
                tUCommonImpressionListener.onDeeplinkCallback(z2);
            }

            @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener
            public final void onDownloadConfirm(Context context, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
                tUCommonImpressionListener.onDownloadConfirm(context, tUNetworkConfirmInfo);
            }

            @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener
            public final void onInterstitialAdClicked() {
                tUCommonImpressionListener.onAdClick();
            }

            @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener
            public final void onInterstitialAdClose() {
                tUCommonImpressionListener.onAdDismiss();
            }

            @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener
            public final void onInterstitialAdShow() {
                tUCommonImpressionListener.onAdImpression();
            }

            @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener
            public final void onInterstitialAdVideoEnd() {
                tUCommonImpressionListener.onAdVideoPlayEnd();
            }

            @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener
            public final void onInterstitialAdVideoError(String str, String str2) {
                tUCommonImpressionListener.onAdShowFail(str, str2);
            }

            @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialEventListener
            public final void onInterstitialAdVideoStart() {
                tUCommonImpressionListener.onAdVideoPlayStart();
            }
        };
        try {
            if (isSupportAdCarousel()) {
                getNetworkName();
                m.n().o(this);
            }
            show(activity);
        } catch (Throwable th) {
            th.printStackTrace();
            CustomInterstitialEventListener customInterstitialEventListener = this.mImpressListener;
            if (customInterstitialEventListener != null) {
                customInterstitialEventListener.onInterstitialAdVideoError("", "exception, show failed: " + th.getMessage());
            }
        }
    }

    public boolean isSupportAdCarousel() {
        return false;
    }

    public abstract void show(Activity activity);
}
