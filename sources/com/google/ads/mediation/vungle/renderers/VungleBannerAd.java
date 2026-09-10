package com.google.ads.mediation.vungle.renderers;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleFactory;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.VungleError;
import com.vungle.ads.competently;
import com.vungle.mediation.VungleInterstitialAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class VungleBannerAd implements MediationBannerAd, competently {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public MediationBannerAdCallback f19185arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f19186kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public VungleBannerView f19187monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final VungleFactory f19188polloi;

    public class attabal implements VungleInitializer.VungleInitializationListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f19189attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ VungleAdSize f19190dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ String f19192saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ MediationBannerAdConfiguration f19193wireman;

        public attabal(Context context, String str, VungleAdSize vungleAdSize, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
            this.f19189attabal = context;
            this.f19192saneness = str;
            this.f19190dern = vungleAdSize;
            this.f19193wireman = mediationBannerAdConfiguration;
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public void onInitializeError(AdError adError) {
            String str = VungleMediationAdapter.TAG;
            adError.toString();
            VungleBannerAd.this.f19186kowloon.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public void onInitializeSuccess() {
            VungleBannerAd.this.dern(this.f19189attabal, this.f19192saneness, this.f19190dern, this.f19193wireman);
        }
    }

    public VungleBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, VungleFactory vungleFactory) {
        this.f19186kowloon = mediationAdLoadCallback;
        this.f19188polloi = vungleFactory;
    }

    public final void dern(Context context, String str, VungleAdSize vungleAdSize, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        VungleBannerView vungleBannerViewCreateBannerAd = this.f19188polloi.createBannerAd(context, str, vungleAdSize);
        this.f19187monoploid = vungleBannerViewCreateBannerAd;
        vungleBannerViewCreateBannerAd.setAdListener(this);
        wireman(this.f19187monoploid, mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f19187monoploid;
    }

    @Override // com.vungle.ads.competently, com.vungle.ads.impromptu
    public void onAdClicked(BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f19185arytenoidectomy;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f19185arytenoidectomy.onAdOpened();
        }
    }

    @Override // com.vungle.ads.competently, com.vungle.ads.impromptu
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        String str = VungleMediationAdapter.TAG;
        adError.toString();
        this.f19186kowloon.onFailure(adError);
    }

    @Override // com.vungle.ads.competently, com.vungle.ads.impromptu
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        String str = VungleMediationAdapter.TAG;
        adError.toString();
    }

    @Override // com.vungle.ads.competently, com.vungle.ads.impromptu
    public void onAdImpression(BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f19185arytenoidectomy;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.competently, com.vungle.ads.impromptu
    public void onAdLeftApplication(BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f19185arytenoidectomy;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.competently, com.vungle.ads.impromptu
    public void onAdLoaded(BaseAd baseAd) {
        this.f19185arytenoidectomy = this.f19186kowloon.onSuccess(this);
    }

    public void validateParamsAndLoadAd(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            String str = VungleMediationAdapter.TAG;
            adError.getMessage();
            this.f19186kowloon.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (!TextUtils.isEmpty(string2)) {
            Context context = mediationBannerAdConfiguration.getContext();
            VungleInitializer.getInstance().initialize(string, context, new attabal(context, string2, VungleInterstitialAdapter.getVungleBannerAdSizeFromGoogleAdSize(mediationBannerAdConfiguration.getCom.ironsource.X3.i.O java.lang.String(), string2), mediationBannerAdConfiguration));
        } else {
            AdError adError2 = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            String str2 = VungleMediationAdapter.TAG;
            adError2.getMessage();
            this.f19186kowloon.onFailure(adError2);
        }
    }

    public abstract void wireman(VungleBannerView vungleBannerView, MediationBannerAdConfiguration mediationBannerAdConfiguration);

    @Override // com.vungle.ads.competently, com.vungle.ads.impromptu
    public void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.competently, com.vungle.ads.impromptu
    public void onAdStart(BaseAd baseAd) {
    }
}
