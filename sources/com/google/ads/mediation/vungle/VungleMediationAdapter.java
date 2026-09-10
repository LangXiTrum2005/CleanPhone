package com.google.ads.mediation.vungle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.vungle.rtb.VungleRtbAppOpenAd;
import com.google.ads.mediation.vungle.rtb.VungleRtbBannerAd;
import com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd;
import com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd;
import com.google.ads.mediation.vungle.rtb.VungleRtbRewardedAd;
import com.google.ads.mediation.vungle.waterfall.VungleWaterfallAppOpenAd;
import com.google.ads.mediation.vungle.waterfall.VungleWaterfallBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
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
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleError;
import com.vungle.ads.cord;
import com.vungle.ads.preprohormone;
import com.vungle.ads.taiyuan;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class VungleMediationAdapter extends RtbAdapter implements MediationRewardedAd, cord {
    public static final int ERROR_CANNOT_GET_BID_TOKEN = 108;
    public static final int ERROR_CANNOT_PLAY_AD = 107;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.vungle";
    public static final int ERROR_INITIALIZATION_FAILURE = 105;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final String TAG = "VungleMediationAdapter";
    public static final String VUNGLE_SDK_ERROR_DOMAIN = "com.vungle.ads";
    private com.vungle.ads.saneness adConfig;
    private MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback;
    private MediationRewardedAdCallback mediationRewardedAdCallback;
    private preprohormone rewardedAd;
    private VungleRtbAppOpenAd rtbAppOpenAd;
    private VungleRtbBannerAd rtbBannerAd;
    private VungleRtbInterstitialAd rtbInterstitialAd;
    private VungleRtbNativeAd rtbNativeAd;
    private VungleRtbRewardedAd rtbRewardedAd;
    private VungleRtbRewardedAd rtbRewardedInterstitialAd;
    private String userId;
    private final VungleFactory vungleFactory;
    private VungleWaterfallAppOpenAd waterfallAppOpenAd;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AdapterError {
    }

    public class attabal implements taiyuan {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ SignalCallbacks f19169attabal;

        public attabal(SignalCallbacks signalCallbacks) {
            this.f19169attabal = signalCallbacks;
        }

        @Override // com.vungle.ads.taiyuan
        public void onBidTokenCollected(String str) {
            String str2 = VungleMediationAdapter.TAG;
            this.f19169attabal.onSuccess(str);
        }

        @Override // com.vungle.ads.taiyuan
        public void onBidTokenError(String str) {
            AdError adError = new AdError(108, "Liftoff Monetize returned an empty bid token.", VungleMediationAdapter.ERROR_DOMAIN);
            String str2 = VungleMediationAdapter.TAG;
            this.f19169attabal.onFailure(adError);
        }
    }

    public class dern implements VungleInitializer.VungleInitializationListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f19171attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ String f19173saneness;

        public dern(Context context, String str) {
            this.f19171attabal = context;
            this.f19173saneness = str;
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public void onInitializeError(AdError adError) {
            String str = VungleMediationAdapter.TAG;
            adError.toString();
            VungleMediationAdapter.this.mediationAdLoadCallback.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public void onInitializeSuccess() {
            VungleMediationAdapter vungleMediationAdapter = VungleMediationAdapter.this;
            vungleMediationAdapter.rewardedAd = vungleMediationAdapter.vungleFactory.createRewardedAd(this.f19171attabal, this.f19173saneness, VungleMediationAdapter.this.adConfig);
            VungleMediationAdapter.this.rewardedAd.setAdListener(VungleMediationAdapter.this);
            if (!TextUtils.isEmpty(VungleMediationAdapter.this.userId)) {
                VungleMediationAdapter.this.rewardedAd.setUserId(VungleMediationAdapter.this.userId);
            }
            VungleMediationAdapter.this.rewardedAd.load((String) null);
        }
    }

    public class saneness implements VungleInitializer.VungleInitializationListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f19174attabal;

        public saneness(InitializationCompleteCallback initializationCompleteCallback) {
            this.f19174attabal = initializationCompleteCallback;
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public void onInitializeError(AdError adError) {
            String str = VungleMediationAdapter.TAG;
            adError.toString();
            this.f19174attabal.onInitializationFailed(adError.toString());
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public void onInitializeSuccess() {
            this.f19174attabal.onInitializationSucceeded();
        }
    }

    public VungleMediationAdapter() {
        this.vungleFactory = new VungleFactory();
    }

    public static AdError getAdError(VungleError vungleError) {
        return new AdError(vungleError.getCode(), vungleError.getErrorMessage(), "com.vungle.ads");
    }

    public static String getAdapterVersion() {
        return "7.7.1.0";
    }

    private static boolean isVersionGreaterThanOrEqualTo(VersionInfo versionInfo, VersionInfo versionInfo2) {
        if (versionInfo.getMajorVersion() > versionInfo2.getMajorVersion()) {
            return true;
        }
        if (versionInfo.getMajorVersion() == versionInfo2.getMajorVersion()) {
            if (versionInfo.getMinorVersion() > versionInfo2.getMinorVersion()) {
                return true;
            }
            if (versionInfo.getMinorVersion() == versionInfo2.getMinorVersion() && versionInfo.getMicroVersion() >= versionInfo2.getMicroVersion()) {
                return true;
            }
        }
        return false;
    }

    private static boolean isVersionLowerThan(VersionInfo versionInfo, VersionInfo versionInfo2) {
        if (versionInfo.getMajorVersion() < versionInfo2.getMajorVersion()) {
            return true;
        }
        if (versionInfo.getMajorVersion() == versionInfo2.getMajorVersion()) {
            if (versionInfo.getMinorVersion() < versionInfo2.getMinorVersion()) {
                return true;
            }
            if (versionInfo.getMinorVersion() == versionInfo2.getMinorVersion() && versionInfo.getMicroVersion() < versionInfo2.getMicroVersion()) {
                return true;
            }
        }
        return false;
    }

    public static boolean runtimeGmaSdkListensToAdapterReportedImpressions() {
        VersionInfo version = MobileAds.getVersion();
        if (isVersionLowerThan(version, new VersionInfo(6, 5, 0)) && isVersionGreaterThanOrEqualTo(version, new VersionInfo(0, 18, 0))) {
            return true;
        }
        return isVersionGreaterThanOrEqualTo(version, new VersionInfo(24, 4, 0));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        VungleSdkWrapper.delegate.getBiddingToken(rtbSignalData.getContext(), new attabal(signalCallbacks));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = VungleSdkWrapper.delegate.getSdkVersion();
        String[] strArrSplit = sdkVersion.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sdkVersion);
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String adapterVersion = getAdapterVersion();
        String[] strArrSplit = adapterVersion.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]));
        }
        String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", adapterVersion);
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (VungleSdkWrapper.delegate.isInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("appid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            if (initializationCompleteCallback != null) {
                initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or Invalid App ID.", ERROR_DOMAIN).toString());
            }
        } else {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Vungle SDK.", "appid", hashSet, str);
            }
            VungleInitializer.getInstance().initialize(str, context, new saneness(initializationCompleteCallback));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(MobileAds.getRequestConfiguration());
        VungleWaterfallAppOpenAd vungleWaterfallAppOpenAd = new VungleWaterfallAppOpenAd(mediationAdLoadCallback, this.vungleFactory);
        this.waterfallAppOpenAd = vungleWaterfallAppOpenAd;
        vungleWaterfallAppOpenAd.render(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(MobileAds.getRequestConfiguration());
        new VungleWaterfallBannerAd(mediationAdLoadCallback, this.vungleFactory).validateParamsAndLoadAd(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(MobileAds.getRequestConfiguration());
        VungleRtbNativeAd vungleRtbNativeAd = new VungleRtbNativeAd(mediationAdLoadCallback, this.vungleFactory);
        this.rtbNativeAd = vungleRtbNativeAd;
        vungleRtbNativeAd.render(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        if (mediationExtras != null) {
            this.userId = mediationExtras.getString("userId");
        }
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            mediationAdLoadCallback.onFailure(new AdError(101, "Failed to load waterfall rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN));
            return;
        }
        String string2 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            mediationAdLoadCallback.onFailure(new AdError(101, "Failed to load waterfall rewarded ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", ERROR_DOMAIN));
            return;
        }
        this.adConfig = this.vungleFactory.createAdConfig();
        if (mediationExtras != null && mediationExtras.containsKey(VungleConstants.KEY_ORIENTATION)) {
            this.adConfig.setAdOrientation(mediationExtras.getInt(VungleConstants.KEY_ORIENTATION, 2));
        }
        VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(MobileAds.getRequestConfiguration());
        Context context = mediationRewardedAdConfiguration.getContext();
        VungleInitializer.getInstance().initialize(string, context, new dern(context, string2));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(MobileAds.getRequestConfiguration());
        VungleRtbAppOpenAd vungleRtbAppOpenAd = new VungleRtbAppOpenAd(mediationAdLoadCallback, this.vungleFactory);
        this.rtbAppOpenAd = vungleRtbAppOpenAd;
        vungleRtbAppOpenAd.render(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(MobileAds.getRequestConfiguration());
        VungleRtbBannerAd vungleRtbBannerAd = new VungleRtbBannerAd(mediationAdLoadCallback, this.vungleFactory);
        this.rtbBannerAd = vungleRtbBannerAd;
        vungleRtbBannerAd.validateParamsAndLoadAd(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(MobileAds.getRequestConfiguration());
        VungleRtbInterstitialAd vungleRtbInterstitialAd = new VungleRtbInterstitialAd(mediationAdLoadCallback, this.vungleFactory);
        this.rtbInterstitialAd = vungleRtbInterstitialAd;
        vungleRtbInterstitialAd.render(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(MobileAds.getRequestConfiguration());
        VungleRtbNativeAd vungleRtbNativeAd = new VungleRtbNativeAd(mediationAdLoadCallback, this.vungleFactory);
        this.rtbNativeAd = vungleRtbNativeAd;
        vungleRtbNativeAd.render(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(MobileAds.getRequestConfiguration());
        VungleRtbRewardedAd vungleRtbRewardedAd = new VungleRtbRewardedAd(mediationAdLoadCallback, this.vungleFactory);
        this.rtbRewardedAd = vungleRtbRewardedAd;
        vungleRtbRewardedAd.render(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(MobileAds.getRequestConfiguration());
        VungleRtbRewardedAd vungleRtbRewardedAd = new VungleRtbRewardedAd(mediationAdLoadCallback, this.vungleFactory);
        this.rtbRewardedInterstitialAd = vungleRtbRewardedAd;
        vungleRtbRewardedAd.render(mediationRewardedAdConfiguration);
    }

    @Override // com.vungle.ads.cord, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdClicked(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.cord, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdEnd(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.cord, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdError adError = getAdError(vungleError);
        adError.toString();
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    @Override // com.vungle.ads.cord, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        AdError adError = getAdError(vungleError);
        adError.toString();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.cord, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdImpression(BaseAd baseAd) {
        this.mediationRewardedAdCallback.onVideoStart();
        this.mediationRewardedAdCallback.reportAdImpression();
    }

    @Override // com.vungle.ads.cord, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdLoaded(BaseAd baseAd) {
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.mediationRewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.vungle.ads.cord
    public void onAdRewarded(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.mediationRewardedAdCallback.onUserEarnedReward();
        }
    }

    @Override // com.vungle.ads.cord, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdStart(BaseAd baseAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        preprohormone preprohormoneVar = this.rewardedAd;
        if (preprohormoneVar != null) {
            preprohormoneVar.play(context);
        } else if (this.mediationRewardedAdCallback != null) {
            this.mediationRewardedAdCallback.onAdFailedToShow(new AdError(107, "Failed to show waterfall rewarded ad from Liftoff Monetize.", ERROR_DOMAIN));
        }
    }

    public VungleMediationAdapter(VungleFactory vungleFactory) {
        this.vungleFactory = vungleFactory;
    }

    @Override // com.vungle.ads.cord, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdLeftApplication(BaseAd baseAd) {
    }
}
