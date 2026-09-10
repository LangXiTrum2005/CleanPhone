package com.thinkup.network.admob;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AdmobTUBannerAdapter extends CustomBannerAdapter {
    private static final String mo = "AdmobTUBannerAdapter";
    AdView m;
    private String mn;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f42493n;
    Map<String, Object> on;
    AdRequest o = null;
    private String mm = "";
    int o0 = 0;
    final int oo = 1;
    final int om = 2;
    private boolean n0 = false;
    boolean m0 = false;

    /* JADX INFO: renamed from: com.thinkup.network.admob.AdmobTUBannerAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends AdListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f42495n = false;
        final /* synthetic */ AdView o;

        public AnonymousClass2(AdView adView) {
            this.o = adView;
        }

        public static /* synthetic */ boolean m(AnonymousClass2 anonymousClass2) {
            anonymousClass2.f42495n = true;
            return true;
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClicked() {
            if (AdmobTUBannerAdapter.this.o0 != 1 || Math.abs(SystemClock.elapsedRealtime() - AdmobTUBannerAdapter.this.f42493n) >= 1000) {
                AdmobTUBannerAdapter admobTUBannerAdapter = AdmobTUBannerAdapter.this;
                admobTUBannerAdapter.o0 = 2;
                admobTUBannerAdapter.f42493n = SystemClock.elapsedRealtime();
                CustomBannerEventListener customBannerEventListener = AdmobTUBannerAdapter.this.mImpressionEventListener;
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
            if (((TUBaseAdInternalAdapter) AdmobTUBannerAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) AdmobTUBannerAdapter.this).mLoadListener.onAdLoadError(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdImpression() {
            String unused = AdmobTUBannerAdapter.mo;
            try {
                if (AdmobTUBannerAdapter.this.m != null) {
                    AdMobTUInitManager.getInstance().o(AdmobTUBannerAdapter.this.getTrackingInfo().omm(), AdmobTUBannerAdapter.this.m);
                }
            } catch (Throwable unused2) {
            }
            if (AdmobTUBannerAdapter.this.n0) {
                this.f42495n = false;
                AdmobTUBannerAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.thinkup.network.admob.AdmobTUBannerAdapter.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (AnonymousClass2.this.f42495n) {
                            return;
                        }
                        AnonymousClass2.m(AnonymousClass2.this);
                        CustomBannerEventListener customBannerEventListener = AdmobTUBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdShow();
                        }
                    }
                }, 500L);
                return;
            }
            this.f42495n = true;
            CustomBannerEventListener customBannerEventListener = AdmobTUBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdShow();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            AdmobTUBannerAdapter admobTUBannerAdapter = AdmobTUBannerAdapter.this;
            AdView adView = this.o;
            admobTUBannerAdapter.m = adView;
            ResponseInfo responseInfo = adView.getResponseInfo();
            if (responseInfo != null) {
                AdmobTUBannerAdapter.this.on.put("response_info", responseInfo);
            }
            if (AdmobTUBannerAdapter.this.n0) {
                AdmobTUBannerAdapter.this.m.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.thinkup.network.admob.AdmobTUBannerAdapter.2.1
                    @Override // com.google.android.gms.ads.OnPaidEventListener
                    public final void onPaidEvent(AdValue adValue) {
                        String unused = AdmobTUBannerAdapter.mo;
                        if (AnonymousClass2.this.f42495n) {
                            return;
                        }
                        AnonymousClass2.m(AnonymousClass2.this);
                        AdMobTUInitManager.getInstance();
                        AdMobTUInitManager.o(AdmobTUBannerAdapter.this.on, adValue);
                        CustomBannerEventListener customBannerEventListener = AdmobTUBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdShow();
                        }
                    }
                });
            }
            if (((TUBaseAdInternalAdapter) AdmobTUBannerAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) AdmobTUBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            AdmobTUBannerAdapter admobTUBannerAdapter = AdmobTUBannerAdapter.this;
            if (admobTUBannerAdapter.m0) {
                return;
            }
            if (admobTUBannerAdapter.o0 != 2 || Math.abs(SystemClock.elapsedRealtime() - AdmobTUBannerAdapter.this.f42493n) >= 1000) {
                AdmobTUBannerAdapter admobTUBannerAdapter2 = AdmobTUBannerAdapter.this;
                admobTUBannerAdapter2.o0 = 1;
                admobTUBannerAdapter2.f42493n = SystemClock.elapsedRealtime();
                CustomBannerEventListener customBannerEventListener = AdmobTUBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        AdView adView = this.m;
        if (adView != null) {
            adView.setAdListener(null);
            this.m.destroy();
            this.m = null;
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.m;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        AdMobTUInitManager.getInstance().o(context, map, map2, AdFormat.BANNER, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(0, AdmobTUAdapter.class);
        return map;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        if (this.on == null) {
            this.on = new HashMap();
        }
        try {
            AdView adView = this.m;
            if (adView != null) {
                this.on.put(AdmobTUConst.ADMOB_IS_COLLAPSIBLE, Boolean.valueOf(adView.isCollapsible()));
            }
        } catch (Throwable unused) {
        }
        return this.on;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return AdMobTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.mm;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.mm = TUInitMediation.getStringFromMap(map, "unit_id");
        this.mn = TUInitMediation.getStringFromMap(map, "payload");
        this.n0 = TUInitMediation.getIntFromMap(map, "admob_show_with_pay_info", 2) == 1;
        this.m0 = TUInitMediation.getIntFromMap(map, "admob_clbn_sw", 1) != 1;
        if (!TextUtils.isEmpty(this.mm)) {
            AdMobTUInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.thinkup.network.admob.AdmobTUBannerAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) AdmobTUBannerAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) AdmobTUBannerAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    AdmobTUBannerAdapter.this.postOnMainThread(new Runnable() { // from class: com.thinkup.network.admob.AdmobTUBannerAdapter.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            AdmobTUBannerAdapter.o(AdmobTUBannerAdapter.this, context, map, map2);
                        }
                    });
                }
            });
            return;
        }
        TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdLoadError("", "unitId is empty.");
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return AdMobTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    private void o(Context context, Map<String, Object> map, Map<String, Object> map2) {
        AdView adView = new AdView(context);
        adView.setAdSize(AdmobTUConst.o(context, map2, map));
        adView.setAdUnitId(this.mm);
        this.on = new HashMap();
        adView.setAdListener(new AnonymousClass2(adView));
        AdRequest.Builder builderO = AdMobTUInitManager.getInstance().o(context, map, map2, AdFormat.BANNER, !TextUtils.isEmpty(this.mn));
        if (!TextUtils.isEmpty(this.mn)) {
            builderO.setAdString(this.mn);
        }
        AdRequest adRequestBuild = builderO.build();
        this.o = adRequestBuild;
        adView.loadAd(adRequestBuild);
    }

    public static /* synthetic */ void o(AdmobTUBannerAdapter admobTUBannerAdapter, Context context, Map map, Map map2) {
        AdView adView = new AdView(context);
        adView.setAdSize(AdmobTUConst.o(context, (Map<String, Object>) map2, (Map<String, Object>) map));
        adView.setAdUnitId(admobTUBannerAdapter.mm);
        admobTUBannerAdapter.on = new HashMap();
        adView.setAdListener(admobTUBannerAdapter.new AnonymousClass2(adView));
        AdRequest.Builder builderO = AdMobTUInitManager.getInstance().o(context, (Map<String, Object>) map, (Map<String, Object>) map2, AdFormat.BANNER, !TextUtils.isEmpty(admobTUBannerAdapter.mn));
        if (!TextUtils.isEmpty(admobTUBannerAdapter.mn)) {
            builderO.setAdString(admobTUBannerAdapter.mn);
        }
        AdRequest adRequestBuild = builderO.build();
        admobTUBannerAdapter.o = adRequestBuild;
        adView.loadAd(adRequestBuild);
    }
}
