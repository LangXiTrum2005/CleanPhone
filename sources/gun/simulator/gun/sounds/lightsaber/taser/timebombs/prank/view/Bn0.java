package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: loaded from: classes4.dex */
public final class Bn0 extends BF implements InterfaceC3240dB {
    public final RewardedAd k;

    public Bn0(RewardedAd rewardedAd) {
        this.k = rewardedAd;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final DZ a() {
        return new Dn0(this, 5);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final void b() {
        System.currentTimeMillis();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final String d() {
        RewardedAd rewardedAd = this.k;
        if (rewardedAd != null) {
            return rewardedAd.getAdUnitId();
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3240dB
    public final void c() {
    }
}
