package com.google.ads.mediation.unity;

import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.banners.BannerView;

/* JADX INFO: compiled from: UnityBannerViewWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final BannerView f19165attabal;

    public wireman(BannerView bannerView) {
        this.f19165attabal = bannerView;
    }

    public BannerView attabal() {
        return this.f19165attabal;
    }

    public void dern(BannerView.IListener iListener) {
        this.f19165attabal.setListener(iListener);
    }

    public void saneness(UnityAdsLoadOptions unityAdsLoadOptions) {
        this.f19165attabal.load(unityAdsLoadOptions);
    }
}
