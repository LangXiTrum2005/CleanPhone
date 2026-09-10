package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd;
import com.google.android.gms.ads.AdError;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3898kj0 implements VungleInitializer.VungleInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4610a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C3573h1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ VungleRtbInterstitialAd e;

    public C3898kj0(VungleRtbInterstitialAd vungleRtbInterstitialAd, Context context, String str, C3573h1 c3573h1, String str2) {
        this.e = vungleRtbInterstitialAd;
        this.f4610a = context;
        this.b = str;
        this.c = c3573h1;
        this.d = str2;
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.e.b.onFailure(adError);
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeSuccess() {
        VungleRtbInterstitialAd vungleRtbInterstitialAd = this.e;
        vungleRtbInterstitialAd.d = vungleRtbInterstitialAd.e.createInterstitialAd(this.f4610a, this.b, this.c);
        vungleRtbInterstitialAd.d.setAdListener(vungleRtbInterstitialAd);
        vungleRtbInterstitialAd.d.load(this.d);
    }
}
