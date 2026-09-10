package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Y30 extends X30 {
    public final List j;

    public Y30(C3614hX c3614hX, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(c3614hX, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X30
    public final long d(long j) {
        return this.j.size();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X30
    public final C3614hX h(long j, FY fy) {
        return (C3614hX) this.j.get((int) (j - this.d));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X30
    public final boolean i() {
        return true;
    }
}
