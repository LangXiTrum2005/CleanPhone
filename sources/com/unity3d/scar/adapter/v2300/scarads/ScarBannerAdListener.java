package com.unity3d.scar.adapter.v2300.scarads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.banners.BannerView;

/* JADX INFO: loaded from: classes6.dex */
public class ScarBannerAdListener extends ScarAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScarBannerAdHandler f42839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScarBannerAd f42840c;
    public final AdListener d = new AdListener() { // from class: com.unity3d.scar.adapter.v2300.scarads.ScarBannerAdListener.1
        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClicked() {
            super.onAdClicked();
            ScarBannerAdListener.this.f42839b.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            super.onAdClosed();
            ScarBannerAdListener.this.f42839b.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            AdView adView;
            super.onAdFailedToLoad(loadAdError);
            ScarBannerAdListener scarBannerAdListener = ScarBannerAdListener.this;
            ScarBannerAd scarBannerAd = scarBannerAdListener.f42840c;
            BannerView bannerView = scarBannerAd.g;
            if (bannerView != null && (adView = scarBannerAd.j) != null) {
                bannerView.removeView(adView);
            }
            scarBannerAdListener.f42839b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdImpression() {
            super.onAdImpression();
            ScarBannerAdListener.this.f42839b.onAdImpression();
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            super.onAdLoaded();
            ScarBannerAdListener.this.f42839b.onAdLoaded();
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            super.onAdOpened();
            ScarBannerAdListener.this.f42839b.onAdOpened();
        }
    };

    public ScarBannerAdListener(ScarBannerAdHandler scarBannerAdHandler, ScarBannerAd scarBannerAd) {
        this.f42839b = scarBannerAdHandler;
        this.f42840c = scarBannerAd;
    }
}
