package com.google.ads.mediation.vungle.rtb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleFactory;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleError;
import com.vungle.ads.arytenoidectomy;
import com.vungle.ads.kowloon;
import com.vungle.ads.saneness;

/* JADX INFO: loaded from: classes2.dex */
public class VungleRtbInterstitialAd implements MediationInterstitialAd, arytenoidectomy {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public MediationInterstitialAdCallback f19194arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f19195kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public kowloon f19196monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final VungleFactory f19197polloi;

    public class attabal implements VungleInitializer.VungleInitializationListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f19198attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ saneness f19199dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ String f19201saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ String f19202wireman;

        public attabal(Context context, String str, saneness sanenessVar, String str2) {
            this.f19198attabal = context;
            this.f19201saneness = str;
            this.f19199dern = sanenessVar;
            this.f19202wireman = str2;
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public void onInitializeError(AdError adError) {
            String str = VungleMediationAdapter.TAG;
            adError.toString();
            VungleRtbInterstitialAd.this.f19195kowloon.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public void onInitializeSuccess() {
            VungleRtbInterstitialAd vungleRtbInterstitialAd = VungleRtbInterstitialAd.this;
            vungleRtbInterstitialAd.f19196monoploid = vungleRtbInterstitialAd.f19197polloi.createInterstitialAd(this.f19198attabal, this.f19201saneness, this.f19199dern);
            VungleRtbInterstitialAd.this.f19196monoploid.setAdListener(VungleRtbInterstitialAd.this);
            VungleRtbInterstitialAd.this.f19196monoploid.load(this.f19202wireman);
        }
    }

    public VungleRtbInterstitialAd(MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, VungleFactory vungleFactory) {
        this.f19195kowloon = mediationAdLoadCallback;
        this.f19197polloi = vungleFactory;
    }

    @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdClicked(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f19194arytenoidectomy;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdEnd(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f19194arytenoidectomy;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        String str = VungleMediationAdapter.TAG;
        adError.toString();
        this.f19195kowloon.onFailure(adError);
    }

    @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        String str = VungleMediationAdapter.TAG;
        adError.toString();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f19194arytenoidectomy;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdImpression(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f19194arytenoidectomy;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdLeftApplication(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f19194arytenoidectomy;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdLoaded(BaseAd baseAd) {
        this.f19194arytenoidectomy = this.f19195kowloon.onSuccess(this);
    }

    @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdStart(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f19194arytenoidectomy;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    public void render(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Bundle mediationExtras = mediationInterstitialAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            String str = VungleMediationAdapter.TAG;
            this.f19195kowloon.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            String str2 = VungleMediationAdapter.TAG;
            this.f19195kowloon.onFailure(adError2);
            return;
        }
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        saneness sanenessVarCreateAdConfig = this.f19197polloi.createAdConfig();
        if (mediationExtras.containsKey(VungleConstants.KEY_ORIENTATION)) {
            sanenessVarCreateAdConfig.setAdOrientation(mediationExtras.getInt(VungleConstants.KEY_ORIENTATION, 2));
        }
        String str3 = mediationInterstitialAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String();
        if (!TextUtils.isEmpty(str3)) {
            sanenessVarCreateAdConfig.setWatermark(str3);
        }
        Context context = mediationInterstitialAdConfiguration.getContext();
        VungleInitializer.getInstance().initialize(string, context, new attabal(context, string2, sanenessVarCreateAdConfig, bidResponse));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        kowloon kowloonVar = this.f19196monoploid;
        if (kowloonVar != null) {
            kowloonVar.play(context);
        } else if (this.f19194arytenoidectomy != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewarded ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            String str = VungleMediationAdapter.TAG;
            this.f19194arytenoidectomy.onAdFailedToShow(adError);
        }
    }
}
