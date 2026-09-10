package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3899kk extends AbstractC4008m implements InterfaceC2909Yj {
    public static final C3811jk Key = new C3811jk(G7.d, C3724ik.g);

    public AbstractC3899kk() {
        super(G7.d);
    }

    public abstract void dispatch(InterfaceC3549gk interfaceC3549gk, Runnable runnable);

    public void dispatchYield(InterfaceC3549gk interfaceC3549gk, Runnable runnable) {
        dispatch(interfaceC3549gk, runnable);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4008m, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public <E extends InterfaceC3373ek> E get(InterfaceC3461fk interfaceC3461fk) {
        AbstractC2995aW.q(interfaceC3461fk, "key");
        if (!(interfaceC3461fk instanceof AbstractC4096n)) {
            if (G7.d == interfaceC3461fk) {
                return this;
            }
            return null;
        }
        AbstractC4096n abstractC4096n = (AbstractC4096n) interfaceC3461fk;
        InterfaceC3461fk key = getKey();
        AbstractC2995aW.q(key, "key");
        if (key != abstractC4096n && abstractC4096n.b != key) {
            return null;
        }
        E e = (E) abstractC4096n.f4723a.invoke(this);
        if (e instanceof InterfaceC3373ek) {
            return e;
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2909Yj
    public final <T> InterfaceC2857Wj interceptContinuation(InterfaceC2857Wj interfaceC2857Wj) {
        return new C4085mp(this, interfaceC2857Wj);
    }

    public boolean isDispatchNeeded(InterfaceC3549gk interfaceC3549gk) {
        return !(this instanceof C4505rf0);
    }

    public AbstractC3899kk limitedParallelism(int i) {
        WD.j(i);
        return new C4564sI(this, i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4008m, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public InterfaceC3549gk minusKey(InterfaceC3461fk interfaceC3461fk) {
        AbstractC2995aW.q(interfaceC3461fk, "key");
        boolean z = interfaceC3461fk instanceof AbstractC4096n;
        C2734Rq c2734Rq = C2734Rq.f3684a;
        if (z) {
            AbstractC4096n abstractC4096n = (AbstractC4096n) interfaceC3461fk;
            InterfaceC3461fk key = getKey();
            AbstractC2995aW.q(key, "key");
            if ((key == abstractC4096n || abstractC4096n.b == key) && ((InterfaceC3373ek) abstractC4096n.f4723a.invoke(this)) != null) {
                return c2734Rq;
            }
        } else if (G7.d == interfaceC3461fk) {
            return c2734Rq;
        }
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2909Yj
    public final void releaseInterceptedContinuation(InterfaceC2857Wj interfaceC2857Wj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractC2995aW.o(interfaceC2857Wj, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        C4085mp c4085mp = (C4085mp) interfaceC2857Wj;
        do {
            atomicReferenceFieldUpdater = C4085mp.h;
        } while (atomicReferenceFieldUpdater.get(c4085mp) == AbstractC4173np.b);
        Object obj = atomicReferenceFieldUpdater.get(c4085mp);
        C2798Uc c2798Uc = obj instanceof C2798Uc ? (C2798Uc) obj : null;
        if (c2798Uc != null) {
            c2798Uc.o();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC2340Cl.x(this);
    }

    public final AbstractC3899kk plus(AbstractC3899kk abstractC3899kk) {
        return abstractC3899kk;
    }
}
