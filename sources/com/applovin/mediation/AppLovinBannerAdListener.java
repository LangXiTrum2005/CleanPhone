package com.applovin.mediation;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* JADX INFO: loaded from: classes2.dex */
class AppLovinBannerAdListener implements AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {
    private final AppLovinAdView adView;
    private final ApplovinAdapter adapter;
    private final MediationBannerListener mediationBannerListener;
    private final String zoneId;

    public AppLovinBannerAdListener(String str, AppLovinAdView appLovinAdView, ApplovinAdapter applovinAdapter, MediationBannerListener mediationBannerListener) {
        this.adapter = applovinAdapter;
        this.mediationBannerListener = mediationBannerListener;
        this.adView = appLovinAdView;
        this.zoneId = str;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Banner clicked.");
        this.mediationBannerListener.onAdClicked(this.adapter);
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        ApplovinAdapter.log(3, "Banner closed fullscreen.");
        this.mediationBannerListener.onAdClosed(this.adapter);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Banner displayed.");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        ApplovinAdapter.log(5, "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Banner dismissed.");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        ApplovinAdapter.log(3, "Banner left application.");
        this.mediationBannerListener.onAdLeftApplication(this.adapter);
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        ApplovinAdapter.log(3, "Banner opened fullscreen.");
        this.mediationBannerListener.onAdOpened(this.adapter);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Banner did load ad for zone: " + this.zoneId);
        this.adView.renderAd(appLovinAd);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.AppLovinBannerAdListener.1
            @Override // java.lang.Runnable
            public void run() {
                AppLovinBannerAdListener.this.mediationBannerListener.onAdLoaded(AppLovinBannerAdListener.this.adapter);
            }
        });
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        final AdError adError = AppLovinUtils.getAdError(i);
        ApplovinAdapter.log(5, "Failed to load banner ad with error: " + i);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.AppLovinBannerAdListener.2
            @Override // java.lang.Runnable
            public void run() {
                AppLovinBannerAdListener.this.mediationBannerListener.onAdFailedToLoad(AppLovinBannerAdListener.this.adapter, adError);
            }
        });
    }
}
