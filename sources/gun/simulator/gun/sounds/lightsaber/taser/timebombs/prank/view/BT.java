package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.google.ads.mediation.pangle.renderer.PangleInterstitialAd;
import com.google.android.gms.ads.AdError;

/* JADX INFO: loaded from: classes2.dex */
public final class BT implements PangleInitializer.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2873a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PangleInterstitialAd c;

    public BT(PangleInterstitialAd pangleInterstitialAd, String str, String str2) {
        this.c = pangleInterstitialAd;
        this.f2873a = str;
        this.b = str2;
    }

    @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.c.b.onFailure(adError);
    }

    @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
    public final void onInitializeSuccess() {
        PangleInterstitialAd pangleInterstitialAd = this.c;
        PAGInterstitialRequest pAGInterstitialRequestCreatePagInterstitialRequest = pangleInterstitialAd.e.createPagInterstitialRequest();
        String str = this.f2873a;
        pAGInterstitialRequestCreatePagInterstitialRequest.setAdString(str);
        PangleRequestHelper.setWatermarkString(pAGInterstitialRequestCreatePagInterstitialRequest, str, pangleInterstitialAd.f776a);
        pangleInterstitialAd.d.loadInterstitialAd(this.b, pAGInterstitialRequestCreatePagInterstitialRequest, new AT(this));
    }
}
