package com.bytedance.sdk.openadsdk.ri.ka;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements PAGAppOpenAdLoadListener {
    private final PAGAppOpenAdLoadListener ri;

    public ri(PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        this.ri = pAGAppOpenAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
    public void onError(final int i, final String str) {
        if (this.ri == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.ka.ri.1
            @Override // java.lang.Runnable
            public void run() {
                if (ri.this.ri != null) {
                    ri.this.ri.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGAppOpenAd pAGAppOpenAd) {
        if (this.ri == null) {
            return;
        }
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.ka.ri.2
            @Override // java.lang.Runnable
            public void run() {
                if (ri.this.ri != null) {
                    ri.this.ri.onAdLoaded(pAGAppOpenAd);
                }
            }
        });
    }
}
