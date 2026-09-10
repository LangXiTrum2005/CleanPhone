package com.thinkup.rewardvideo.unitgroup.api;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUCommonImpressionListener;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.common.mn.o0.m;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CustomRewardVideoAdapter extends TUBaseAdAdapter {
    protected CustomRewardedVideoEventListener mImpressionListener;

    public void clearImpressionListener() {
        this.mImpressionListener = null;
    }

    public int getAdRewardCallbackType() {
        m mVar = this.serverExtraInfo;
        if (mVar != null) {
            return mVar.n();
        }
        return 1;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void internalFormatShow(Activity activity, ViewGroup viewGroup, final TUCommonImpressionListener tUCommonImpressionListener) {
        final CustomRewardedVideoEventListener customRewardedVideoEventListener = tUCommonImpressionListener instanceof CustomRewardedVideoEventListener ? (CustomRewardedVideoEventListener) tUCommonImpressionListener : null;
        this.mImpressionListener = new CustomRewardedVideoEventListener() { // from class: com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter.1
            @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
            public final void onAgainReward() {
                CustomRewardedVideoEventListener customRewardedVideoEventListener2 = customRewardedVideoEventListener;
                if (customRewardedVideoEventListener2 != null) {
                    customRewardedVideoEventListener2.onAgainReward();
                }
            }

            @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
            public final void onAgainRewardFailed() {
                CustomRewardedVideoEventListener customRewardedVideoEventListener2 = customRewardedVideoEventListener;
                if (customRewardedVideoEventListener2 != null) {
                    customRewardedVideoEventListener2.onAgainRewardFailed();
                }
            }

            @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
            public final void onDeeplinkCallback(boolean z2) {
                TUCommonImpressionListener tUCommonImpressionListener2 = tUCommonImpressionListener;
                if (tUCommonImpressionListener2 != null) {
                    tUCommonImpressionListener2.onDeeplinkCallback(z2);
                }
            }

            @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
            public final void onDownloadConfirm(Context context, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
                TUCommonImpressionListener tUCommonImpressionListener2 = tUCommonImpressionListener;
                if (tUCommonImpressionListener2 != null) {
                    tUCommonImpressionListener2.onDownloadConfirm(context, tUNetworkConfirmInfo);
                }
            }

            @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
            public final void onReward() {
                CustomRewardedVideoEventListener customRewardedVideoEventListener2 = customRewardedVideoEventListener;
                if (customRewardedVideoEventListener2 != null) {
                    customRewardedVideoEventListener2.onReward();
                }
            }

            @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
            public final void onRewardFailed() {
                TUCommonImpressionListener tUCommonImpressionListener2 = tUCommonImpressionListener;
                if (tUCommonImpressionListener2 != null) {
                    tUCommonImpressionListener2.onAdRewardFailed();
                }
            }

            @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
            public final void onRewardedVideoAdAgainPlayClicked() {
                CustomRewardedVideoEventListener customRewardedVideoEventListener2 = customRewardedVideoEventListener;
                if (customRewardedVideoEventListener2 != null) {
                    customRewardedVideoEventListener2.onRewardedVideoAdAgainPlayClicked();
                }
            }

            @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
            public final void onRewardedVideoAdAgainPlayEnd() {
                CustomRewardedVideoEventListener customRewardedVideoEventListener2 = customRewardedVideoEventListener;
                if (customRewardedVideoEventListener2 != null) {
                    customRewardedVideoEventListener2.onRewardedVideoAdAgainPlayEnd();
                }
            }

            @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
            public final void onRewardedVideoAdAgainPlayFailed(String str, String str2) {
                CustomRewardedVideoEventListener customRewardedVideoEventListener2 = customRewardedVideoEventListener;
                if (customRewardedVideoEventListener2 != null) {
                    customRewardedVideoEventListener2.onRewardedVideoAdAgainPlayFailed(str, str2);
                }
            }

            @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
            public final void onRewardedVideoAdAgainPlayStart() {
                CustomRewardedVideoEventListener customRewardedVideoEventListener2 = customRewardedVideoEventListener;
                if (customRewardedVideoEventListener2 != null) {
                    customRewardedVideoEventListener2.onRewardedVideoAdAgainPlayStart();
                }
            }

            @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
            public final void onRewardedVideoAdClosed() {
                CustomRewardedVideoEventListener customRewardedVideoEventListener2 = customRewardedVideoEventListener;
                if (customRewardedVideoEventListener2 != null) {
                    customRewardedVideoEventListener2.onRewardedVideoAdClosed();
                    return;
                }
                TUCommonImpressionListener tUCommonImpressionListener2 = tUCommonImpressionListener;
                if (tUCommonImpressionListener2 != null) {
                    tUCommonImpressionListener2.onAdDismiss();
                }
            }

            @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
            public final void onRewardedVideoAdPlayClicked() {
                CustomRewardedVideoEventListener customRewardedVideoEventListener2 = customRewardedVideoEventListener;
                if (customRewardedVideoEventListener2 != null) {
                    customRewardedVideoEventListener2.onRewardedVideoAdPlayClicked();
                    return;
                }
                TUCommonImpressionListener tUCommonImpressionListener2 = tUCommonImpressionListener;
                if (tUCommonImpressionListener2 != null) {
                    tUCommonImpressionListener2.onAdClick();
                }
            }

            @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
            public final void onRewardedVideoAdPlayEnd() {
                CustomRewardedVideoEventListener customRewardedVideoEventListener2 = customRewardedVideoEventListener;
                if (customRewardedVideoEventListener2 != null) {
                    customRewardedVideoEventListener2.onRewardedVideoAdPlayEnd();
                    return;
                }
                TUCommonImpressionListener tUCommonImpressionListener2 = tUCommonImpressionListener;
                if (tUCommonImpressionListener2 != null) {
                    tUCommonImpressionListener2.onAdVideoPlayEnd();
                }
            }

            @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
            public final void onRewardedVideoAdPlayFailed(String str, String str2) {
                CustomRewardedVideoEventListener customRewardedVideoEventListener2 = customRewardedVideoEventListener;
                if (customRewardedVideoEventListener2 != null) {
                    customRewardedVideoEventListener2.onRewardedVideoAdPlayFailed(str, str2);
                    return;
                }
                TUCommonImpressionListener tUCommonImpressionListener2 = tUCommonImpressionListener;
                if (tUCommonImpressionListener2 != null) {
                    tUCommonImpressionListener2.onAdShowFail(str, str2);
                }
            }

            @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
            public final void onRewardedVideoAdPlayStart() {
                CustomRewardedVideoEventListener customRewardedVideoEventListener2 = customRewardedVideoEventListener;
                if (customRewardedVideoEventListener2 != null) {
                    customRewardedVideoEventListener2.onRewardedVideoAdPlayStart();
                    return;
                }
                TUCommonImpressionListener tUCommonImpressionListener2 = tUCommonImpressionListener;
                if (tUCommonImpressionListener2 != null) {
                    tUCommonImpressionListener2.onAdVideoPlayStart();
                    tUCommonImpressionListener.onAdImpression();
                }
            }
        };
        try {
            show(activity);
        } catch (Throwable th) {
            if (this.mImpressionListener != null) {
                this.mImpressionListener.onRewardedVideoAdPlayFailed("", "show failed: " + th.getMessage());
            }
        }
    }

    public abstract void show(Activity activity);
}
