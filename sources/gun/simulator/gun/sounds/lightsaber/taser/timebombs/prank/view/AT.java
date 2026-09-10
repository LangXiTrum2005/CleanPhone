package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.renderer.PangleInterstitialAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class AT implements PAGInterstitialAdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BT f2816a;

    public AT(BT bt) {
        this.f2816a = bt;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
        BT bt = this.f2816a;
        PangleInterstitialAd pangleInterstitialAd = bt.c;
        pangleInterstitialAd.g = (MediationInterstitialAdCallback) pangleInterstitialAd.b.onSuccess(pangleInterstitialAd);
        bt.c.h = pAGInterstitialAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.lc
    public final void onError(int i, String str) {
        AdError adErrorCreateSdkError = PangleConstants.createSdkError(i, str);
        adErrorCreateSdkError.toString();
        this.f2816a.c.b.onFailure(adErrorCreateSdkError);
    }
}
