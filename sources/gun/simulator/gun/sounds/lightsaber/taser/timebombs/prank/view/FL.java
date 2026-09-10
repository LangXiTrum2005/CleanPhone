package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvNewCommonWeaponSortsAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvNewSpecialWeaponSortsAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter.RvWeaponSortsAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class FL extends WG implements InterfaceC2714Qw {
    public static final FL g = new FL(0);
    public static final FL h = new FL(1);
    public static final FL i = new FL(2);
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FL(int i2) {
        super(0);
        this.f = i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        switch (this.f) {
            case 0:
                return new RvNewCommonWeaponSortsAdapter();
            case 1:
                return new RvNewSpecialWeaponSortsAdapter();
            default:
                return new RvWeaponSortsAdapter();
        }
    }
}
