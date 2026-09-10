package com.bytedance.sdk.openadsdk.qdl.mzz;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.fco;

/* JADX INFO: loaded from: classes3.dex */
public class ud implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener qdl;

    public ud(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.qdl = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
    public void onError(final int i2, final String str) {
        if (this.qdl == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qdl.mzz.ud.1
            @Override // java.lang.Runnable
            public void run() {
                if (ud.this.qdl != null) {
                    ud.this.qdl.onError(i2, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.qdl == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qdl.mzz.ud.2
            @Override // java.lang.Runnable
            public void run() {
                if (ud.this.qdl != null) {
                    ud.this.qdl.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
