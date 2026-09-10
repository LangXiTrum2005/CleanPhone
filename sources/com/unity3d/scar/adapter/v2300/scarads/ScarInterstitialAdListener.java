package com.unity3d.scar.adapter.v2300.scarads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;

/* JADX INFO: loaded from: classes6.dex */
public class ScarInterstitialAdListener extends ScarAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScarInterstitialAd f42841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScarInterstitialAdHandler f42842c;
    public final InterstitialAdLoadCallback d = new InterstitialAdLoadCallback() { // from class: com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAdListener.1
        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            ScarInterstitialAdListener.this.f42842c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdLoaded(InterstitialAd interstitialAd) {
            InterstitialAd interstitialAd2 = interstitialAd;
            super.onAdLoaded(interstitialAd2);
            ScarInterstitialAdListener scarInterstitialAdListener = ScarInterstitialAdListener.this;
            scarInterstitialAdListener.f42842c.onAdLoaded();
            interstitialAd2.setFullScreenContentCallback(scarInterstitialAdListener.f42843e);
            scarInterstitialAdListener.f42841b.f42832a = interstitialAd2;
            IScarLoadListener iScarLoadListener = scarInterstitialAdListener.f42836a;
            if (iScarLoadListener != null) {
                iScarLoadListener.onAdLoaded();
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FullScreenContentCallback f42843e = new FullScreenContentCallback() { // from class: com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAdListener.2
        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdClicked() {
            super.onAdClicked();
            ScarInterstitialAdListener.this.f42842c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            ScarInterstitialAdListener.this.f42842c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            ScarInterstitialAdListener.this.f42842c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdImpression() {
            super.onAdImpression();
            ScarInterstitialAdListener.this.f42842c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public final void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            ScarInterstitialAdListener.this.f42842c.onAdOpened();
        }
    };

    public ScarInterstitialAdListener(ScarInterstitialAdHandler scarInterstitialAdHandler, ScarInterstitialAd scarInterstitialAd) {
        this.f42842c = scarInterstitialAdHandler;
        this.f42841b = scarInterstitialAd;
    }
}
