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
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.splashad.unitgroup.api.CustomSplashAdapter;
import com.thinkup.splashad.unitgroup.api.CustomSplashEventListener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class GoogleAdTUSplashAdapter extends CustomSplashAdapter {
    private static final String o = "GoogleAdTUSplashAdapter";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42510n;
    private FullScreenContentCallback om;
    private AppOpenAd on;
    private AppOpenAd.AppOpenAdLoadCallback oo;
    private String m = "";
    private Bundle o0 = new Bundle();
    private Map<String, Object> m0 = new HashMap();

    /* JADX INFO: renamed from: com.thinkup.network.admob.GoogleAdTUSplashAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends AppOpenAd.AppOpenAdLoadCallback {
        public AnonymousClass2() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            GoogleAdTUSplashAdapter.this.notifyATLoadFail(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdLoaded(AppOpenAd appOpenAd) {
            GoogleAdTUSplashAdapter.this.on = appOpenAd;
            ResponseInfo responseInfo = GoogleAdTUSplashAdapter.this.on.getResponseInfo();
            if (responseInfo != null) {
                GoogleAdTUSplashAdapter.this.m0.put("response_info", responseInfo);
            }
            if (((TUBaseAdInternalAdapter) GoogleAdTUSplashAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GoogleAdTUSplashAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.admob.GoogleAdTUSplashAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        final /* synthetic */ AdRequest m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Method f42512n;
        final /* synthetic */ Context o;

        public AnonymousClass3(Context context, AdRequest adRequest, Method method) {
            this.o = context;
            this.m = adRequest;
            this.f42512n = method;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!AdMobTUInitManager.getInstance().isLowestFor2400()) {
                AppOpenAd.load(this.o, GoogleAdTUSplashAdapter.this.m, this.m, GoogleAdTUSplashAdapter.this.oo);
                return;
            }
            Method method = this.f42512n;
            if (method == null) {
                GoogleAdTUSplashAdapter.this.notifyATLoadFail("", "can not found the load method");
                return;
            }
            try {
                method.invoke(null, this.o, GoogleAdTUSplashAdapter.this.m, this.m, Integer.valueOf(GoogleAdTUSplashAdapter.this.f42510n), GoogleAdTUSplashAdapter.this.oo);
            } catch (Throwable th) {
                Log.e(GoogleAdTUSplashAdapter.o, "startLoadSplashAd() >>> network version: +" + GoogleAdTUSplashAdapter.this.getNetworkSDKVersion() + ", load error: " + th.getMessage());
                GoogleAdTUSplashAdapter googleAdTUSplashAdapter = GoogleAdTUSplashAdapter.this;
                StringBuilder sb = new StringBuilder("load error: ");
                sb.append(th.getMessage());
                googleAdTUSplashAdapter.notifyATLoadFail("", sb.toString());
            }
        }
    }

    public static /* synthetic */ int mm(GoogleAdTUSplashAdapter googleAdTUSplashAdapter) {
        googleAdTUSplashAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        this.on = null;
        this.o0 = null;
        this.oo = null;
        this.om = null;
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
        return this.m;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        return this.on != null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        if (context == null) {
            notifyATLoadFail("", "context is null.");
            return;
        }
        String stringFromMap = TUInitMediation.getStringFromMap(map, "unit_id");
        this.m = stringFromMap;
        if (!TextUtils.isEmpty(stringFromMap)) {
            this.f42510n = TUInitMediation.getIntFromMap(map, "orientation", 1);
            final Context applicationContext = context.getApplicationContext();
            AdMobTUInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.thinkup.network.admob.GoogleAdTUSplashAdapter.1
                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((TUBaseAdInternalAdapter) GoogleAdTUSplashAdapter.this).mLoadListener != null) {
                        ((TUBaseAdInternalAdapter) GoogleAdTUSplashAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.thinkup.core.api.MediationInitCallback
                public final void onSuccess() {
                    GoogleAdTUSplashAdapter.o(GoogleAdTUSplashAdapter.this, applicationContext, map, map2);
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
        if (!isAdReady()) {
            notifyATLoadFail("", "GAM Ad not ready.");
            return;
        }
        FullScreenContentCallback fullScreenContentCallback = new FullScreenContentCallback() { // from class: com.thinkup.network.admob.GoogleAdTUSplashAdapter.4
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdClicked() {
                if (((CustomSplashAdapter) GoogleAdTUSplashAdapter.this).mImpressionListener != null) {
                    ((CustomSplashAdapter) GoogleAdTUSplashAdapter.this).mImpressionListener.onSplashAdClicked();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdDismissedFullScreenContent() {
                try {
                    AdMobTUInitManager.getInstance().o(GoogleAdTUSplashAdapter.this.getTrackingInfo().omm());
                } catch (Throwable unused) {
                }
                if (((CustomSplashAdapter) GoogleAdTUSplashAdapter.this).mImpressionListener != null) {
                    ((CustomSplashAdapter) GoogleAdTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdFailedToShowFullScreenContent(AdError adError) {
                Log.e(GoogleAdTUSplashAdapter.o, "GAM splash show fail: " + adError.getCode() + ", " + adError.getMessage());
                GoogleAdTUSplashAdapter.mm(GoogleAdTUSplashAdapter.this);
                if (((CustomSplashAdapter) GoogleAdTUSplashAdapter.this).mImpressionListener != null) {
                    CustomSplashEventListener customSplashEventListener = ((CustomSplashAdapter) GoogleAdTUSplashAdapter.this).mImpressionListener;
                    StringBuilder sb = new StringBuilder();
                    sb.append(adError.getCode());
                    customSplashEventListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, sb.toString(), adError.getMessage()));
                    ((CustomSplashAdapter) GoogleAdTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdShowedFullScreenContent() {
                try {
                    if (GoogleAdTUSplashAdapter.this.on != null) {
                        AdMobTUInitManager.getInstance().o(GoogleAdTUSplashAdapter.this.getTrackingInfo().omm(), GoogleAdTUSplashAdapter.this.on);
                    }
                } catch (Throwable unused) {
                }
                if (((CustomSplashAdapter) GoogleAdTUSplashAdapter.this).mImpressionListener != null) {
                    ((CustomSplashAdapter) GoogleAdTUSplashAdapter.this).mImpressionListener.onSplashAdShow();
                }
            }
        };
        this.om = fullScreenContentCallback;
        this.on.setFullScreenContentCallback(fullScreenContentCallback);
        this.on.show(activity);
    }

    private void o(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.oo = new AnonymousClass2();
        postOnMainThread(new AnonymousClass3(context, AdMobTUInitManager.getInstance().o(context, map, map2, AdFormat.APP_OPEN_AD).build(), AdMobTUInitManager.getInstance().getAppOpenLoadMethod()));
    }

    public static /* synthetic */ void o(GoogleAdTUSplashAdapter googleAdTUSplashAdapter, Context context, Map map, Map map2) {
        googleAdTUSplashAdapter.oo = googleAdTUSplashAdapter.new AnonymousClass2();
        googleAdTUSplashAdapter.postOnMainThread(googleAdTUSplashAdapter.new AnonymousClass3(context, AdMobTUInitManager.getInstance().o(context, (Map<String, Object>) map, (Map<String, Object>) map2, AdFormat.APP_OPEN_AD).build(), AdMobTUInitManager.getInstance().getAppOpenLoadMethod()));
    }
}
