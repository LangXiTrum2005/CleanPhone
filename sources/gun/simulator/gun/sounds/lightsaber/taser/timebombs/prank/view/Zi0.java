package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.vungle.mediation.VungleInterstitialAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class Zi0 implements VungleInitializer.VungleInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4087a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C3573h1 c;
    public final /* synthetic */ MediationInterstitialListener d;
    public final /* synthetic */ VungleInterstitialAdapter e;

    public Zi0(VungleInterstitialAdapter vungleInterstitialAdapter, Context context, String str, C3573h1 c3573h1, MediationInterstitialListener mediationInterstitialListener) {
        this.e = vungleInterstitialAdapter;
        this.f4087a = context;
        this.b = str;
        this.c = c3573h1;
        this.d = mediationInterstitialListener;
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeError(AdError adError) {
        this.d.onAdFailedToLoad(this.e, adError);
        adError.toString();
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeSuccess() {
        OD od = new OD(this.f4087a, this.b, this.c);
        VungleInterstitialAdapter vungleInterstitialAdapter = this.e;
        vungleInterstitialAdapter.interstitialAd = od;
        vungleInterstitialAdapter.interstitialAd.setAdListener(new C3195cj0(vungleInterstitialAdapter));
        vungleInterstitialAdapter.interstitialAd.load(null);
    }
}
