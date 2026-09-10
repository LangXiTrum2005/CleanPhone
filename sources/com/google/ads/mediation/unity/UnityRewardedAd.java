package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
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
public class UnityRewardedAd implements MediationRewardedAd {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final String f19141adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final UnityInitializer f19142arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final IUnityAdsLoadListener f19143dovishness = new attabal();

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final IUnityAdsShowListener f19144gintrap = new saneness();

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public String f19145graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f19146kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public String f19147molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final com.google.ads.mediation.unity.attabal f19148monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public MediationRewardedAdCallback f19149polloi;

    public class attabal implements IUnityAdsLoadListener {
        public attabal() {
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsAdLoaded(String str) {
            String.format("Unity Ads rewarded ad successfully loaded placement ID: %s", str);
            String str2 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            UnityRewardedAd.this.f19147molybdenite = str;
            UnityRewardedAd unityRewardedAd = UnityRewardedAd.this;
            unityRewardedAd.f19149polloi = (MediationRewardedAdCallback) unityRewardedAd.f19146kowloon.onSuccess(UnityRewardedAd.this);
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            UnityRewardedAd.this.f19147molybdenite = str;
            AdError adErrorDern = UnityAdsAdapterUtils.dern(unityAdsLoadError, str2);
            String str3 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            adErrorDern.toString();
            UnityRewardedAd.this.f19146kowloon.onFailure(adErrorDern);
        }
    }

    public class dern implements IUnityAdsInitializationListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f19151attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final String f19152dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f19154saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final String f19155wireman;

        public dern(Context context, String str, String str2, String str3) {
            this.f19151attabal = context;
            this.f19154saneness = str;
            this.f19152dern = str2;
            this.f19155wireman = str3;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() {
            String.format("Unity Ads is initialized for game ID '%s' and can now load rewarded ad with placement ID: %s", this.f19154saneness, this.f19152dern);
            String str = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            UnityAdsAdapterUtils.setUnityAdsPrivacy(MobileAds.getRequestConfiguration(), new MetaData(this.f19151attabal));
            UnityRewardedAd.this.f19145graveside = UUID.randomUUID().toString();
            UnityAdsLoadOptions unityAdsLoadOptionsAttabal = UnityRewardedAd.this.f19148monoploid.attabal(UnityRewardedAd.this.f19145graveside);
            String str2 = this.f19155wireman;
            if (str2 != null) {
                unityAdsLoadOptionsAttabal.setAdMarkup(str2);
            }
            UnityRewardedAd.this.f19148monoploid.dern(this.f19152dern, unityAdsLoadOptionsAttabal, UnityRewardedAd.this.f19143dovishness);
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError adErrorSaneness = UnityAdsAdapterUtils.saneness(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", this.f19154saneness, str));
            String str2 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            adErrorSaneness.toString();
            UnityRewardedAd.this.f19146kowloon.onFailure(adErrorSaneness);
        }
    }

    public class saneness implements IUnityAdsShowListener {
        public saneness() {
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowClick(String str) {
            if (UnityRewardedAd.this.f19149polloi != null) {
                UnityRewardedAd.this.f19149polloi.reportAdClicked();
            }
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            if (UnityRewardedAd.this.f19149polloi == null) {
                return;
            }
            if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.COMPLETED) {
                UnityRewardedAd.this.f19149polloi.onVideoComplete();
                UnityRewardedAd.this.f19149polloi.onUserEarnedReward();
            }
            UnityRewardedAd.this.f19149polloi.onAdClosed();
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            if (UnityRewardedAd.this.f19149polloi != null) {
                UnityRewardedAd.this.f19149polloi.onAdFailedToShow(UnityAdsAdapterUtils.wireman(unityAdsShowError, str2));
            }
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowStart(String str) {
            if (UnityRewardedAd.this.f19149polloi == null) {
                return;
            }
            UnityRewardedAd.this.f19149polloi.onAdOpened();
            UnityRewardedAd.this.f19149polloi.reportAdImpression();
            UnityRewardedAd.this.f19149polloi.onVideoStart();
        }
    }

    public UnityRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, UnityInitializer unityInitializer, com.google.ads.mediation.unity.attabal attabalVar) {
        this.f19141adultoid = mediationRewardedAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String();
        this.f19146kowloon = mediationAdLoadCallback;
        this.f19142arytenoidectomy = unityInitializer;
        this.f19148monoploid = attabalVar;
    }

    public void loadAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Context context = mediationRewardedAdConfiguration.getContext();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AndroidGetAdPlayerContext.KEY_GAME_ID);
        String string2 = serverParameters.getString("zoneId");
        if (UnityAdsAdapterUtils.areValidIds(string, string2)) {
            this.f19142arytenoidectomy.initializeUnityAds(context, string, new dern(context, string, string2, mediationRewardedAdConfiguration.getBidResponse()));
        } else {
            AdError adError = new AdError(101, "Missing or invalid server parameters.", BuildConfig.LIBRARY_PACKAGE_NAME);
            String str = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            this.f19146kowloon.onFailure(adError);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (this.f19147molybdenite == null) {
                String str = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            }
            UnityAdsShowOptions unityAdsShowOptionsSaneness = this.f19148monoploid.saneness(this.f19145graveside);
            unityAdsShowOptionsSaneness.set(MBridgeConstans.EXTRA_KEY_WM, this.f19141adultoid);
            this.f19148monoploid.wireman(activity, this.f19147molybdenite, unityAdsShowOptionsSaneness, this.f19144gintrap);
            return;
        }
        AdError adError = new AdError(105, "Unity Ads requires an Activity context to load ads.", BuildConfig.LIBRARY_PACKAGE_NAME);
        String str2 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f19149polloi;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }
}
