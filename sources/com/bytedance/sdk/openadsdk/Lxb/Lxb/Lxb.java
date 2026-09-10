package com.bytedance.sdk.openadsdk.Lxb.Lxb;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.hg;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener Lxb;

    public Lxb(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.Lxb = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.lc
    public void onError(final int i, final String str) {
        if (this.Lxb == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb.1
            @Override // java.lang.Runnable
            public void run() {
                Lxb.this.Lxb.onError(i, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.Lxb == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Lxb.Lxb.Lxb.2
            @Override // java.lang.Runnable
            public void run() {
                Lxb.this.Lxb.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
