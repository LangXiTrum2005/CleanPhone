package com.google.ads.mediation.pangle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.google.ads.mediation.pangle.renderer.PangleAppOpenAd;
import com.google.ads.mediation.pangle.renderer.PangleBannerAd;
import com.google.ads.mediation.pangle.renderer.PangleInterstitialAd;
import com.google.ads.mediation.pangle.renderer.PangleNativeAd;
import com.google.ads.mediation.pangle.renderer.PangleRewardedAd;
import com.google.android.gms.ads.AdError;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PangleMediationAdapter extends RtbAdapter {
    public static final String TAG = "PangleMediationAdapter";

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public PangleNativeAd f19034adultoid;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public PangleRewardedAd f19036dovishness;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public PangleInterstitialAd f19037graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public PangleBannerAd f19039molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public PangleAppOpenAd f19041polloi;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final PangleInitializer f19038kowloon = PangleInitializer.getInstance();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final PangleSdkWrapper f19035arytenoidectomy = new PangleSdkWrapper();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final PangleFactory f19040monoploid = new PangleFactory();

    public class attabal implements PAGBidCallback {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ SignalCallbacks f19042attabal;

        public attabal(SignalCallbacks signalCallbacks) {
            this.f19042attabal = signalCallbacks;
        }

        @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
        public void onBiddingTokenCollected(String str) {
            this.f19042attabal.onSuccess(str);
        }

        @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
        public void onBiddingTokenFailed(PAGBidError pAGBidError) {
            this.f19042attabal.onFailure(new AdError(pAGBidError.getCode(), pAGBidError.getMessage(), PangleConstants.PANGLE_SDK_ERROR_DOMAIN));
        }
    }

    public class saneness implements PangleInitializer.Listener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f19044attabal;

        public saneness(InitializationCompleteCallback initializationCompleteCallback) {
            this.f19044attabal = initializationCompleteCallback;
        }

        @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
        public void onInitializeError(AdError adError) {
            String str = PangleMediationAdapter.TAG;
            adError.toString();
            this.f19044attabal.onInitializationFailed(adError.getMessage());
        }

        @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
        public void onInitializeSuccess() {
            this.f19044attabal.onInitializationSucceeded();
        }
    }

    public static void attabal(int i, PangleSdkWrapper pangleSdkWrapper) {
        if (i == 1 || i == 0) {
            pangleSdkWrapper.dern(i);
        }
    }

    public static int getPAConsent() {
        return PAGConfig.getPAConsent();
    }

    public static void setPAConsent(int i) {
        attabal(i, new PangleSdkWrapper());
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        if (PangleConstants.isChildUser()) {
            signalCallbacks.onFailure(PangleConstants.createChildUserError());
            return;
        }
        Bundle networkExtras = rtbSignalData.getNetworkExtras();
        if (networkExtras != null && networkExtras.containsKey("user_data")) {
            this.f19035arytenoidectomy.wireman(networkExtras.getString("user_data", ""));
        }
        PAGBiddingRequest pAGBiddingRequest = new PAGBiddingRequest();
        pAGBiddingRequest.setAdxId(PangleConstants.ADX_ID);
        this.f19035arytenoidectomy.attabal(rtbSignalData.getContext(), pAGBiddingRequest, new attabal(signalCallbacks));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String strSaneness = this.f19035arytenoidectomy.saneness();
        String[] strArrSplit = strSaneness.split("\\.");
        if (strArrSplit.length < 3) {
            String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", strSaneness);
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
        return getVersionInfo(BuildConfig.ADAPTER_VERSION);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (PangleConstants.isChildUser()) {
            initializationCompleteCallback.onInitializationFailed(PangleConstants.ERROR_MSG_CHILD_USER);
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
            AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(101, "Missing or invalid App ID.");
            adErrorCreateAdapterError.toString();
            initializationCompleteCallback.onInitializationFailed(adErrorCreateAdapterError.toString());
        } else {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                String.format("Found multiple app IDs in %s. Using %s to initialize Pangle SDK.", hashSet, str);
            }
            this.f19038kowloon.initialize(context, str, new saneness(initializationCompleteCallback));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        if (PangleConstants.isChildUser()) {
            mediationAdLoadCallback.onFailure(PangleConstants.createChildUserError());
            return;
        }
        PangleAppOpenAd pangleAppOpenAdSaneness = this.f19040monoploid.saneness(mediationAdLoadCallback, this.f19038kowloon, this.f19035arytenoidectomy);
        this.f19041polloi = pangleAppOpenAdSaneness;
        pangleAppOpenAdSaneness.render(mediationAppOpenAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        if (PangleConstants.isChildUser()) {
            mediationAdLoadCallback.onFailure(PangleConstants.createChildUserError());
            return;
        }
        PangleBannerAd pangleBannerAdDern = this.f19040monoploid.dern(mediationAdLoadCallback, this.f19038kowloon, this.f19035arytenoidectomy);
        this.f19039molybdenite = pangleBannerAdDern;
        pangleBannerAdDern.render(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (PangleConstants.isChildUser()) {
            mediationAdLoadCallback.onFailure(PangleConstants.createChildUserError());
            return;
        }
        PangleInterstitialAd pangleInterstitialAdWireman = this.f19040monoploid.wireman(mediationAdLoadCallback, this.f19038kowloon, this.f19035arytenoidectomy);
        this.f19037graveside = pangleInterstitialAdWireman;
        pangleInterstitialAdWireman.render(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        if (PangleConstants.isChildUser()) {
            mediationAdLoadCallback.onFailure(PangleConstants.createChildUserError());
            return;
        }
        PangleNativeAd pangleNativeAdMarial = this.f19040monoploid.marial(mediationAdLoadCallback, this.f19038kowloon, this.f19035arytenoidectomy);
        this.f19034adultoid = pangleNativeAdMarial;
        pangleNativeAdMarial.render(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (PangleConstants.isChildUser()) {
            mediationAdLoadCallback.onFailure(PangleConstants.createChildUserError());
            return;
        }
        PangleRewardedAd pangleRewardedAdBeachfront = this.f19040monoploid.beachfront(mediationAdLoadCallback, this.f19038kowloon, this.f19035arytenoidectomy);
        this.f19036dovishness = pangleRewardedAdBeachfront;
        pangleRewardedAdBeachfront.render(mediationRewardedAdConfiguration);
    }

    public VersionInfo getVersionInfo(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 4) {
            String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", str);
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
}
