package com.bytedance.sdk.openadsdk.qdl.lnr;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.fco;

/* JADX INFO: loaded from: classes3.dex */
public class qdl implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener qdl;

    public qdl(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.qdl = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
    public void onError(final int i2, final String str) {
        if (this.qdl == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qdl.lnr.qdl.1
            @Override // java.lang.Runnable
            public void run() {
                if (qdl.this.qdl != null) {
                    qdl.this.qdl.onError(i2, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.qdl == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qdl.lnr.qdl.2
            @Override // java.lang.Runnable
            public void run() {
                if (qdl.this.qdl != null) {
                    qdl.this.qdl.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }
}
