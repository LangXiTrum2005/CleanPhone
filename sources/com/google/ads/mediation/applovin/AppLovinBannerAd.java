package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class AppLovinBannerAd implements MediationBannerAd, AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final String f18785dovishness = "AppLovinBannerAd";

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public MediationBannerAdCallback f18786adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public AppLovinSdk f18787arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f18788graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public com.google.ads.mediation.applovin.attabal f18789kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final AppLovinAdFactory f18790molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public String f18791monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final AppLovinInitializer f18792polloi;

    public class attabal implements AppLovinInitializer.OnInitializeSuccessListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f18793attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ AppLovinAdSize f18794dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ Bundle f18796saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ AdSize f18797wireman;

        public attabal(Context context, Bundle bundle, AppLovinAdSize appLovinAdSize, AdSize adSize) {
            this.f18793attabal = context;
            this.f18796saneness = bundle;
            this.f18794dern = appLovinAdSize;
            this.f18797wireman = adSize;
        }

        @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
        public void onInitializeSuccess() {
            AppLovinBannerAd appLovinBannerAd = AppLovinBannerAd.this;
            appLovinBannerAd.f18787arytenoidectomy = appLovinBannerAd.f18792polloi.retrieveSdk(this.f18793attabal);
            AppLovinBannerAd.this.f18791monoploid = AppLovinUtils.retrieveZoneId(this.f18796saneness);
            String unused = AppLovinBannerAd.f18785dovishness;
            Objects.toString(this.f18794dern);
            String unused2 = AppLovinBannerAd.this.f18791monoploid;
            AppLovinBannerAd appLovinBannerAd2 = AppLovinBannerAd.this;
            appLovinBannerAd2.f18789kowloon = appLovinBannerAd2.f18790molybdenite.attabal(AppLovinBannerAd.this.f18787arytenoidectomy, this.f18794dern, this.f18797wireman, this.f18793attabal);
            AppLovinBannerAd.this.f18789kowloon.marial(AppLovinBannerAd.this);
            AppLovinBannerAd.this.f18789kowloon.wireman(AppLovinBannerAd.this);
            AppLovinBannerAd.this.f18789kowloon.beachfront(AppLovinBannerAd.this);
            if (TextUtils.isEmpty(AppLovinBannerAd.this.f18791monoploid)) {
                AppLovinBannerAd.this.f18787arytenoidectomy.getAdService().loadNextAd(this.f18794dern, AppLovinBannerAd.this);
            } else {
                AppLovinBannerAd.this.f18787arytenoidectomy.getAdService().loadNextAdForZoneId(AppLovinBannerAd.this.f18791monoploid, AppLovinBannerAd.this);
            }
        }
    }

    public AppLovinBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, AppLovinInitializer appLovinInitializer, AppLovinAdFactory appLovinAdFactory) {
        this.f18788graveside = mediationAdLoadCallback;
        this.f18792polloi = appLovinInitializer;
        this.f18790molybdenite = appLovinAdFactory;
    }

    public static AppLovinBannerAd newInstance(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, AppLovinInitializer appLovinInitializer, AppLovinAdFactory appLovinAdFactory) {
        return new AppLovinBannerAd(mediationAdLoadCallback, appLovinInitializer, appLovinAdFactory);
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18786adultoid;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18786adultoid;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18786adultoid;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        Objects.toString(appLovinAdViewDisplayErrorCode);
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18786adultoid;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18786adultoid;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        this.f18789kowloon.dern(appLovinAd);
        this.f18786adultoid = this.f18788graveside.onSuccess(this);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        this.f18788graveside.onFailure(AppLovinUtils.getAdError(i));
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f18789kowloon.attabal();
    }

    public void loadAd(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Context context = mediationBannerAdConfiguration.getContext();
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        AdSize adSize = mediationBannerAdConfiguration.getCom.ironsource.X3.i.O java.lang.String();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.ERROR_DOMAIN);
            adError.getMessage();
            this.f18788graveside.onFailure(adError);
            return;
        }
        AppLovinAdSize appLovinAdSizeAppLovinAdSizeFromAdMobAdSize = AppLovinUtils.appLovinAdSizeFromAdMobAdSize(context, adSize);
        if (appLovinAdSizeAppLovinAdSizeFromAdMobAdSize != null) {
            this.f18792polloi.initialize(context, string, new attabal(context, serverParameters, appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, adSize));
            return;
        }
        AdError adError2 = new AdError(101, "Failed to request banner with unsupported size.", AppLovinMediationAdapter.ERROR_DOMAIN);
        adError2.getMessage();
        this.f18788graveside.onFailure(adError2);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
    }
}
