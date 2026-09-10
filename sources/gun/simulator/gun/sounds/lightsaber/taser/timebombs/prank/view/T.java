package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public abstract class T extends AbstractC3173cX {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3173cX
    public final int a(int i) {
        return ((-i) >> 31) & (e().nextInt() >>> (32 - i));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3173cX
    public final int b() {
        return e().nextInt();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3173cX
    public final long c() {
        return e().nextLong();
    }

    public abstract Random e();
}
