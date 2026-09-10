package com.bytedance.sdk.openadsdk.Lxb.LD;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.hg;

/* JADX INFO: loaded from: classes2.dex */
public class JXs implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener Lxb;

    public JXs(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.Lxb = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.lc
    public void onError(final int i, final String str) {
        if (this.Lxb == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Lxb.LD.JXs.1
            @Override // java.lang.Runnable
            public void run() {
                JXs.this.Lxb.onError(i, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.Lxb == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Lxb.LD.JXs.2
            @Override // java.lang.Runnable
            public void run() {
                JXs.this.Lxb.onAdLoaded(pAGNativeAd);
            }
        });
    }
}
