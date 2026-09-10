package com.bytedance.sdk.openadsdk.ri.ri;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener ri;

    public ri(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.ri = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
    public void onError(final int i, final String str) {
        if (this.ri == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.ri.ri.1
            @Override // java.lang.Runnable
            public void run() {
                ri.this.ri.onError(i, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.ri == null) {
            return;
        }
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.ri.ri.2
            @Override // java.lang.Runnable
            public void run() {
                ri.this.ri.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
