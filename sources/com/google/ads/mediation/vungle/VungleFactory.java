package com.google.ads.mediation.vungle;

import android.content.Context;
import com.ironsource.X3;
import com.vungle.ads.NativeAd;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.kowloon;
import com.vungle.ads.preprohormone;
import com.vungle.ads.saneness;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VungleFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/google/ads/mediation/vungle/VungleFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "placementId", "Lcom/vungle/ads/trm;", X3.i.O, "Lcom/vungle/ads/VungleBannerView;", "createBannerAd", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/trm;)Lcom/vungle/ads/VungleBannerView;", "Lcom/vungle/ads/saneness;", "adConfig", "Lcom/vungle/ads/kowloon;", "createInterstitialAd", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/saneness;)Lcom/vungle/ads/kowloon;", "Lcom/vungle/ads/preprohormone;", "createRewardedAd", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/saneness;)Lcom/vungle/ads/preprohormone;", "Lcom/vungle/ads/NativeAd;", "createNativeAd", "(Landroid/content/Context;Ljava/lang/String;)Lcom/vungle/ads/NativeAd;", "createAdConfig", "()Lcom/vungle/ads/saneness;", "liftoffmonetize_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VungleFactory {
    public final saneness createAdConfig() {
        return new saneness();
    }

    public final VungleBannerView createBannerAd(Context context, String placementId, VungleAdSize adSize) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return new VungleBannerView(context, placementId, adSize);
    }

    public final kowloon createInterstitialAd(Context context, String placementId, saneness adConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        return new kowloon(context, placementId, adConfig);
    }

    public final NativeAd createNativeAd(Context context, String placementId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return new NativeAd(context, placementId);
    }

    public final preprohormone createRewardedAd(Context context, String placementId, saneness adConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        return new preprohormone(context, placementId, adConfig);
    }
}
