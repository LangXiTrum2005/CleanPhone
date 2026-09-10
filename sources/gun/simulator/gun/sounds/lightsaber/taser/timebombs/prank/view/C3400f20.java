package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Build;
import android.os.Vibrator;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3400f20 extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ C4629t20 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3400f20(C4629t20 c4629t20, int i) {
        super(0);
        this.f = i;
        this.g = c4629t20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        int i = this.f;
        C4629t20 c4629t20 = this.g;
        switch (i) {
            case 0:
                RussianRouletteActivity russianRouletteActivity = c4629t20.f5012a;
                AbstractC2995aW.q(russianRouletteActivity, "activity");
                return Build.VERSION.SDK_INT >= 23 ? new C3213cv(russianRouletteActivity, 1) : new C3213cv(russianRouletteActivity, 0);
            case 1:
                return new R7(c4629t20.f5012a, null, new W9(c4629t20, 4), 2);
            default:
                Object systemService = c4629t20.f5012a.getSystemService("vibrator");
                if (systemService instanceof Vibrator) {
                    return (Vibrator) systemService;
                }
                return null;
        }
    }
}
