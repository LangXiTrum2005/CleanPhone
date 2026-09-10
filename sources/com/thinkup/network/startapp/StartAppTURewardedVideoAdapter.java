package com.thinkup.network.startapp;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class StartAppTURewardedVideoAdapter extends CustomRewardVideoAdapter {
    String m = "";
    StartAppAd o;

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        if (this.o != null) {
            StartAppTUInitManager.getInstance().removeAdReference(this.o);
            this.o.setVideoListener(null);
            this.o = null;
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        StartAppTUInitManager.getInstance().o(context, map, map2, tUBidRequestInfoListener, 1);
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return StartAppTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.m;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return StartAppTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        StartAppAd startAppAd = this.o;
        return startAppAd != null && startAppAd.isReady();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        this.m = TUInitMediation.getStringFromMap(map, "ad_tag");
        String stringFromMap2 = TUInitMediation.getStringFromMap(map, "payload");
        if (TextUtils.isEmpty(stringFromMap)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "app_id could not be null.");
                return;
            }
            return;
        }
        StartAppTUInitManager.getInstance().initSDK(context, map);
        AdPreferences adPreferences = new AdPreferences();
        if (!TextUtils.isEmpty(this.m)) {
            adPreferences.setAdTag(this.m);
        }
        StartAppTUInitManager.getInstance();
        StartAppTUInitManager.o(adPreferences, map);
        StartAppAd startAppAd = new StartAppAd(context.getApplicationContext());
        this.o = startAppAd;
        StartAppAd.AdMode adMode = StartAppAd.AdMode.REWARDED_VIDEO;
        AdEventListener adEventListener = new AdEventListener() { // from class: com.thinkup.network.startapp.StartAppTURewardedVideoAdapter.1
            @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
            public final void onFailedToReceiveAd(Ad ad) {
                if (((TUBaseAdInternalAdapter) StartAppTURewardedVideoAdapter.this).mLoadListener != null) {
                    if (ad != null) {
                        ((TUBaseAdInternalAdapter) StartAppTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", ad.getErrorMessage());
                    } else {
                        ((TUBaseAdInternalAdapter) StartAppTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", "StartApp has not error msg.");
                    }
                }
            }

            @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
            public final void onReceiveAd(Ad ad) {
                if (((TUBaseAdInternalAdapter) StartAppTURewardedVideoAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) StartAppTURewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }
        };
        if (TextUtils.isEmpty(stringFromMap2)) {
            stringFromMap2 = null;
        }
        startAppAd.loadAd(adMode, adPreferences, adEventListener, stringFromMap2);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return StartAppTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        StartAppAd startAppAd = this.o;
        if (startAppAd == null || !startAppAd.isReady()) {
            return;
        }
        StartAppTUInitManager.getInstance().putAdReference(this.o);
        this.o.setVideoListener(new VideoListener() { // from class: com.thinkup.network.startapp.StartAppTURewardedVideoAdapter.2
            @Override // com.startapp.sdk.adsbase.adlisteners.VideoListener
            public final void onVideoCompleted() {
                if (((CustomRewardVideoAdapter) StartAppTURewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) StartAppTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                }
                if (((CustomRewardVideoAdapter) StartAppTURewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) StartAppTURewardedVideoAdapter.this).mImpressionListener.onReward();
                }
            }
        });
        AdDisplayListener adDisplayListener = new AdDisplayListener() { // from class: com.thinkup.network.startapp.StartAppTURewardedVideoAdapter.3
            @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
            public final void adClicked(Ad ad) {
                if (((CustomRewardVideoAdapter) StartAppTURewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) StartAppTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                }
            }

            @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
            public final void adDisplayed(Ad ad) {
                if (((CustomRewardVideoAdapter) StartAppTURewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) StartAppTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                }
            }

            @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
            public final void adHidden(Ad ad) {
                StartAppTUInitManager.getInstance().removeAdReference(StartAppTURewardedVideoAdapter.this.o);
                if (((CustomRewardVideoAdapter) StartAppTURewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) StartAppTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                }
            }

            @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
            public final void adNotDisplayed(Ad ad) {
                StartAppTUInitManager.getInstance().removeAdReference(StartAppTURewardedVideoAdapter.this.o);
                if (((CustomRewardVideoAdapter) StartAppTURewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) StartAppTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed("", ad.getErrorMessage());
                }
            }
        };
        if (TextUtils.isEmpty(this.m)) {
            this.o.showAd(adDisplayListener);
        } else {
            this.o.showAd(this.m, adDisplayListener);
        }
    }
}
