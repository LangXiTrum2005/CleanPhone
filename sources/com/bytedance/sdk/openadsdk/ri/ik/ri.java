package com.bytedance.sdk.openadsdk.ri.ik;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener ri;

    public ri(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.ri = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
    public void onError(final int i, final String str) {
        if (this.ri == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.ik.ri.1
            @Override // java.lang.Runnable
            public void run() {
                if (ri.this.ri != null) {
                    ri.this.ri.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.ri == null) {
            return;
        }
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.ik.ri.2
            @Override // java.lang.Runnable
            public void run() {
                if (ri.this.ri != null) {
                    ri.this.ri.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }
}
