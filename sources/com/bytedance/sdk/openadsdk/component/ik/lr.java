package com.bytedance.sdk.openadsdk.component.ik;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener ri;

    public lr(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.ri = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
    public void onError(final int i, final String str) {
        if (this.ri != null) {
            dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.ik.lr.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = lr.this.ri;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.ri != null) {
            dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.ik.lr.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = lr.this.ri;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }
}
