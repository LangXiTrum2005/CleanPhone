package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.google.ads.mediation.pangle.renderer.PangleAppOpenAd;
import com.google.android.gms.ads.AdError;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5015xT implements PangleInitializer.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5224a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PangleAppOpenAd c;

    public C5015xT(PangleAppOpenAd pangleAppOpenAd, String str, String str2) {
        this.c = pangleAppOpenAd;
        this.f5224a = str;
        this.b = str2;
    }

    @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.c.b.onFailure(adError);
    }

    @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
    public final void onInitializeSuccess() {
        PangleAppOpenAd pangleAppOpenAd = this.c;
        PAGAppOpenRequest pAGAppOpenRequestCreatePagAppOpenRequest = pangleAppOpenAd.e.createPagAppOpenRequest();
        String str = this.f5224a;
        pAGAppOpenRequestCreatePagAppOpenRequest.setAdString(str);
        PangleRequestHelper.setWatermarkString(pAGAppOpenRequestCreatePagAppOpenRequest, str, pangleAppOpenAd.f774a);
        pangleAppOpenAd.d.loadAppOpenAd(this.b, pAGAppOpenRequestCreatePagAppOpenRequest, new C4927wT(this));
    }
}
