package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.p004ironsource.sv;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class mzz implements com.bytedance.sdk.openadsdk.qdl.mml.ud {
    private final PAGAppOpenAdInteractionListener qdl;
    private final AtomicBoolean ud = new AtomicBoolean(false);
    private final AtomicBoolean lnr = new AtomicBoolean(false);

    public mzz(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.qdl = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.mml.ud
    public void lnr() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.ud.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.qdl) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        aaj.qdl("BVA", sv.f);
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.qdl;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.mml.ud
    public void qdl() {
        if (this.lnr.compareAndSet(false, true)) {
            aaj.qdl("BVA", "onAdShow");
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.qdl;
            if (pAGAppOpenAdInteractionListener != null) {
                pAGAppOpenAdInteractionListener.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.mml.ud
    public void ud() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        aaj.qdl("BVA", "onAdSkip");
        if (this.ud.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.qdl) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }
}
