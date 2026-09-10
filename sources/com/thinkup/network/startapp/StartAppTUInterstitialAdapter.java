package com.thinkup.network.startapp;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class StartAppTUInterstitialAdapter extends CustomInterstitialAdapter {
    String m = "";
    StartAppAd o;

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        if (this.o != null) {
            StartAppTUInitManager.getInstance().removeAdReference(this.o);
            this.o.setVideoListener(null);
            this.o = null;
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        StartAppTUInitManager.getInstance().o(context, map, map2, tUBidRequestInfoListener, 3);
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
        StartAppAd.AdMode adMode;
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
        this.o = new StartAppAd(context.getApplicationContext());
        if (TextUtils.isEmpty(stringFromMap2)) {
            int intFromMap = TUInitMediation.getIntFromMap(map, "is_video", 0);
            if (intFromMap != 1) {
                adMode = intFromMap != 3 ? StartAppAd.AdMode.AUTOMATIC : StartAppAd.AdMode.OFFERWALL;
            } else {
                adMode = StartAppAd.AdMode.VIDEO;
            }
        } else {
            adMode = StartAppAd.AdMode.FULLPAGE;
        }
        AdPreferences adPreferences = new AdPreferences();
        if (!TextUtils.isEmpty(this.m)) {
            adPreferences.setAdTag(this.m);
        }
        StartAppTUInitManager.getInstance();
        StartAppTUInitManager.o(adPreferences, map);
        StartAppAd startAppAd = this.o;
        AdEventListener adEventListener = new AdEventListener() { // from class: com.thinkup.network.startapp.StartAppTUInterstitialAdapter.1
            @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
            public final void onFailedToReceiveAd(Ad ad) {
                if (((TUBaseAdInternalAdapter) StartAppTUInterstitialAdapter.this).mLoadListener != null) {
                    if (ad != null) {
                        ((TUBaseAdInternalAdapter) StartAppTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", ad.getErrorMessage());
                    } else {
                        ((TUBaseAdInternalAdapter) StartAppTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", "StartApp has not error msg.");
                    }
                }
            }

            @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
            public final void onReceiveAd(Ad ad) {
                if (((TUBaseAdInternalAdapter) StartAppTUInterstitialAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) StartAppTUInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
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

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        StartAppAd startAppAd = this.o;
        if (startAppAd == null || !startAppAd.isReady()) {
            return;
        }
        StartAppTUInitManager.getInstance().putAdReference(this.o);
        AdDisplayListener adDisplayListener = new AdDisplayListener() { // from class: com.thinkup.network.startapp.StartAppTUInterstitialAdapter.2
            @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
            public final void adClicked(Ad ad) {
                if (((CustomInterstitialAdapter) StartAppTUInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) StartAppTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                }
            }

            @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
            public final void adDisplayed(Ad ad) {
                if (((CustomInterstitialAdapter) StartAppTUInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) StartAppTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                }
            }

            @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
            public final void adHidden(Ad ad) {
                StartAppTUInitManager.getInstance().removeAdReference(StartAppTUInterstitialAdapter.this.o);
                if (((CustomInterstitialAdapter) StartAppTUInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) StartAppTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                }
            }

            @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
            public final void adNotDisplayed(Ad ad) {
                StartAppTUInitManager.getInstance().removeAdReference(StartAppTUInterstitialAdapter.this.o);
                if (((CustomInterstitialAdapter) StartAppTUInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) StartAppTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError("", ad.getErrorMessage());
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
