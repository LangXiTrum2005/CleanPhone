package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC3548gj0 implements Runnable {
    private WeakReference<C3636hj0> runner;

    public RunnableC3548gj0(WeakReference<C3636hj0> weakReference) {
        AbstractC2995aW.q(weakReference, "runner");
        this.runner = weakReference;
    }

    public final WeakReference<C3636hj0> getRunner() {
        return this.runner;
    }

    @Override // java.lang.Runnable
    public void run() {
        C3636hj0 c3636hj0 = this.runner.get();
        if (c3636hj0 != null) {
            c3636hj0.executePendingJobs();
        }
    }

    public final void setRunner(WeakReference<C3636hj0> weakReference) {
        AbstractC2995aW.q(weakReference, "<set-?>");
        this.runner = weakReference;
    }
}
