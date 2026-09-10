package com.p004ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p004ironsource.a8;
import com.p004ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.p004ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.p004ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.p004ironsource.mediationsdk.config.ConfigFile;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.sdk.BannerAdapterInterface;
import com.p004ironsource.mediationsdk.sdk.BannerSmashListener;
import com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.p004ironsource.tk;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class u implements AdapterAPSDataInterface, AdapterBaseInterface, AdapterConsentInterface, AdapterDebugInterface, AdapterMetaDataInterface, AdapterSettingsInterface, BannerSmashListener, a8, InterstitialSmashListener, NativeAdSmashListener, RewardedVideoSmashListener, AdapterNetworkDataInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractAdapter f26097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<NetworkInitializationListener> f26098b;

    public u(AbstractAdapter abstractAdapter) {
        this.f26097a = abstractAdapter;
    }

    public void a() {
        String pluginType = ConfigFile.getConfigFile().getPluginType();
        if (TextUtils.isEmpty(pluginType)) {
            return;
        }
        this.f26097a.setPluginData(pluginType);
    }

    @Override // com.p004ironsource.a8
    public void collectBiddingData(AdData adData, BiddingDataCallback biddingDataCallback) {
        JSONObject jSONObjectA = tk.a(adData.getConfiguration());
        JSONObject jSONObjectA2 = tk.a(adData.getAdUnitData());
        IronSource.AD_UNIT ad_unit = (IronSource.AD_UNIT) adData.getAdUnitData().get("adUnit");
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f26097a.collectRewardedVideoBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f26097a.collectInterstitialBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.f26097a.collectBannerBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            this.f26097a.collectNativeAdBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        IronLog.INTERNAL.error("ad unit not supported - " + ad_unit);
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getAdapterVersion() {
        return this.f26097a.getVersion();
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public LoadWhileShowSupportState getBannerLoadWhileShowSupportedState(NetworkSettings networkSettings) {
        return this.f26097a.getBannerLoadWhileShowSupportState(networkSettings.getBannerSettings());
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public LoadWhileShowSupportState getLoadWhileShowSupportedState(NetworkSettings networkSettings) {
        return this.f26097a.getLoadWhileShowSupportState(networkSettings.getRewardedVideoSettings());
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public String getNetworkSDKVersion() {
        return this.f26097a.getCoreSDKVersion();
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener) {
        this.f26098b = new WeakReference<>(networkInitializationListener);
        String str = (String) adData.getAdUnitData().get("userId");
        IronSource.AD_UNIT ad_unit = (IronSource.AD_UNIT) adData.getAdUnitData().get("adUnit");
        a();
        JSONObject jSONObjectA = tk.a(adData.getConfiguration());
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f26097a.initRewardedVideoWithCallback("", str, jSONObjectA, this);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            Integer num = adData.getInt("instanceType");
            if (num == null || num.intValue() != 1) {
                this.f26097a.initInterstitialForBidding("", str, jSONObjectA, this);
                return;
            } else {
                this.f26097a.initInterstitial("", str, jSONObjectA, this);
                return;
            }
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            Integer num2 = adData.getInt("instanceType");
            if (num2 == null || num2.intValue() != 1) {
                this.f26097a.initBannerForBidding("", str, jSONObjectA, this);
                return;
            } else {
                this.f26097a.initBanners("", str, jSONObjectA, this);
                return;
            }
        }
        if (ad_unit != IronSource.AD_UNIT.NATIVE_AD) {
            IronLog.INTERNAL.error("ad unit not supported - " + ad_unit);
            return;
        }
        Integer num3 = adData.getInt("instanceType");
        if (num3 == null || num3.intValue() != 1) {
            this.f26097a.initNativeAdForBidding("", str, jSONObjectA, this);
        } else {
            this.f26097a.initNativeAds("", str, jSONObjectA, this);
        }
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public boolean isUsingActivityBeforeImpression(IronSource.AD_UNIT ad_unit) {
        return this.f26097a.isUsingActivityBeforeImpression(ad_unit);
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f26098b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f26098b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f26098b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f26098b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdClicked() {
    }

    @Override // com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f26098b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f26098b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
    }

    @Override // com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoaded(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
    }

    @Override // com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdShown() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z2) {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f26098b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f26098b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
    }

    @Override // com.p004ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface
    public void setAPSData(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        BannerAdapterInterface bannerAdapterInterface = this.f26097a;
        if (bannerAdapterInterface instanceof SetAPSInterface) {
            ((SetAPSInterface) bannerAdapterInterface).setAPSData(ad_unit, jSONObject);
        }
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z2) {
        this.f26097a.setAdapterDebug(Boolean.valueOf(z2));
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(boolean z2) {
        this.f26097a.setConsent(z2);
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(String str, List<String> list) {
        this.f26097a.setMetaData(str, list);
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface
    public void setNetworkData(AdapterNetworkData adapterNetworkData) {
        this.f26097a.setNetworkData(adapterNetworkData);
    }
}
