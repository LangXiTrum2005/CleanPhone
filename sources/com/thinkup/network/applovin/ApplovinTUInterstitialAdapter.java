package com.thinkup.network.applovin;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ApplovinTUInterstitialAdapter extends CustomInterstitialAdapter {
    private static final String oo = "ApplovinTUInterstitialAdapter";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    AppLovinAd f42528n;
    AppLovinInterstitialAdDialog o0;
    String o = "";
    String m = "";

    /* JADX INFO: renamed from: com.thinkup.network.applovin.ApplovinTUInterstitialAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements MediationInitCallback {
        final /* synthetic */ Context o;

        public AnonymousClass1(Context context) {
            this.o = context;
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onFail(String str) {
            if (((TUBaseAdInternalAdapter) ApplovinTUInterstitialAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) ApplovinTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", str);
            }
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onSuccess() {
            ApplovinTUInterstitialAdapter.this.runOnNetworkRequestThread(new Runnable() { // from class: com.thinkup.network.applovin.ApplovinTUInterstitialAdapter.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        ApplovinTUInterstitialAdapter.o(ApplovinTUInterstitialAdapter.this, anonymousClass1.o);
                    } catch (Throwable th) {
                        if (((TUBaseAdInternalAdapter) ApplovinTUInterstitialAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) ApplovinTUInterstitialAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.applovin.ApplovinTUInterstitialAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements AppLovinAdDisplayListener {
        public AnonymousClass2() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public final void adDisplayed(AppLovinAd appLovinAd) {
            if (appLovinAd != null) {
                try {
                    ApplovinTUInitManager.getInstance().o(ApplovinTUInterstitialAdapter.this.getTrackingInfo().omm(), new WeakReference(appLovinAd));
                } catch (Throwable unused) {
                }
            }
            if (((CustomInterstitialAdapter) ApplovinTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) ApplovinTUInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public final void adHidden(AppLovinAd appLovinAd) {
            try {
                ApplovinTUInitManager.getInstance().o(ApplovinTUInterstitialAdapter.this.getTrackingInfo().omm());
            } catch (Throwable unused) {
            }
            if (((CustomInterstitialAdapter) ApplovinTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) ApplovinTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.applovin.ApplovinTUInterstitialAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements AppLovinAdClickListener {
        public AnonymousClass3() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public final void adClicked(AppLovinAd appLovinAd) {
            if (((CustomInterstitialAdapter) ApplovinTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) ApplovinTUInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.applovin.ApplovinTUInterstitialAdapter$4, reason: invalid class name */
    public class AnonymousClass4 implements AppLovinAdVideoPlaybackListener {
        public AnonymousClass4() {
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public final void videoPlaybackBegan(AppLovinAd appLovinAd) {
            if (((CustomInterstitialAdapter) ApplovinTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) ApplovinTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoStart();
            }
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public final void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z2) {
            if (((CustomInterstitialAdapter) ApplovinTUInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) ApplovinTUInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoEnd();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.applovin.ApplovinTUInterstitialAdapter$5, reason: invalid class name */
    public class AnonymousClass5 implements AppLovinAdLoadListener {
        public AnonymousClass5() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public final void adReceived(AppLovinAd appLovinAd) {
            ApplovinTUInterstitialAdapter applovinTUInterstitialAdapter = ApplovinTUInterstitialAdapter.this;
            applovinTUInterstitialAdapter.f42528n = appLovinAd;
            if (((TUBaseAdInternalAdapter) applovinTUInterstitialAdapter).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) ApplovinTUInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public final void failedToReceiveAd(int i2) {
            if (((TUBaseAdInternalAdapter) ApplovinTUInterstitialAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) ApplovinTUInterstitialAdapter.this).mLoadListener.onAdLoadError(String.valueOf(i2), "");
            }
        }
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        try {
            this.f42528n = null;
            AppLovinInterstitialAdDialog appLovinInterstitialAdDialog = this.o0;
            if (appLovinInterstitialAdDialog != null) {
                appLovinInterstitialAdDialog.setAdClickListener(null);
                this.o0.setAdDisplayListener(null);
                this.o0.setAdVideoPlaybackListener(null);
                this.o0 = null;
            }
        } catch (Exception unused) {
        }
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
    public boolean isAdReady() {
        return (this.o0 == null || this.f42528n == null) ? false : true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.o = TUInitMediation.getStringFromMap(map, "sdkkey");
        this.m = TUInitMediation.getStringFromMap(map, "zone_id");
        if (!TextUtils.isEmpty(this.o) && !TextUtils.isEmpty(this.m)) {
            Context applicationContext = context.getApplicationContext();
            ApplovinTUInitManager.getInstance().initSDK(applicationContext, map, new AnonymousClass1(applicationContext));
        } else {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "sdkkey or zone_id is empty!");
            }
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return ApplovinTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        AppLovinAd appLovinAd;
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialog = this.o0;
        if (appLovinInterstitialAdDialog == null || (appLovinAd = this.f42528n) == null) {
            return;
        }
        appLovinInterstitialAdDialog.showAndRender(appLovinAd);
    }

    private void o(Context context, Map<String, Object> map) {
        Context applicationContext = context.getApplicationContext();
        ApplovinTUInitManager.getInstance().initSDK(applicationContext, map, new AnonymousClass1(applicationContext));
    }

    private void o(Context context) {
        AppLovinSdk appLovinSDK = ApplovinTUInitManager.getInstance().getAppLovinSDK();
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(appLovinSDK, context.getApplicationContext());
        this.o0 = appLovinInterstitialAdDialogCreate;
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(new AnonymousClass2());
        this.o0.setAdClickListener(new AnonymousClass3());
        this.o0.setAdVideoPlaybackListener(new AnonymousClass4());
        appLovinSDK.getAdService().loadNextAdForZoneId(this.m, new AnonymousClass5());
    }

    public static /* synthetic */ void o(ApplovinTUInterstitialAdapter applovinTUInterstitialAdapter, Context context) {
        AppLovinSdk appLovinSDK = ApplovinTUInitManager.getInstance().getAppLovinSDK();
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(appLovinSDK, context.getApplicationContext());
        applovinTUInterstitialAdapter.o0 = appLovinInterstitialAdDialogCreate;
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(applovinTUInterstitialAdapter.new AnonymousClass2());
        applovinTUInterstitialAdapter.o0.setAdClickListener(applovinTUInterstitialAdapter.new AnonymousClass3());
        applovinTUInterstitialAdapter.o0.setAdVideoPlaybackListener(applovinTUInterstitialAdapter.new AnonymousClass4());
        appLovinSDK.getAdService().loadNextAdForZoneId(applovinTUInterstitialAdapter.m, applovinTUInterstitialAdapter.new AnonymousClass5());
    }
}
