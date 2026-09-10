package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import com.unity3d.services.banners.BannerView;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface IScarAdapter {
    void a(Activity activity, String str, String str2);

    void b(Context context, boolean z2, BiddingSignalsHandler biddingSignalsHandler);

    void c(Context context, String str, UnityAdFormat unityAdFormat, SignalsHandler signalsHandler);

    void d(Context context, BannerView bannerView, ScarAdMetadata scarAdMetadata, int i2, int i3, ScarBannerAdHandler scarBannerAdHandler);

    void e(Context context, List list, BiddingSignalsHandler biddingSignalsHandler);

    void f(Context context, ScarAdMetadata scarAdMetadata, ScarRewardedAdHandler scarRewardedAdHandler);

    void g(Context context, ScarAdMetadata scarAdMetadata, ScarInterstitialAdHandler scarInterstitialAdHandler);
}
