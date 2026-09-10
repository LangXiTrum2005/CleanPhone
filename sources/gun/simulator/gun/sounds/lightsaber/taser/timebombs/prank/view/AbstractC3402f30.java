package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3402f30 extends AbstractC4440qs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorC4427qk f4347a;

    public AbstractC3402f30(int i, int i2, String str, long j) {
        this.f4347a = new ExecutorC4427qk(i, i2, str, j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final void dispatch(InterfaceC3549gk interfaceC3549gk, Runnable runnable) {
        ExecutorC4427qk.k(this.f4347a, runnable, false, 6);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final void dispatchYield(InterfaceC3549gk interfaceC3549gk, Runnable runnable) {
        ExecutorC4427qk.k(this.f4347a, runnable, true, 2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4440qs
    public final Executor n() {
        return this.f4347a;
    }
}
