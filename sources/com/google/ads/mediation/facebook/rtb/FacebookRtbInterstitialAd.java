package com.google.ads.mediation.facebook.rtb;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.facebook.MetaFactory;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class FacebookRtbInterstitialAd implements MediationInterstitialAd, InterstitialAdExtendedListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public InterstitialAd f18851arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final MetaFactory f18852graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f18853kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public MediationInterstitialAdCallback f18855monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final AtomicBoolean f18856polloi = new AtomicBoolean();

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final AtomicBoolean f18854molybdenite = new AtomicBoolean();

    public FacebookRtbInterstitialAd(MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, MetaFactory metaFactory) {
        this.f18853kowloon = mediationAdLoadCallback;
        this.f18852graveside = metaFactory;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18855monoploid;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
            this.f18855monoploid.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        this.f18855monoploid = this.f18853kowloon.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, AdError adError) {
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        String str = FacebookMediationAdapter.TAG;
        adError2.getMessage();
        if (!this.f18856polloi.get()) {
            this.f18853kowloon.onFailure(adError2);
            return;
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18855monoploid;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError2);
        }
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (this.f18854molybdenite.getAndSet(true) || (mediationInterstitialAdCallback = this.f18855monoploid) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (this.f18854molybdenite.getAndSet(true) || (mediationInterstitialAdCallback = this.f18855monoploid) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18855monoploid;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18855monoploid;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    public void render(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String placementID = FacebookMediationAdapter.getPlacementID(mediationInterstitialAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty. ", "com.google.ads.mediation.facebook");
            String str = FacebookMediationAdapter.TAG;
            adError.getMessage();
            this.f18853kowloon.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(mediationInterstitialAdConfiguration);
        this.f18851arytenoidectomy = this.f18852graveside.createInterstitialAd(mediationInterstitialAdConfiguration.getContext(), placementID);
        if (!TextUtils.isEmpty(mediationInterstitialAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String())) {
            this.f18851arytenoidectomy.setExtraHints(new ExtraHints.Builder().mediationData(mediationInterstitialAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String()).build());
        }
        InterstitialAd interstitialAd = this.f18851arytenoidectomy;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(mediationInterstitialAdConfiguration.getBidResponse()).withAdListener(this).build());
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f18856polloi.set(true);
        if (this.f18851arytenoidectomy.show()) {
            return;
        }
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Failed to present interstitial ad.", "com.google.ads.mediation.facebook");
        String str = FacebookMediationAdapter.TAG;
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18855monoploid;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
    }
}
