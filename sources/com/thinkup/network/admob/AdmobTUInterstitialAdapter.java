package com.thinkup.network.admob;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AdmobTUInterstitialAdapter extends CustomInterstitialAdapter {
    private static final String oo = "AdmobTUInterstitialAdapter";
    private FullScreenContentCallback m0;
    private InterstitialAdLoadCallback mo;
    InterstitialAd o;
    Map<String, Object> o0;
    private String on;
    AdRequest m = null;
    private String om = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f42496n = false;
    private boolean mm = false;
    private boolean mn = false;

    /* JADX INFO: renamed from: com.thinkup.network.admob.AdmobTUInterstitialAdapter$1, reason: invalid class name */
    public class AnonymousClass1 extends InterstitialAdLoadCallback {
        public AnonymousClass1() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            AdmobTUInterstitialAdapter admobTUInterstitialAdapter = AdmobTUInterstitialAdapter.this;
            admobTUInterstitialAdapter.o = null;
            if (((TUBaseAdInternalAdapter) admobTUInterstitialAdapter).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) AdmobTUInterstitialAdapter.this).mLoadListener.onAdLoadError(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdLoaded(InterstitialAd interstitialAd) {
            AdmobTUInterstitialAdapter.this.o = interstitialAd;
            ResponseInfo responseInfo = interstitialAd.getResponseInfo();
            if (responseInfo != null) {
                AdmobTUInterstitialAdapter.this.o0.put("response_info", responseInfo);
            }
            AdmobTUInterstitialAdapter admobTUInterstitialAdapter = AdmobTUInterstitialAdapter.this;
            admobTUInterstitialAdapter.f42496n = true;
            if (admobTUInterstitialAdapter.mm) {
                AdmobTUInterstitialAdapter.this.o.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.thinkup.network.admob.AdmobTUInterstitialAdapter.1.1
                    @Override // com.google.android.gms.ads.OnPaidEventListener
                    public final void onPaidEvent(AdValue adValue) {
                        if (AdmobTUInterstitialAdapter.this.mn) {
                            return;
                        }
                        AdmobTUInterstitialAdapter.n(AdmobTUInterstitialAdapter.this);
                        AdMobTUInitManager.getInstance();
                        AdMobTUInitManager.o(AdmobTUInterstitialAdapter.this.o0, adValue);
                        if (((CustomInterstitialAdapter) AdmobTUInterstitialAdapter.this).mImpressListener != null) {
                            ((CustomInterstitialAdapter) AdmobTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                        }
                    }
                });
            }
            if (((TUBaseAdInternalAdapter) AdmobTUInterstitialAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) AdmobTUInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.admob.AdmobTUInterstitialAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ Context o;

        public AnonymousClass2(Context context) {
            this.o = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Context context = this.o;
                String str = AdmobTUInterstitialAdapter.this.om;
                AdmobTUInterstitialAdapter admobTUInterstitialAdapter = AdmobTUInterstitialAdapter.this;
                InterstitialAd.load(context, str, admobTUInterstitialAdapter.m, admobTUInterstitialAdapter.mo);
            } catch (Throwable th) {
                if (((TUBaseAdInternalAdapter) AdmobTUInterstitialAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) AdmobTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    public static /* synthetic */ boolean n(AdmobTUInterstitialAdapter admobTUInterstitialAdapter) {
        admobTUInterstitialAdapter.mn = true;
        return true;
    }

    public static /* synthetic */ int o0m(AdmobTUInterstitialAdapter admobTUInterstitialAdapter) {
        admobTUInterstitialAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        try {
            InterstitialAd interstitialAd = this.o;
            if (interstitialAd != null) {
                interstitialAd.setFullScreenContentCallback(null);
                this.o = null;
            }
            this.mo = null;
            this.m0 = null;
            this.m = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        AdMobTUInitManager.getInstance().o(context, map, map2, AdFormat.INTERSTITIAL, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(4, AdmobTUSplashAdapter.class);
        map.put(0, AdmobTUAdapter.class);
        return map;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.o0;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return AdMobTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.om;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        return this.o != null && this.f42496n;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.om = TUInitMediation.getStringFromMap(map, "unit_id");
        this.on = TUInitMediation.getStringFromMap(map, "payload");
        this.mm = TUInitMediation.getIntFromMap(map, "admob_show_with_pay_info", 2) == 1;
        if (!TextUtils.isEmpty(this.om)) {
            final Context applicationContext = context.getApplicationContext();
            AdMobTUInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.thinkup.network.admob.AdmobTUInterstitialAdapter.3
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) AdmobTUInterstitialAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) AdmobTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    AdmobTUInterstitialAdapter.o(AdmobTUInterstitialAdapter.this, applicationContext, map, map2);
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

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            if (activity == null) {
                Log.e(oo, "Admob: show(), activity = null");
                return;
            }
            this.f42496n = false;
            FullScreenContentCallback fullScreenContentCallback = new FullScreenContentCallback() { // from class: com.thinkup.network.admob.AdmobTUInterstitialAdapter.4
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public final void onAdClicked() {
                    if (((CustomInterstitialAdapter) AdmobTUInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) AdmobTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public final void onAdDismissedFullScreenContent() {
                    try {
                        AdMobTUInitManager.getInstance().o(AdmobTUInterstitialAdapter.this.getTrackingInfo().omm());
                    } catch (Throwable unused) {
                    }
                    if (((CustomInterstitialAdapter) AdmobTUInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) AdmobTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public final void onAdFailedToShowFullScreenContent(AdError adError) {
                    AdmobTUInterstitialAdapter.o0m(AdmobTUInterstitialAdapter.this);
                    if (((CustomInterstitialAdapter) AdmobTUInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) AdmobTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError(String.valueOf(adError.getCode()), adError.getMessage());
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public final void onAdShowedFullScreenContent() {
                    try {
                        if (AdmobTUInterstitialAdapter.this.o != null) {
                            AdMobTUInitManager.getInstance().o(AdmobTUInterstitialAdapter.this.getTrackingInfo().omm(), AdmobTUInterstitialAdapter.this.o);
                        }
                    } catch (Throwable unused) {
                    }
                    if (AdmobTUInterstitialAdapter.this.mm) {
                        AdmobTUInterstitialAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.thinkup.network.admob.AdmobTUInterstitialAdapter.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (AdmobTUInterstitialAdapter.this.mn) {
                                    return;
                                }
                                AdmobTUInterstitialAdapter.n(AdmobTUInterstitialAdapter.this);
                                if (((CustomInterstitialAdapter) AdmobTUInterstitialAdapter.this).mImpressListener != null) {
                                    ((CustomInterstitialAdapter) AdmobTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                                }
                            }
                        }, 500L);
                    } else if (((CustomInterstitialAdapter) AdmobTUInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) AdmobTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                    }
                }
            };
            this.m0 = fullScreenContentCallback;
            this.o.setFullScreenContentCallback(fullScreenContentCallback);
            this.o.show(activity);
        }
    }

    private void o(Context context, Map<String, Object> map, Map<String, Object> map2) {
        AdRequest.Builder builderO = AdMobTUInitManager.getInstance().o(context.getApplicationContext(), map, map2, AdFormat.INTERSTITIAL, !TextUtils.isEmpty(this.on));
        if (!TextUtils.isEmpty(this.on)) {
            builderO.setAdString(this.on);
        }
        this.m = builderO.build();
        this.o0 = new HashMap();
        this.mo = new AnonymousClass1();
        postOnMainThread(new AnonymousClass2(context));
    }

    public static /* synthetic */ void o(AdmobTUInterstitialAdapter admobTUInterstitialAdapter, Context context, Map map, Map map2) {
        AdRequest.Builder builderO = AdMobTUInitManager.getInstance().o(context.getApplicationContext(), (Map<String, Object>) map, (Map<String, Object>) map2, AdFormat.INTERSTITIAL, !TextUtils.isEmpty(admobTUInterstitialAdapter.on));
        if (!TextUtils.isEmpty(admobTUInterstitialAdapter.on)) {
            builderO.setAdString(admobTUInterstitialAdapter.on);
        }
        admobTUInterstitialAdapter.m = builderO.build();
        admobTUInterstitialAdapter.o0 = new HashMap();
        admobTUInterstitialAdapter.mo = admobTUInterstitialAdapter.new AnonymousClass1();
        admobTUInterstitialAdapter.postOnMainThread(admobTUInterstitialAdapter.new AnonymousClass2(context));
    }
}
