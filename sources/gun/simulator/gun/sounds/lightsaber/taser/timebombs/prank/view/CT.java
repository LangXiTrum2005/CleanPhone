package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.renderer.PangleNativeAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class CT implements PAGNativeAdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DT f2922a;

    public CT(DT dt) {
        this.f2922a = dt;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGNativeAd pAGNativeAd) {
        PAGNativeAd pAGNativeAd2 = pAGNativeAd;
        DT dt = this.f2922a;
        PangleNativeAd pangleNativeAd = dt.c;
        pangleNativeAd.h = pAGNativeAd2;
        PAGNativeAdData nativeAdData = pAGNativeAd2.getNativeAdData();
        pangleNativeAd.setHeadline(nativeAdData.getTitle());
        pangleNativeAd.setBody(nativeAdData.getDescription());
        pangleNativeAd.setCallToAction(nativeAdData.getButtonText());
        if (nativeAdData.getIcon() != null) {
            pangleNativeAd.setIcon(new PangleNativeAd.PangleNativeMappedImage(Uri.parse(nativeAdData.getIcon().getImageUrl())));
        }
        pangleNativeAd.setOverrideClickHandling(true);
        pangleNativeAd.setMediaView(nativeAdData.getMediaView());
        pangleNativeAd.setAdChoicesContent(nativeAdData.getAdLogoView());
        PangleNativeAd pangleNativeAd2 = dt.c;
        pangleNativeAd2.g = (MediationNativeAdCallback) pangleNativeAd2.b.onSuccess(pangleNativeAd2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.lc
    public final void onError(int i, String str) {
        AdError adErrorCreateSdkError = PangleConstants.createSdkError(i, str);
        adErrorCreateSdkError.toString();
        this.f2922a.c.b.onFailure(adErrorCreateSdkError);
    }
}
