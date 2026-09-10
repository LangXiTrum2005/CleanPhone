package com.bytedance.sdk.openadsdk.component.lk;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.hg;

/* JADX INFO: loaded from: classes2.dex */
public class LD implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener Lxb;

    public LD(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.Lxb = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.Lxb != null) {
            hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.lk.LD.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = LD.this.Lxb;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.lc
    public void onError(final int i, final String str) {
        if (this.Lxb != null) {
            hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.lk.LD.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = LD.this.Lxb;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onError(i, str);
                    }
                }
            });
        }
    }
}
