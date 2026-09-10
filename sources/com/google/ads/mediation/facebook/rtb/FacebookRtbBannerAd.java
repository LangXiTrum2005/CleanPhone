package com.google.ads.mediation.facebook.rtb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.facebook.MetaFactory;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class FacebookRtbBannerAd implements MediationBannerAd, AdListener {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public AdView f18846arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f18847kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final MetaFactory f18848molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public FrameLayout f18849monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public MediationBannerAdCallback f18850polloi;

    public FacebookRtbBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, MetaFactory metaFactory) {
        this.f18847kowloon = mediationAdLoadCallback;
        this.f18848molybdenite = metaFactory;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f18849monoploid;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18850polloi;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f18850polloi.onAdOpened();
            this.f18850polloi.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        this.f18850polloi = this.f18847kowloon.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, AdError adError) {
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        String str = FacebookMediationAdapter.TAG;
        adError2.getMessage();
        this.f18847kowloon.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18850polloi;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    public void render(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        String placementID = FacebookMediationAdapter.getPlacementID(mediationBannerAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            String str = FacebookMediationAdapter.TAG;
            adError.getMessage();
            this.f18847kowloon.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(mediationBannerAdConfiguration);
        try {
            this.f18846arytenoidectomy = this.f18848molybdenite.createMetaAdView(mediationBannerAdConfiguration.getContext(), placementID, mediationBannerAdConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(mediationBannerAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String())) {
                this.f18846arytenoidectomy.setExtraHints(new ExtraHints.Builder().mediationData(mediationBannerAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String()).build());
            }
            Context context = mediationBannerAdConfiguration.getContext();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mediationBannerAdConfiguration.getCom.ironsource.X3.i.O java.lang.String().getWidthInPixels(context), -2);
            this.f18849monoploid = new FrameLayout(context);
            this.f18846arytenoidectomy.setLayoutParams(layoutParams);
            this.f18849monoploid.addView(this.f18846arytenoidectomy);
            AdView adView = this.f18846arytenoidectomy;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(this).withBid(mediationBannerAdConfiguration.getBidResponse()).build());
        } catch (Exception e) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(111, "Failed to create banner ad: " + e.getMessage(), "com.google.ads.mediation.facebook");
            String str2 = FacebookMediationAdapter.TAG;
            adError2.getMessage();
            this.f18847kowloon.onFailure(adError2);
        }
    }
}
