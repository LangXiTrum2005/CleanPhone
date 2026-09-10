package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;

/* JADX INFO: loaded from: classes2.dex */
public class bu extends ri<PAGRewardedAdLoadListener, TTClientBidding> {
    public bu(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri
    public int di() {
        return 6;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri
    public int lr() {
        return 7;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public TTClientBidding ri(Context context, com.bytedance.sdk.openadsdk.core.model.ri riVar, AdSlot adSlot) {
        return new tan(context, riVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri
    public void lr(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof tan) {
            ((tan) tTClientBidding).lr();
        }
    }

    public static bu ri(Context context) {
        return (bu) ac.ri(context, 7);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri
    public bgr ri() {
        return bgr.ri(this.ri, bgr.ri.REWARD_VIDEO);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri
    public Object ri(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof tan) {
            return ((tan) tTClientBidding).ri();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri
    public void ri(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, int i, String str) {
        pAGRewardedAdLoadListener.onError(i, str);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri
    public void ri(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, Object obj) {
        if (pAGRewardedAdLoadListener == null || obj == null || !(obj instanceof PAGRewardedAd)) {
            return;
        }
        pAGRewardedAdLoadListener.onAdLoaded((PAGRewardedAd) obj);
    }
}
