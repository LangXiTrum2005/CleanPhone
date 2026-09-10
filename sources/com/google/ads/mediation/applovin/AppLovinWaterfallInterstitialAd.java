package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class AppLovinWaterfallInterstitialAd extends AppLovinInterstitialRenderer implements MediationInterstitialAd {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final HashMap<String, WeakReference<AppLovinWaterfallInterstitialAd>> f18812monoploid = new HashMap<>();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean f18813arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public AppLovinSdk f18814kowloon;

    public class attabal implements AppLovinInitializer.OnInitializeSuccessListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Bundle f18815attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ Context f18817saneness;

        public attabal(Bundle bundle, Context context) {
            this.f18815attabal = bundle;
            this.f18817saneness = context;
        }

        @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
        public void onInitializeSuccess() {
            AppLovinWaterfallInterstitialAd.this.zoneId = AppLovinUtils.retrieveZoneId(this.f18815attabal);
            HashMap<String, WeakReference<AppLovinWaterfallInterstitialAd>> map = AppLovinWaterfallInterstitialAd.f18812monoploid;
            if (map.containsKey(AppLovinWaterfallInterstitialAd.this.zoneId) && map.get(AppLovinWaterfallInterstitialAd.this.zoneId).get() != null) {
                AdError adError = new AdError(105, " Cannot load multiple interstitial ads with the same Zone ID. Let the first ad finish loading before attempting to load another. ", AppLovinMediationAdapter.ERROR_DOMAIN);
                String str = AppLovinInterstitialRenderer.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD;
                adError.getMessage();
                AppLovinWaterfallInterstitialAd.this.interstitialAdLoadCallback.onFailure(adError);
                return;
            }
            map.put(AppLovinWaterfallInterstitialAd.this.zoneId, new WeakReference<>(AppLovinWaterfallInterstitialAd.this));
            AppLovinWaterfallInterstitialAd appLovinWaterfallInterstitialAd = AppLovinWaterfallInterstitialAd.this;
            appLovinWaterfallInterstitialAd.f18814kowloon = appLovinWaterfallInterstitialAd.appLovinInitializer.retrieveSdk(this.f18817saneness);
            String str2 = AppLovinInterstitialRenderer.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD;
            String str3 = AppLovinWaterfallInterstitialAd.this.zoneId;
            if (TextUtils.isEmpty(AppLovinWaterfallInterstitialAd.this.zoneId)) {
                AppLovinWaterfallInterstitialAd.this.f18814kowloon.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, AppLovinWaterfallInterstitialAd.this);
                return;
            }
            AppLovinAdService adService = AppLovinWaterfallInterstitialAd.this.f18814kowloon.getAdService();
            AppLovinWaterfallInterstitialAd appLovinWaterfallInterstitialAd2 = AppLovinWaterfallInterstitialAd.this;
            adService.loadNextAdForZoneId(appLovinWaterfallInterstitialAd2.zoneId, appLovinWaterfallInterstitialAd2);
        }
    }

    public AppLovinWaterfallInterstitialAd(MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, AppLovinInitializer appLovinInitializer, AppLovinAdFactory appLovinAdFactory) {
        super(mediationAdLoadCallback, appLovinInitializer, appLovinAdFactory);
        this.f18813arytenoidectomy = false;
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer, com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        dern();
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (this.f18813arytenoidectomy) {
            dern();
        }
        super.adReceived(appLovinAd);
    }

    public void dern() {
        if (TextUtils.isEmpty(this.zoneId)) {
            return;
        }
        HashMap<String, WeakReference<AppLovinWaterfallInterstitialAd>> map = f18812monoploid;
        if (map.containsKey(this.zoneId) && equals(map.get(this.zoneId).get())) {
            map.remove(this.zoneId);
        }
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer, com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        dern();
        super.failedToReceiveAd(i);
    }

    @Override // com.google.ads.mediation.applovin.AppLovinInterstitialRenderer
    public void loadAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Context context = mediationInterstitialAdConfiguration.getContext();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
            adError.getMessage();
            this.interstitialAdLoadCallback.onFailure(adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled()) {
                this.f18813arytenoidectomy = true;
            }
            this.networkExtras = mediationInterstitialAdConfiguration.getMediationExtras();
            this.appLovinInitializer.initialize(context, string, new attabal(serverParameters, context));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f18814kowloon.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreateInterstitialAdDialog = this.appLovinAdFactory.createInterstitialAdDialog(this.f18814kowloon, context);
        appLovinInterstitialAdDialogCreateInterstitialAdDialog.setAdDisplayListener(this);
        appLovinInterstitialAdDialogCreateInterstitialAdDialog.setAdClickListener(this);
        appLovinInterstitialAdDialogCreateInterstitialAdDialog.setAdVideoPlaybackListener(this);
        if (this.appLovinInterstitialAd != null) {
            appLovinInterstitialAdDialogCreateInterstitialAdDialog.showAndRender(this.appLovinInterstitialAd);
        } else if (TextUtils.isEmpty(this.zoneId)) {
            appLovinInterstitialAdDialogCreateInterstitialAdDialog.show();
        }
    }
}
