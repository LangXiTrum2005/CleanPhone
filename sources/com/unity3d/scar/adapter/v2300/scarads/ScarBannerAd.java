package com.unity3d.scar.adapter.v2300.scarads;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.unity3d.services.banners.BannerView;

/* JADX INFO: loaded from: classes6.dex */
public class ScarBannerAd extends ScarAdBase<AdView> {
    public BannerView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42838i;
    public AdView j;

    @Override // com.unity3d.scar.adapter.v2300.scarads.ScarAdBase
    public final void b(AdRequest adRequest) {
        AdView adView;
        BannerView bannerView = this.g;
        if (bannerView == null || (adView = this.j) == null) {
            return;
        }
        bannerView.addView(adView);
        adView.setAdSize(new AdSize(this.f42837h, this.f42838i));
        adView.setAdUnitId(this.f42834c.f42792c);
        adView.setAdListener(((ScarBannerAdListener) this.f42835e).d);
        adView.loadAd(adRequest);
    }
}
