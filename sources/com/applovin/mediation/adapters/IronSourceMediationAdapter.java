package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import com.applovin.mediation.adapters.ironsource.BuildConfig;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.banner.BannerAdViewListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class IronSourceMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static MaxAdapter.InitializationStatus status;
    private ISDemandOnlyBannerLayout adView;

    @Nullable
    private String adViewPlacementIdentifier;
    private BannerAdView biddingAdView;
    private InterstitialAd biddingInterstitialAd;
    private BiddingInterstitialListener biddingInterstitialListener;
    private RewardedAd biddingRewardedAd;
    private BiddingRewardedListener biddingRewardedListener;
    private String mRouterPlacementIdentifier;
    private static final IronSourceRouter ROUTER = new IronSourceRouter();
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static final List<String> loadedAdViewPlacementIdentifiers = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class AdViewListener implements ISDemandOnlyBannerListener {
        private final MaxAdViewAdapterListener listener;

        public AdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
        public void onBannerAdClicked(String str) {
            IronSourceMediationAdapter.this.log("AdView ad clicked for instance ID: " + str);
            this.listener.onAdViewAdClicked();
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
        public void onBannerAdLeftApplication(String str) {
            IronSourceMediationAdapter.this.log("AdView ad left application for instance ID: " + str);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
        public void onBannerAdLoadFailed(String str, IronSourceError ironSourceError) {
            MaxAdapterError maxError = IronSourceMediationAdapter.toMaxError(ironSourceError);
            IronSourceMediationAdapter.this.log("AdView ad failed to load for instance ID: " + str + " with error: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
        public void onBannerAdLoaded(String str) {
            IronSourceMediationAdapter.this.log("AdView loaded for instance ID: " + str);
            this.listener.onAdViewAdLoaded(IronSourceMediationAdapter.this.adView);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
        public void onBannerAdShown(String str) {
            IronSourceMediationAdapter.loadedAdViewPlacementIdentifiers.add(str);
            IronSourceMediationAdapter.this.log("AdView ad displayed for instance ID: " + str);
            this.listener.onAdViewAdDisplayed();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class BiddingAdViewListener implements BannerAdLoaderListener, BannerAdViewListener {
        private final MaxAdViewAdapterListener listener;

        public BiddingAdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        @Nullable
        private Bundle createExtraInfo(@NonNull BannerAdView bannerAdView) {
            String adId = bannerAdView.getAdInfo().getAdId();
            if (TextUtils.isEmpty(adId)) {
                return null;
            }
            Bundle bundle = new Bundle(1);
            bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, adId);
            return bundle;
        }

        @Override // com.unity3d.ironsourceads.banner.BannerAdViewListener
        public void onBannerAdClicked(@NonNull BannerAdView bannerAdView) {
            IronSourceMediationAdapter.this.log("AdView ad clicked");
            this.listener.onAdViewAdClicked(createExtraInfo(bannerAdView));
        }

        @Override // com.unity3d.ironsourceads.banner.BannerAdLoaderListener
        public void onBannerAdLoadFailed(@NonNull IronSourceError ironSourceError) {
            MaxAdapterError maxError = IronSourceMediationAdapter.toMaxError(ironSourceError);
            IronSourceMediationAdapter.this.log("AdView ad failed to load for bidding instance with error: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.unity3d.ironsourceads.banner.BannerAdLoaderListener
        public void onBannerAdLoaded(@NonNull BannerAdView bannerAdView) {
            IronSourceMediationAdapter.this.log("AdView loaded for instance ID: " + bannerAdView.getAdInfo().getInstanceId());
            IronSourceMediationAdapter.this.biddingAdView = bannerAdView;
            IronSourceMediationAdapter.this.biddingAdView.setListener(this);
            this.listener.onAdViewAdLoaded(IronSourceMediationAdapter.this.biddingAdView, createExtraInfo(bannerAdView));
        }

        @Override // com.unity3d.ironsourceads.banner.BannerAdViewListener
        public void onBannerAdShown(@NonNull BannerAdView bannerAdView) {
            IronSourceMediationAdapter.this.log("AdView ad displayed");
            this.listener.onAdViewAdDisplayed(createExtraInfo(bannerAdView));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class BiddingInterstitialListener implements InterstitialAdLoaderListener, InterstitialAdListener {
        private final MaxInterstitialAdapterListener listener;

        public BiddingInterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Nullable
        private Bundle createExtraInfo(@NonNull InterstitialAd interstitialAd) {
            String adId = interstitialAd.getAdInfo().getAdId();
            if (TextUtils.isEmpty(adId)) {
                return null;
            }
            Bundle bundle = new Bundle(1);
            bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, adId);
            return bundle;
        }

        @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
        public void onInterstitialAdClicked(@NonNull InterstitialAd interstitialAd) {
            IronSourceMediationAdapter.this.log("Interstitial ad clicked for bidding instance ID: " + interstitialAd.getAdInfo().getInstanceId());
            this.listener.onInterstitialAdClicked(createExtraInfo(interstitialAd));
        }

        @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
        public void onInterstitialAdDismissed(@NonNull InterstitialAd interstitialAd) {
            IronSourceMediationAdapter.this.log("Interstitial ad closed for bidding instance ID: " + interstitialAd.getAdInfo().getInstanceId());
            this.listener.onInterstitialAdHidden(createExtraInfo(interstitialAd));
        }

        @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
        public void onInterstitialAdFailedToShow(@NonNull InterstitialAd interstitialAd, @NonNull IronSourceError ironSourceError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
            IronSourceMediationAdapter.this.log("Interstitial ad failed to show for bidding instance ID: " + interstitialAd.getAdInfo().getInstanceId() + " with error: " + maxAdapterError);
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError, createExtraInfo(interstitialAd));
        }

        @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
        public void onInterstitialAdLoadFailed(@NonNull IronSourceError ironSourceError) {
            IronSourceMediationAdapter.this.log("Interstitial ad failed to load for bidding instance with error: " + ironSourceError);
            this.listener.onInterstitialAdLoadFailed(IronSourceMediationAdapter.toMaxError(ironSourceError));
        }

        @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
        public void onInterstitialAdLoaded(@NonNull InterstitialAd interstitialAd) {
            IronSourceMediationAdapter.this.log("Interstitial loaded for bidding instance ID: " + interstitialAd.getAdInfo().getInstanceId());
            IronSourceMediationAdapter.this.biddingInterstitialAd = interstitialAd;
            this.listener.onInterstitialAdLoaded(createExtraInfo(interstitialAd));
        }

        @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
        public void onInterstitialAdShown(@NonNull InterstitialAd interstitialAd) {
            IronSourceMediationAdapter.this.log("Interstitial ad displayed for bidding instance ID: " + interstitialAd.getAdInfo().getInstanceId());
            this.listener.onInterstitialAdDisplayed(createExtraInfo(interstitialAd));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class BiddingRewardedListener implements RewardedAdLoaderListener, RewardedAdListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        public BiddingRewardedListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Nullable
        private Bundle createExtraInfo(@NonNull RewardedAd rewardedAd) {
            String adId = rewardedAd.getAdInfo().getAdId();
            if (TextUtils.isEmpty(adId)) {
                return null;
            }
            Bundle bundle = new Bundle(1);
            bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, adId);
            return bundle;
        }

        @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
        public void onRewardedAdClicked(@NonNull RewardedAd rewardedAd) {
            IronSourceMediationAdapter.this.log("Rewarded ad clicked for instance ID: " + rewardedAd.getAdInfo().getInstanceId());
            this.listener.onRewardedAdClicked(createExtraInfo(rewardedAd));
        }

        @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
        public void onRewardedAdDismissed(@NonNull RewardedAd rewardedAd) {
            if (this.hasGrantedReward || IronSourceMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = IronSourceMediationAdapter.this.getReward();
                IronSourceMediationAdapter.this.log("Rewarded ad rewarded user with reward: " + reward + " for instance ID: " + rewardedAd.getAdInfo().getInstanceId());
                this.listener.onUserRewarded(reward);
            }
            IronSourceMediationAdapter.this.log("Rewarded ad hidden for instance ID: " + rewardedAd.getAdInfo().getInstanceId());
            this.listener.onRewardedAdHidden(createExtraInfo(rewardedAd));
        }

        @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
        public void onRewardedAdFailedToShow(@NonNull RewardedAd rewardedAd, @NonNull IronSourceError ironSourceError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
            IronSourceMediationAdapter.this.log("Rewarded ad failed to show for bidding instance ID: " + rewardedAd.getAdInfo().getInstanceId() + " with error: " + maxAdapterError);
            this.listener.onRewardedAdDisplayFailed(maxAdapterError, createExtraInfo(rewardedAd));
        }

        @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
        public void onRewardedAdLoadFailed(@NonNull IronSourceError ironSourceError) {
            IronSourceMediationAdapter.this.log("Rewarded ad failed to load for bidding instance with error: " + ironSourceError);
            this.listener.onRewardedAdLoadFailed(IronSourceMediationAdapter.toMaxError(ironSourceError));
        }

        @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
        public void onRewardedAdLoaded(@NonNull RewardedAd rewardedAd) {
            IronSourceMediationAdapter.this.log("Rewarded ad loaded for bidding instance ID: " + rewardedAd.getAdInfo().getInstanceId());
            IronSourceMediationAdapter.this.biddingRewardedAd = rewardedAd;
            this.listener.onRewardedAdLoaded(createExtraInfo(rewardedAd));
        }

        @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
        public void onRewardedAdShown(@NonNull RewardedAd rewardedAd) {
            IronSourceMediationAdapter.this.log("Rewarded ad shown for bidding instance ID: " + rewardedAd.getAdInfo().getInstanceId());
            this.listener.onRewardedAdDisplayed(createExtraInfo(rewardedAd));
        }

        @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
        public void onUserEarnedReward(@NonNull RewardedAd rewardedAd) {
            IronSourceMediationAdapter.this.log("Rewarded ad granted reward for instance ID: " + rewardedAd.getAdInfo().getInstanceId());
            this.hasGrantedReward = true;
        }
    }

    public IronSourceMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    private List<IronSourceAds.AdFormat> getAdFormatsToInitialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters) {
        ArrayList<String> stringArrayList = maxAdapterInitializationParameters.getServerParameters().getStringArrayList("init_ad_formats");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            return Arrays.asList(IronSourceAds.AdFormat.INTERSTITIAL, IronSourceAds.AdFormat.REWARDED, IronSourceAds.AdFormat.BANNER);
        }
        ArrayList arrayList = new ArrayList();
        if (stringArrayList.contains("inter")) {
            arrayList.add(IronSourceAds.AdFormat.INTERSTITIAL);
        }
        if (stringArrayList.contains("rewarded")) {
            arrayList.add(IronSourceAds.AdFormat.REWARDED);
        }
        if (stringArrayList.contains("banner")) {
            arrayList.add(IronSourceAds.AdFormat.BANNER);
        }
        return arrayList;
    }

    private long getAdapterVersionCode() {
        int i10;
        long j10;
        long j11 = 0;
        for (String str : getAdapterVersion().replaceAll("[^0-9.]", "").split("\\.")) {
            long j12 = j11 * 100;
            if (j12 == 0 || str.length() <= 2) {
                if (str.isEmpty()) {
                    j10 = 0;
                } else {
                    i10 = Integer.parseInt(str);
                }
                j11 = j12 + j10;
            } else {
                i10 = Integer.parseInt(str.substring(0, 2));
            }
            j10 = i10;
            j11 = j12 + j10;
        }
        return j11;
    }

    private void setPrivacySettings(MaxAdapterParameters maxAdapterParameters) throws JSONException {
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null) {
            IronSourceAds.setConsent(boolHasUserConsent.booleanValue());
        }
    }

    private AdSize toISAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdSize.banner();
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdSize.leaderboard();
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.mediumRectangle();
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    private ISBannerSize toISBannerSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return ISBannerSize.BANNER;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return ISBannerSize.LARGE;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return ISBannerSize.RECTANGLE;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x003c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0042  */
    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    /* JADX WARN: Code duplicated, block: B:30:0x0048  */
    /* JADX WARN: Code duplicated, block: B:31:0x004b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0054  */
    /* JADX WARN: Code duplicated, block: B:35:0x0057  */
    public static MaxAdapterError toMaxError(IronSourceError ironSourceError) {
        int errorCode = ironSourceError.getErrorCode();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (errorCode != 501 && errorCode != 502 && errorCode != 505 && errorCode != 506) {
            if (errorCode != 526) {
                if (errorCode != 527 && errorCode != 1060 && errorCode != 1061) {
                    switch (errorCode) {
                        case 1:
                        case IronSourceError.ERROR_BN_LOAD_EXCEPTION /* 605 */:
                        case 610:
                        case IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER /* 611 */:
                        case IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE /* 613 */:
                        case IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND /* 614 */:
                        case 7101:
                        case 7102:
                        case 7103:
                        case 7104:
                        case 7201:
                            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                            break;
                        case IronSourceError.ERROR_NO_INTERNET_CONNECTION /* 520 */:
                            maxAdapterError = MaxAdapterError.NO_CONNECTION;
                            break;
                        case 600:
                        case IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION /* 601 */:
                        case IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD /* 602 */:
                        case IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION /* 603 */:
                        case IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT /* 607 */:
                        case IronSourceError.ERROR_BN_INSTANCE_INIT_EXCEPTION /* 612 */:
                        case 1010:
                        case 7001:
                        case 7002:
                        case 7003:
                        case 7004:
                        case 7115:
                            maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
                            break;
                        case IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED /* 604 */:
                            maxAdapterError = MaxAdapterError.AD_FREQUENCY_CAPPED;
                            break;
                        case 606:
                        case 621:
                        case 1158:
                            maxAdapterError = MaxAdapterError.NO_FILL;
                            break;
                        case 608:
                        case IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT /* 609 */:
                        case 7113:
                            maxAdapterError = MaxAdapterError.TIMEOUT;
                            break;
                        case IronSourceError.ERROR_BN_LOAD_NO_CONFIG /* 615 */:
                        case IronSourceError.ERROR_BN_UNSUPPORTED_SIZE /* 616 */:
                        case 7105:
                        case 7106:
                        case 7107:
                        case 7108:
                        case 7109:
                        case 7110:
                        case 7111:
                        case 7112:
                        case 7116:
                        case 7117:
                        case 7118:
                            maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                            break;
                        case 7202:
                            maxAdapterError = MaxAdapterError.AD_NOT_READY;
                            break;
                        default:
                            switch (errorCode) {
                                case IronSourceError.ERROR_CODE_INIT_FAILED /* 508 */:
                                    maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
                                    break;
                                case IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW /* 509 */:
                                    maxAdapterError = MaxAdapterError.NO_FILL;
                                    break;
                                case 510:
                                    break;
                                default:
                                    switch (errorCode) {
                                        case 1000:
                                        case 1001:
                                        case 1002:
                                        case 1003:
                                        case 1004:
                                        case 1005:
                                        case 1007:
                                        case 1008:
                                            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                                            break;
                                        case 1006:
                                            maxAdapterError = MaxAdapterError.SIGNAL_COLLECTION_TIMEOUT;
                                            break;
                                        default:
                                            switch (errorCode) {
                                                case 1020:
                                                case IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT /* 1021 */:
                                                    maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                                                    break;
                                                case IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW /* 1022 */:
                                                case IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE /* 1023 */:
                                                    maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                                                    break;
                                                case 1024:
                                                    maxAdapterError = MaxAdapterError.NO_FILL;
                                                    break;
                                                default:
                                                    switch (errorCode) {
                                                        case IronSourceError.ERROR_RV_LOAD_DURING_LOAD /* 1026 */:
                                                        case IronSourceError.ERROR_RV_LOAD_DURING_SHOW /* 1027 */:
                                                        case IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW /* 1036 */:
                                                        case IronSourceError.ERROR_IS_LOAD_DURING_SHOW /* 1037 */:
                                                            maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                                                            break;
                                                        case IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED /* 1028 */:
                                                        case IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED /* 1030 */:
                                                        case IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK /* 1034 */:
                                                        case IronSourceError.ERROR_RV_SHOW_EXCEPTION /* 1038 */:
                                                        case IronSourceError.ERROR_IS_SHOW_EXCEPTION /* 1039 */:
                                                        case IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION /* 1040 */:
                                                        case IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION /* 1041 */:
                                                            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                                                            break;
                                                        case IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID /* 1029 */:
                                                        case IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID /* 1031 */:
                                                            maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                                                            break;
                                                        case IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT /* 1032 */:
                                                        case IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT /* 1033 */:
                                                            maxAdapterError = MaxAdapterError.TIMEOUT;
                                                            break;
                                                        case IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES /* 1035 */:
                                                            maxAdapterError = MaxAdapterError.NO_FILL;
                                                            break;
                                                        default:
                                                            switch (errorCode) {
                                                                case 1050:
                                                                case 1053:
                                                                case IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW /* 1056 */:
                                                                    maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                                                                    break;
                                                                case IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW /* 1051 */:
                                                                case IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW /* 1054 */:
                                                                    maxAdapterError = MaxAdapterError.AD_NOT_READY;
                                                                    break;
                                                                case 1052:
                                                                case 1055:
                                                                    maxAdapterError = MaxAdapterError.TIMEOUT;
                                                                    break;
                                                                case IronSourceError.ERROR_RV_EXPIRED_ADS /* 1057 */:
                                                                    maxAdapterError = MaxAdapterError.AD_EXPIRED;
                                                                    break;
                                                                case 1058:
                                                                    maxAdapterError = MaxAdapterError.NO_FILL;
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                }
            } else {
                maxAdapterError = MaxAdapterError.AD_FREQUENCY_CAPPED;
            }
        } else {
            maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
        }
        return new MaxAdapterError(maxAdapterError, errorCode, ironSourceError.getErrorMessage());
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, @Nullable Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) throws JSONException {
        log("Collecting signal...");
        setPrivacySettings(maxAdapterSignalCollectionParameters);
        maxSignalCollectionListener.onSignalCollected(IronSource.getISDemandOnlyBiddingData(getApplicationContext()));
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return IronSourceAds.getSdkVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) throws JSONException {
        if (!INITIALIZED.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(status, null);
            return;
        }
        status = MaxAdapter.InitializationStatus.INITIALIZING;
        String string = maxAdapterInitializationParameters.getServerParameters().getString(MBridgeConstans.APP_KEY);
        log("Initializing IronSource SDK with app key: " + string + "...");
        IronSource.setMediationType("MAX" + getAdapterVersionCode() + "SDK" + AppLovinSdk.VERSION_CODE);
        setPrivacySettings(maxAdapterInitializationParameters);
        Boolean boolIsDoNotSell = maxAdapterInitializationParameters.isDoNotSell();
        if (boolIsDoNotSell != null) {
            IronSourceAds.setMetaData("do_not_sell", Boolean.toString(boolIsDoNotSell.booleanValue()));
        }
        IronSourceAds.enableDebugMode(maxAdapterInitializationParameters.isTesting());
        IronSourceRouter ironSourceRouter = ROUTER;
        IronSource.setISDemandOnlyInterstitialListener(ironSourceRouter);
        IronSource.setISDemandOnlyRewardedVideoListener(ironSourceRouter);
        IronSourceAds.init(getApplicationContext(), new InitRequest.Builder(string).withLegacyAdFormats(getAdFormatsToInitialize(maxAdapterInitializationParameters)).build(), new InitListener() { // from class: com.applovin.mediation.adapters.IronSourceMediationAdapter.1
            @Override // com.unity3d.ironsourceads.InitListener
            public void onInitFailed(@NonNull IronSourceError ironSourceError) {
                IronSourceMediationAdapter.this.log("Failed to initialize IronSource SDK with error: " + ironSourceError);
                MaxAdapter.InitializationStatus unused = IronSourceMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                onCompletionListener.onCompletion(IronSourceMediationAdapter.status, ironSourceError.getErrorMessage());
            }

            @Override // com.unity3d.ironsourceads.InitListener
            public void onInitSuccess() {
                IronSourceMediationAdapter.this.log("IronSource SDK initialized.");
                MaxAdapter.InitializationStatus unused = IronSourceMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                onCompletionListener.onCompletion(IronSourceMediationAdapter.status, null);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, @Nullable Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) throws JSONException {
        setPrivacySettings(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        StringBuilder sb2 = new StringBuilder("Loading ");
        sb2.append(zIsValidString ? "bidding " : "");
        sb2.append(maxAdFormat.getLabel());
        sb2.append(" ad for instance ID: ");
        sb2.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        log(sb2.toString());
        if (zIsValidString) {
            BannerAdLoader.loadAd(new BannerAdRequest.Builder(getApplicationContext(), maxAdapterResponseParameters.getThirdPartyAdPlacementId(), bidResponse, toISAdSize(maxAdFormat)).build(), new BiddingAdViewListener(maxAdViewAdapterListener));
            return;
        }
        if (activity == null) {
            log(maxAdFormat.getLabel() + " ad load failed: Activity is null");
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.MISSING_ACTIVITY);
            return;
        }
        if (!loadedAdViewPlacementIdentifiers.contains(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            this.adViewPlacementIdentifier = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutCreateBannerForDemandOnly = IronSource.createBannerForDemandOnly(activity, toISBannerSize(maxAdFormat));
            this.adView = iSDemandOnlyBannerLayoutCreateBannerForDemandOnly;
            iSDemandOnlyBannerLayoutCreateBannerForDemandOnly.setBannerDemandOnlyListener(new AdViewListener(maxAdViewAdapterListener));
            IronSource.loadISDemandOnlyBanner(activity, this.adView, this.adViewPlacementIdentifier);
            return;
        }
        log("AdView ad failed to load for instance ID: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + ". An ad with the same instance ID is already loaded");
        MaxAdapterError maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        maxAdViewAdapterListener.onAdViewAdLoadFailed(new MaxAdapterError(maxAdapterError.getCode(), maxAdapterError.getMessage(), 0, "An ad with the same instance ID is already loaded"));
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) throws JSONException {
        setPrivacySettings(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder("Loading ironSource ");
        sb2.append(zIsValidString ? "bidding " : "");
        sb2.append("interstitial for instance ID: ");
        sb2.append(thirdPartyAdPlacementId);
        log(sb2.toString());
        if (zIsValidString) {
            InterstitialAdRequest interstitialAdRequestBuild = new InterstitialAdRequest.Builder(thirdPartyAdPlacementId, bidResponse).build();
            BiddingInterstitialListener biddingInterstitialListener = new BiddingInterstitialListener(maxInterstitialAdapterListener);
            this.biddingInterstitialListener = biddingInterstitialListener;
            InterstitialAdLoader.loadAd(interstitialAdRequestBuild, biddingInterstitialListener);
            return;
        }
        String interstitialRouterIdentifier = IronSourceRouter.getInterstitialRouterIdentifier(thirdPartyAdPlacementId);
        this.mRouterPlacementIdentifier = interstitialRouterIdentifier;
        IronSourceRouter ironSourceRouter = ROUTER;
        ironSourceRouter.addInterstitialAdapter(this, maxInterstitialAdapterListener, interstitialRouterIdentifier);
        if (!IronSource.isISDemandOnlyInterstitialReady(thirdPartyAdPlacementId)) {
            IronSource.loadISDemandOnlyInterstitial(activity, thirdPartyAdPlacementId);
            return;
        }
        log("Ad is available already for instance ID: " + thirdPartyAdPlacementId);
        ironSourceRouter.onAdLoaded(this.mRouterPlacementIdentifier);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) throws JSONException {
        setPrivacySettings(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder("Loading ironSource ");
        sb2.append(zIsValidString ? "bidding " : "");
        sb2.append("rewarded for instance ID: ");
        sb2.append(thirdPartyAdPlacementId);
        log(sb2.toString());
        if (zIsValidString) {
            RewardedAdRequest rewardedAdRequestBuild = new RewardedAdRequest.Builder(thirdPartyAdPlacementId, bidResponse).build();
            BiddingRewardedListener biddingRewardedListener = new BiddingRewardedListener(maxRewardedAdapterListener);
            this.biddingRewardedListener = biddingRewardedListener;
            RewardedAdLoader.loadAd(rewardedAdRequestBuild, biddingRewardedListener);
            return;
        }
        String rewardedVideoRouterIdentifier = IronSourceRouter.getRewardedVideoRouterIdentifier(thirdPartyAdPlacementId);
        this.mRouterPlacementIdentifier = rewardedVideoRouterIdentifier;
        IronSourceRouter ironSourceRouter = ROUTER;
        ironSourceRouter.addRewardedAdapter(this, maxRewardedAdapterListener, rewardedVideoRouterIdentifier);
        if (!IronSource.isISDemandOnlyRewardedVideoAvailable(thirdPartyAdPlacementId)) {
            IronSource.loadISDemandOnlyRewardedVideo(activity, thirdPartyAdPlacementId);
            return;
        }
        log("Ad is available already for instance ID: " + thirdPartyAdPlacementId);
        ironSourceRouter.onAdLoaded(this.mRouterPlacementIdentifier);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        if (this.adViewPlacementIdentifier != null) {
            log("Destroying adview with instance ID: " + this.adViewPlacementIdentifier);
            IronSource.destroyISDemandOnlyBanner(this.adViewPlacementIdentifier);
            loadedAdViewPlacementIdentifiers.remove(this.adViewPlacementIdentifier);
        }
        ROUTER.removeAdapter(this, this.mRouterPlacementIdentifier);
        BannerAdView bannerAdView = this.biddingAdView;
        if (bannerAdView != null) {
            bannerAdView.setListener(null);
            this.biddingAdView = null;
        }
        InterstitialAd interstitialAd = this.biddingInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setListener(null);
            this.biddingInterstitialAd = null;
        }
        RewardedAd rewardedAd = this.biddingRewardedAd;
        if (rewardedAd != null) {
            rewardedAd.setListener(null);
            this.biddingRewardedAd = null;
        }
        this.biddingInterstitialListener = null;
        this.biddingRewardedListener = null;
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        boolean zIsValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing ironSource interstitial for instance ID: " + thirdPartyAdPlacementId);
        if (!zIsValidString) {
            IronSourceRouter ironSourceRouter = ROUTER;
            ironSourceRouter.addShowingAdapter(this);
            if (IronSource.isISDemandOnlyInterstitialReady(thirdPartyAdPlacementId)) {
                IronSource.showISDemandOnlyInterstitial(thirdPartyAdPlacementId);
                return;
            }
            log("Unable to show ironSource interstitial - no ad loaded for instance ID: " + thirdPartyAdPlacementId);
            String interstitialRouterIdentifier = IronSourceRouter.getInterstitialRouterIdentifier(thirdPartyAdPlacementId);
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
            ironSourceRouter.onAdDisplayFailed(interstitialRouterIdentifier, new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        InterstitialAd interstitialAd = this.biddingInterstitialAd;
        if (interstitialAd == null || !interstitialAd.isReadyToShow()) {
            log("Unable to show ironSource interstitial - ad is not ready for instance ID: " + thirdPartyAdPlacementId);
            MaxAdapterError maxAdapterError3 = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError4 = MaxAdapterError.AD_NOT_READY;
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError3, maxAdapterError4.getCode(), maxAdapterError4.getMessage()));
            return;
        }
        if (activity == null) {
            log("Interstitial ad display failed: Activity is null");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.biddingInterstitialAd.setListener(this.biddingInterstitialListener);
            this.biddingInterstitialAd.show(activity);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        boolean zIsValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing ironSource rewarded for instance ID: " + thirdPartyAdPlacementId);
        if (!zIsValidString) {
            IronSourceRouter ironSourceRouter = ROUTER;
            ironSourceRouter.addShowingAdapter(this);
            if (IronSource.isISDemandOnlyRewardedVideoAvailable(thirdPartyAdPlacementId)) {
                configureReward(maxAdapterResponseParameters);
                IronSource.showISDemandOnlyRewardedVideo(thirdPartyAdPlacementId);
                return;
            }
            log("Unable to show ironSource rewarded - no ad loaded...");
            String rewardedVideoRouterIdentifier = IronSourceRouter.getRewardedVideoRouterIdentifier(thirdPartyAdPlacementId);
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
            ironSourceRouter.onAdDisplayFailed(rewardedVideoRouterIdentifier, new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        RewardedAd rewardedAd = this.biddingRewardedAd;
        if (rewardedAd == null || !rewardedAd.isReadyToShow()) {
            log("Unable to show ironSource rewarded - ad is not ready for instance ID: " + thirdPartyAdPlacementId);
            MaxAdapterError maxAdapterError3 = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError4 = MaxAdapterError.AD_NOT_READY;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError3, maxAdapterError4.getCode(), maxAdapterError4.getMessage()));
            return;
        }
        if (activity == null) {
            log("Rewarded ad display failed: Activity is null");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.MISSING_ACTIVITY);
        } else {
            configureReward(maxAdapterResponseParameters);
            this.biddingRewardedAd.setListener(this.biddingRewardedListener);
            this.biddingRewardedAd.show(activity);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class IronSourceRouter extends MediationAdapterRouter implements ISDemandOnlyInterstitialListener, ISDemandOnlyRewardedVideoListener {
        private boolean hasGrantedReward;

        private IronSourceRouter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String getInterstitialRouterIdentifier(String str) {
            return str + '-' + IronSourceAds.AdFormat.INTERSTITIAL;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String getRewardedVideoRouterIdentifier(String str) {
            return str + '-' + IronSourceAds.AdFormat.REWARDED;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public void onInterstitialAdClicked(String str) {
            log("Interstitial ad clicked for instance ID: " + str);
            onAdClicked(getInterstitialRouterIdentifier(str));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public void onInterstitialAdClosed(String str) {
            log("Interstitial ad closed for instance ID: " + str);
            onAdHidden(getInterstitialRouterIdentifier(str));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
            log("Interstitial ad failed to load for instance ID: " + str + " with error: " + ironSourceError);
            onAdLoadFailed(getInterstitialRouterIdentifier(str), IronSourceMediationAdapter.toMaxError(ironSourceError));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public void onInterstitialAdOpened(String str) {
            log("Interstitial ad displayed for instance ID: " + str);
            onAdDisplayed(getInterstitialRouterIdentifier(str));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public void onInterstitialAdReady(String str) {
            log("Interstitial loaded for instance ID: " + str);
            onAdLoaded(getInterstitialRouterIdentifier(str));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
            log("Interstitial ad failed to show for instance ID: " + str + " with error: " + maxAdapterError);
            onAdDisplayFailed(getInterstitialRouterIdentifier(str), maxAdapterError);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public void onRewardedVideoAdClicked(String str) {
            log("Rewarded ad clicked for instance ID: " + str);
            onAdClicked(getRewardedVideoRouterIdentifier(str));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public void onRewardedVideoAdClosed(String str) {
            String rewardedVideoRouterIdentifier = getRewardedVideoRouterIdentifier(str);
            if (this.hasGrantedReward || shouldAlwaysRewardUser(rewardedVideoRouterIdentifier)) {
                MaxReward reward = getReward(rewardedVideoRouterIdentifier);
                log("Rewarded  ad rewarded user with reward: " + reward + " for instance ID: " + str);
                onUserRewarded(rewardedVideoRouterIdentifier, reward);
            }
            log("Rewarded ad hidden for instance ID: " + str);
            onAdHidden(rewardedVideoRouterIdentifier);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
            log("Rewarded ad failed to load for instance ID: " + str);
            onAdLoadFailed(getRewardedVideoRouterIdentifier(str), IronSourceMediationAdapter.toMaxError(ironSourceError));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public void onRewardedVideoAdLoadSuccess(String str) {
            log("Rewarded ad loaded for instance ID: " + str);
            onAdLoaded(getRewardedVideoRouterIdentifier(str));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public void onRewardedVideoAdOpened(String str) {
            log("Rewarded ad shown for instance ID: " + str);
            onAdDisplayed(getRewardedVideoRouterIdentifier(str));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public void onRewardedVideoAdRewarded(String str) {
            log("Rewarded ad granted reward for instance ID: " + str);
            this.hasGrantedReward = true;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
            log("Rewarded ad failed to show for instance ID: " + str + " with error: " + maxAdapterError);
            onAdDisplayFailed(getRewardedVideoRouterIdentifier(str), maxAdapterError);
        }

        @Override // com.applovin.mediation.adapters.MediationAdapterRouter
        public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        }
    }
}
