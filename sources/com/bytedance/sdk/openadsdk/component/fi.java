package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.ironsource.If;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class fi implements com.bytedance.sdk.openadsdk.ri.ka.lr {
    private final PAGAppOpenAdInteractionListener ri;
    private final AtomicBoolean lr = new AtomicBoolean(false);
    private final AtomicBoolean ik = new AtomicBoolean(false);

    public fi(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.ri = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.ri.ka.lr
    public void ik() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.lr.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.ri) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.ri.ka.lr
    public void lr() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        ac.ri("BVA", "onAdSkip");
        if (this.lr.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.ri) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        ac.ri("BVA", If.f);
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.ri;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ri.ka.lr
    public void ri() {
        if (this.ik.compareAndSet(false, true)) {
            ac.ri("BVA", "onAdShow");
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.ri;
            if (pAGAppOpenAdInteractionListener != null) {
                pAGAppOpenAdInteractionListener.onAdShowed();
            }
        }
    }
}
