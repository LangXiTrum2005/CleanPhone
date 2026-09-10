package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4151ne extends W30 {
    public final C2330Cb e;
    public final AtomicReferenceArray f;

    public C4151ne(long j, C4151ne c4151ne, C2330Cb c2330Cb, int i) {
        super(j, c4151ne, i);
        this.e = c2330Cb;
        this.f = new AtomicReferenceArray(AbstractC2382Eb.b * 2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W30
    public final int f() {
        return AbstractC2382Eb.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W30
    public final void g(int i, InterfaceC3549gk interfaceC3549gk) throws IllegalAccessException, InvocationTargetException {
        C2330Cb c2330Cb;
        C3770jF c3770jFJ;
        C3770jF c3770jFJ2;
        int i2 = AbstractC2382Eb.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object obj = this.f.get(i * 2);
        while (true) {
            Object objK = k(i);
            boolean z2 = objK instanceof InterfaceC5129yj0;
            c2330Cb = this.e;
            if (z2 || (objK instanceof C5217zj0)) {
                if (j(i, objK, z ? AbstractC2382Eb.j : AbstractC2382Eb.k)) {
                    m(i, null);
                    l(i, !z);
                    if (z) {
                        AbstractC2995aW.n(c2330Cb);
                        InterfaceC2766Sw interfaceC2766Sw = c2330Cb.b;
                        if (interfaceC2766Sw == null || (c3770jFJ = AbstractC3375el.j(interfaceC2766Sw, obj, null)) == null) {
                            return;
                        }
                        AbstractC2995aW.Q(interfaceC3549gk, c3770jFJ);
                        return;
                    }
                    return;
                }
            } else {
                if (objK == AbstractC2382Eb.j || objK == AbstractC2382Eb.k) {
                    break;
                }
                if (objK != AbstractC2382Eb.g && objK != AbstractC2382Eb.f) {
                    if (objK == AbstractC2382Eb.i || objK == AbstractC2382Eb.d || objK == AbstractC2382Eb.l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objK).toString());
                }
            }
        }
        m(i, null);
        if (z) {
            AbstractC2995aW.n(c2330Cb);
            InterfaceC2766Sw interfaceC2766Sw2 = c2330Cb.b;
            if (interfaceC2766Sw2 == null || (c3770jFJ2 = AbstractC3375el.j(interfaceC2766Sw2, obj, null)) == null) {
                return;
            }
            AbstractC2995aW.Q(interfaceC3549gk, c3770jFJ2);
        }
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void l(int i, boolean z) {
        if (z) {
            C2330Cb c2330Cb = this.e;
            AbstractC2995aW.n(c2330Cb);
            c2330Cb.K((this.c * ((long) AbstractC2382Eb.b)) + ((long) i));
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.f.lazySet(i * 2, obj);
    }

    public final void n(int i, SE se) {
        this.f.set((i * 2) + 1, se);
    }
}
