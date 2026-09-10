package com.bytedance.sdk.openadsdk.api.reward;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;

/* JADX INFO: loaded from: classes2.dex */
public class PAGRewardFullExpressAdListenerProxy implements PAGExpressAdWrapperListener {
    private final PAGExpressAdWrapperListener ri;
    private boolean lr = false;
    private final Handler ik = new Handler(Looper.getMainLooper());

    public PAGRewardFullExpressAdListenerProxy(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.ri = pAGExpressAdWrapperListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.ri;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdDismissed() {
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.ri;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdShow(View view, int i) {
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.ri;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onAdShow(view, i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(final View view, final String str, final int i) {
        lr(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy.2
            @Override // java.lang.Runnable
            public void run() {
                PAGRewardFullExpressAdListenerProxy.this.ri.onRenderFail(view, str, i);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderSuccess(final View view, final float f, final float f2) {
        lr(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy.3
            @Override // java.lang.Runnable
            public void run() {
                PAGRewardFullExpressAdListenerProxy.this.ri.onRenderSuccess(view, f, f2);
            }
        });
    }

    public void triggerUnfinishedFail(final View view) {
        lr(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy.4
            @Override // java.lang.Runnable
            public void run() {
                PAGRewardFullExpressAdListenerProxy.this.ri.onRenderFail(view, BackupConstant.UNFINISHED_FAIL_MSG, BackupConstant.UNFINISHED_FAIL_CODE);
            }
        });
    }

    private void lr(final Runnable runnable) {
        ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy.1
            @Override // java.lang.Runnable
            public void run() {
                if (PAGRewardFullExpressAdListenerProxy.this.lr || PAGRewardFullExpressAdListenerProxy.this.ri == null) {
                    boolean unused = PAGRewardFullExpressAdListenerProxy.this.lr;
                } else {
                    PAGRewardFullExpressAdListenerProxy.this.lr = true;
                    runnable.run();
                }
            }
        });
    }

    private void ri(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.ik.post(runnable);
        }
    }
}
