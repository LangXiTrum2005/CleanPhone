package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes4.dex */
public final class BU extends T {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3173cX
    public final long d(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.T
    public final Random e() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC2995aW.p(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }
}
