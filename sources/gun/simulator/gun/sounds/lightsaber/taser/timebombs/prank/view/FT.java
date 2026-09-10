package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.renderer.PangleRewardedAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class FT implements PAGRewardedAdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GT f3066a;

    public FT(GT gt) {
        this.f3066a = gt;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
        GT gt = this.f3066a;
        PangleRewardedAd pangleRewardedAd = gt.c;
        pangleRewardedAd.g = (MediationRewardedAdCallback) pangleRewardedAd.b.onSuccess(pangleRewardedAd);
        gt.c.h = pAGRewardedAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.lc
    public final void onError(int i, String str) {
        AdError adErrorCreateSdkError = PangleConstants.createSdkError(i, str);
        adErrorCreateSdkError.toString();
        this.f3066a.c.b.onFailure(adErrorCreateSdkError);
    }
}
