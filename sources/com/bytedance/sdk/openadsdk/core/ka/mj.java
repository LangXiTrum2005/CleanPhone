package com.bytedance.sdk.openadsdk.core.ka;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;

/* JADX INFO: loaded from: classes2.dex */
public class mj implements PAGBannerAdWrapperListener {
    private final PAGBannerAdInteractionListener ri;

    public mj(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        this.ri = pAGBannerAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = this.ri;
        if (pAGBannerAdInteractionListener != null) {
            pAGBannerAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdDismissed() {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = this.ri;
        if (pAGBannerAdInteractionListener != null) {
            pAGBannerAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdShow(View view, int i) {
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = this.ri;
        if (pAGBannerAdInteractionListener != null) {
            pAGBannerAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(View view, String str, int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderSuccess(View view, float f, float f2) {
    }
}
