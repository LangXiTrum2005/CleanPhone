package com.bytedance.sdk.openadsdk.qdl.qdl;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.fco;

/* JADX INFO: loaded from: classes3.dex */
public class qdl implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener qdl;

    public qdl(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.qdl = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
    public void onError(final int i2, final String str) {
        if (this.qdl == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qdl.qdl.qdl.1
            @Override // java.lang.Runnable
            public void run() {
                qdl.this.qdl.onError(i2, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.qdl == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qdl.qdl.qdl.2
            @Override // java.lang.Runnable
            public void run() {
                qdl.this.qdl.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
