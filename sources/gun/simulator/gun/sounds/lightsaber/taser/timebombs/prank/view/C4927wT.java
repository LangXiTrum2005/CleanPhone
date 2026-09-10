package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.renderer.PangleAppOpenAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4927wT implements PAGAppOpenAdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5015xT f5181a;

    public C4927wT(C5015xT c5015xT) {
        this.f5181a = c5015xT;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGAppOpenAd pAGAppOpenAd) {
        C5015xT c5015xT = this.f5181a;
        PangleAppOpenAd pangleAppOpenAd = c5015xT.c;
        pangleAppOpenAd.g = (MediationAppOpenAdCallback) pangleAppOpenAd.b.onSuccess(pangleAppOpenAd);
        c5015xT.c.h = pAGAppOpenAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.lc
    public final void onError(int i, String str) {
        AdError adErrorCreateSdkError = PangleConstants.createSdkError(i, str);
        adErrorCreateSdkError.toString();
        this.f5181a.c.b.onFailure(adErrorCreateSdkError);
    }
}
