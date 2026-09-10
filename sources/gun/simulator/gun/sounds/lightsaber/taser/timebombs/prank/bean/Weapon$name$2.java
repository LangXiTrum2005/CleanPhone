package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes4.dex */
public final class Weapon$name$2 extends WG implements InterfaceC2714Qw {
    final /* synthetic */ Weapon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Weapon$name$2(Weapon weapon) {
        super(0);
        this.this$0 = weapon;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final String invoke() {
        return this.this$0.initName();
    }
}
