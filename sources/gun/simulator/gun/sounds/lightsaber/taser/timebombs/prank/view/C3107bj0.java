package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.vungle.mediation.VungleInterstitialAdapter;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3107bj0 implements O8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VungleInterstitialAdapter f4184a;

    public C3107bj0(VungleInterstitialAdapter vungleInterstitialAdapter) {
        this.f4184a = vungleInterstitialAdapter;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public final void onAdClicked(X8 x8) {
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f4184a;
        if (vungleInterstitialAdapter.mediationBannerListener != null) {
            vungleInterstitialAdapter.mediationBannerListener.onAdClicked(vungleInterstitialAdapter);
            vungleInterstitialAdapter.mediationBannerListener.onAdOpened(vungleInterstitialAdapter);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public final void onAdFailedToLoad(X8 x8, Ei0 ei0) {
        AdError adError = VungleMediationAdapter.getAdError(ei0);
        adError.toString();
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f4184a;
        if (vungleInterstitialAdapter.mediationBannerListener != null) {
            vungleInterstitialAdapter.mediationBannerListener.onAdFailedToLoad(vungleInterstitialAdapter, adError);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public final void onAdFailedToPlay(X8 x8, Ei0 ei0) {
        VungleMediationAdapter.getAdError(ei0).toString();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public final void onAdLeftApplication(X8 x8) {
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f4184a;
        if (vungleInterstitialAdapter.mediationBannerListener != null) {
            vungleInterstitialAdapter.mediationBannerListener.onAdLeftApplication(vungleInterstitialAdapter);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public final void onAdLoaded(X8 x8) {
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f4184a;
        if (vungleInterstitialAdapter.mediationBannerListener != null) {
            vungleInterstitialAdapter.mediationBannerListener.onAdLoaded(vungleInterstitialAdapter);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public final void onAdEnd(X8 x8) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public final void onAdImpression(X8 x8) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public final void onAdStart(X8 x8) {
    }
}
