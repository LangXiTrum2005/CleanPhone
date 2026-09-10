package com.thinkup.banner.unitgroup.api;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUCommonImpressionListener;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CustomBannerAdapter extends TUBaseAdAdapter {
    public CustomBannerEventListener mImpressionEventListener;

    public abstract View getBannerView();

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public View getMixView() {
        return getBannerView();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void internalFormatShow(Activity activity, ViewGroup viewGroup, final TUCommonImpressionListener tUCommonImpressionListener) {
        this.mImpressionEventListener = new CustomBannerEventListener() { // from class: com.thinkup.banner.unitgroup.api.CustomBannerAdapter.1
            @Override // com.thinkup.banner.unitgroup.api.CustomBannerEventListener
            public final void onBannerAdClicked() {
                TUCommonImpressionListener tUCommonImpressionListener2 = tUCommonImpressionListener;
                if (tUCommonImpressionListener2 != null) {
                    tUCommonImpressionListener2.onAdClick();
                }
            }

            @Override // com.thinkup.banner.unitgroup.api.CustomBannerEventListener
            public final void onBannerAdClose() {
                TUCommonImpressionListener tUCommonImpressionListener2 = tUCommonImpressionListener;
                if (tUCommonImpressionListener2 != null) {
                    tUCommonImpressionListener2.onAdDismiss();
                }
            }

            @Override // com.thinkup.banner.unitgroup.api.CustomBannerEventListener
            public final void onBannerAdShow() {
                TUCommonImpressionListener tUCommonImpressionListener2 = tUCommonImpressionListener;
                if (tUCommonImpressionListener2 != null) {
                    tUCommonImpressionListener2.onAdImpression();
                }
            }

            @Override // com.thinkup.banner.unitgroup.api.CustomBannerEventListener
            public final void onDeeplinkCallback(boolean z2) {
                TUCommonImpressionListener tUCommonImpressionListener2 = tUCommonImpressionListener;
                if (tUCommonImpressionListener2 != null) {
                    tUCommonImpressionListener2.onDeeplinkCallback(z2);
                }
            }

            @Override // com.thinkup.banner.unitgroup.api.CustomBannerEventListener
            public final void onDownloadConfirm(Context context, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
                TUCommonImpressionListener tUCommonImpressionListener2 = tUCommonImpressionListener;
                if (tUCommonImpressionListener2 != null) {
                    tUCommonImpressionListener2.onDownloadConfirm(context, tUNetworkConfirmInfo);
                }
            }
        };
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        return getBannerView() != null;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public final void releaseLoadResource() {
        super.releaseLoadResource();
    }

    public final void setAdEventListener(CustomBannerEventListener customBannerEventListener) {
        this.mImpressionEventListener = customBannerEventListener;
    }
}
