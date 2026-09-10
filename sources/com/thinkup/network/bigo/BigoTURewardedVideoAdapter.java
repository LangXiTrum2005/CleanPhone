package com.thinkup.network.bigo;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener;
import java.util.Map;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.api.RewardVideoAd;
import sg.bigo.ads.api.RewardVideoAdLoader;
import sg.bigo.ads.api.RewardVideoAdRequest;

/* JADX INFO: loaded from: classes6.dex */
public class BigoTURewardedVideoAdapter extends CustomRewardVideoAdapter {
    private RewardVideoAd m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42535n;
    private String o;

    /* JADX INFO: renamed from: com.thinkup.network.bigo.BigoTURewardedVideoAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements AdLoadListener<RewardVideoAd> {
        public AnonymousClass3() {
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public final void onError(AdError adError) {
            if (((TUBaseAdInternalAdapter) BigoTURewardedVideoAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) BigoTURewardedVideoAdapter.this).mLoadListener.onAdLoadError(String.valueOf(adError.getCode()), adError.getMessage());
            }
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public final void onAdLoaded(RewardVideoAd rewardVideoAd) {
            BigoTURewardedVideoAdapter.this.m = rewardVideoAd;
            if (((TUBaseAdInternalAdapter) BigoTURewardedVideoAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) BigoTURewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    public static /* synthetic */ void no(BigoTURewardedVideoAdapter bigoTURewardedVideoAdapter) {
        RewardVideoAdRequest.Builder builderWithSlotId = new RewardVideoAdRequest.Builder().withSlotId(bigoTURewardedVideoAdapter.o);
        if (!TextUtils.isEmpty(bigoTURewardedVideoAdapter.f42535n)) {
            builderWithSlotId.withBid(bigoTURewardedVideoAdapter.f42535n);
        }
        new RewardVideoAdLoader.Builder().withAdLoadListener((AdLoadListener<RewardVideoAd>) bigoTURewardedVideoAdapter.new AnonymousClass3()).build().loadAd(builderWithSlotId.build());
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        RewardVideoAd rewardVideoAd = this.m;
        if (rewardVideoAd != null) {
            rewardVideoAd.destroy();
            this.m = null;
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        BigoTUInitManager.getInstance().o(context, map, false, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return BigoTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return BigoTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        RewardVideoAd rewardVideoAd = this.m;
        return (rewardVideoAd == null || rewardVideoAd.isExpired()) ? false : true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        this.o = TUInitMediation.getStringFromMap(map, "slot_id");
        if (!TextUtils.isEmpty(stringFromMap) && !TextUtils.isEmpty(this.o)) {
            this.f42535n = TUInitMediation.getStringFromMap(map, "payload");
            BigoTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.bigo.BigoTURewardedVideoAdapter.2
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) BigoTURewardedVideoAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) BigoTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    BigoTURewardedVideoAdapter.no(BigoTURewardedVideoAdapter.this);
                }
            });
        } else {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "Bigo: app_id or slot_id is empty");
            }
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return BigoTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        RewardVideoAd rewardVideoAd = this.m;
        if (rewardVideoAd != null) {
            rewardVideoAd.setAdInteractionListener(new RewardAdInteractionListener() { // from class: com.thinkup.network.bigo.BigoTURewardedVideoAdapter.1
                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdClicked() {
                    if (((CustomRewardVideoAdapter) BigoTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) BigoTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                    }
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdClosed() {
                    if (((CustomRewardVideoAdapter) BigoTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) BigoTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                    }
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdError(AdError adError) {
                    if (((CustomRewardVideoAdapter) BigoTURewardedVideoAdapter.this).mImpressionListener != null) {
                        CustomRewardedVideoEventListener customRewardedVideoEventListener = ((CustomRewardVideoAdapter) BigoTURewardedVideoAdapter.this).mImpressionListener;
                        StringBuilder sb = new StringBuilder();
                        sb.append(adError.getCode());
                        customRewardedVideoEventListener.onRewardedVideoAdPlayFailed(sb.toString(), adError.getMessage());
                    }
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdImpression() {
                    if (((CustomRewardVideoAdapter) BigoTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) BigoTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                    }
                }

                @Override // sg.bigo.ads.api.AdInteractionListener
                public final void onAdOpened() {
                }

                @Override // sg.bigo.ads.api.RewardAdInteractionListener
                public final void onAdRewarded() {
                    if (((CustomRewardVideoAdapter) BigoTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) BigoTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                    }
                    if (((CustomRewardVideoAdapter) BigoTURewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) BigoTURewardedVideoAdapter.this).mImpressionListener.onReward();
                    }
                }
            });
            try {
                this.m.show(activity);
            } catch (Throwable unused) {
                this.m.show();
            }
        }
    }

    private void o() {
        RewardVideoAdRequest.Builder builderWithSlotId = new RewardVideoAdRequest.Builder().withSlotId(this.o);
        if (!TextUtils.isEmpty(this.f42535n)) {
            builderWithSlotId.withBid(this.f42535n);
        }
        new RewardVideoAdLoader.Builder().withAdLoadListener((AdLoadListener<RewardVideoAd>) new AnonymousClass3()).build().loadAd(builderWithSlotId.build());
    }
}
