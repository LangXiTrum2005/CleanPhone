package com.thinkup.network.facebook;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationBidManager;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class FacebookTUBannerAdapter extends CustomBannerAdapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42549n;
    AdView o;
    Map<String, Object> o0;
    private String oo = "";
    String m = "";

    /* JADX INFO: renamed from: com.thinkup.network.facebook.FacebookTUBannerAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements AdListener {
        public AnonymousClass1() {
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdClicked(Ad ad) {
            CustomBannerEventListener customBannerEventListener = FacebookTUBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdClicked();
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdLoaded(Ad ad) {
            FacebookTUBannerAdapter facebookTUBannerAdapter = FacebookTUBannerAdapter.this;
            facebookTUBannerAdapter.o = (AdView) ad;
            if (((TUBaseAdInternalAdapter) facebookTUBannerAdapter).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) FacebookTUBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onError(Ad ad, AdError adError) {
            if (((TUBaseAdInternalAdapter) FacebookTUBannerAdapter.this).mLoadListener != null) {
                TUCustomLoadListener tUCustomLoadListener = ((TUBaseAdInternalAdapter) FacebookTUBannerAdapter.this).mLoadListener;
                StringBuilder sb = new StringBuilder();
                sb.append(adError.getErrorCode());
                tUCustomLoadListener.onAdLoadError(sb.toString(), adError.getErrorMessage());
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onLoggingImpression(Ad ad) {
            CustomBannerEventListener customBannerEventListener = FacebookTUBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdShow();
            }
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        AdView adView = this.o;
        if (adView != null) {
            adView.destroy();
            this.o = null;
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.o;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public MediationBidManager getBidManager() {
        return FacebookBidkitManager.getInstance();
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        try {
            this.oo = (String) map.get("unit_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FacebookTUInitManager.getInstance().o(context, map, true, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(0, FacebookTUAdapter.class);
        return map;
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
        return this.oo;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return FacebookTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        AdView adView;
        if (!map.containsKey("unit_id")) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "facebook unitid is empty.");
                return;
            }
            return;
        }
        this.oo = (String) map.get("unit_id");
        FacebookTUInitManager.getInstance().initSDK(context.getApplicationContext(), map);
        if (map.containsKey("size")) {
            this.m = map.get("size").toString();
        }
        if (map.containsKey("payload")) {
            this.f42549n = map.get("payload").toString();
            HashMap map3 = new HashMap();
            this.o0 = map3;
            FacebookTUInitManager.getInstance();
            map3.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookTUInitManager.o(this.f42549n));
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        Context applicationContext = context.getApplicationContext();
        String str = this.m;
        str.getClass();
        switch (str) {
            case "300x250":
            case "320x250":
                adView = new AdView(applicationContext, this.oo, AdSize.RECTANGLE_HEIGHT_250);
                break;
            case "320x50":
                adView = new AdView(applicationContext, this.oo, AdSize.BANNER_HEIGHT_50);
                break;
            case "320x90":
                adView = new AdView(applicationContext, this.oo, AdSize.BANNER_HEIGHT_90);
                break;
            default:
                adView = new AdView(applicationContext, this.oo, AdSize.BANNER_HEIGHT_50);
                break;
        }
        if (TextUtils.isEmpty(this.f42549n)) {
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(anonymousClass1).build());
        } else {
            adView.loadAd(adView.buildLoadAdConfig().withBid(this.f42549n).withAdListener(anonymousClass1).build());
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return false;
    }

    private void o(Context context, Map<String, Object> map) {
        AdView adView;
        if (map.containsKey("size")) {
            this.m = map.get("size").toString();
        }
        if (map.containsKey("payload")) {
            this.f42549n = map.get("payload").toString();
            HashMap map2 = new HashMap();
            this.o0 = map2;
            FacebookTUInitManager.getInstance();
            map2.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookTUInitManager.o(this.f42549n));
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        Context applicationContext = context.getApplicationContext();
        String str = this.m;
        str.getClass();
        switch (str) {
            case "300x250":
            case "320x250":
                adView = new AdView(applicationContext, this.oo, AdSize.RECTANGLE_HEIGHT_250);
                break;
            case "320x50":
                adView = new AdView(applicationContext, this.oo, AdSize.BANNER_HEIGHT_50);
                break;
            case "320x90":
                adView = new AdView(applicationContext, this.oo, AdSize.BANNER_HEIGHT_90);
                break;
            default:
                adView = new AdView(applicationContext, this.oo, AdSize.BANNER_HEIGHT_50);
                break;
        }
        if (TextUtils.isEmpty(this.f42549n)) {
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(anonymousClass1).build());
        } else {
            adView.loadAd(adView.buildLoadAdConfig().withBid(this.f42549n).withAdListener(anonymousClass1).build());
        }
    }
}
