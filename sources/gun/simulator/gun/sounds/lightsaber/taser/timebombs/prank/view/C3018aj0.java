package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.vungle.mediation.VungleInterstitialAdapter;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.aj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3018aj0 implements VungleInitializer.VungleInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4136a;
    public final /* synthetic */ AdSize b;
    public final /* synthetic */ C3105bi0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ VungleInterstitialAdapter e;

    public C3018aj0(VungleInterstitialAdapter vungleInterstitialAdapter, Context context, AdSize adSize, C3105bi0 c3105bi0, String str) {
        this.e = vungleInterstitialAdapter;
        this.f4136a = context;
        this.b = adSize;
        this.c = c3105bi0;
        this.d = str;
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        VungleInterstitialAdapter vungleInterstitialAdapter = this.e;
        if (vungleInterstitialAdapter.mediationBannerListener != null) {
            vungleInterstitialAdapter.mediationBannerListener.onAdFailedToLoad(vungleInterstitialAdapter, adError);
        }
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeSuccess() {
        Context context = this.f4136a;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        VungleInterstitialAdapter vungleInterstitialAdapter = this.e;
        vungleInterstitialAdapter.bannerLayout = relativeLayout;
        AdSize adSize = this.b;
        int heightInPixels = adSize.getHeightInPixels(context);
        C3105bi0 c3105bi0 = this.c;
        if (heightInPixels <= 0) {
            heightInPixels = Math.round(c3105bi0.getHeight() * context.getResources().getDisplayMetrics().density);
        }
        vungleInterstitialAdapter.bannerLayout.setLayoutParams(new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), heightInPixels));
        vungleInterstitialAdapter.bannerAdView = new Di0(context, this.d, c3105bi0);
        vungleInterstitialAdapter.bannerAdView.setAdListener(new C3107bj0(vungleInterstitialAdapter));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14, -1);
        layoutParams.addRule(15, -1);
        vungleInterstitialAdapter.bannerLayout.addView(vungleInterstitialAdapter.bannerAdView, layoutParams);
        vungleInterstitialAdapter.bannerAdView.load(null);
    }
}
