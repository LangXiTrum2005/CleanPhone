package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends ri<PAGInterstitialAdLoadListener, TTClientBidding> {
    public xha(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri
    public int di() {
        return 5;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri
    public int lr() {
        return 8;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public TTClientBidding ri(Context context, com.bytedance.sdk.openadsdk.core.model.ri riVar, AdSlot adSlot) {
        return new nr(context, riVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri
    public void lr(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof nr) {
            ((nr) tTClientBidding).lr();
        }
    }

    public static xha ri(Context context) {
        return (xha) ac.ri(context, 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri
    public bgr ri() {
        return bgr.ri(this.ri, bgr.ri.FULL_SCREEN_VIDEO);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri
    public Object ri(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof nr) {
            return ((nr) tTClientBidding).ri();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri
    public void ri(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, int i, String str) {
        pAGInterstitialAdLoadListener.onError(i, str);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ri
    public void ri(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, Object obj) {
        if (pAGInterstitialAdLoadListener == null || obj == null || !(obj instanceof PAGInterstitialAd)) {
            return;
        }
        pAGInterstitialAdLoadListener.onAdLoaded((PAGInterstitialAd) obj);
    }
}
