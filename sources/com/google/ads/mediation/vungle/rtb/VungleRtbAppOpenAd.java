package com.google.ads.mediation.vungle.rtb;

import com.google.ads.mediation.vungle.VungleFactory;
import com.google.ads.mediation.vungle.renderers.VungleAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.saneness;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VungleRtbAppOpenAd.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/ads/mediation/vungle/rtb/VungleRtbAppOpenAd;", "Lcom/google/ads/mediation/vungle/renderers/VungleAppOpenAd;", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAd;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdCallback;", "mediationAdLoadCallback", "Lcom/google/ads/mediation/vungle/VungleFactory;", "vungleFactory", "<init>", "(Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;Lcom/google/ads/mediation/vungle/VungleFactory;)V", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;", "mediationAppOpenAdConfiguration", "", "getAdMarkup", "(Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;)Ljava/lang/String;", "Lcom/vungle/ads/saneness;", "adConfig", "", "maybeAddWatermarkToVungleAdConfig", "(Lcom/vungle/ads/saneness;Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;)V", "liftoffmonetize_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VungleRtbAppOpenAd extends VungleAppOpenAd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleRtbAppOpenAd(MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, VungleFactory vungleFactory) {
        super(mediationAdLoadCallback, vungleFactory);
        Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
        Intrinsics.checkNotNullParameter(vungleFactory, "vungleFactory");
    }

    @Override // com.google.ads.mediation.vungle.renderers.VungleAppOpenAd
    public String getAdMarkup(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Intrinsics.checkNotNullParameter(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
        Intrinsics.checkNotNullExpressionValue(bidResponse, "getBidResponse(...)");
        return bidResponse;
    }

    @Override // com.google.ads.mediation.vungle.renderers.VungleAppOpenAd
    public void maybeAddWatermarkToVungleAdConfig(saneness adConfig, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        String str = mediationAppOpenAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String();
        Intrinsics.checkNotNullExpressionValue(str, "getWatermark(...)");
        if (str.length() > 0) {
            adConfig.setWatermark(str);
        }
    }
}
