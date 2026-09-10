package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.op, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4261op extends C4016m30 {
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(C4261op.class, "_decision");
    private volatile int _decision;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4016m30, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE
    public final void x(Object obj) {
        y(obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4016m30, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE
    public final void y(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                AbstractC4173np.a(AbstractC2995aW.j0(obj), null, WD.w(this.d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
