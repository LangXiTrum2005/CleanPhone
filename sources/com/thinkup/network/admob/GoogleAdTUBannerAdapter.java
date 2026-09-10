package com.thinkup.network.admob;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class GoogleAdTUBannerAdapter extends CustomBannerAdapter {
    AdManagerAdView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f42504n;
    AdManagerAdRequest o = null;
    private String on = "";
    int o0 = 0;
    final int oo = 1;
    final int om = 2;
    private Map<String, Object> m0 = new HashMap();

    /* JADX INFO: renamed from: com.thinkup.network.admob.GoogleAdTUBannerAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends AdListener {
        final /* synthetic */ AdManagerAdView o;

        public AnonymousClass2(AdManagerAdView adManagerAdView) {
            this.o = adManagerAdView;
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClicked() {
            if (GoogleAdTUBannerAdapter.this.o0 != 1 || Math.abs(SystemClock.elapsedRealtime() - GoogleAdTUBannerAdapter.this.f42504n) >= 1000) {
                GoogleAdTUBannerAdapter googleAdTUBannerAdapter = GoogleAdTUBannerAdapter.this;
                googleAdTUBannerAdapter.o0 = 2;
                googleAdTUBannerAdapter.f42504n = SystemClock.elapsedRealtime();
                CustomBannerEventListener customBannerEventListener = GoogleAdTUBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            if (((TUBaseAdInternalAdapter) GoogleAdTUBannerAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GoogleAdTUBannerAdapter.this).mLoadListener.onAdLoadError(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdImpression() {
            try {
                if (GoogleAdTUBannerAdapter.this.m != null) {
                    AdMobTUInitManager.getInstance().o(GoogleAdTUBannerAdapter.this.getTrackingInfo().omm(), GoogleAdTUBannerAdapter.this.m);
                }
            } catch (Throwable unused) {
            }
            CustomBannerEventListener customBannerEventListener = GoogleAdTUBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdShow();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            GoogleAdTUBannerAdapter googleAdTUBannerAdapter = GoogleAdTUBannerAdapter.this;
            AdManagerAdView adManagerAdView = this.o;
            googleAdTUBannerAdapter.m = adManagerAdView;
            ResponseInfo responseInfo = adManagerAdView.getResponseInfo();
            if (responseInfo != null) {
                GoogleAdTUBannerAdapter.this.m0.put("response_info", responseInfo);
            }
            if (((TUBaseAdInternalAdapter) GoogleAdTUBannerAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GoogleAdTUBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            if (GoogleAdTUBannerAdapter.this.o0 != 2 || Math.abs(SystemClock.elapsedRealtime() - GoogleAdTUBannerAdapter.this.f42504n) >= 1000) {
                GoogleAdTUBannerAdapter googleAdTUBannerAdapter = GoogleAdTUBannerAdapter.this;
                googleAdTUBannerAdapter.o0 = 1;
                googleAdTUBannerAdapter.f42504n = SystemClock.elapsedRealtime();
                CustomBannerEventListener customBannerEventListener = GoogleAdTUBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        AdManagerAdView adManagerAdView = this.m;
        if (adManagerAdView != null) {
            adManagerAdView.setAdListener(null);
            this.m.destroy();
            this.m = null;
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.m;
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(0, GoogleAdTUAdapter.class);
        return map;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        if (this.m0 == null) {
            this.m0 = new HashMap();
        }
        try {
            AdManagerAdView adManagerAdView = this.m;
            if (adManagerAdView != null) {
                this.m0.put(AdmobTUConst.ADMOB_IS_COLLAPSIBLE, Boolean.valueOf(adManagerAdView.isCollapsible()));
            }
        } catch (Throwable unused) {
        }
        return this.m0;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return AdMobTUInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.on;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "unit_id");
        this.on = stringFromMap;
        if (!TextUtils.isEmpty(stringFromMap)) {
            final Context applicationContext = context.getApplicationContext();
            postOnMainThread(new Runnable() { // from class: com.thinkup.network.admob.GoogleAdTUBannerAdapter.1
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdTUBannerAdapter.o(GoogleAdTUBannerAdapter.this, applicationContext, map, map2);
                }
            });
        } else {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "unitId is empty.");
            }
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return AdMobTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    private void o(Context context, Map<String, Object> map, Map<String, Object> map2) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        adManagerAdView.setAdSizes(AdmobTUConst.o(context, map2, map));
        adManagerAdView.setAdUnitId(this.on);
        adManagerAdView.setAdListener(new AnonymousClass2(adManagerAdView));
        AdManagerAdRequest adManagerAdRequestBuild = AdMobTUInitManager.getInstance().o(context, map, map2, AdFormat.BANNER).build();
        this.o = adManagerAdRequestBuild;
        adManagerAdView.loadAd(adManagerAdRequestBuild);
    }

    public static /* synthetic */ void o(GoogleAdTUBannerAdapter googleAdTUBannerAdapter, Context context, Map map, Map map2) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        adManagerAdView.setAdSizes(AdmobTUConst.o(context, (Map<String, Object>) map2, (Map<String, Object>) map));
        adManagerAdView.setAdUnitId(googleAdTUBannerAdapter.on);
        adManagerAdView.setAdListener(googleAdTUBannerAdapter.new AnonymousClass2(adManagerAdView));
        AdManagerAdRequest adManagerAdRequestBuild = AdMobTUInitManager.getInstance().o(context, (Map<String, Object>) map, (Map<String, Object>) map2, AdFormat.BANNER).build();
        googleAdTUBannerAdapter.o = adManagerAdRequestBuild;
        adManagerAdView.loadAd(adManagerAdRequestBuild);
    }
}
