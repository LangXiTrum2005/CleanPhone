package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityRussianRouletteBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class J10 extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ RussianRouletteActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J10(RussianRouletteActivity russianRouletteActivity, int i) {
        super(0);
        this.f = i;
        this.g = russianRouletteActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        int i = this.f;
        RussianRouletteActivity russianRouletteActivity = this.g;
        switch (i) {
            case 0:
                return new C4717u20((ActivityRussianRouletteBinding) russianRouletteActivity.getMBinding(), russianRouletteActivity, russianRouletteActivity);
            case 1:
                return new C4629t20(russianRouletteActivity, russianRouletteActivity, russianRouletteActivity.e, (ActivityRussianRouletteBinding) russianRouletteActivity.getMBinding());
            default:
                return new N10(russianRouletteActivity);
        }
    }
}
