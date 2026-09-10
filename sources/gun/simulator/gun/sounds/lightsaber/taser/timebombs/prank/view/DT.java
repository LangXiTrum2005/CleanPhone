package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.google.ads.mediation.pangle.renderer.PangleNativeAd;
import com.google.android.gms.ads.AdError;

/* JADX INFO: loaded from: classes2.dex */
public final class DT implements PangleInitializer.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2970a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PangleNativeAd c;

    public DT(PangleNativeAd pangleNativeAd, String str, String str2) {
        this.c = pangleNativeAd;
        this.f2970a = str;
        this.b = str2;
    }

    @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.c.b.onFailure(adError);
    }

    @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
    public final void onInitializeSuccess() {
        PangleNativeAd pangleNativeAd = this.c;
        PAGNativeRequest pAGNativeRequestCreatePagNativeRequest = pangleNativeAd.e.createPagNativeRequest();
        String str = this.f2970a;
        pAGNativeRequestCreatePagNativeRequest.setAdString(str);
        PangleRequestHelper.setWatermarkString(pAGNativeRequestCreatePagNativeRequest, str, pangleNativeAd.f777a);
        pangleNativeAd.d.loadNativeAd(this.b, pAGNativeRequestCreatePagNativeRequest, new CT(this));
    }
}
