package com.thinkup.network.admob;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class GoogleAdTUInterstitialAdapter extends CustomInterstitialAdapter {
    private static final String o0 = "AdmobTUInterstitialAdapter";
    InterstitialAd o;
    private FullScreenContentCallback om;
    private InterstitialAdLoadCallback on;
    AdManagerAdRequest m = null;
    private String oo = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f42506n = false;
    private Map<String, Object> m0 = new HashMap();

    /* JADX INFO: renamed from: com.thinkup.network.admob.GoogleAdTUInterstitialAdapter$1, reason: invalid class name */
    public class AnonymousClass1 extends InterstitialAdLoadCallback {
        public AnonymousClass1() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            GoogleAdTUInterstitialAdapter googleAdTUInterstitialAdapter = GoogleAdTUInterstitialAdapter.this;
            googleAdTUInterstitialAdapter.o = null;
            if (((TUBaseAdInternalAdapter) googleAdTUInterstitialAdapter).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GoogleAdTUInterstitialAdapter.this).mLoadListener.onAdLoadError(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdLoaded(InterstitialAd interstitialAd) {
            GoogleAdTUInterstitialAdapter.this.o = interstitialAd;
            ResponseInfo responseInfo = interstitialAd.getResponseInfo();
            if (responseInfo != null) {
                GoogleAdTUInterstitialAdapter.this.m0.put("response_info", responseInfo);
            }
            GoogleAdTUInterstitialAdapter googleAdTUInterstitialAdapter = GoogleAdTUInterstitialAdapter.this;
            googleAdTUInterstitialAdapter.f42506n = true;
            if (((TUBaseAdInternalAdapter) googleAdTUInterstitialAdapter).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GoogleAdTUInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.admob.GoogleAdTUInterstitialAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ Context o;

        public AnonymousClass2(Context context) {
            this.o = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Context context = this.o;
                String str = GoogleAdTUInterstitialAdapter.this.oo;
                GoogleAdTUInterstitialAdapter googleAdTUInterstitialAdapter = GoogleAdTUInterstitialAdapter.this;
                InterstitialAd.load(context, str, googleAdTUInterstitialAdapter.m, googleAdTUInterstitialAdapter.on);
            } catch (Throwable th) {
                if (((TUBaseAdInternalAdapter) GoogleAdTUInterstitialAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) GoogleAdTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    public static /* synthetic */ int nm(GoogleAdTUInterstitialAdapter googleAdTUInterstitialAdapter) {
        googleAdTUInterstitialAdapter.mDismissType = 99;
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
            this.on = null;
            this.om = null;
            this.m = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(4, GoogleAdTUSplashAdapter.class);
        return map;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.m0;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return AdMobTUInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.oo;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        return this.o != null && this.f42506n;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "unit_id");
        this.oo = stringFromMap;
        if (!TextUtils.isEmpty(stringFromMap)) {
            final Context applicationContext = context.getApplicationContext();
            AdMobTUInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.thinkup.network.admob.GoogleAdTUInterstitialAdapter.3
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) GoogleAdTUInterstitialAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) GoogleAdTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    GoogleAdTUInterstitialAdapter.o(GoogleAdTUInterstitialAdapter.this, applicationContext, map, map2);
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
                Log.e(o0, "show(), activity = null");
                return;
            }
            this.f42506n = false;
            FullScreenContentCallback fullScreenContentCallback = new FullScreenContentCallback() { // from class: com.thinkup.network.admob.GoogleAdTUInterstitialAdapter.4
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public final void onAdClicked() {
                    if (((CustomInterstitialAdapter) GoogleAdTUInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) GoogleAdTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public final void onAdDismissedFullScreenContent() {
                    try {
                        if (GoogleAdTUInterstitialAdapter.this.o != null) {
                            AdMobTUInitManager.getInstance().o(GoogleAdTUInterstitialAdapter.this.getTrackingInfo().omm());
                        }
                    } catch (Throwable unused) {
                    }
                    if (((CustomInterstitialAdapter) GoogleAdTUInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) GoogleAdTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public final void onAdFailedToShowFullScreenContent(AdError adError) {
                    GoogleAdTUInterstitialAdapter.nm(GoogleAdTUInterstitialAdapter.this);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public final void onAdShowedFullScreenContent() {
                    try {
                        if (GoogleAdTUInterstitialAdapter.this.o != null) {
                            AdMobTUInitManager.getInstance().o(GoogleAdTUInterstitialAdapter.this.getTrackingInfo().omm(), GoogleAdTUInterstitialAdapter.this.o);
                        }
                    } catch (Throwable unused) {
                    }
                    if (((CustomInterstitialAdapter) GoogleAdTUInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) GoogleAdTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                    }
                }
            };
            this.om = fullScreenContentCallback;
            this.o.setFullScreenContentCallback(fullScreenContentCallback);
            this.o.show(activity);
        }
    }

    private void o(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.m = AdMobTUInitManager.getInstance().o(context, map, map2, AdFormat.INTERSTITIAL).build();
        this.on = new AnonymousClass1();
        postOnMainThread(new AnonymousClass2(context));
    }

    public static /* synthetic */ void o(GoogleAdTUInterstitialAdapter googleAdTUInterstitialAdapter, Context context, Map map, Map map2) {
        googleAdTUInterstitialAdapter.m = AdMobTUInitManager.getInstance().o(context, (Map<String, Object>) map, (Map<String, Object>) map2, AdFormat.INTERSTITIAL).build();
        googleAdTUInterstitialAdapter.on = googleAdTUInterstitialAdapter.new AnonymousClass1();
        googleAdTUInterstitialAdapter.postOnMainThread(googleAdTUInterstitialAdapter.new AnonymousClass2(context));
    }
}
