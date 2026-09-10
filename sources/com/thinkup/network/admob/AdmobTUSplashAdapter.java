package com.thinkup.network.admob;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.splashad.unitgroup.api.CustomSplashAdapter;
import com.thinkup.splashad.unitgroup.api.CustomSplashEventListener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AdmobTUSplashAdapter extends CustomSplashAdapter {
    public static final String TAG = "AdmobTUSplashAdapter";
    private String m0;
    private int mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    AppOpenAd.AppOpenAdLoadCallback f42501n;
    FullScreenContentCallback o0;
    Map<String, Object> om;
    AppOpenAd oo;
    private String on = "";
    Bundle o = new Bundle();
    boolean m = false;
    private boolean mm = false;
    private boolean mn = false;

    /* JADX INFO: renamed from: com.thinkup.network.admob.AdmobTUSplashAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends AppOpenAd.AppOpenAdLoadCallback {
        public AnonymousClass2() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            if (((TUBaseAdInternalAdapter) AdmobTUSplashAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) AdmobTUSplashAdapter.this).mLoadListener.onAdLoadError(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdLoaded(AppOpenAd appOpenAd) {
            AdmobTUSplashAdapter.this.oo = appOpenAd;
            ResponseInfo responseInfo = appOpenAd.getResponseInfo();
            if (responseInfo != null) {
                AdmobTUSplashAdapter.this.om.put("response_info", responseInfo);
            }
            if (AdmobTUSplashAdapter.this.mm) {
                AdmobTUSplashAdapter.this.oo.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.thinkup.network.admob.AdmobTUSplashAdapter.2.1
                    @Override // com.google.android.gms.ads.OnPaidEventListener
                    public final void onPaidEvent(AdValue adValue) {
                        if (AdmobTUSplashAdapter.this.mn) {
                            return;
                        }
                        AdmobTUSplashAdapter.oo(AdmobTUSplashAdapter.this);
                        AdMobTUInitManager.getInstance();
                        AdMobTUInitManager.o(AdmobTUSplashAdapter.this.om, adValue);
                        if (((CustomSplashAdapter) AdmobTUSplashAdapter.this).mImpressionListener != null) {
                            ((CustomSplashAdapter) AdmobTUSplashAdapter.this).mImpressionListener.onSplashAdShow();
                        }
                    }
                });
            }
            if (((TUBaseAdInternalAdapter) AdmobTUSplashAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) AdmobTUSplashAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.admob.AdmobTUSplashAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        final /* synthetic */ AdRequest m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Method f42503n;
        final /* synthetic */ Context o;

        public AnonymousClass3(Context context, AdRequest adRequest, Method method) {
            this.o = context;
            this.m = adRequest;
            this.f42503n = method;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!AdMobTUInitManager.getInstance().isLowestFor2400()) {
                AppOpenAd.load(this.o, AdmobTUSplashAdapter.this.on, this.m, AdmobTUSplashAdapter.this.f42501n);
                return;
            }
            Method method = this.f42503n;
            if (method == null) {
                AdmobTUSplashAdapter.this.notifyATLoadFail("", "can not found the load method");
                return;
            }
            try {
                method.invoke(null, this.o, AdmobTUSplashAdapter.this.on, this.m, Integer.valueOf(AdmobTUSplashAdapter.this.mo), AdmobTUSplashAdapter.this.f42501n);
            } catch (Throwable th) {
                Log.e(AdmobTUSplashAdapter.TAG, "startLoadSplashAd() >>> network version: +" + AdmobTUSplashAdapter.this.getNetworkSDKVersion() + ", load error: " + th.getMessage());
                AdmobTUSplashAdapter admobTUSplashAdapter = AdmobTUSplashAdapter.this;
                StringBuilder sb = new StringBuilder("load error: ");
                sb.append(th.getMessage());
                admobTUSplashAdapter.notifyATLoadFail("", sb.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.admob.AdmobTUSplashAdapter$4, reason: invalid class name */
    public class AnonymousClass4 extends FullScreenContentCallback {
        public AnonymousClass4() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdClicked() {
            if (((CustomSplashAdapter) AdmobTUSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) AdmobTUSplashAdapter.this).mImpressionListener.onSplashAdClicked();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdDismissedFullScreenContent() {
            try {
                AdMobTUInitManager.getInstance().o(AdmobTUSplashAdapter.this.getTrackingInfo().omm());
            } catch (Throwable unused) {
            }
            if (((CustomSplashAdapter) AdmobTUSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) AdmobTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdFailedToShowFullScreenContent(AdError adError) {
            Log.e(AdmobTUSplashAdapter.TAG, "Admob splash show fail: " + adError.getCode() + ", " + adError.getMessage());
            AdmobTUSplashAdapter.nm(AdmobTUSplashAdapter.this);
            if (((CustomSplashAdapter) AdmobTUSplashAdapter.this).mImpressionListener != null) {
                CustomSplashEventListener customSplashEventListener = ((CustomSplashAdapter) AdmobTUSplashAdapter.this).mImpressionListener;
                StringBuilder sb = new StringBuilder();
                sb.append(adError.getCode());
                customSplashEventListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, sb.toString(), adError.getMessage()));
                ((CustomSplashAdapter) AdmobTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdShowedFullScreenContent() {
            try {
                if (AdmobTUSplashAdapter.this.oo != null) {
                    AdMobTUInitManager.getInstance().o(AdmobTUSplashAdapter.this.getTrackingInfo().omm(), AdmobTUSplashAdapter.this.oo);
                }
            } catch (Throwable unused) {
            }
            if (AdmobTUSplashAdapter.this.mm) {
                AdmobTUSplashAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.thinkup.network.admob.AdmobTUSplashAdapter.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (AdmobTUSplashAdapter.this.mn) {
                            return;
                        }
                        AdmobTUSplashAdapter.oo(AdmobTUSplashAdapter.this);
                        if (((CustomSplashAdapter) AdmobTUSplashAdapter.this).mImpressionListener != null) {
                            ((CustomSplashAdapter) AdmobTUSplashAdapter.this).mImpressionListener.onSplashAdShow();
                        }
                    }
                }, 500L);
            } else if (((CustomSplashAdapter) AdmobTUSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) AdmobTUSplashAdapter.this).mImpressionListener.onSplashAdShow();
            }
        }
    }

    public static /* synthetic */ int nm(AdmobTUSplashAdapter admobTUSplashAdapter) {
        admobTUSplashAdapter.mDismissType = 99;
        return 99;
    }

    public static /* synthetic */ boolean oo(AdmobTUSplashAdapter admobTUSplashAdapter) {
        admobTUSplashAdapter.mn = true;
        return true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        this.f42501n = null;
        this.o0 = null;
        this.o = null;
        this.m = true;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        AdMobTUInitManager.getInstance().o(context, map, map2, AdFormat.APP_OPEN_AD, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(2, AdmobTUBannerAdapter.class);
        map.put(3, AdmobTUInterstitialAdapter.class);
        map.put(0, AdmobTUAdapter.class);
        return map;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.om;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return AdMobTUInitManager.getInstance().getNetworkName();
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
    public boolean isAdReady() {
        return this.oo != null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.on = TUInitMediation.getStringFromMap(map, "unit_id");
        this.m0 = TUInitMediation.getStringFromMap(map, "payload");
        this.mm = TUInitMediation.getIntFromMap(map, "admob_show_with_pay_info", 2) == 1;
        if (!TextUtils.isEmpty(this.on)) {
            this.mo = TUInitMediation.getIntFromMap(map, "orientation", 1);
            final Context applicationContext = context.getApplicationContext();
            AdMobTUInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.thinkup.network.admob.AdmobTUSplashAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) AdmobTUSplashAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) AdmobTUSplashAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    AdmobTUSplashAdapter.o(AdmobTUSplashAdapter.this, applicationContext, map, map2);
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

    @Override // com.thinkup.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        this.o0 = anonymousClass4;
        this.oo.setFullScreenContentCallback(anonymousClass4);
        this.oo.show(activity);
    }

    private void o(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.om = new HashMap();
        this.f42501n = new AnonymousClass2();
        AdRequest.Builder builderO = AdMobTUInitManager.getInstance().o(context, map, map2, AdFormat.APP_OPEN_AD, !TextUtils.isEmpty(this.m0));
        if (!TextUtils.isEmpty(this.m0)) {
            builderO.setAdString(this.m0);
        }
        postOnMainThread(new AnonymousClass3(context, builderO.build(), AdMobTUInitManager.getInstance().getAppOpenLoadMethod()));
    }

    private void o(Activity activity) {
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        this.o0 = anonymousClass4;
        this.oo.setFullScreenContentCallback(anonymousClass4);
        this.oo.show(activity);
    }

    public static /* synthetic */ void o(AdmobTUSplashAdapter admobTUSplashAdapter, Context context, Map map, Map map2) {
        admobTUSplashAdapter.om = new HashMap();
        admobTUSplashAdapter.f42501n = admobTUSplashAdapter.new AnonymousClass2();
        AdRequest.Builder builderO = AdMobTUInitManager.getInstance().o(context, (Map<String, Object>) map, (Map<String, Object>) map2, AdFormat.APP_OPEN_AD, !TextUtils.isEmpty(admobTUSplashAdapter.m0));
        if (!TextUtils.isEmpty(admobTUSplashAdapter.m0)) {
            builderO.setAdString(admobTUSplashAdapter.m0);
        }
        admobTUSplashAdapter.postOnMainThread(admobTUSplashAdapter.new AnonymousClass3(context, builderO.build(), AdMobTUInitManager.getInstance().getAppOpenLoadMethod()));
    }
}
