package com.applovin.mediation.adapters;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyAdSize;
import com.adcolony.sdk.AdColonyAdView;
import com.adcolony.sdk.AdColonyAdViewListener;
import com.adcolony.sdk.AdColonyAppOptions;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyReward;
import com.adcolony.sdk.AdColonyRewardListener;
import com.adcolony.sdk.AdColonySignalsListener;
import com.adcolony.sdk.AdColonyZone;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.sdk.AppLovinSdk;
import com.p004ironsource.ne;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class AdColonyMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus status;
    private AdColonyAdView loadedAdViewAd;
    private AdColonyInterstitial loadedInterstitialAd;
    private AdColonyInterstitial loadedRewardedAd;

    public class AdViewAdListener extends AdColonyAdViewListener {
        private final MaxAdFormat adFormat;
        private final MaxAdViewAdapterListener listener;

        public AdViewAdListener(MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
            this.adFormat = maxAdFormat;
        }

        @Override // com.adcolony.sdk.AdColonyAdViewListener
        public void onClicked(AdColonyAdView adColonyAdView) {
            AdColonyMediationAdapter.this.log(this.adFormat.getLabel() + " ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.adcolony.sdk.AdColonyAdViewListener
        public void onLeftApplication(AdColonyAdView adColonyAdView) {
            AdColonyMediationAdapter.this.log(this.adFormat.getLabel() + " ad left application");
        }

        @Override // com.adcolony.sdk.AdColonyAdViewListener
        public void onRequestFilled(AdColonyAdView adColonyAdView) {
            AdColonyMediationAdapter.this.log(this.adFormat.getLabel() + " ad loaded");
            AdColonyMediationAdapter.this.loadedAdViewAd = adColonyAdView;
            this.listener.onAdViewAdLoaded(AdColonyMediationAdapter.this.loadedAdViewAd);
        }

        @Override // com.adcolony.sdk.AdColonyAdViewListener
        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            AdColonyMediationAdapter.this.log(this.adFormat.getLabel() + " ad failed to fill for zone: " + adColonyZone.getZoneID());
            this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        @Override // com.adcolony.sdk.AdColonyAdViewListener
        public void onShow(AdColonyAdView adColonyAdView) {
            AdColonyMediationAdapter.this.log(this.adFormat.getLabel() + " ad shown");
            this.listener.onAdViewAdDisplayed();
        }
    }

    public class InterstitialListener extends AdColonyInterstitialListener {
        private final MaxInterstitialAdapterListener listener;

        public InterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.adcolony.sdk.AdColonyInterstitialListener
        public void onClicked(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Interstitial clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.adcolony.sdk.AdColonyInterstitialListener
        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Interstitial hidden");
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.adcolony.sdk.AdColonyInterstitialListener
        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Interstitial expiring: " + adColonyInterstitial.getZoneID());
        }

        @Override // com.adcolony.sdk.AdColonyInterstitialListener
        public void onLeftApplication(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Interstitial left application");
        }

        @Override // com.adcolony.sdk.AdColonyInterstitialListener
        public void onOpened(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Interstitial shown");
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.adcolony.sdk.AdColonyInterstitialListener
        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Interstitial loaded");
            AdColonyMediationAdapter.this.loadedInterstitialAd = adColonyInterstitial;
            this.listener.onInterstitialAdLoaded();
        }

        @Override // com.adcolony.sdk.AdColonyInterstitialListener
        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            AdColonyMediationAdapter.this.log("Interstitial failed to fill for zone: " + adColonyZone.getZoneID());
            this.listener.onInterstitialAdLoadFailed(MaxAdapterError.NO_FILL);
        }
    }

    public class RewardedAdListener extends AdColonyInterstitialListener implements AdColonyRewardListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        public RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.adcolony.sdk.AdColonyInterstitialListener
        public void onClicked(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // com.adcolony.sdk.AdColonyInterstitialListener
        public void onClosed(AdColonyInterstitial adColonyInterstitial) {
            this.listener.onRewardedAdVideoCompleted();
            if (this.hasGrantedReward || AdColonyMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = AdColonyMediationAdapter.this.getReward();
                AdColonyMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            AdColonyMediationAdapter.this.log("Rewarded ad hidden");
            this.listener.onRewardedAdHidden();
        }

        @Override // com.adcolony.sdk.AdColonyInterstitialListener
        public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Rewarded ad expiring: " + adColonyInterstitial.getZoneID());
        }

        @Override // com.adcolony.sdk.AdColonyInterstitialListener
        public void onLeftApplication(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Rewarded ad left application");
        }

        @Override // com.adcolony.sdk.AdColonyInterstitialListener
        public void onOpened(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Rewarded ad shown");
            this.listener.onRewardedAdDisplayed();
            this.listener.onRewardedAdVideoStarted();
        }

        @Override // com.adcolony.sdk.AdColonyInterstitialListener
        public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
            AdColonyMediationAdapter.this.log("Rewarded ad loaded");
            AdColonyMediationAdapter.this.loadedRewardedAd = adColonyInterstitial;
            this.listener.onRewardedAdLoaded();
        }

        @Override // com.adcolony.sdk.AdColonyInterstitialListener
        public void onRequestNotFilled(AdColonyZone adColonyZone) {
            AdColonyMediationAdapter.this.log("Rewarded ad failed to fill for zone: " + adColonyZone.getZoneID());
            this.listener.onRewardedAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        @Override // com.adcolony.sdk.AdColonyRewardListener
        public void onReward(AdColonyReward adColonyReward) {
            if (!adColonyReward.success()) {
                AdColonyMediationAdapter.this.log("Rewarded ad did not grant reward");
            } else {
                AdColonyMediationAdapter.this.log("Rewarded ad granted reward");
                this.hasGrantedReward = true;
            }
        }
    }

    public AdColonyMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    private AdColonyAppOptions getOptions(MaxAdapterParameters maxAdapterParameters) {
        Bundle serverParameters = maxAdapterParameters.getServerParameters();
        AdColonyAppOptions adColonyAppOptions = new AdColonyAppOptions();
        adColonyAppOptions.setTestModeEnabled(maxAdapterParameters.isTesting());
        adColonyAppOptions.setMediationNetwork("AppLovin", AppLovinSdk.VERSION);
        Boolean privacySetting = getPrivacySetting("hasUserConsent", maxAdapterParameters);
        if (privacySetting != null) {
            adColonyAppOptions.setPrivacyConsentString(AdColonyAppOptions.GDPR, privacySetting.booleanValue() ? "1" : "0");
        }
        if (AppLovinSdk.VERSION_CODE >= 91100) {
            Boolean privacySetting2 = getPrivacySetting("isDoNotSell", maxAdapterParameters);
            if (privacySetting2 != null) {
                adColonyAppOptions.setPrivacyFrameworkRequired(AdColonyAppOptions.CCPA, true);
                adColonyAppOptions.setPrivacyConsentString(AdColonyAppOptions.CCPA, privacySetting2.booleanValue() ? "0" : "1");
            } else {
                adColonyAppOptions.setPrivacyFrameworkRequired(AdColonyAppOptions.CCPA, false);
            }
        }
        Boolean privacySetting3 = getPrivacySetting("isAgeRestrictedUser", maxAdapterParameters);
        if (privacySetting3 != null) {
            adColonyAppOptions.setPrivacyFrameworkRequired(AdColonyAppOptions.COPPA, privacySetting3.booleanValue());
        }
        if (maxAdapterParameters instanceof MaxAdapterResponseParameters) {
            String bidResponse = ((MaxAdapterResponseParameters) maxAdapterParameters).getBidResponse();
            if (!TextUtils.isEmpty(bidResponse)) {
                adColonyAppOptions.setOption("adm", bidResponse);
            }
        }
        if (serverParameters.containsKey("app_orientation")) {
            adColonyAppOptions.setAppOrientation(serverParameters.getInt("app_orientation"));
        }
        if (serverParameters.containsKey("app_version")) {
            adColonyAppOptions.setAppVersion(serverParameters.getString("app_version"));
        }
        if (serverParameters.containsKey("keep_screen_on")) {
            adColonyAppOptions.setKeepScreenOn(serverParameters.getBoolean("keep_screen_on"));
        }
        if (serverParameters.containsKey("multi_window_enabled")) {
            adColonyAppOptions.setMultiWindowEnabled(serverParameters.getBoolean("multi_window_enabled"));
        }
        if (serverParameters.containsKey("origin_store")) {
            adColonyAppOptions.setOriginStore(serverParameters.getString("origin_store"));
        }
        if (serverParameters.containsKey("requested_ad_orientation")) {
            adColonyAppOptions.setRequestedAdOrientation(serverParameters.getInt("requested_ad_orientation"));
        }
        if (serverParameters.containsKey(ne.K) && serverParameters.containsKey("plugin_version")) {
            adColonyAppOptions.setPlugin(serverParameters.getString(ne.K), serverParameters.getString("plugin_version"));
        }
        if (serverParameters.containsKey("user_id")) {
            adColonyAppOptions.setUserID(serverParameters.getString("user_id"));
        }
        return adColonyAppOptions;
    }

    private Boolean getPrivacySetting(String str, MaxAdapterParameters maxAdapterParameters) {
        try {
            return (Boolean) maxAdapterParameters.getClass().getMethod(str, new Class[0]).invoke(maxAdapterParameters, new Object[0]);
        } catch (Exception e2) {
            log("Error getting privacy setting " + str + " with exception: ", e2);
            if (AppLovinSdk.VERSION_CODE >= 9140000) {
                return null;
            }
            return Boolean.FALSE;
        }
    }

    private boolean isAdColonyConfigured() {
        return !AdColony.getSDKVersion().isEmpty();
    }

    private AdColonyAdSize sizeFromAdFormat(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdColonyAdSize.BANNER;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdColonyAdSize.LEADERBOARD;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdColonyAdSize.MEDIUM_RECTANGLE;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal for " + maxAdapterSignalCollectionParameters.getAdFormat() + " ad...");
        AdColony.setAppOptions(getOptions(maxAdapterSignalCollectionParameters));
        AdColony.collectSignals(new AdColonySignalsListener() { // from class: com.applovin.mediation.adapters.AdColonyMediationAdapter.1
            @Override // com.adcolony.sdk.AdColonySignalsListener
            public void onFailure() {
                AdColonyMediationAdapter.this.log("Signal collection failed");
                maxSignalCollectionListener.onSignalCollectionFailed("AdColony has not yet been configured or there was an error parsing data");
            }

            @Override // com.adcolony.sdk.AdColonySignalsListener
            public void onSuccess(String str) {
                AdColonyMediationAdapter.this.log("Signal collection successful");
                maxSignalCollectionListener.onSignalCollected(str);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return "4.8.0.4";
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return AdColony.getSDKVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        if (initialized.compareAndSet(false, true)) {
            status = MaxAdapter.InitializationStatus.INITIALIZING;
            String string = maxAdapterInitializationParameters.getServerParameters().getString("app_id");
            log("Initializing AdColony SDK with app id: " + string + "...");
            status = AdColony.configure(activity != null ? activity.getApplication() : (Application) getApplicationContext(), getOptions(maxAdapterInitializationParameters), string) ? MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS : MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
        }
        onCompletionListener.onCompletion(status, null);
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        StringBuilder sb = new StringBuilder("Loading ");
        sb.append(TextUtils.isEmpty(bidResponse) ? "bidding " : "");
        sb.append(maxAdFormat.getLabel());
        sb.append(" ad for zone id ");
        sb.append(thirdPartyAdPlacementId);
        sb.append("...");
        log(sb.toString());
        if (isAdColonyConfigured()) {
            AdColony.setAppOptions(getOptions(maxAdapterResponseParameters));
            AdColony.requestAdView(thirdPartyAdPlacementId, new AdViewAdListener(maxAdFormat, maxAdViewAdapterListener), sizeFromAdFormat(maxAdFormat));
        } else {
            log("AdColony SDK is not initialized");
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log(androidx.media3.extractor.text.ttml.a.q(new StringBuilder("Loading "), TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "", " interstitial ad for zone id ", thirdPartyAdPlacementId, "..."));
        if (isAdColonyConfigured()) {
            AdColony.setAppOptions(getOptions(maxAdapterResponseParameters));
            AdColony.requestInterstitial(thirdPartyAdPlacementId, new InterstitialListener(maxInterstitialAdapterListener));
        } else {
            log("AdColony SDK is not initialized");
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log(androidx.media3.extractor.text.ttml.a.q(new StringBuilder("Loading "), TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "", " rewarded ad for zone id ", thirdPartyAdPlacementId, "..."));
        if (!isAdColonyConfigured()) {
            log("AdColony SDK is not initialized");
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
        } else {
            AdColony.setAppOptions(getOptions(maxAdapterResponseParameters));
            RewardedAdListener rewardedAdListener = new RewardedAdListener(maxRewardedAdapterListener);
            AdColony.setRewardListener(rewardedAdListener);
            AdColony.requestInterstitial(thirdPartyAdPlacementId, rewardedAdListener);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        AdColonyInterstitial adColonyInterstitial = this.loadedInterstitialAd;
        if (adColonyInterstitial != null) {
            adColonyInterstitial.destroy();
            this.loadedInterstitialAd = null;
        }
        AdColonyInterstitial adColonyInterstitial2 = this.loadedRewardedAd;
        if (adColonyInterstitial2 != null) {
            adColonyInterstitial2.destroy();
            this.loadedRewardedAd = null;
        }
        AdColonyAdView adColonyAdView = this.loadedAdViewAd;
        if (adColonyAdView != null) {
            adColonyAdView.destroy();
            this.loadedAdViewAd = null;
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        AdColonyInterstitial adColonyInterstitial = this.loadedInterstitialAd;
        if (adColonyInterstitial == null) {
            log("Interstitial ad not ready");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", 0, "Interstitial ad not ready"));
        } else if (adColonyInterstitial.isExpired()) {
            log("Interstitial ad is expired");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_EXPIRED);
        } else {
            if (this.loadedInterstitialAd.show()) {
                return;
            }
            log("Interstitial ad failed to display");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", 0, "Interstitial ad failed to display"));
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        AdColonyInterstitial adColonyInterstitial = this.loadedRewardedAd;
        if (adColonyInterstitial == null) {
            log("Rewarded ad not ready");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", 0, "Rewarded ad not ready"));
        } else {
            if (adColonyInterstitial.isExpired()) {
                log("Rewarded ad is expired");
                maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.AD_EXPIRED);
                return;
            }
            configureReward(maxAdapterResponseParameters);
            if (this.loadedRewardedAd.show()) {
                return;
            }
            log("Rewarded ad failed to display");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
        }
    }
}
