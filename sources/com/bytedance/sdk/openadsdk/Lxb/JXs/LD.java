package com.bytedance.sdk.openadsdk.Lxb.JXs;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.hg;

/* JADX INFO: loaded from: classes2.dex */
public class LD implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener Lxb;

    public LD(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.Lxb = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.lc
    public void onError(final int i, final String str) {
        if (this.Lxb == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Lxb.JXs.LD.1
            @Override // java.lang.Runnable
            public void run() {
                if (LD.this.Lxb != null) {
                    LD.this.Lxb.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.Lxb == null) {
            return;
        }
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Lxb.JXs.LD.2
            @Override // java.lang.Runnable
            public void run() {
                if (LD.this.Lxb != null) {
                    LD.this.Lxb.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
