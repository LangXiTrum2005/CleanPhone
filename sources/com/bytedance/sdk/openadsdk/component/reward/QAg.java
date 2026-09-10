package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;

/* JADX INFO: loaded from: classes2.dex */
public class QAg implements com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb {
    private final PAGRewardedAdInteractionCallback LD;
    private final PAGRewardedAdInteractionListener Lxb;

    public QAg(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.Lxb = pAGRewardedAdInteractionListener;
        this.LD = null;
    }

    @Override // com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb
    public void LD() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.Lxb;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdDismissed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.LD;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb
    public void Lxb() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.Lxb;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdShowed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.LD;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.Lxb;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.LD;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    public QAg(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.LD = pAGRewardedAdInteractionCallback;
        this.Lxb = null;
    }

    @Override // com.bytedance.sdk.openadsdk.Lxb.JXs.Lxb
    public void Lxb(boolean z, int i, String str, int i2, String str2) {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.Lxb;
        if (pAGRewardedAdInteractionListener != null) {
            if (z) {
                pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i, str));
                return;
            } else {
                pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i2, str2);
                return;
            }
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.LD;
        if (pAGRewardedAdInteractionCallback != null) {
            if (z) {
                pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i, str));
            } else {
                pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i2, str2));
            }
        }
    }
}
