package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class JXs implements com.bytedance.sdk.openadsdk.Lxb.ZU.LD {
    private final AtomicBoolean LD = new AtomicBoolean(false);
    private final PAGAppOpenAdInteractionListener Lxb;

    public JXs(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.Lxb = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.Lxb.ZU.LD
    public void LD() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.LD.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.Lxb) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.Lxb.ZU.LD
    public void Lxb() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.Lxb;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.Lxb.ZU.LD
    public void lk() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.LD.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.Lxb) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.Lxb;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }
}
