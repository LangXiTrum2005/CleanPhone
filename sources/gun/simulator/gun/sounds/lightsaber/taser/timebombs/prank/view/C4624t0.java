package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4624t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5008a;
    public final Executor b;
    public final HashMap c;
    public final ReferenceQueue d;
    public InterfaceC5054xr e;

    public C4624t0() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC4448r0(0));
        this.c = new HashMap();
        this.d = new ReferenceQueue();
        this.f5008a = false;
        this.b = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new TY(this, 1));
    }

    public final synchronized void a(InterfaceC4650tG interfaceC4650tG, C5142yr c5142yr) {
        C4536s0 c4536s0 = (C4536s0) this.c.put(interfaceC4650tG, new C4536s0(interfaceC4650tG, c5142yr, this.d, this.f5008a));
        if (c4536s0 != null) {
            c4536s0.c = null;
            c4536s0.clear();
        }
    }

    public final void b(C4536s0 c4536s0) {
        InterfaceC3616hZ interfaceC3616hZ;
        synchronized (this) {
            this.c.remove(c4536s0.f4957a);
            if (c4536s0.b && (interfaceC3616hZ = c4536s0.c) != null) {
                ((C4439qr) this.e).e(c4536s0.f4957a, new C5142yr(interfaceC3616hZ, true, false, c4536s0.f4957a, this.e));
            }
        }
    }
}
