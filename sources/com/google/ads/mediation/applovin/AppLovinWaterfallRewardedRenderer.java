package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class AppLovinWaterfallRewardedRenderer extends AppLovinRewardedRenderer implements MediationRewardedAd {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final HashMap<String, WeakReference<AppLovinWaterfallRewardedRenderer>> f18818monoploid = new HashMap<>();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean f18819arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public String f18820kowloon;

    public class attabal implements AppLovinInitializer.OnInitializeSuccessListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Bundle f18821attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ Context f18823saneness;

        public attabal(Bundle bundle, Context context) {
            this.f18821attabal = bundle;
            this.f18823saneness = context;
        }

        @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
        public void onInitializeSuccess() {
            AppLovinWaterfallRewardedRenderer.this.f18820kowloon = AppLovinUtils.retrieveZoneId(this.f18821attabal);
            AppLovinWaterfallRewardedRenderer appLovinWaterfallRewardedRenderer = AppLovinWaterfallRewardedRenderer.this;
            appLovinWaterfallRewardedRenderer.appLovinSdk = appLovinWaterfallRewardedRenderer.appLovinInitializer.retrieveSdk(this.f18823saneness);
            String.format("Requesting rewarded video for zone '%s'", AppLovinWaterfallRewardedRenderer.this.f18820kowloon);
            String str = AppLovinRewardedRenderer.TAG;
            HashMap<String, WeakReference<AppLovinWaterfallRewardedRenderer>> map = AppLovinWaterfallRewardedRenderer.f18818monoploid;
            if (map.containsKey(AppLovinWaterfallRewardedRenderer.this.f18820kowloon)) {
                AppLovinWaterfallRewardedRenderer.this.adLoadCallback.onFailure(new AdError(105, "Cannot load multiple rewarded ads with the same Zone ID. Let the first ad finish loading before attempting to load another.", AppLovinMediationAdapter.ERROR_DOMAIN));
                return;
            }
            map.put(AppLovinWaterfallRewardedRenderer.this.f18820kowloon, new WeakReference<>(AppLovinWaterfallRewardedRenderer.this));
            if (Objects.equals(AppLovinWaterfallRewardedRenderer.this.f18820kowloon, "")) {
                AppLovinWaterfallRewardedRenderer appLovinWaterfallRewardedRenderer2 = AppLovinWaterfallRewardedRenderer.this;
                appLovinWaterfallRewardedRenderer2.incentivizedInterstitial = appLovinWaterfallRewardedRenderer2.appLovinAdFactory.createIncentivizedInterstitial(appLovinWaterfallRewardedRenderer2.appLovinSdk);
            } else {
                AppLovinWaterfallRewardedRenderer appLovinWaterfallRewardedRenderer3 = AppLovinWaterfallRewardedRenderer.this;
                appLovinWaterfallRewardedRenderer3.incentivizedInterstitial = appLovinWaterfallRewardedRenderer3.appLovinAdFactory.createIncentivizedInterstitial(appLovinWaterfallRewardedRenderer3.f18820kowloon, AppLovinWaterfallRewardedRenderer.this.appLovinSdk);
            }
            AppLovinWaterfallRewardedRenderer appLovinWaterfallRewardedRenderer4 = AppLovinWaterfallRewardedRenderer.this;
            appLovinWaterfallRewardedRenderer4.incentivizedInterstitial.preload(appLovinWaterfallRewardedRenderer4);
        }
    }

    public AppLovinWaterfallRewardedRenderer(MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, AppLovinInitializer appLovinInitializer, AppLovinAdFactory appLovinAdFactory, AppLovinSdkUtilsWrapper appLovinSdkUtilsWrapper) {
        super(mediationAdLoadCallback, appLovinInitializer, appLovinAdFactory, appLovinSdkUtilsWrapper);
        this.f18819arytenoidectomy = false;
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer, com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        f18818monoploid.remove(this.f18820kowloon);
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (this.f18819arytenoidectomy) {
            f18818monoploid.remove(this.f18820kowloon);
        }
        super.adReceived(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer, com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        f18818monoploid.remove(this.f18820kowloon);
        super.failedToReceiveAd(i);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinRewardedRenderer
    public void loadAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Context context = mediationRewardedAdConfiguration.getContext();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            this.adLoadCallback.onFailure(new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN));
        } else {
            if (AppLovinUtils.isMultiAdsEnabled()) {
                this.f18819arytenoidectomy = true;
            }
            this.networkExtras = mediationRewardedAdConfiguration.getMediationExtras();
            this.appLovinInitializer.initialize(context, string, new attabal(serverParameters, context));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        String str = this.f18820kowloon;
        if (str != null) {
            String.format("Showing rewarded video for zone '%s'", str);
        }
        if (this.incentivizedInterstitial.isAdReadyToDisplay()) {
            this.incentivizedInterstitial.show(context, this, this, this, this);
        } else {
            this.rewardedAdCallback.onAdFailedToShow(new AdError(106, "Ad not ready to show.", AppLovinMediationAdapter.ERROR_DOMAIN));
        }
    }
}
