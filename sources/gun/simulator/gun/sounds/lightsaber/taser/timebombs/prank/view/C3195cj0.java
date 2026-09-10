package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.vungle.mediation.VungleInterstitialAdapter;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3195cj0 implements RD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VungleInterstitialAdapter f4239a;

    public C3195cj0(VungleInterstitialAdapter vungleInterstitialAdapter) {
        this.f4239a = vungleInterstitialAdapter;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public final void onAdClicked(X8 x8) {
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f4239a;
        if (vungleInterstitialAdapter.mediationInterstitialListener != null) {
            vungleInterstitialAdapter.mediationInterstitialListener.onAdClicked(vungleInterstitialAdapter);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public final void onAdEnd(X8 x8) {
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f4239a;
        if (vungleInterstitialAdapter.mediationInterstitialListener != null) {
            vungleInterstitialAdapter.mediationInterstitialListener.onAdClosed(vungleInterstitialAdapter);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public final void onAdFailedToLoad(X8 x8, Ei0 ei0) {
        AdError adError = VungleMediationAdapter.getAdError(ei0);
        adError.toString();
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f4239a;
        if (vungleInterstitialAdapter.mediationInterstitialListener != null) {
            vungleInterstitialAdapter.mediationInterstitialListener.onAdFailedToLoad(vungleInterstitialAdapter, adError);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public final void onAdFailedToPlay(X8 x8, Ei0 ei0) {
        VungleMediationAdapter.getAdError(ei0).toString();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public final void onAdLeftApplication(X8 x8) {
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f4239a;
        if (vungleInterstitialAdapter.mediationInterstitialListener != null) {
            vungleInterstitialAdapter.mediationInterstitialListener.onAdLeftApplication(vungleInterstitialAdapter);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public final void onAdLoaded(X8 x8) {
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f4239a;
        if (vungleInterstitialAdapter.mediationInterstitialListener != null) {
            vungleInterstitialAdapter.mediationInterstitialListener.onAdLoaded(vungleInterstitialAdapter);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public final void onAdStart(X8 x8) {
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f4239a;
        if (vungleInterstitialAdapter.mediationInterstitialListener != null) {
            vungleInterstitialAdapter.mediationInterstitialListener.onAdOpened(vungleInterstitialAdapter);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public final void onAdImpression(X8 x8) {
    }
}
