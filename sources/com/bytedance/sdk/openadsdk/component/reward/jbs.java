package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: loaded from: classes2.dex */
public class jbs implements PAGRewardedAdLoadListener {
    final PAGRewardedAdLoadListener ri;

    public jbs(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.ri = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
    public void onError(final int i, final String str) {
        if (this.ri != null) {
            dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.jbs.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = jbs.this.ri;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.ri != null) {
            dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.jbs.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = jbs.this.ri;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }
}
