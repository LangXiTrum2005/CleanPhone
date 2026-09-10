package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import cj.h;
import com.applovin.mediation.MaxAdFormat;
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
import com.applovin.mediation.adapters.unityads.BuildConfig;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import d5.u;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class UnityAdsMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static MaxAdapter.InitializationStatus initializationStatus;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private BannerView bannerView;
    private String biddingAdId;

    /* JADX INFO: renamed from: com.applovin.mediation.adapters.UnityAdsMediationAdapter$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError;
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError;

        static {
            int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError = iArr;
            try {
                iArr[UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[UnityAds.UnityAdsLoadError.values().length];
            $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError = iArr2;
            try {
                iArr2[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public UnityAdsMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    private UnityAdsLoadOptions createAdLoadOptions(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (AppLovinSdkUtils.isValidString(bidResponse)) {
            unityAdsLoadOptions.setAdMarkup(bidResponse);
        }
        if (AppLovinSdkUtils.isValidString(this.biddingAdId)) {
            unityAdsLoadOptions.setObjectId(this.biddingAdId);
        }
        return unityAdsLoadOptions;
    }

    private UnityAdsShowOptions createAdShowOptions() {
        UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
        if (AppLovinSdkUtils.isValidString(this.biddingAdId)) {
            unityAdsShowOptions.setObjectId(this.biddingAdId);
        }
        return unityAdsShowOptions;
    }

    private Context getContext(@Nullable Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$collectSignal$0(MaxSignalCollectionListener maxSignalCollectionListener, String str) {
        log("Collected signal");
        maxSignalCollectionListener.onSignalCollected(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaxAdapterError toMaxError(BannerErrorInfo bannerErrorInfo) {
        MaxAdapterError maxAdapterError;
        BannerErrorCode bannerErrorCode = bannerErrorInfo.errorCode;
        if (bannerErrorCode == BannerErrorCode.NO_FILL) {
            maxAdapterError = MaxAdapterError.NO_FILL;
        } else if (bannerErrorCode == BannerErrorCode.NATIVE_ERROR) {
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        } else {
            maxAdapterError = bannerErrorCode == BannerErrorCode.WEBVIEW_ERROR ? MaxAdapterError.WEBVIEW_ERROR : MaxAdapterError.UNSPECIFIED;
        }
        return new MaxAdapterError(maxAdapterError, bannerErrorInfo.errorCode.ordinal(), bannerErrorInfo.errorMessage);
    }

    private AdFormat toUnityAdFormat(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters) {
        MaxAdFormat adFormat = maxAdapterSignalCollectionParameters.getAdFormat();
        if (adFormat.isAdViewAd()) {
            return AdFormat.BANNER;
        }
        if (adFormat == MaxAdFormat.INTERSTITIAL) {
            return AdFormat.INTERSTITIAL;
        }
        if (adFormat == MaxAdFormat.REWARDED) {
            return AdFormat.REWARDED;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + adFormat);
    }

    private UnityBannerSize toUnityBannerSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return new UnityBannerSize(320, 50);
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return new UnityBannerSize(728, 90);
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return new UnityBannerSize(300, 250);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private void updatePrivacyConsent(MaxAdapterParameters maxAdapterParameters, Context context) {
        MetaData metaData = new MetaData(context);
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null) {
            metaData.set("gdpr.consent", boolHasUserConsent);
            metaData.commit();
        }
        Boolean boolIsDoNotSell = maxAdapterParameters.isDoNotSell();
        if (boolIsDoNotSell != null) {
            metaData.set("privacy.consent", Boolean.valueOf(!boolIsDoNotSell.booleanValue()));
            metaData.commit();
        }
        metaData.set("privacy.mode", "mixed");
        metaData.commit();
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, @Nullable Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updatePrivacyConsent(maxAdapterSignalCollectionParameters, getContext(activity));
        UnityAds.getToken(new TokenConfiguration(toUnityAdFormat(maxAdapterSignalCollectionParameters)), new h(13, this, maxSignalCollectionListener));
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return UnityAds.getVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        Context context = getContext(activity);
        updatePrivacyConsent(maxAdapterInitializationParameters, context);
        if (!initialized.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(initializationStatus, null);
            return;
        }
        String string = maxAdapterInitializationParameters.getServerParameters().getString("game_id", null);
        log("Initializing UnityAds SDK with game id: " + string + "...");
        initializationStatus = MaxAdapter.InitializationStatus.INITIALIZING;
        MediationMetaData mediationMetaData = new MediationMetaData(context);
        mediationMetaData.setName("MAX");
        mediationMetaData.setVersion(AppLovinSdk.VERSION);
        mediationMetaData.set("adapter_version", getAdapterVersion());
        mediationMetaData.commit();
        UnityAds.setDebugMode(maxAdapterInitializationParameters.isTesting());
        UnityAds.initialize(context, string, maxAdapterInitializationParameters.isTesting(), new IUnityAdsInitializationListener() { // from class: com.applovin.mediation.adapters.UnityAdsMediationAdapter.1
            @Override // com.unity3d.ads.IUnityAdsInitializationListener
            public void onInitializationComplete() {
                UnityAdsMediationAdapter.this.log("UnityAds SDK initialized");
                MaxAdapter.InitializationStatus initializationStatus2 = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                MaxAdapter.InitializationStatus unused = UnityAdsMediationAdapter.initializationStatus = initializationStatus2;
                onCompletionListener.onCompletion(initializationStatus2, null);
            }

            @Override // com.unity3d.ads.IUnityAdsInitializationListener
            public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
                UnityAdsMediationAdapter.this.log("UnityAds SDK failed to initialize with error: " + str);
                MaxAdapter.InitializationStatus initializationStatus2 = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                MaxAdapter.InitializationStatus unused = UnityAdsMediationAdapter.initializationStatus = initializationStatus2;
                onCompletionListener.onCompletion(initializationStatus2, str);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, final MaxAdFormat maxAdFormat, @Nullable Activity activity, final MaxAdViewAdapterListener maxAdViewAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder("Loading ");
        sb2.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb2.append(maxAdFormat.getLabel());
        sb2.append(" ad for placement \"");
        sb2.append(thirdPartyAdPlacementId);
        sb2.append("\"...");
        log(sb2.toString());
        if (activity != null) {
            updatePrivacyConsent(maxAdapterResponseParameters, getContext(activity));
            this.biddingAdId = UUID.randomUUID().toString();
            BannerView bannerView = new BannerView(activity, thirdPartyAdPlacementId, toUnityBannerSize(maxAdFormat));
            this.bannerView = bannerView;
            bannerView.setListener(new BannerView.IListener() { // from class: com.applovin.mediation.adapters.UnityAdsMediationAdapter.6
                @Override // com.unity3d.services.banners.BannerView.IListener
                public void onBannerClick(BannerView bannerView2) {
                    UnityAdsMediationAdapter.this.log(maxAdFormat.getLabel() + " ad placement \"" + thirdPartyAdPlacementId + "\" clicked");
                    maxAdViewAdapterListener.onAdViewAdClicked();
                }

                @Override // com.unity3d.services.banners.BannerView.IListener
                public void onBannerFailedToLoad(BannerView bannerView2, BannerErrorInfo bannerErrorInfo) {
                    UnityAdsMediationAdapter.this.log(maxAdFormat.getLabel() + " ad placement \"" + thirdPartyAdPlacementId + "\" failed to load");
                    maxAdViewAdapterListener.onAdViewAdLoadFailed(UnityAdsMediationAdapter.toMaxError(bannerErrorInfo));
                }

                @Override // com.unity3d.services.banners.BannerView.IListener
                public void onBannerLeftApplication(BannerView bannerView2) {
                    UnityAdsMediationAdapter.this.log(maxAdFormat.getLabel() + " ad placement \"" + thirdPartyAdPlacementId + "\" left application");
                }

                @Override // com.unity3d.services.banners.BannerView.IListener
                public void onBannerLoaded(BannerView bannerView2) {
                    UnityAdsMediationAdapter.this.log(maxAdFormat.getLabel() + " ad placement \"" + thirdPartyAdPlacementId + "\" loaded");
                    maxAdViewAdapterListener.onAdViewAdLoaded(bannerView2);
                }

                @Override // com.unity3d.services.banners.BannerView.IListener
                public void onBannerShown(BannerView bannerView2) {
                    UnityAdsMediationAdapter.this.log(maxAdFormat.getLabel() + " ad placement \"" + thirdPartyAdPlacementId + "\" shown");
                    maxAdViewAdapterListener.onAdViewAdDisplayed();
                }
            });
            this.bannerView.load(createAdLoadOptions(maxAdapterResponseParameters));
            return;
        }
        log(maxAdFormat.getLabel() + " ad placement \"" + thirdPartyAdPlacementId + "\" load failed: Activity is null");
        maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.MISSING_ACTIVITY);
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log(u.h(new StringBuilder("Loading "), AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "", "interstitial ad for placement \"", thirdPartyAdPlacementId, "\"..."));
        updatePrivacyConsent(maxAdapterResponseParameters, getContext(activity));
        this.biddingAdId = UUID.randomUUID().toString();
        UnityAds.load(thirdPartyAdPlacementId, createAdLoadOptions(maxAdapterResponseParameters), new IUnityAdsLoadListener() { // from class: com.applovin.mediation.adapters.UnityAdsMediationAdapter.2
            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(String str) {
                UnityAdsMediationAdapter.this.log("Interstitial placement \"" + str + "\" loaded");
                maxInterstitialAdapterListener.onInterstitialAdLoaded();
            }

            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
                UnityAdsMediationAdapter.this.log("Interstitial placement \"" + str + "\" failed to load with error: " + unityAdsLoadError + ": " + str2);
                maxInterstitialAdapterListener.onInterstitialAdLoadFailed(UnityAdsMediationAdapter.toMaxError(unityAdsLoadError, str2));
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log(u.h(new StringBuilder("Loading "), AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "", "rewarded ad for placement \"", thirdPartyAdPlacementId, "\"..."));
        updatePrivacyConsent(maxAdapterResponseParameters, getContext(activity));
        this.biddingAdId = UUID.randomUUID().toString();
        UnityAds.load(thirdPartyAdPlacementId, createAdLoadOptions(maxAdapterResponseParameters), new IUnityAdsLoadListener() { // from class: com.applovin.mediation.adapters.UnityAdsMediationAdapter.4
            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(String str) {
                UnityAdsMediationAdapter.this.log("Rewarded ad placement \"" + str + "\" loaded");
                maxRewardedAdapterListener.onRewardedAdLoaded();
            }

            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
                UnityAdsMediationAdapter.this.log("Rewarded ad placement \"" + str + "\" failed to load with error: " + unityAdsLoadError + ": " + str2);
                maxRewardedAdapterListener.onRewardedAdLoadFailed(UnityAdsMediationAdapter.toMaxError(unityAdsLoadError, str2));
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        BannerView bannerView = this.bannerView;
        if (bannerView != null) {
            bannerView.destroy();
            this.bannerView = null;
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing interstitial ad for placement \"" + thirdPartyAdPlacementId + "\"...");
        UnityAds.show(activity, thirdPartyAdPlacementId, createAdShowOptions(), new IUnityAdsShowListener() { // from class: com.applovin.mediation.adapters.UnityAdsMediationAdapter.3
            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowClick(String str) {
                UnityAdsMediationAdapter.this.log("Interstitial placement \"" + str + "\" clicked");
                maxInterstitialAdapterListener.onInterstitialAdClicked();
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                UnityAdsMediationAdapter.this.log("Interstitial placement \"" + str + "\" hidden with completion state: " + unityAdsShowCompletionState);
                maxInterstitialAdapterListener.onInterstitialAdHidden();
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                UnityAdsMediationAdapter.this.log("Interstitial placement \"" + str + "\" failed to display with error: " + unityAdsShowError + ": " + str2);
                maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, unityAdsShowError.ordinal(), str2));
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowStart(String str) {
                UnityAdsMediationAdapter.this.log("Interstitial placement \"" + str + "\" displayed");
                maxInterstitialAdapterListener.onInterstitialAdDisplayed();
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded ad for placement \"" + thirdPartyAdPlacementId + "\"...");
        configureReward(maxAdapterResponseParameters);
        UnityAds.show(activity, thirdPartyAdPlacementId, createAdShowOptions(), new IUnityAdsShowListener() { // from class: com.applovin.mediation.adapters.UnityAdsMediationAdapter.5
            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowClick(String str) {
                UnityAdsMediationAdapter.this.log("Rewarded ad placement \"" + str + "\" clicked");
                maxRewardedAdapterListener.onRewardedAdClicked();
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                UnityAdsMediationAdapter.this.log("Rewarded ad placement \"" + str + "\" hidden with completion state: " + unityAdsShowCompletionState);
                if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.COMPLETED || UnityAdsMediationAdapter.this.shouldAlwaysRewardUser()) {
                    maxRewardedAdapterListener.onUserRewarded(UnityAdsMediationAdapter.this.getReward());
                }
                maxRewardedAdapterListener.onRewardedAdHidden();
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                UnityAdsMediationAdapter.this.log("Rewarded ad placement \"" + str + "\" failed to display with error: " + unityAdsShowError + ": " + str2);
                maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, unityAdsShowError.ordinal(), str2));
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowStart(String str) {
                UnityAdsMediationAdapter.this.log("Rewarded ad placement \"" + str + "\" displayed");
                maxRewardedAdapterListener.onRewardedAdDisplayed();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaxAdapterError toMaxError(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        int i10 = AnonymousClass7.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[unityAdsLoadError.ordinal()];
        if (i10 == 1) {
            maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
        } else if (i10 == 2) {
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        } else if (i10 == 3) {
            maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
        } else if (i10 == 4) {
            maxAdapterError = MaxAdapterError.NO_FILL;
        } else if (i10 == 5) {
            maxAdapterError = MaxAdapterError.TIMEOUT;
        }
        return new MaxAdapterError(maxAdapterError, unityAdsLoadError.ordinal(), str);
    }

    private static MaxAdapterError toMaxError(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        switch (AnonymousClass7.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[unityAdsShowError.ordinal()]) {
            case 1:
                maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
                break;
            case 2:
                maxAdapterError = MaxAdapterError.AD_NOT_READY;
                break;
            case 3:
                maxAdapterError = MaxAdapterError.WEBVIEW_ERROR;
                break;
            case 4:
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                break;
            case 5:
                maxAdapterError = MaxAdapterError.NO_CONNECTION;
                break;
            case 6:
                maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                break;
            case 7:
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                break;
        }
        return new MaxAdapterError(maxAdapterError, unityAdsShowError.ordinal(), str);
    }
}
