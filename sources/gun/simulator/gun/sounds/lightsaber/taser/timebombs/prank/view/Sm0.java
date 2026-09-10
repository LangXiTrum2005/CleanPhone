package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.ads.interstitial.InterstitialAd;

/* JADX INFO: loaded from: classes4.dex */
public final class Sm0 implements InterfaceC3240dB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterstitialAd f3735a;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final DZ a() {
        return new C2294Ar(this, 4);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final void b() {
        System.currentTimeMillis();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final String d() {
        InterstitialAd interstitialAd = this.f3735a;
        if (interstitialAd != null) {
            return interstitialAd.getAdUnitId();
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final void c() {
    }
}
