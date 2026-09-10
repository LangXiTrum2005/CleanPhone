package com.thinkup.network.applovin;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ApplovinTUBannerAdapter extends CustomBannerAdapter {
    private static final String on = "ApplovinTUBannerAdapter";
    AppLovinAdView o0;
    Context om;
    WeakReference<Activity> oo;
    String o = "";
    String m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42526n = "";

    /* JADX INFO: renamed from: com.thinkup.network.applovin.ApplovinTUBannerAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements MediationInitCallback {
        public AnonymousClass1() {
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onFail(String str) {
            if (((TUBaseAdInternalAdapter) ApplovinTUBannerAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) ApplovinTUBannerAdapter.this).mLoadListener.onAdLoadError("", str);
            }
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onSuccess() {
            ApplovinTUBannerAdapter.this.postOnMainThread(new Runnable() { // from class: com.thinkup.network.applovin.ApplovinTUBannerAdapter.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        WeakReference<Activity> weakReference = ApplovinTUBannerAdapter.this.oo;
                        Activity activity = weakReference != null ? weakReference.get() : null;
                        ApplovinTUBannerAdapter applovinTUBannerAdapter = ApplovinTUBannerAdapter.this;
                        if (activity == null) {
                            activity = applovinTUBannerAdapter.om;
                        }
                        ApplovinTUBannerAdapter.o(applovinTUBannerAdapter, activity);
                    } catch (Throwable th) {
                        if (((TUBaseAdInternalAdapter) ApplovinTUBannerAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) ApplovinTUBannerAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.applovin.ApplovinTUBannerAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements AppLovinAdDisplayListener {
        public AnonymousClass2() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public final void adDisplayed(AppLovinAd appLovinAd) {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public final void adHidden(AppLovinAd appLovinAd) {
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.applovin.ApplovinTUBannerAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements AppLovinAdClickListener {
        public AnonymousClass3() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public final void adClicked(AppLovinAd appLovinAd) {
            CustomBannerEventListener customBannerEventListener = ApplovinTUBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdClicked();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.applovin.ApplovinTUBannerAdapter$4, reason: invalid class name */
    public class AnonymousClass4 implements AppLovinAdLoadListener {
        final /* synthetic */ AppLovinAdView o;

        public AnonymousClass4(AppLovinAdView appLovinAdView) {
            this.o = appLovinAdView;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public final void adReceived(AppLovinAd appLovinAd) {
            this.o.renderAd(appLovinAd);
            ApplovinTUBannerAdapter applovinTUBannerAdapter = ApplovinTUBannerAdapter.this;
            applovinTUBannerAdapter.o0 = this.o;
            if (((TUBaseAdInternalAdapter) applovinTUBannerAdapter).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) ApplovinTUBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public final void failedToReceiveAd(int i2) {
            if (((TUBaseAdInternalAdapter) ApplovinTUBannerAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) ApplovinTUBannerAdapter.this).mLoadListener.onAdLoadError(String.valueOf(i2), "");
            }
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        AppLovinAdView appLovinAdView = this.o0;
        if (appLovinAdView != null) {
            appLovinAdView.setAdLoadListener(null);
            this.o0.setAdClickListener(null);
            this.o0.setAdDisplayListener(null);
            this.o0.destroy();
            this.o0 = null;
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.o0;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return ApplovinTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.m;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return ApplovinTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.o = TUInitMediation.getStringFromMap(map, "sdkkey");
        this.m = TUInitMediation.getStringFromMap(map, "zone_id");
        if (TextUtils.isEmpty(this.o) || TextUtils.isEmpty(this.m)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "sdkkey or zone_id is empty!");
                return;
            }
            return;
        }
        this.f42526n = TUInitMediation.getStringFromMap(map, "size");
        if (context instanceof Activity) {
            this.oo = new WeakReference<>((Activity) context);
        }
        this.om = context.getApplicationContext();
        ApplovinTUInitManager.getInstance().initSDK(context, map, new AnonymousClass1());
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return ApplovinTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean supportImpressionCallback() {
        try {
            if (this.o0 == null) {
                return false;
            }
            ApplovinTUInitManager.getInstance().o(getTrackingInfo().omm(), new WeakReference(this.o0));
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private void o(Context context, Map<String, Object> map) {
        if (context instanceof Activity) {
            this.oo = new WeakReference<>((Activity) context);
        }
        this.om = context.getApplicationContext();
        ApplovinTUInitManager.getInstance().initSDK(context, map, new AnonymousClass1());
    }

    private void o(Context context) {
        AppLovinAdView appLovinAdView;
        AppLovinSdk appLovinSDK = ApplovinTUInitManager.getInstance().getAppLovinSDK();
        String str = this.f42526n;
        str.getClass();
        if (str.equals("300x250")) {
            appLovinAdView = new AppLovinAdView(appLovinSDK, AppLovinAdSize.MREC, context);
        } else if (!str.equals("320x50")) {
            appLovinAdView = new AppLovinAdView(appLovinSDK, AppLovinAdSize.BANNER, context);
        } else {
            appLovinAdView = new AppLovinAdView(appLovinSDK, AppLovinAdSize.BANNER, context);
        }
        appLovinAdView.setAdDisplayListener(new AnonymousClass2());
        appLovinAdView.setAdClickListener(new AnonymousClass3());
        appLovinSDK.getAdService().loadNextAdForZoneId(this.m, new AnonymousClass4(appLovinAdView));
    }

    public static /* synthetic */ void o(ApplovinTUBannerAdapter applovinTUBannerAdapter, Context context) {
        AppLovinAdView appLovinAdView;
        AppLovinSdk appLovinSDK = ApplovinTUInitManager.getInstance().getAppLovinSDK();
        String str = applovinTUBannerAdapter.f42526n;
        str.getClass();
        if (str.equals("300x250")) {
            appLovinAdView = new AppLovinAdView(appLovinSDK, AppLovinAdSize.MREC, context);
        } else if (!str.equals("320x50")) {
            appLovinAdView = new AppLovinAdView(appLovinSDK, AppLovinAdSize.BANNER, context);
        } else {
            appLovinAdView = new AppLovinAdView(appLovinSDK, AppLovinAdSize.BANNER, context);
        }
        appLovinAdView.setAdDisplayListener(applovinTUBannerAdapter.new AnonymousClass2());
        appLovinAdView.setAdClickListener(applovinTUBannerAdapter.new AnonymousClass3());
        appLovinSDK.getAdService().loadNextAdForZoneId(applovinTUBannerAdapter.m, applovinTUBannerAdapter.new AnonymousClass4(appLovinAdView));
    }
}
