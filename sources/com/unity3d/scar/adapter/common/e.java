package com.unity3d.scar.adapter.common;

import android.content.Context;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.banners.BannerView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface e {
    void a(Context context, ph.c cVar, ScarRewardedAdHandler scarRewardedAdHandler);

    void b(Context context, ph.c cVar, ScarInterstitialAdHandler scarInterstitialAdHandler);

    void c(Context context, BannerView bannerView, ph.c cVar, int i10, int i11, ScarBannerAdHandler scarBannerAdHandler);
}
