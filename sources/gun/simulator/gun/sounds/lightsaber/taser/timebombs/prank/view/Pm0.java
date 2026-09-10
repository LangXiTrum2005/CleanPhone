package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.ads.AdView;

/* JADX INFO: loaded from: classes4.dex */
public final class Pm0 extends S implements InterfaceC3240dB {
    public AdView d;

    public Pm0(AdView adView) {
        this.d = adView;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final DZ a() {
        return new C2294Ar(this, 3);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final void b() {
        System.currentTimeMillis();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final String d() {
        AdView adView = this.d;
        if (adView != null) {
            return adView.getAdUnitId();
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final void c() {
    }
}
