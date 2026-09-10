package com.google.ads.mediation.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.mediation.LevelPlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class IronSourceMediationAdapter extends RtbAdapter {
    public static final String ADAPTER_ERROR_DOMAIN = "com.google.ads.mediation.ironsource";
    public static final int ERROR_AD_ALREADY_LOADED = 103;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 105;
    public static final int ERROR_CALL_SHOW_BEFORE_LOADED_SUCCESS = 107;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 102;
    public static final int ERROR_SDK_NOT_INITIALIZED = 106;
    public static final String IRONSOURCE_SDK_ERROR_DOMAIN = "com.ironsource.mediationsdk";

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final AtomicBoolean f18949kowloon = new AtomicBoolean(false);

    @Retention(RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

    public class attabal implements InitListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f18950attabal;

        public attabal(InitializationCompleteCallback initializationCompleteCallback) {
            this.f18950attabal = initializationCompleteCallback;
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(IronSourceError ironSourceError) {
            this.f18950attabal.onInitializationFailed(ironSourceError.getErrorMessage());
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
            IronSourceMediationAdapter.f18949kowloon.set(true);
            this.f18950attabal.onInitializationSucceeded();
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(IronSource.getISDemandOnlyBiddingData(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = IronSourceAds.getSdkVersion();
        String[] strArrSplit = sdkVersion.split("\\.");
        if (strArrSplit.length < 3) {
            String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sdkVersion);
            String str = IronSourceConstants.f18943attabal;
            return new VersionInfo(0, 0, 0);
        }
        int i = Integer.parseInt(strArrSplit[0]);
        int i2 = Integer.parseInt(strArrSplit[1]);
        int i3 = Integer.parseInt(strArrSplit[2]);
        if (strArrSplit.length >= 4) {
            i3 = (i3 * 100) + Integer.parseInt(strArrSplit[3]);
        }
        return new VersionInfo(i, i2, i3);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String adapterVersion = IronSourceAdapterUtils.getAdapterVersion();
        String[] strArrSplit = adapterVersion.split("\\.");
        if (strArrSplit.length < 4) {
            String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", adapterVersion);
            String str = IronSourceConstants.f18943attabal;
            return new VersionInfo(0, 0, 0);
        }
        int i = Integer.parseInt(strArrSplit[0]);
        int i2 = Integer.parseInt(strArrSplit[1]);
        int i3 = (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]);
        if (strArrSplit.length >= 5) {
            i3 = (i3 * 100) + Integer.parseInt(strArrSplit[4]);
        }
        return new VersionInfo(i, i2, i3);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (f18949kowloon.get()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("appKey");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid app key.", "com.google.ads.mediation.ironsource").getMessage());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (TextUtils.isEmpty(str)) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid app key.", "com.google.ads.mediation.ironsource").getMessage());
            return;
        }
        if (size > 1) {
            String.format("Multiple '%s' entries found: %s. Using app key '%s' to initialize the IronSource SDK.", "appKey", hashSet, str);
            String str2 = IronSourceConstants.f18943attabal;
        }
        IronSource.setMediationType(IronSourceAdapterUtils.getMediationType());
        String str3 = IronSourceConstants.f18943attabal;
        saneness();
        IronSourceAds.init(context, new InitRequest.Builder(str).withLegacyAdFormats(new ArrayList(Arrays.asList(IronSourceAds.AdFormat.BANNER, IronSourceAds.AdFormat.INTERSTITIAL, IronSourceAds.AdFormat.REWARDED))).build(), new attabal(initializationCompleteCallback));
        IronSource.setISDemandOnlyInterstitialListener(IronSourceInterstitialAd.dern());
        IronSource.setISDemandOnlyRewardedVideoListener(IronSourceRewardedAd.saneness());
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        if (f18949kowloon.get()) {
            new IronSourceBannerAd(mediationAdLoadCallback).loadAd(mediationBannerAdConfiguration);
            return;
        }
        AdError adError = new AdError(106, "Failed to load IronSource banner ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
        String str = IronSourceConstants.f18943attabal;
        adError.getMessage();
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (f18949kowloon.get()) {
            new IronSourceInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback).loadWaterfallAd(mediationInterstitialAdConfiguration);
            return;
        }
        AdError adError = new AdError(106, "Failed to load IronSource interstitial ad since IronSource SDK is not initialized.", IRONSOURCE_SDK_ERROR_DOMAIN);
        String str = IronSourceConstants.f18943attabal;
        adError.getMessage();
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (f18949kowloon.get()) {
            new IronSourceRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback).loadWaterfallAd(mediationRewardedAdConfiguration);
            return;
        }
        AdError adError = new AdError(106, "Failed to load IronSource rewarded ad since IronSource SDK is not initialized.", "com.google.ads.mediation.ironsource");
        String str = IronSourceConstants.f18943attabal;
        adError.getMessage();
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String str = IronSourceConstants.f18943attabal;
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        new IronSourceRtbBannerAd(mediationAdLoadCallback).loadRtbAd(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        new IronSourceRtbInterstitialAd(mediationAdLoadCallback).loadRtbAd(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new IronSourceRtbRewardedAd(mediationAdLoadCallback).loadRtbAd(mediationRewardedAdConfiguration);
    }

    public final void saneness() {
        RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
        if (requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1) {
            LevelPlay.setMetaData(a.b, a.g);
        } else if (requestConfiguration.getTagForChildDirectedTreatment() == 0 || requestConfiguration.getTagForUnderAgeOfConsent() == 0) {
            LevelPlay.setMetaData(a.b, "false");
        }
    }

    public void setIsInitialized(boolean z) {
        f18949kowloon.set(z);
    }
}
