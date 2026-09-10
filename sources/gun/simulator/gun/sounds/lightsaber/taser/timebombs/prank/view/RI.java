package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogLoadingRewardAdsBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class RI implements NS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SI f3653a;

    public RI(SI si) {
        this.f3653a = si;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final void a(A70 a70) {
        SI si = this.f3653a;
        int i = si.f;
        if (i > 0 && si.d != null) {
            S3.b("unlock_weapon_results", "failure_again");
        } else if (si.d != null && i == 0) {
            S3.b("unlock_weapon_results", "failure");
        }
        ((DialogLoadingRewardAdsBinding) si.a()).conLoadingReward.setVisibility(8);
        ((DialogLoadingRewardAdsBinding) si.a()).conLoadingRewardError.setVisibility(0);
        si.d().removeCallbacks(si.h);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final void b(InterfaceC3240dB interfaceC3240dB) {
        this.f3653a.k = true;
    }
}
