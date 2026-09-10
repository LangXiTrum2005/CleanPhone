package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.metadata.MetaData;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class UnityInterstitialAd implements MediationInterstitialAd, IUnityAdsLoadListener, IUnityAdsShowListener {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final String f19122adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f19123arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public String f19124graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public String f19125kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public MediationInterstitialAdCallback f19126molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final UnityInitializer f19127monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final com.google.ads.mediation.unity.attabal f19128polloi;

    public class attabal implements IUnityAdsInitializationListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ String f19129attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ String f19130dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ Context f19131saneness;

        public attabal(String str, Context context, String str2) {
            this.f19129attabal = str;
            this.f19131saneness = context;
            this.f19130dern = str2;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() {
            String.format("Unity Ads is initialized for game ID '%s' and can now load interstitial ad with placement ID: %s", this.f19129attabal, UnityInterstitialAd.this.f19124graveside);
            String str = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            UnityAdsAdapterUtils.setUnityAdsPrivacy(MobileAds.getRequestConfiguration(), new MetaData(this.f19131saneness));
            UnityInterstitialAd.this.f19125kowloon = UUID.randomUUID().toString();
            UnityAdsLoadOptions unityAdsLoadOptionsAttabal = UnityInterstitialAd.this.f19128polloi.attabal(UnityInterstitialAd.this.f19125kowloon);
            String str2 = this.f19130dern;
            if (str2 != null) {
                unityAdsLoadOptionsAttabal.setAdMarkup(str2);
            }
            UnityInterstitialAd.this.f19128polloi.dern(UnityInterstitialAd.this.f19124graveside, unityAdsLoadOptionsAttabal, UnityInterstitialAd.this);
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError adErrorSaneness = UnityAdsAdapterUtils.saneness(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", this.f19129attabal, str));
            String str2 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            adErrorSaneness.toString();
            UnityInterstitialAd.this.f19123arytenoidectomy.onFailure(adErrorSaneness);
        }
    }

    public UnityInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, UnityInitializer unityInitializer, com.google.ads.mediation.unity.attabal attabalVar) {
        this.f19122adultoid = mediationInterstitialAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String();
        this.f19123arytenoidectomy = mediationAdLoadCallback;
        this.f19127monoploid = unityInitializer;
        this.f19128polloi = attabalVar;
    }

    public void loadAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Context context = mediationInterstitialAdConfiguration.getContext();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AndroidGetAdPlayerContext.KEY_GAME_ID);
        String string2 = serverParameters.getString("zoneId");
        this.f19124graveside = string2;
        if (UnityAdsAdapterUtils.areValidIds(string, string2)) {
            this.f19127monoploid.initializeUnityAds(context, string, new attabal(string, context, mediationInterstitialAdConfiguration.getBidResponse()));
        } else {
            this.f19123arytenoidectomy.onFailure(new AdError(101, "Missing or invalid server parameters.", BuildConfig.LIBRARY_PACKAGE_NAME));
        }
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsAdLoaded(String str) {
        String.format("Unity Ads interstitial ad successfully loaded for placement ID: %s", str);
        String str2 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
        this.f19124graveside = str;
        this.f19126molybdenite = this.f19123arytenoidectomy.onSuccess(this);
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        this.f19124graveside = str;
        AdError adErrorDern = UnityAdsAdapterUtils.dern(unityAdsLoadError, str2);
        String str3 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
        adErrorDern.toString();
        this.f19123arytenoidectomy.onFailure(adErrorDern);
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowClick(String str) {
        String.format("Unity Ads interstitial ad was clicked for placement ID: %s", str);
        String str2 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f19126molybdenite;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.reportAdClicked();
        this.f19126molybdenite.onAdLeftApplication();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        String.format("Unity Ads interstitial ad finished playing for placement ID: %s", str);
        String str2 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f19126molybdenite;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        AdError adErrorWireman = UnityAdsAdapterUtils.wireman(unityAdsShowError, str2);
        String str3 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
        adErrorWireman.toString();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f19126molybdenite;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adErrorWireman);
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowStart(String str) {
        String.format("Unity Ads interstitial ad started for placement ID: %s", str);
        String str2 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f19126molybdenite;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        if (this.f19124graveside == null) {
            String str = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
        }
        UnityAdsShowOptions unityAdsShowOptionsSaneness = this.f19128polloi.saneness(this.f19125kowloon);
        unityAdsShowOptionsSaneness.set(MBridgeConstans.EXTRA_KEY_WM, this.f19122adultoid);
        this.f19128polloi.wireman((Activity) context, this.f19124graveside, unityAdsShowOptionsSaneness, this);
    }
}
