package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.renderer.PangleBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5103yT implements PAGBannerAdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5191zT f5277a;

    public C5103yT(C5191zT c5191zT) {
        this.f5277a = c5191zT;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGBannerAd pAGBannerAd) {
        PAGBannerAd pAGBannerAd2 = pAGBannerAd;
        C5191zT c5191zT = this.f5277a;
        pAGBannerAd2.setAdInteractionListener(c5191zT.d);
        PangleBannerAd pangleBannerAd = c5191zT.d;
        pangleBannerAd.h.addView(pAGBannerAd2.getBannerView());
        pangleBannerAd.g = (MediationBannerAdCallback) pangleBannerAd.b.onSuccess(pangleBannerAd);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.lc
    public final void onError(int i, String str) {
        AdError adErrorCreateSdkError = PangleConstants.createSdkError(i, str);
        adErrorCreateSdkError.toString();
        this.f5277a.d.b.onFailure(adErrorCreateSdkError);
    }
}
