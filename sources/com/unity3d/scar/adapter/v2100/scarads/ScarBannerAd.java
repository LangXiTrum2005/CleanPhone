package com.unity3d.scar.adapter.v2100.scarads;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.unity3d.services.banners.BannerView;

/* JADX INFO: loaded from: classes6.dex */
public class ScarBannerAd extends ScarAdBase<AdView> {
    public BannerView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42813i;
    public AdView j;

    @Override // com.unity3d.scar.adapter.v2100.scarads.ScarAdBase
    public final void b(AdRequest adRequest) {
        AdView adView;
        BannerView bannerView = this.g;
        if (bannerView == null || (adView = this.j) == null) {
            return;
        }
        bannerView.addView(adView);
        adView.setAdSize(new AdSize(this.f42812h, this.f42813i));
        adView.setAdUnitId(this.f42809c.f42792c);
        adView.setAdListener(((ScarBannerAdListener) this.f42810e).d);
        adView.loadAd(adRequest);
    }
}
