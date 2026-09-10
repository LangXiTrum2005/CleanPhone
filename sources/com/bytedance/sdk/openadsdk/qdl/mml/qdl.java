package com.bytedance.sdk.openadsdk.qdl.mml;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.fco;

/* JADX INFO: loaded from: classes3.dex */
public class qdl implements PAGAppOpenAdLoadListener {
    private final PAGAppOpenAdLoadListener qdl;

    public qdl(PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        this.qdl = pAGAppOpenAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
    public void onError(final int i2, final String str) {
        if (this.qdl == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qdl.mml.qdl.1
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
    public void onAdLoaded(final PAGAppOpenAd pAGAppOpenAd) {
        if (this.qdl == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qdl.mml.qdl.2
            @Override // java.lang.Runnable
            public void run() {
                if (qdl.this.qdl != null) {
                    qdl.this.qdl.onAdLoaded(pAGAppOpenAd);
                }
            }
        });
    }
}
