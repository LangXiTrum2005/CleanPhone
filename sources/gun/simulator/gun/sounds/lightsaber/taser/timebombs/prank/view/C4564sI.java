package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4564sI extends AbstractC3899kk implements InterfaceC4083mo {
    public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(C4564sI.class, "runningWorkers");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3899kk f4971a;
    public final int b;
    public final /* synthetic */ InterfaceC4083mo c;
    public final C3248dJ d;
    public final Object e;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public C4564sI(AbstractC3899kk abstractC3899kk, int i) {
        this.f4971a = abstractC3899kk;
        this.b = i;
        InterfaceC4083mo interfaceC4083mo = abstractC3899kk instanceof InterfaceC4083mo ? (InterfaceC4083mo) abstractC3899kk : null;
        this.c = interfaceC4083mo == null ? AbstractC2912Ym.f4040a : interfaceC4083mo;
        this.d = new C3248dJ();
        this.e = new Object();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final void dispatch(InterfaceC3549gk interfaceC3549gk, Runnable runnable) {
        Runnable runnableN;
        this.d.a(runnable);
        if (f.get(this) >= this.b || !o() || (runnableN = n()) == null) {
            return;
        }
        this.f4971a.dispatch(this, new RunnableC3252dN(17, this, runnableN));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final void dispatchYield(InterfaceC3549gk interfaceC3549gk, Runnable runnable) {
        Runnable runnableN;
        this.d.a(runnable);
        if (f.get(this) >= this.b || !o() || (runnableN = n()) == null) {
            return;
        }
        this.f4971a.dispatchYield(this, new RunnableC3252dN(17, this, runnableN));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4083mo
    public final void e(long j, C2798Uc c2798Uc) {
        this.c.e(j, c2798Uc);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4083mo
    public final InterfaceC4612sp f(long j, Runnable runnable, InterfaceC3549gk interfaceC3549gk) {
        return this.c.f(j, runnable, interfaceC3549gk);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final AbstractC3899kk limitedParallelism(int i) {
        WD.j(i);
        return i >= this.b ? this : super.limitedParallelism(i);
    }

    public final Runnable n() {
        while (true) {
            Runnable runnable = (Runnable) this.d.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.e) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.d.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean o() {
        synchronized (this.e) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            if (atomicIntegerFieldUpdater.get(this) >= this.b) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
