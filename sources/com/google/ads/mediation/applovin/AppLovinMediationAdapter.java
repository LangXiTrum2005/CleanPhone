package com.google.ads.mediation.applovin;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.BuildConfig;
import com.applovin.mediation.rtb.AppLovinRtbInterstitialRenderer;
import com.applovin.mediation.rtb.AppLovinRtbRewardedRenderer;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
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
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class AppLovinMediationAdapter extends RtbAdapter {
    public static final String APPLOVIN_SDK_ERROR_DOMAIN = "com.applovin.sdk";
    public static final int ERROR_AD_ALREADY_REQUESTED = 105;
    public static final int ERROR_AD_FORMAT_UNSUPPORTED = 108;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 101;
    public static final int ERROR_CHILD_USER = 112;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.applovin";
    public static final int ERROR_EMPTY_BID_TOKEN = 104;
    public static final int ERROR_MISSING_AD_UNIT_ID = 113;
    public static final int ERROR_MISSING_SDK_KEY = 110;
    static final String ERROR_MSG_BANNER_SIZE_MISMATCH = "Failed to request banner with unsupported size.";
    static final String ERROR_MSG_MISSING_SDK = "Missing or invalid SDK Key.";
    public static final int ERROR_PRESENTATION_AD_NOT_READY = 106;
    private static final String TAG = "AppLovinMediationAdapter";
    private final AppLovinAdFactory appLovinAdFactory;
    private final AppLovinInitializer appLovinInitializer;
    private final AppLovinSdkUtilsWrapper appLovinSdkUtilsWrapper;
    private final AppLovinSdkWrapper appLovinSdkWrapper;
    private AppLovinBannerAd bannerAd;
    private AppLovinWaterfallRewardedRenderer rewardedRenderer;
    private AppLovinRtbInterstitialRenderer rtbInterstitialRenderer;
    private AppLovinRtbRewardedRenderer rtbRewardedRenderer;
    private AppLovinWaterfallInterstitialAd waterfallInterstitialAd;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

    public class attabal implements AppLovinInitializer.OnInitializeSuccessListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f18802attabal;

        public attabal(InitializationCompleteCallback initializationCompleteCallback) {
            this.f18802attabal = initializationCompleteCallback;
        }

        @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
        public void onInitializeSuccess() {
            this.f18802attabal.onInitializationSucceeded();
        }
    }

    public AppLovinMediationAdapter() {
        this.appLovinInitializer = AppLovinInitializer.getInstance();
        this.appLovinAdFactory = new AppLovinAdFactory();
        this.appLovinSdkWrapper = new AppLovinSdkWrapper();
        this.appLovinSdkUtilsWrapper = new AppLovinSdkUtilsWrapper();
    }

    public static AppLovinSdkSettings getSdkSettings(Context context) {
        return AppLovinSdk.getInstance(context).getSettings();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        if (AppLovinUtils.isChildUser()) {
            signalCallbacks.onFailure(AppLovinUtils.getChildUserError());
            return;
        }
        List<MediationConfiguration> configurations = rtbSignalData.getConfigurations();
        if (!configurations.isEmpty() && configurations.get(0).getFormat() == AdFormat.NATIVE) {
            AdError adError = new AdError(108, "Requested to collect signal for unsupported native ad format. Ignoring...", ERROR_DOMAIN);
            adError.getMessage();
            signalCallbacks.onFailure(adError);
            return;
        }
        Objects.toString(rtbSignalData.getNetworkExtras());
        String bidToken = this.appLovinInitializer.retrieveSdk(rtbSignalData.getContext()).getAdService().getBidToken();
        if (!TextUtils.isEmpty(bidToken)) {
            signalCallbacks.onSuccess(bidToken);
            return;
        }
        AdError adError2 = new AdError(104, "Failed to generate bid token.", ERROR_DOMAIN);
        adError2.getMessage();
        signalCallbacks.onFailure(adError2);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = this.appLovinSdkWrapper.getSdkVersion();
        String[] strArrSplit = sdkVersion.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sdkVersion);
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        return getVersionInfo(BuildConfig.ADAPTER_VERSION);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (AppLovinUtils.isChildUser()) {
            initializationCompleteCallback.onInitializationFailed(AppLovinUtils.ERROR_MSG_CHILD_USER);
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        if (hashSet.isEmpty()) {
            AdError adError = new AdError(110, ERROR_MSG_MISSING_SDK, ERROR_DOMAIN);
            adError.getMessage();
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
        } else {
            String str = (String) hashSet.iterator().next();
            if (hashSet.size() > 1) {
                String.format("Found more than one AppLovin SDK key. Using %s. Please update your app's ad unit mappings on Admob/GAM UI to use a single SDK key for ad serving to work as expected.", str);
            }
            this.appLovinInitializer.initialize(context, str, new attabal(initializationCompleteCallback));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        if (AppLovinUtils.isChildUser()) {
            mediationAdLoadCallback.onFailure(AppLovinUtils.getChildUserError());
        } else {
            new AppLovinWaterfallAppOpenAd(mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory).loadAd(mediationAppOpenAdConfiguration);
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        if (AppLovinUtils.isChildUser()) {
            mediationAdLoadCallback.onFailure(AppLovinUtils.getChildUserError());
            return;
        }
        AppLovinBannerAd appLovinBannerAdNewInstance = AppLovinBannerAd.newInstance(mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory);
        this.bannerAd = appLovinBannerAdNewInstance;
        appLovinBannerAdNewInstance.loadAd(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (AppLovinUtils.isChildUser()) {
            mediationAdLoadCallback.onFailure(AppLovinUtils.getChildUserError());
            return;
        }
        AppLovinWaterfallInterstitialAd appLovinWaterfallInterstitialAd = new AppLovinWaterfallInterstitialAd(mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory);
        this.waterfallInterstitialAd = appLovinWaterfallInterstitialAd;
        appLovinWaterfallInterstitialAd.loadAd(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (AppLovinUtils.isChildUser()) {
            mediationAdLoadCallback.onFailure(AppLovinUtils.getChildUserError());
            return;
        }
        AppLovinWaterfallRewardedRenderer appLovinWaterfallRewardedRenderer = new AppLovinWaterfallRewardedRenderer(mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory, this.appLovinSdkUtilsWrapper);
        this.rewardedRenderer = appLovinWaterfallRewardedRenderer;
        appLovinWaterfallRewardedRenderer.loadAd(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (AppLovinUtils.isChildUser()) {
            mediationAdLoadCallback.onFailure(AppLovinUtils.getChildUserError());
            return;
        }
        AppLovinRtbInterstitialRenderer appLovinRtbInterstitialRenderer = new AppLovinRtbInterstitialRenderer(mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory);
        this.rtbInterstitialRenderer = appLovinRtbInterstitialRenderer;
        appLovinRtbInterstitialRenderer.loadAd(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (AppLovinUtils.isChildUser()) {
            mediationAdLoadCallback.onFailure(AppLovinUtils.getChildUserError());
            return;
        }
        AppLovinRtbRewardedRenderer appLovinRtbRewardedRenderer = new AppLovinRtbRewardedRenderer(mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory, this.appLovinSdkUtilsWrapper);
        this.rtbRewardedRenderer = appLovinRtbRewardedRenderer;
        appLovinRtbRewardedRenderer.loadAd(mediationRewardedAdConfiguration);
    }

    public VersionInfo getVersionInfo(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]));
        }
        String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", str);
        return new VersionInfo(0, 0, 0);
    }

    public AppLovinMediationAdapter(AppLovinInitializer appLovinInitializer, AppLovinAdFactory appLovinAdFactory, AppLovinSdkWrapper appLovinSdkWrapper, AppLovinSdkUtilsWrapper appLovinSdkUtilsWrapper) {
        this.appLovinInitializer = appLovinInitializer;
        this.appLovinAdFactory = appLovinAdFactory;
        this.appLovinSdkWrapper = appLovinSdkWrapper;
        this.appLovinSdkUtilsWrapper = appLovinSdkUtilsWrapper;
    }
}
