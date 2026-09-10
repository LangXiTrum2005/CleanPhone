package com.thinkup.network.chartboost;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.RewardEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class ChartboostTURewardedVideoAdapter extends CustomRewardVideoAdapter implements RewardedCallback {
    private Rewarded m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42541n;
    String o = "";
    private String o0 = "ChartboostTURewardedVideoAdapter";

    private static void o() {
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        Rewarded rewarded = this.m;
        if (rewarded != null) {
            rewarded.clearCache();
            this.m = null;
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return ChartboostTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return ChartboostTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map == null || !map.containsKey("app_id") || !map.containsKey("app_signature") || !map.containsKey("location")) {
            return false;
        }
        this.o = TUInitMediation.getStringFromMap(map, "location");
        return true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        Rewarded rewarded = this.m;
        return (rewarded == null || !rewarded.isCached() || this.f42541n) ? false : true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        String stringFromMap2 = TUInitMediation.getStringFromMap(map, "app_signature");
        this.o = TUInitMediation.getStringFromMap(map, "location");
        if (!TextUtils.isEmpty(stringFromMap) && !TextUtils.isEmpty(stringFromMap2) && !TextUtils.isEmpty(this.o)) {
            ChartboostTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.chartboost.ChartboostTURewardedVideoAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) ChartboostTURewardedVideoAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) ChartboostTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    ChartboostTURewardedVideoAdapter.this.startload();
                }
            });
            return;
        }
        TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdLoadError("", " app_id ,app_signature or location is empty.");
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdClicked(ClickEvent clickEvent, ClickError clickError) {
        CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
        if (customRewardedVideoEventListener != null && clickError == null) {
            customRewardedVideoEventListener.onRewardedVideoAdPlayClicked();
        }
    }

    @Override // com.chartboost.sdk.callbacks.DismissibleAdCallback
    public void onAdDismiss(DismissEvent dismissEvent) {
        CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
        if (customRewardedVideoEventListener != null) {
            customRewardedVideoEventListener.onRewardedVideoAdClosed();
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdExpired(ExpirationEvent expirationEvent) {
        if (expirationEvent != null) {
            expirationEvent.toString();
        }
        this.f42541n = true;
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdLoaded(CacheEvent cacheEvent, CacheError cacheError) {
        this.f42541n = false;
        if (this.mLoadListener == null) {
            return;
        }
        Ad ad = cacheEvent.getAd();
        String adID = cacheEvent.getAdID();
        Objects.toString(ad);
        ad.getLocation();
        Objects.toString(cacheError);
        if (cacheError == null || !TextUtils.isEmpty(adID)) {
            this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
        } else {
            this.mLoadListener.onAdLoadError(String.valueOf(cacheError.getCode().getErrorCode()), cacheError.getException() != null ? cacheError.getException().getMessage() : "");
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdRequestedToShow(ShowEvent showEvent) {
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdShown(ShowEvent showEvent, ShowError showError) {
        Objects.toString(showError);
        CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
        if (customRewardedVideoEventListener == null) {
            return;
        }
        if (showError == null) {
            customRewardedVideoEventListener.onRewardedVideoAdPlayStart();
        } else {
            this.mImpressionListener.onRewardedVideoAdPlayFailed(String.valueOf(showError.getCode().getErrorCode()), showError.getException() != null ? showError.getException().getMessage() : "");
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onImpressionRecorded(ImpressionEvent impressionEvent) {
    }

    @Override // com.chartboost.sdk.callbacks.RewardedCallback
    public void onRewardEarned(RewardEvent rewardEvent) {
        CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
        if (customRewardedVideoEventListener != null) {
            customRewardedVideoEventListener.onRewardedVideoAdPlayEnd();
            this.mImpressionListener.onReward();
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return ChartboostTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        Rewarded rewarded = this.m;
        if (rewarded == null || !rewarded.isCached()) {
            return;
        }
        this.m.show();
    }

    public void startload() {
        Rewarded rewarded = new Rewarded(this.o, this, ChartboostTUInitManager.MEDIATION);
        this.m = rewarded;
        if (rewarded.isCached()) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdCacheLoaded(new BaseAd[0]);
                return;
            }
            return;
        }
        try {
            this.m.cache();
        } catch (Throwable th) {
            TUCustomLoadListener tUCustomLoadListener2 = this.mLoadListener;
            if (tUCustomLoadListener2 != null) {
                tUCustomLoadListener2.onAdLoadError("", th.getMessage());
            }
        }
    }
}
