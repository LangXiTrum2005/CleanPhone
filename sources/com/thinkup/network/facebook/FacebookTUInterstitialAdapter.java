package com.thinkup.network.facebook;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationBidManager;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class FacebookTUInterstitialAdapter extends CustomInterstitialAdapter {
    String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42553n;
    InterstitialAd o;
    Map<String, Object> o0;
    boolean oo;

    /* JADX INFO: renamed from: com.thinkup.network.facebook.FacebookTUInterstitialAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements InterstitialAdListener {
        public AnonymousClass1() {
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdClicked(Ad ad) {
            if (((CustomInterstitialAdapter) FacebookTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) FacebookTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdLoaded(Ad ad) {
            if (((TUBaseAdInternalAdapter) FacebookTUInterstitialAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) FacebookTUInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onError(Ad ad, AdError adError) {
            if (((TUBaseAdInternalAdapter) FacebookTUInterstitialAdapter.this).mLoadListener != null) {
                TUCustomLoadListener tUCustomLoadListener = ((TUBaseAdInternalAdapter) FacebookTUInterstitialAdapter.this).mLoadListener;
                StringBuilder sb = new StringBuilder();
                sb.append(adError.getErrorCode());
                tUCustomLoadListener.onAdLoadError(sb.toString(), adError.getErrorMessage());
            }
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public final void onInterstitialDismissed(Ad ad) {
            if (((CustomInterstitialAdapter) FacebookTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) FacebookTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
            }
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public final void onInterstitialDisplayed(Ad ad) {
        }

        @Override // com.facebook.ads.AdListener
        public final void onLoggingImpression(Ad ad) {
            FacebookTUInterstitialAdapter facebookTUInterstitialAdapter = FacebookTUInterstitialAdapter.this;
            if (facebookTUInterstitialAdapter.oo) {
                return;
            }
            facebookTUInterstitialAdapter.oo = true;
            if (((CustomInterstitialAdapter) facebookTUInterstitialAdapter).mImpressListener != null) {
                ((CustomInterstitialAdapter) FacebookTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
            }
        }
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        try {
            InterstitialAd interstitialAd = this.o;
            if (interstitialAd != null) {
                interstitialAd.destroy();
                this.o = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public MediationBidManager getBidManager() {
        return FacebookBidkitManager.getInstance();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        try {
            this.m = (String) map.get("unit_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FacebookTUInitManager.getInstance().o(context, map, false, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public TUInitMediation getMediationInitManager() {
        return FacebookTUInitManager.getInstance();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.o0;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return FacebookTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.m;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return FacebookTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        InterstitialAd interstitialAd = this.o;
        return (interstitialAd == null || !interstitialAd.isAdLoaded() || this.o.isAdInvalidated()) ? false : true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (!map.containsKey("unit_id")) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "facebook sdkkey is empty.");
                return;
            }
            return;
        }
        this.m = (String) map.get("unit_id");
        FacebookTUInitManager.getInstance().initSDK(context.getApplicationContext(), map);
        if (map.containsKey("payload")) {
            this.f42553n = map.get("payload").toString();
            HashMap map3 = new HashMap();
            this.o0 = map3;
            FacebookTUInitManager.getInstance();
            map3.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookTUInitManager.o(this.f42553n));
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        InterstitialAd interstitialAd = new InterstitialAd(context.getApplicationContext(), this.m);
        this.o = interstitialAd;
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderWithAdListener = interstitialAd.buildLoadAdConfig().withAdListener(anonymousClass1);
        if (!TextUtils.isEmpty(this.f42553n)) {
            interstitialAdLoadConfigBuilderWithAdListener.withBid(this.f42553n);
        }
        this.o.loadAd(interstitialAdLoadConfigBuilderWithAdListener.build());
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return false;
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        InterstitialAd interstitialAd = this.o;
        if (interstitialAd != null) {
            interstitialAd.show();
        }
    }

    private void o(Context context, Map<String, Object> map) {
        if (map.containsKey("payload")) {
            this.f42553n = map.get("payload").toString();
            HashMap map2 = new HashMap();
            this.o0 = map2;
            FacebookTUInitManager.getInstance();
            map2.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookTUInitManager.o(this.f42553n));
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        InterstitialAd interstitialAd = new InterstitialAd(context.getApplicationContext(), this.m);
        this.o = interstitialAd;
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderWithAdListener = interstitialAd.buildLoadAdConfig().withAdListener(anonymousClass1);
        if (!TextUtils.isEmpty(this.f42553n)) {
            interstitialAdLoadConfigBuilderWithAdListener.withBid(this.f42553n);
        }
        this.o.loadAd(interstitialAdLoadConfigBuilderWithAdListener.build());
    }
}
