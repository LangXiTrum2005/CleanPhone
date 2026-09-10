package com.bytedance.sdk.openadsdk.Lxb.ZU;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.hg;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements PAGAppOpenAdLoadListener {
    private final PAGAppOpenAdLoadListener Lxb;

    public Lxb(PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        this.Lxb = pAGAppOpenAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.lc
    public void onError(final int i, final String str) {
        if (this.Lxb == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Lxb.ZU.Lxb.1
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
    public void onAdLoaded(final PAGAppOpenAd pAGAppOpenAd) {
        if (this.Lxb == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Lxb.ZU.Lxb.2
            @Override // java.lang.Runnable
            public void run() {
                if (Lxb.this.Lxb != null) {
                    Lxb.this.Lxb.onAdLoaded(pAGAppOpenAd);
                }
            }
        });
    }
}
