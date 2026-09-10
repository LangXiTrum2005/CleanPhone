package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class sf implements com.bytedance.sdk.openadsdk.ri.fi.ri {
    private final wjv di;
    private final AtomicBoolean fi;
    private final AtomicBoolean ik;
    private final AtomicBoolean ka;
    private final PAGRewardedAdInteractionCallback lr;
    private final PAGRewardedAdInteractionListener ri;

    public sf(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        this.ik = new AtomicBoolean(false);
        this.ka = new AtomicBoolean(false);
        this.fi = new AtomicBoolean(false);
        this.ri = pAGRewardedAdInteractionListener;
        this.lr = null;
        this.di = riVar != null ? riVar.di() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.ri.fi.ri
    public void lr() {
        this.ka.get();
        com.bytedance.sdk.openadsdk.ka.qt.ri("close_callback", this.ka.get(), this.ik.get(), this.di);
        if (this.ka.compareAndSet(false, true)) {
            com.bytedance.sdk.component.utils.ac.ri("BVA", "reward video onAdClose");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.ri;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdDismissed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.lr;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdDismissed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.ri;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.lr;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ri.fi.ri
    public void ri() {
        this.ik.get();
        com.bytedance.sdk.openadsdk.ka.qt.ri("show_callback", this.ka.get(), this.ik.get(), this.di);
        if (this.ik.compareAndSet(false, true)) {
            com.bytedance.sdk.component.utils.ac.ri("BVA", "reward video onAdShow");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.ri;
            if (pAGRewardedAdInteractionListener != null) {
                pAGRewardedAdInteractionListener.onAdShowed();
                return;
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.lr;
            if (pAGRewardedAdInteractionCallback != null) {
                pAGRewardedAdInteractionCallback.onAdShowed();
            }
        }
    }

    public sf(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        this.ik = new AtomicBoolean(false);
        this.ka = new AtomicBoolean(false);
        this.fi = new AtomicBoolean(false);
        this.lr = pAGRewardedAdInteractionCallback;
        this.ri = null;
        this.di = riVar != null ? riVar.di() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.ri.fi.ri
    public void ri(boolean z, int i, String str, int i2, String str2) {
        if (this.fi.compareAndSet(false, true)) {
            com.bytedance.sdk.component.utils.ac.ri("BVA", "reward video onRewardVerify");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.ri;
            if (pAGRewardedAdInteractionListener != null) {
                if (z) {
                    pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i, str));
                    return;
                } else {
                    pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i2, str2);
                    return;
                }
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.lr;
            if (pAGRewardedAdInteractionCallback != null) {
                if (z) {
                    pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i, str));
                } else {
                    pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i2, str2));
                }
            }
        }
    }
}
