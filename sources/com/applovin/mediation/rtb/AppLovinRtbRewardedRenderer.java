package com.applovin.mediation.rtb;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.AppLovinAdFactory;
import com.google.ads.mediation.applovin.AppLovinInitializer;
import com.google.ads.mediation.applovin.AppLovinRewardedRenderer;
import com.google.ads.mediation.applovin.AppLovinSdkUtilsWrapper;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class AppLovinRtbRewardedRenderer extends AppLovinRewardedRenderer {
    private AppLovinAd appLovinAd;

    public AppLovinRtbRewardedRenderer(MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, AppLovinInitializer appLovinInitializer, AppLovinAdFactory appLovinAdFactory, AppLovinSdkUtilsWrapper appLovinSdkUtilsWrapper) {
        super(mediationAdLoadCallback, appLovinInitializer, appLovinAdFactory, appLovinSdkUtilsWrapper);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        this.appLovinAd = appLovinAd;
        super.adReceived(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer
    public void loadAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        AppLovinSdk appLovinSdkRetrieveSdk = this.appLovinInitializer.retrieveSdk(mediationRewardedAdConfiguration.getContext());
        this.appLovinSdk = appLovinSdkRetrieveSdk;
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitialCreateIncentivizedInterstitial = this.appLovinAdFactory.createIncentivizedInterstitial(appLovinSdkRetrieveSdk);
        this.incentivizedInterstitial = appLovinIncentivizedInterstitialCreateIncentivizedInterstitial;
        appLovinIncentivizedInterstitialCreateIncentivizedInterstitial.setExtraInfo(AppLovinExtras.Keys.KEY_WATERMARK, mediationRewardedAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String());
        this.networkExtras = mediationRewardedAdConfiguration.getMediationExtras();
        this.appLovinSdk.getAdService().loadNextAdForAdToken(mediationRewardedAdConfiguration.getBidResponse(), this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        this.incentivizedInterstitial.show(this.appLovinAd, context, this, this, this, this);
    }
}
