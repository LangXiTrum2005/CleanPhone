package com.thinkup.network.applovin;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ApplovinTURewardedVideoAdapter extends CustomRewardVideoAdapter {
    private static final String mo = "ApplovinTURewardedVideoAdapter";
    AppLovinAdRewardListener m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    AppLovinAdVideoPlaybackListener f42529n;
    AppLovinIncentivizedInterstitial o;
    AppLovinAdDisplayListener o0;
    AppLovinAdClickListener oo;
    String om = "";
    String on = "";
    boolean m0 = false;

    /* JADX INFO: renamed from: com.thinkup.network.applovin.ApplovinTURewardedVideoAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements MediationInitCallback {
        public AnonymousClass1() {
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onFail(String str) {
            if (((TUBaseAdInternalAdapter) ApplovinTURewardedVideoAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) ApplovinTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", str);
            }
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onSuccess() {
            try {
                ApplovinTURewardedVideoAdapter.o(ApplovinTURewardedVideoAdapter.this);
            } catch (Throwable th) {
                if (((TUBaseAdInternalAdapter) ApplovinTURewardedVideoAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) ApplovinTURewardedVideoAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.applovin.ApplovinTURewardedVideoAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements AppLovinAdRewardListener {
        public AnonymousClass2() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public final void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public final void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public final void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public final void validationRequestFailed(AppLovinAd appLovinAd, int i2) {
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.applovin.ApplovinTURewardedVideoAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements AppLovinAdVideoPlaybackListener {
        public AnonymousClass3() {
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public final void videoPlaybackBegan(AppLovinAd appLovinAd) {
            if (appLovinAd != null) {
                try {
                    ApplovinTUInitManager.getInstance().o(ApplovinTURewardedVideoAdapter.this.getTrackingInfo().omm(), new WeakReference(appLovinAd));
                } catch (Throwable unused) {
                }
            }
            if (((CustomRewardVideoAdapter) ApplovinTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) ApplovinTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
            }
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public final void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z2) {
            if (((CustomRewardVideoAdapter) ApplovinTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) ApplovinTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
            }
            if (((CustomRewardVideoAdapter) ApplovinTURewardedVideoAdapter.this).mImpressionListener == null || !z2) {
                return;
            }
            ((CustomRewardVideoAdapter) ApplovinTURewardedVideoAdapter.this).mImpressionListener.onReward();
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.applovin.ApplovinTURewardedVideoAdapter$4, reason: invalid class name */
    public class AnonymousClass4 implements AppLovinAdDisplayListener {
        public AnonymousClass4() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public final void adDisplayed(AppLovinAd appLovinAd) {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public final void adHidden(AppLovinAd appLovinAd) {
            try {
                ApplovinTUInitManager.getInstance().o(ApplovinTURewardedVideoAdapter.this.getTrackingInfo().omm());
            } catch (Throwable unused) {
            }
            if (((CustomRewardVideoAdapter) ApplovinTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) ApplovinTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
            }
            ApplovinTURewardedVideoAdapter.this.m0 = false;
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.applovin.ApplovinTURewardedVideoAdapter$5, reason: invalid class name */
    public class AnonymousClass5 implements AppLovinAdClickListener {
        public AnonymousClass5() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public final void adClicked(AppLovinAd appLovinAd) {
            if (((CustomRewardVideoAdapter) ApplovinTURewardedVideoAdapter.this).mImpressionListener != null) {
                ((CustomRewardVideoAdapter) ApplovinTURewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.applovin.ApplovinTURewardedVideoAdapter$6, reason: invalid class name */
    public class AnonymousClass6 implements AppLovinAdLoadListener {
        public AnonymousClass6() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public final void adReceived(AppLovinAd appLovinAd) {
            if (((TUBaseAdInternalAdapter) ApplovinTURewardedVideoAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) ApplovinTURewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public final void failedToReceiveAd(int i2) {
            if (((TUBaseAdInternalAdapter) ApplovinTURewardedVideoAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) ApplovinTURewardedVideoAdapter.this).mLoadListener.onAdLoadError(String.valueOf(i2), "");
            }
        }
    }

    private void o(Context context, Map<String, Object> map) {
        ApplovinTUInitManager.getInstance().initSDK(context, map, new AnonymousClass1());
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        this.o = null;
        this.oo = null;
        this.o0 = null;
        this.m = null;
        this.f42529n = null;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return ApplovinTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.on;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return ApplovinTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial = this.o;
        return appLovinIncentivizedInterstitial != null && appLovinIncentivizedInterstitial.isAdReadyToDisplay();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.om = TUInitMediation.getStringFromMap(map, "sdkkey");
        this.on = TUInitMediation.getStringFromMap(map, "zone_id");
        if (!TextUtils.isEmpty(this.om) && !TextUtils.isEmpty(this.on)) {
            ApplovinTUInitManager.getInstance().initSDK(context, map, new AnonymousClass1());
            return;
        }
        TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdLoadError("", "sdkkey or zone_id is empty!");
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return ApplovinTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial = this.o;
        if (appLovinIncentivizedInterstitial != null) {
            appLovinIncentivizedInterstitial.show(activity, this.m, this.f42529n, this.o0, this.oo);
        }
    }

    private void o() {
        AppLovinSdk appLovinSDK = ApplovinTUInitManager.getInstance().getAppLovinSDK();
        try {
            appLovinSDK.getSettings().setUserIdentifier(this.mUserId);
        } catch (Throwable unused) {
        }
        this.o = AppLovinIncentivizedInterstitial.create(this.on, appLovinSDK);
        this.m = new AnonymousClass2();
        this.f42529n = new AnonymousClass3();
        this.o0 = new AnonymousClass4();
        this.oo = new AnonymousClass5();
        this.o.preload(new AnonymousClass6());
    }

    public static /* synthetic */ void o(ApplovinTURewardedVideoAdapter applovinTURewardedVideoAdapter) {
        AppLovinSdk appLovinSDK = ApplovinTUInitManager.getInstance().getAppLovinSDK();
        try {
            appLovinSDK.getSettings().setUserIdentifier(applovinTURewardedVideoAdapter.mUserId);
        } catch (Throwable unused) {
        }
        applovinTURewardedVideoAdapter.o = AppLovinIncentivizedInterstitial.create(applovinTURewardedVideoAdapter.on, appLovinSDK);
        applovinTURewardedVideoAdapter.m = applovinTURewardedVideoAdapter.new AnonymousClass2();
        applovinTURewardedVideoAdapter.f42529n = applovinTURewardedVideoAdapter.new AnonymousClass3();
        applovinTURewardedVideoAdapter.o0 = applovinTURewardedVideoAdapter.new AnonymousClass4();
        applovinTURewardedVideoAdapter.oo = applovinTURewardedVideoAdapter.new AnonymousClass5();
        applovinTURewardedVideoAdapter.o.preload(applovinTURewardedVideoAdapter.new AnonymousClass6());
    }
}
