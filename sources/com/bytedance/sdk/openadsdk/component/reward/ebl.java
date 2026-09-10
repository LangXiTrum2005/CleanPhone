package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.hg;

/* JADX INFO: loaded from: classes2.dex */
public class ebl implements PAGRewardedAdLoadListener {
    final PAGRewardedAdLoadListener Lxb;

    public ebl(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.Lxb = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.Lxb != null) {
            hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ebl.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = ebl.this.Lxb;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.lc
    public void onError(final int i, final String str) {
        if (this.Lxb != null) {
            hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ebl.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = ebl.this.Lxb;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onError(i, str);
                    }
                }
            });
        }
    }
}
