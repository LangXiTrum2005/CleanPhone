package com.vungle.mediation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.VungleError;
import com.vungle.ads.arytenoidectomy;
import com.vungle.ads.competently;
import com.vungle.ads.kowloon;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class VungleInterstitialAdapter extends VungleMediationAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    private VungleBannerView bannerAdView;
    private kowloon interstitialAd;
    private MediationBannerListener mediationBannerListener;
    private MediationInterstitialListener mediationInterstitialListener;

    public class attabal implements VungleInitializer.VungleInitializationListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f23822attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ com.vungle.ads.saneness f23823dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ String f23825saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ MediationInterstitialListener f23826wireman;

        public attabal(Context context, String str, com.vungle.ads.saneness sanenessVar, MediationInterstitialListener mediationInterstitialListener) {
            this.f23822attabal = context;
            this.f23825saneness = str;
            this.f23823dern = sanenessVar;
            this.f23826wireman = mediationInterstitialListener;
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public void onInitializeError(AdError adError) {
            this.f23826wireman.onAdFailedToLoad(VungleInterstitialAdapter.this, adError);
            String str = VungleMediationAdapter.TAG;
            adError.toString();
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public void onInitializeSuccess() {
            VungleInterstitialAdapter.this.interstitialAd = new kowloon(this.f23822attabal, this.f23825saneness, this.f23823dern);
            VungleInterstitialAdapter.this.interstitialAd.setAdListener(new wireman());
            VungleInterstitialAdapter.this.interstitialAd.load((String) null);
        }
    }

    public class dern implements competently {
        @Override // com.vungle.ads.competently, com.vungle.ads.impromptu
        public void onAdClicked(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdClicked(VungleInterstitialAdapter.this);
                VungleInterstitialAdapter.this.mediationBannerListener.onAdOpened(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.competently, com.vungle.ads.impromptu
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            AdError adError = VungleMediationAdapter.getAdError(vungleError);
            String str = VungleMediationAdapter.TAG;
            adError.toString();
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdFailedToLoad(VungleInterstitialAdapter.this, adError);
            }
        }

        @Override // com.vungle.ads.competently, com.vungle.ads.impromptu
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            AdError adError = VungleMediationAdapter.getAdError(vungleError);
            String str = VungleMediationAdapter.TAG;
            adError.toString();
        }

        @Override // com.vungle.ads.competently, com.vungle.ads.impromptu
        public void onAdLeftApplication(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdLeftApplication(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.competently, com.vungle.ads.impromptu
        public void onAdLoaded(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdLoaded(VungleInterstitialAdapter.this);
            }
        }

        public dern() {
        }

        @Override // com.vungle.ads.competently, com.vungle.ads.impromptu
        public void onAdEnd(BaseAd baseAd) {
        }

        @Override // com.vungle.ads.competently, com.vungle.ads.impromptu
        public void onAdImpression(BaseAd baseAd) {
        }

        @Override // com.vungle.ads.competently, com.vungle.ads.impromptu
        public void onAdStart(BaseAd baseAd) {
        }
    }

    public class saneness implements VungleInitializer.VungleInitializationListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f23828attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ VungleAdSize f23829dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ String f23830saneness;

        public saneness(Context context, String str, VungleAdSize vungleAdSize) {
            this.f23828attabal = context;
            this.f23830saneness = str;
            this.f23829dern = vungleAdSize;
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public void onInitializeError(AdError adError) {
            String str = VungleMediationAdapter.TAG;
            adError.toString();
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdFailedToLoad(VungleInterstitialAdapter.this, adError);
            }
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public void onInitializeSuccess() {
            VungleInterstitialAdapter.this.bannerAdView = new VungleBannerView(this.f23828attabal, this.f23830saneness, this.f23829dern);
            VungleInterstitialAdapter.this.bannerAdView.setAdListener(new dern());
            VungleInterstitialAdapter.this.bannerAdView.load((String) null);
        }
    }

    public class wireman implements arytenoidectomy {
        @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
        public void onAdClicked(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdClicked(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
        public void onAdEnd(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdClosed(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            AdError adError = VungleMediationAdapter.getAdError(vungleError);
            String str = VungleMediationAdapter.TAG;
            adError.toString();
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdFailedToLoad(VungleInterstitialAdapter.this, adError);
            }
        }

        @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            AdError adError = VungleMediationAdapter.getAdError(vungleError);
            String str = VungleMediationAdapter.TAG;
            adError.toString();
        }

        @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
        public void onAdLeftApplication(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdLeftApplication(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
        public void onAdLoaded(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdLoaded(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
        public void onAdStart(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdOpened(VungleInterstitialAdapter.this);
            }
        }

        public wireman() {
        }

        @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
        public void onAdImpression(BaseAd baseAd) {
        }
    }

    public static VungleAdSize getVungleBannerAdSizeFromGoogleAdSize(AdSize adSize, String str) {
        VungleAdSize validAdSizeFromSize = VungleAdSize.getValidAdSizeFromSize(adSize.getWidth(), adSize.getHeight(), str);
        adSize.toString();
        Objects.toString(validAdSizeFromSize);
        return validAdSizeFromSize;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        hashCode();
        return this.bannerAdView;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        hashCode();
        VungleBannerView vungleBannerView = this.bannerAdView;
        if (vungleBannerView != null) {
            vungleBannerView.finishAd();
            this.bannerAdView = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mediationBannerListener = mediationBannerListener;
        String string = bundle.getString("appid");
        if (TextUtils.isEmpty(string)) {
            mediationBannerListener.onAdFailedToLoad(this, new AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN));
            return;
        }
        VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(MobileAds.getRequestConfiguration());
        String string2 = bundle.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            mediationBannerListener.onAdFailedToLoad(this, new AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN));
            return;
        }
        VungleAdSize vungleBannerAdSizeFromGoogleAdSize = getVungleBannerAdSizeFromGoogleAdSize(adSize, string2);
        hashCode();
        VungleInitializer.getInstance().initialize(string, context, new saneness(context, string2, vungleBannerAdSizeFromGoogleAdSize));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mediationInterstitialListener = mediationInterstitialListener;
        String string = bundle.getString("appid");
        if (TextUtils.isEmpty(string)) {
            mediationInterstitialListener.onAdFailedToLoad(this, new AdError(101, "Failed to load waterfall interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN));
            return;
        }
        String string2 = bundle.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            mediationInterstitialListener.onAdFailedToLoad(this, new AdError(101, "Failed to load waterfall interstitial ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN));
            return;
        }
        VungleInitializer.getInstance().updateCoppaAndUnderageConsentStatus(MobileAds.getRequestConfiguration());
        com.vungle.ads.saneness sanenessVar = new com.vungle.ads.saneness();
        if (bundle2 != null && bundle2.containsKey(VungleConstants.KEY_ORIENTATION)) {
            sanenessVar.setAdOrientation(bundle2.getInt(VungleConstants.KEY_ORIENTATION, 2));
        }
        VungleInitializer.getInstance().initialize(string, context, new attabal(context, string2, sanenessVar, mediationInterstitialListener));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        kowloon kowloonVar = this.interstitialAd;
        if (kowloonVar != null) {
            kowloonVar.play(null);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }
}
