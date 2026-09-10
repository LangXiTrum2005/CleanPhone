package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorC4433qn extends AbstractC4440qs implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorC4433qn f4901a = new ExecutorC4433qn();
    public static final AbstractC3899kk b;

    static {
        Xf0 xf0 = Xf0.f3986a;
        int i = Ta0.f3778a;
        if (64 >= i) {
            i = 64;
        }
        b = xf0.limitedParallelism(WD.V("kotlinx.coroutines.io.parallelism", i, 0, 0, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final void dispatch(InterfaceC3549gk interfaceC3549gk, Runnable runnable) {
        b.dispatch(interfaceC3549gk, runnable);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final void dispatchYield(InterfaceC3549gk interfaceC3549gk, Runnable runnable) {
        b.dispatchYield(interfaceC3549gk, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(C2734Rq.f3684a, runnable);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final AbstractC3899kk limitedParallelism(int i) {
        return Xf0.f3986a.limitedParallelism(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4440qs
    public final Executor n() {
        return this;
    }
}
