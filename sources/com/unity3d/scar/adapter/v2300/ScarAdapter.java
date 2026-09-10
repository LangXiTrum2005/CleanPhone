package com.unity3d.scar.adapter.v2300;

import android.content.Context;
import com.google.android.gms.ads.AdView;
import com.unity3d.scar.adapter.common.IScarAdapter;
import com.unity3d.scar.adapter.common.ScarAdapterBase;
import com.unity3d.scar.adapter.common.Utils;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v2300.requests.AdRequestFactory;
import com.unity3d.scar.adapter.v2300.scarads.ScarBannerAd;
import com.unity3d.scar.adapter.v2300.scarads.ScarBannerAdListener;
import com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAd;
import com.unity3d.scar.adapter.v2300.scarads.ScarInterstitialAdListener;
import com.unity3d.scar.adapter.v2300.scarads.ScarRewardedAd;
import com.unity3d.scar.adapter.v2300.scarads.ScarRewardedAdListener;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.banners.BannerView;

/* JADX INFO: loaded from: classes6.dex */
public class ScarAdapter extends ScarAdapterBase implements IScarAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdRequestFactory f42826e;

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public final void d(Context context, BannerView bannerView, ScarAdMetadata scarAdMetadata, int i2, int i3, ScarBannerAdHandler scarBannerAdHandler) {
        final ScarBannerAd scarBannerAd = new ScarBannerAd(context, scarAdMetadata, this.f42826e, this.d);
        scarBannerAd.g = bannerView;
        scarBannerAd.f42837h = i2;
        scarBannerAd.f42838i = i3;
        scarBannerAd.j = new AdView(context);
        scarBannerAd.f42835e = new ScarBannerAdListener(scarBannerAdHandler, scarBannerAd);
        Utils.a(new Runnable() { // from class: com.unity3d.scar.adapter.v2300.ScarAdapter.3
            @Override // java.lang.Runnable
            public final void run() {
                scarBannerAd.a(null);
            }
        });
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public final void f(Context context, final ScarAdMetadata scarAdMetadata, ScarRewardedAdHandler scarRewardedAdHandler) {
        final ScarRewardedAd scarRewardedAd = new ScarRewardedAd(context, scarAdMetadata, this.f42826e, this.d);
        scarRewardedAd.f42835e = new ScarRewardedAdListener(scarRewardedAdHandler, scarRewardedAd);
        Utils.a(new Runnable() { // from class: com.unity3d.scar.adapter.v2300.ScarAdapter.2
            @Override // java.lang.Runnable
            public final void run() {
                scarRewardedAd.a(new IScarLoadListener() { // from class: com.unity3d.scar.adapter.v2300.ScarAdapter.2.1
                    @Override // com.unity3d.scar.adapter.common.scarads.IScarLoadListener
                    public final void onAdLoaded() {
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        ScarAdapter.this.f42786b.put(scarAdMetadata.f42790a, scarRewardedAd);
                    }
                });
            }
        });
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public final void g(Context context, final ScarAdMetadata scarAdMetadata, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        final ScarInterstitialAd scarInterstitialAd = new ScarInterstitialAd(context, scarAdMetadata, this.f42826e, this.d);
        scarInterstitialAd.f42835e = new ScarInterstitialAdListener(scarInterstitialAdHandler, scarInterstitialAd);
        Utils.a(new Runnable() { // from class: com.unity3d.scar.adapter.v2300.ScarAdapter.1
            @Override // java.lang.Runnable
            public final void run() {
                scarInterstitialAd.a(new IScarLoadListener() { // from class: com.unity3d.scar.adapter.v2300.ScarAdapter.1.1
                    @Override // com.unity3d.scar.adapter.common.scarads.IScarLoadListener
                    public final void onAdLoaded() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        ScarAdapter.this.f42786b.put(scarAdMetadata.f42790a, scarInterstitialAd);
                    }
                });
            }
        });
    }
}
