package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.google.ads.mediation.pangle.renderer.PangleRewardedAd;
import com.google.android.gms.ads.AdError;

/* JADX INFO: loaded from: classes2.dex */
public final class GT implements PangleInitializer.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3123a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PangleRewardedAd c;

    public GT(PangleRewardedAd pangleRewardedAd, String str, String str2) {
        this.c = pangleRewardedAd;
        this.f3123a = str;
        this.b = str2;
    }

    @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.c.b.onFailure(adError);
    }

    @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
    public final void onInitializeSuccess() {
        PangleRewardedAd pangleRewardedAd = this.c;
        PAGRewardedRequest pAGRewardedRequestCreatePagRewardedRequest = pangleRewardedAd.e.createPagRewardedRequest();
        String str = this.f3123a;
        pAGRewardedRequestCreatePagRewardedRequest.setAdString(str);
        PangleRequestHelper.setWatermarkString(pAGRewardedRequestCreatePagRewardedRequest, str, pangleRewardedAd.f779a);
        pangleRewardedAd.d.loadRewardedAd(this.b, pAGRewardedRequestCreatePagRewardedRequest, new FT(this));
    }
}
