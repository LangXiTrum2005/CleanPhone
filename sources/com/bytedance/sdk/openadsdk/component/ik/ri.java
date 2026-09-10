package com.bytedance.sdk.openadsdk.component.ik;

import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.ka.qt;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements com.bytedance.sdk.openadsdk.ri.ik.lr {
    private final wjv ka;
    private final PAGInterstitialAdInteractionListener ri;
    private final AtomicBoolean lr = new AtomicBoolean(false);
    private final AtomicBoolean ik = new AtomicBoolean(false);

    public ri(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        this.ri = pAGInterstitialAdInteractionListener;
        this.ka = riVar != null ? riVar.di() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.ri.ik.lr
    public void lr() {
        qt.ri("close_callback", this.ik.get(), this.lr.get(), this.ka);
        if (this.ik.compareAndSet(false, true)) {
            ac.ri("BVA", "full video onAdClose");
            PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.ri;
            if (pAGInterstitialAdInteractionListener != null) {
                pAGInterstitialAdInteractionListener.onAdDismissed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.ri;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ri.ik.lr
    public void ri() {
        qt.ri("show_callback", this.ik.get(), this.lr.get(), this.ka);
        if (this.lr.compareAndSet(false, true)) {
            ac.ri("BVA", "full video onAdShow");
            PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.ri;
            if (pAGInterstitialAdInteractionListener != null) {
                pAGInterstitialAdInteractionListener.onAdShowed();
            }
        }
    }
}
