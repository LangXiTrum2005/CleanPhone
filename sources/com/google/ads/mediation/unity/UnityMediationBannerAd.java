package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class UnityMediationBannerAd implements MediationBannerAd, BannerView.IListener {
    static final String ERROR_MSG_INITIALIZATION_FAILED_FOR_GAME_ID = "Unity Ads initialization failed for game ID '%s' with error message: %s";
    static final String ERROR_MSG_NO_MATCHING_AD_SIZE = "There is no matching Unity Ads ad size for Google ad size: ";
    private String bannerPlacementId;
    private String gameId;
    private MediationBannerAdCallback mediationBannerAdCallback;
    private final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationBannerAdLoadCallback;
    private final com.google.ads.mediation.unity.attabal unityAdsLoader;
    private final dern unityBannerViewFactory;
    private wireman unityBannerViewWrapper;
    private final UnityInitializer unityInitializer;

    public class attabal implements IUnityAdsInitializationListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f19135attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ UnityBannerSize f19137dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ String f19138marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ Activity f19139saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ MediationBannerAdConfiguration f19140wireman;

        public attabal(Context context, Activity activity, UnityBannerSize unityBannerSize, MediationBannerAdConfiguration mediationBannerAdConfiguration, String str) {
            this.f19135attabal = context;
            this.f19139saneness = activity;
            this.f19137dern = unityBannerSize;
            this.f19140wireman = mediationBannerAdConfiguration;
            this.f19138marial = str;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() {
            String.format("Unity Ads is initialized for game ID '%s' and can now load banner ad with placement ID: %s", UnityMediationBannerAd.this.gameId, UnityMediationBannerAd.this.bannerPlacementId);
            String str = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            UnityAdsAdapterUtils.setUnityAdsPrivacy(MobileAds.getRequestConfiguration(), new MetaData(this.f19135attabal));
            if (UnityMediationBannerAd.this.unityBannerViewWrapper == null) {
                UnityMediationBannerAd unityMediationBannerAd = UnityMediationBannerAd.this;
                unityMediationBannerAd.unityBannerViewWrapper = unityMediationBannerAd.unityBannerViewFactory.attabal(this.f19139saneness, UnityMediationBannerAd.this.bannerPlacementId, this.f19137dern);
            }
            UnityMediationBannerAd.this.unityBannerViewWrapper.dern(UnityMediationBannerAd.this);
            UnityAdsLoadOptions unityAdsLoadOptionsAttabal = UnityMediationBannerAd.this.unityAdsLoader.attabal(UUID.randomUUID().toString());
            unityAdsLoadOptionsAttabal.set(MBridgeConstans.EXTRA_KEY_WM, this.f19140wireman.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String());
            String str2 = this.f19138marial;
            if (str2 != null) {
                unityAdsLoadOptionsAttabal.setAdMarkup(str2);
            }
            UnityMediationBannerAd.this.unityBannerViewWrapper.saneness(unityAdsLoadOptionsAttabal);
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError adErrorSaneness = UnityAdsAdapterUtils.saneness(unityAdsInitializationError, String.format(UnityMediationBannerAd.ERROR_MSG_INITIALIZATION_FAILED_FOR_GAME_ID, UnityMediationBannerAd.this.gameId, str));
            String str2 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            adErrorSaneness.toString();
            UnityMediationBannerAd.this.mediationBannerAdLoadCallback.onFailure(adErrorSaneness);
        }
    }

    public UnityMediationBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, UnityInitializer unityInitializer, dern dernVar, com.google.ads.mediation.unity.attabal attabalVar) {
        this.mediationBannerAdLoadCallback = mediationAdLoadCallback;
        this.unityBannerViewFactory = dernVar;
        this.unityInitializer = unityInitializer;
        this.unityAdsLoader = attabalVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.unityBannerViewWrapper.attabal();
    }

    public void loadAd(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Context context = mediationBannerAdConfiguration.getContext();
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        AdSize adSize = mediationBannerAdConfiguration.getCom.ironsource.X3.i.O java.lang.String();
        this.gameId = serverParameters.getString(AndroidGetAdPlayerContext.KEY_GAME_ID);
        String string = serverParameters.getString("zoneId");
        this.bannerPlacementId = string;
        if (!UnityAdsAdapterUtils.areValidIds(this.gameId, string)) {
            AdError adError = new AdError(101, "Missing or invalid server parameters.", BuildConfig.LIBRARY_PACKAGE_NAME);
            String str = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            this.mediationBannerAdLoadCallback.onFailure(adError);
            return;
        }
        if (!(context instanceof Activity)) {
            AdError adError2 = new AdError(105, "Unity Ads requires an Activity context to load ads.", BuildConfig.LIBRARY_PACKAGE_NAME);
            String str2 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
            this.mediationBannerAdLoadCallback.onFailure(adError2);
            return;
        }
        Activity activity = (Activity) context;
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        UnityBannerSize unityBannerSize = UnityAdsAdapterUtils.getUnityBannerSize(context, adSize, !TextUtils.isEmpty(bidResponse));
        if (unityBannerSize != null) {
            this.unityInitializer.initializeUnityAds(context, this.gameId, new attabal(context, activity, unityBannerSize, mediationBannerAdConfiguration, bidResponse));
            return;
        }
        AdError adError3 = new AdError(110, ERROR_MSG_NO_MATCHING_AD_SIZE + adSize, BuildConfig.LIBRARY_PACKAGE_NAME);
        String str3 = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
        this.mediationBannerAdLoadCallback.onFailure(adError3);
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerClick(BannerView bannerView) {
        String.format("Unity Ads banner ad was clicked for placement ID: %s", bannerView.getPlacementId());
        String str = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
        MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback == null) {
            return;
        }
        mediationBannerAdCallback.reportAdClicked();
        this.mediationBannerAdCallback.onAdOpened();
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        AdError adErrorAttabal = UnityAdsAdapterUtils.attabal(UnityAdsAdapterUtils.taiyuan(bannerErrorInfo), bannerErrorInfo.errorMessage);
        String str = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
        adErrorAttabal.toString();
        this.mediationBannerAdLoadCallback.onFailure(adErrorAttabal);
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerLeftApplication(BannerView bannerView) {
        String.format("Unity Ads banner ad left application for placement ID: %s", bannerView.getPlacementId());
        String str = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
        MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback == null) {
            return;
        }
        mediationBannerAdCallback.onAdLeftApplication();
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerLoaded(BannerView bannerView) {
        String.format("Unity Ads finished loading banner ad for placement ID: %s", bannerView.getPlacementId());
        String str = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
        this.mediationBannerAdCallback = this.mediationBannerAdLoadCallback.onSuccess(this);
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerShown(BannerView bannerView) {
        String.format("Unity Ads banner ad was shown for placement ID: %s", bannerView.getPlacementId());
        String str = UnityMediationAdapter.ADAPTER_ERROR_DOMAIN;
        MediationBannerAdCallback mediationBannerAdCallback = this.mediationBannerAdCallback;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
