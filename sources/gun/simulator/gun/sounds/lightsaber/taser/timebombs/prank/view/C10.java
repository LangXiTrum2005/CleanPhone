package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class C10 implements HS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2903a;
    public final /* synthetic */ RussianRouletteActivity b;

    public /* synthetic */ C10(RussianRouletteActivity russianRouletteActivity, int i) {
        this.f2903a = i;
        this.b = russianRouletteActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void d(A70 a70) {
        int i = this.f2903a;
        RussianRouletteActivity russianRouletteActivity = this.b;
        switch (i) {
            case 0:
                int i2 = RussianRouletteActivity.t;
                russianRouletteActivity.o().f();
                break;
            default:
                russianRouletteActivity.onBackPressed();
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final void h(boolean z) {
        int i = this.f2903a;
        RussianRouletteActivity russianRouletteActivity = this.b;
        switch (i) {
            case 0:
                if (z) {
                    int i2 = RussianRouletteActivity.t;
                    russianRouletteActivity.o().f();
                }
                break;
            default:
                if (z) {
                    russianRouletteActivity.onBackPressed();
                }
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
    public final /* synthetic */ void onAdShowed() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4821vB
    public final /* synthetic */ void e(InterfaceC3240dB interfaceC3240dB) {
    }
}
