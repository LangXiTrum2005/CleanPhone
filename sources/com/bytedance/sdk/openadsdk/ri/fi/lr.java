package com.bytedance.sdk.openadsdk.ri.fi;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener ri;

    public lr(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.ri = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
    public void onError(final int i, final String str) {
        if (this.ri == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.fi.lr.1
            @Override // java.lang.Runnable
            public void run() {
                if (lr.this.ri != null) {
                    lr.this.ri.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.ri == null) {
            return;
        }
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.fi.lr.2
            @Override // java.lang.Runnable
            public void run() {
                if (lr.this.ri != null) {
                    lr.this.ri.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
