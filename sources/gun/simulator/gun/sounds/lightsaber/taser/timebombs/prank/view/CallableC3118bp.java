package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC3118bp implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3909kp f4192a;

    public CallableC3118bp(C3909kp c3909kp) {
        this.f4192a = c3909kp;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f4192a) {
            try {
                C3909kp c3909kp = this.f4192a;
                if (c3909kp.i == null) {
                    return null;
                }
                c3909kp.q();
                if (this.f4192a.h()) {
                    this.f4192a.o();
                    this.f4192a.k = 0;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
