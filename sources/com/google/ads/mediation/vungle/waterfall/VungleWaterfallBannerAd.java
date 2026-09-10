package com.google.ads.mediation.vungle.waterfall;

import com.google.ads.mediation.vungle.VungleFactory;
import com.google.ads.mediation.vungle.renderers.VungleBannerAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.VungleBannerView;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VungleWaterfallBannerAd.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/ads/mediation/vungle/waterfall/VungleWaterfallBannerAd;", "Lcom/google/ads/mediation/vungle/renderers/VungleBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", "mediationAdLoadCallback", "Lcom/google/ads/mediation/vungle/VungleFactory;", "vungleFactory", "<init>", "(Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;Lcom/google/ads/mediation/vungle/VungleFactory;)V", "Lcom/vungle/ads/VungleBannerView;", "bannerAdView", "Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;", "mediationBannerAdConfiguration", "", "wireman", "(Lcom/vungle/ads/VungleBannerView;Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;)V", "liftoffmonetize_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VungleWaterfallBannerAd extends VungleBannerAd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleWaterfallBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, VungleFactory vungleFactory) {
        super(mediationAdLoadCallback, vungleFactory);
        Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
        Intrinsics.checkNotNullParameter(vungleFactory, "vungleFactory");
    }

    @Override // com.google.ads.mediation.vungle.renderers.VungleBannerAd
    public void wireman(VungleBannerView bannerAdView, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Intrinsics.checkNotNullParameter(bannerAdView, "bannerAdView");
        Intrinsics.checkNotNullParameter(mediationBannerAdConfiguration, "mediationBannerAdConfiguration");
        bannerAdView.load((String) null);
    }
}
