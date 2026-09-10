package com.thinkup.network.vungle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleError;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class VungleTURewardedVideoAdapter extends CustomRewardVideoAdapter {
    AdConfig m;
    String o;
    RewardedAd o0;
    private final String oo = "VungleTURewardedVideoAdapter";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42639n = "";
    private RewardedAdListener om = new RewardedAdListener() { // from class: com.thinkup.network.vungle.VungleTURewardedVideoAdapter.1
        @Override // com.vungle.ads.BaseAdListener
        public final void onAdClicked(BaseAd baseAd) {
            if (((CustomRewardVideoAdapter) VungleTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) VungleTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdEnd(BaseAd baseAd) {
            if (((CustomRewardVideoAdapter) VungleTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) VungleTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                ((CustomRewardVideoAdapter) VungleTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            if (((TUBaseAdInternalAdapter) VungleTURewardedVideoAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) VungleTURewardedVideoAdapter.this).mLoadListener.onAdLoadError(String.valueOf(vungleError.getCode()), vungleError.getLocalizedMessage());
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            if (((CustomRewardVideoAdapter) VungleTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) VungleTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(String.valueOf(vungleError.getCode()), vungleError.getLocalizedMessage());
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdImpression(BaseAd baseAd) {
            if (((CustomRewardVideoAdapter) VungleTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) VungleTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdLeftApplication(BaseAd baseAd) {
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdLoaded(BaseAd baseAd) {
            if (((TUBaseAdInternalAdapter) VungleTURewardedVideoAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) VungleTURewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new com.thinkup.core.api.BaseAd[0]);
            }
        }

        @Override // com.vungle.ads.RewardedAdListener
        public final void onAdRewarded(BaseAd baseAd) {
            if (((CustomRewardVideoAdapter) VungleTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) VungleTURewardedVideoAdapter.this).mImpressionListener.onReward();
            }
        }

        @Override // com.vungle.ads.BaseAdListener
        public final void onAdStart(BaseAd baseAd) {
        }
    };

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        this.m = null;
        this.om = null;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        try {
            this.o = (String) map.get("placement_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        VungleTUInitManager.getInstance().o(context, map, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public TUInitMediation getMediationInitManager() {
        return VungleTUInitManager.getInstance();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return VungleTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return VungleTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        RewardedAd rewardedAd = this.o0;
        if (rewardedAd != null) {
            return rewardedAd.canPlayAd().booleanValue();
        }
        return false;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String str = (String) map.get("app_id");
        this.o = (String) map.get("placement_id");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.o)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", " appid & placementId is empty.");
                return;
            }
            return;
        }
        if (map.containsKey("payload")) {
            this.f42639n = map.get("payload").toString();
        }
        AdConfig adConfig = new AdConfig();
        this.m = adConfig;
        adConfig.setAdOrientation(2);
        try {
            if (map2.containsKey(TUAdConst.KEY.AD_ORIENTATION)) {
                int i2 = Integer.parseInt(map2.get(TUAdConst.KEY.AD_ORIENTATION).toString());
                if (i2 == 1) {
                    this.m.setAdOrientation(0);
                } else if (i2 == 2) {
                    this.m.setAdOrientation(1);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        final Context applicationContext = context.getApplicationContext();
        VungleTUInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.thinkup.network.vungle.VungleTURewardedVideoAdapter.2
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str2) {
                if (((TUBaseAdInternalAdapter) VungleTURewardedVideoAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) VungleTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", str2);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                VungleTURewardedVideoAdapter.o(VungleTURewardedVideoAdapter.this, applicationContext);
            }
        });
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return VungleTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) throws Throwable {
        RewardedAd rewardedAd = this.o0;
        if (rewardedAd != null) {
            rewardedAd.setUserId(this.mUserId);
            this.o0.play(activity);
        }
    }

    private void o(Context context) {
        try {
            RewardedAd rewardedAd = new RewardedAd(context, this.o, this.m);
            this.o0 = rewardedAd;
            rewardedAd.setAdListener(this.om);
            this.o0.load(this.f42639n);
        } catch (Throwable th) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", th.getMessage());
            }
        }
    }

    public static /* synthetic */ void o(VungleTURewardedVideoAdapter vungleTURewardedVideoAdapter, Context context) {
        try {
            RewardedAd rewardedAd = new RewardedAd(context, vungleTURewardedVideoAdapter.o, vungleTURewardedVideoAdapter.m);
            vungleTURewardedVideoAdapter.o0 = rewardedAd;
            rewardedAd.setAdListener(vungleTURewardedVideoAdapter.om);
            vungleTURewardedVideoAdapter.o0.load(vungleTURewardedVideoAdapter.f42639n);
        } catch (Throwable th) {
            TUCustomLoadListener tUCustomLoadListener = vungleTURewardedVideoAdapter.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", th.getMessage());
            }
        }
    }
}
