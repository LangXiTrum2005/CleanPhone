package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4831vL implements ES {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5126a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ C4831vL(MainActivity mainActivity, int i) {
        this.f5126a = i;
        this.b = mainActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void d(A70 a70) {
        int i = this.f5126a;
        MainActivity mainActivity = this.b;
        switch (i) {
            case 0:
                int i2 = RussianRouletteActivity.t;
                C2498In.k(mainActivity);
                break;
            default:
                MainActivity.i(mainActivity);
                mainActivity.h = false;
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void h(boolean z) {
        int i = this.f5126a;
        MainActivity mainActivity = this.b;
        switch (i) {
            case 0:
                if (z) {
                    int i2 = RussianRouletteActivity.t;
                    C2498In.k(mainActivity);
                }
                break;
            default:
                if (z) {
                    MainActivity.i(mainActivity);
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void onAdShowed() {
        int i = this.f5126a;
        MainActivity mainActivity = this.b;
        switch (i) {
            case 0:
                mainActivity.h = true;
                break;
            default:
                mainActivity.h = true;
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final /* synthetic */ void onAdClicked() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final /* synthetic */ void onAdClosed() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final /* synthetic */ void onAdImpression() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final /* synthetic */ void e(InterfaceC3240dB interfaceC3240dB) {
    }
}
