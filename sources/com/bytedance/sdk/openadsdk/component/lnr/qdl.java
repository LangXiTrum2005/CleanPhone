package com.bytedance.sdk.openadsdk.component.lnr;

import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class qdl implements com.bytedance.sdk.openadsdk.qdl.lnr.ud {
    private final PAGInterstitialAdInteractionListener qdl;
    private final AtomicBoolean ud = new AtomicBoolean(false);
    private final AtomicBoolean lnr = new AtomicBoolean(false);

    public qdl(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.qdl = pAGInterstitialAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.qdl;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.lnr.ud
    public void qdl() {
        if (this.ud.compareAndSet(false, true)) {
            aaj.qdl("BVA", "full video onAdShow");
            PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.qdl;
            if (pAGInterstitialAdInteractionListener != null) {
                pAGInterstitialAdInteractionListener.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.lnr.ud
    public void ud() {
        if (this.lnr.compareAndSet(false, true)) {
            aaj.qdl("BVA", "full video onAdClose");
            PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.qdl;
            if (pAGInterstitialAdInteractionListener != null) {
                pAGInterstitialAdInteractionListener.onAdDismissed();
            }
        }
    }
}
