package com.bytedance.sdk.openadsdk.Lxb.lk;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.hg;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener Lxb;

    public Lxb(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.Lxb = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.lc
    public void onError(final int i, final String str) {
        if (this.Lxb == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Lxb.lk.Lxb.1
            @Override // java.lang.Runnable
            public void run() {
                if (Lxb.this.Lxb != null) {
                    Lxb.this.Lxb.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.Lxb == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Lxb.lk.Lxb.2
            @Override // java.lang.Runnable
            public void run() {
                if (Lxb.this.Lxb != null) {
                    Lxb.this.Lxb.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }
}
