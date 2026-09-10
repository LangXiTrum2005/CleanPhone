package com.bytedance.sdk.openadsdk.component.lk;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements com.bytedance.sdk.openadsdk.Lxb.lk.LD {
    private final PAGInterstitialAdInteractionListener Lxb;

    public Lxb(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.Lxb = pAGInterstitialAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.Lxb.lk.LD
    public void LD() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.Lxb;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.Lxb.lk.LD
    public void Lxb() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.Lxb;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.Lxb;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }
}
