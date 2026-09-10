package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3122bs extends AbstractC3210cs implements InterfaceC4083mo {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(AbstractC3122bs.class, Object.class, "_queue");
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(AbstractC3122bs.class, Object.class, "_delayed");
    public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(AbstractC3122bs.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public final void dispatch(InterfaceC3549gk interfaceC3549gk, Runnable runnable) {
        v(runnable);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4083mo
    public final void e(long j, C2798Uc c2798Uc) {
        SE se = AbstractC3298ds.f4295a;
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C2891Xr c2891Xr = new C2891Xr(this, j2 + jNanoTime, c2798Uc);
            y(jNanoTime, c2891Xr);
            c2798Uc.n(new C4700tp(c2891Xr, 0));
        }
    }

    public InterfaceC4612sp f(long j, Runnable runnable, InterfaceC3549gk interfaceC3549gk) {
        return AbstractC2912Ym.f4040a.f(j, runnable, interfaceC3549gk);
    }

    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3210cs
    public final long r() {
        C3033as c3033as;
        AbstractRunnableC2943Zr abstractRunnableC2943ZrB;
        AbstractRunnableC2943Zr abstractRunnableC2943ZrD;
        if (t()) {
            return 0L;
        }
        C3033as c3033as2 = (C3033as) f.get(this);
        Runnable runnable = null;
        if (c3033as2 != null && C3446fc0.b.get(c3033as2) != 0) {
            long jNanoTime = System.nanoTime();
            do {
                synchronized (c3033as2) {
                    AbstractRunnableC2943Zr[] abstractRunnableC2943ZrArr = c3033as2.f4373a;
                    AbstractRunnableC2943Zr abstractRunnableC2943Zr = abstractRunnableC2943ZrArr != null ? abstractRunnableC2943ZrArr[0] : null;
                    if (abstractRunnableC2943Zr == null) {
                        abstractRunnableC2943ZrD = null;
                    } else {
                        abstractRunnableC2943ZrD = (jNanoTime - abstractRunnableC2943Zr.f4096a < 0 || !w(abstractRunnableC2943Zr)) ? null : c3033as2.d(0);
                    }
                }
            } while (abstractRunnableC2943ZrD != null);
        }
        loop1: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            }
            if (obj instanceof C3512gJ) {
                C3512gJ c3512gJ = (C3512gJ) obj;
                Object objD = c3512gJ.d();
                if (objD != C3512gJ.g) {
                    runnable = (Runnable) objD;
                    break;
                }
                C3512gJ c3512gJC = c3512gJ.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3512gJC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else {
                if (obj == AbstractC3298ds.b) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        runnable = (Runnable) obj;
                        break loop1;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        S5 s5 = this.c;
        long jNanoTime2 = Long.MAX_VALUE;
        if (((s5 == null || s5.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = e.get(this);
        if (obj2 == null) {
            c3033as = (C3033as) f.get(this);
            if (c3033as != null && (abstractRunnableC2943ZrB = c3033as.b()) != null) {
                jNanoTime2 = abstractRunnableC2943ZrB.f4096a - System.nanoTime();
                if (jNanoTime2 < 0) {
                    return 0L;
                }
            }
        } else if (obj2 instanceof C3512gJ) {
            long j = C3512gJ.f.get((C3512gJ) obj2);
            if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                return 0L;
            }
            c3033as = (C3033as) f.get(this);
            if (c3033as != null) {
                jNanoTime2 = abstractRunnableC2943ZrB.f4096a - System.nanoTime();
                if (jNanoTime2 < 0) {
                    return 0L;
                }
            }
        } else if (obj2 != AbstractC3298ds.b) {
            return 0L;
        }
        return jNanoTime2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3210cs
    public void shutdown() {
        AbstractRunnableC2943Zr abstractRunnableC2943ZrD;
        ThreadLocal threadLocal = AbstractC3270dc0.f4278a;
        AbstractC3270dc0.f4278a.set(null);
        g.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                SE se = AbstractC3298ds.b;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, se)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof C3512gJ) {
                ((C3512gJ) obj).b();
                break;
            } else {
                if (obj == AbstractC3298ds.b) {
                    break;
                }
                C3512gJ c3512gJ = new C3512gJ(8, true);
                c3512gJ.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c3512gJ)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (r() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C3033as c3033as = (C3033as) f.get(this);
            if (c3033as == null) {
                return;
            }
            synchronized (c3033as) {
                abstractRunnableC2943ZrD = C3446fc0.b.get(c3033as) > 0 ? c3033as.d(0) : null;
            }
            if (abstractRunnableC2943ZrD == null) {
                return;
            } else {
                u(jNanoTime, abstractRunnableC2943ZrD);
            }
        }
    }

    public void v(Runnable runnable) {
        if (!w(runnable)) {
            RunnableC2886Xm.h.v(runnable);
            return;
        }
        Thread threadN = n();
        if (Thread.currentThread() != threadN) {
            LockSupport.unpark(threadN);
        }
    }

    public final boolean w(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (g.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof C3512gJ)) {
                if (obj == AbstractC3298ds.b) {
                    return false;
                }
                C3512gJ c3512gJ = new C3512gJ(8, true);
                c3512gJ.a((Runnable) obj);
                c3512gJ.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3512gJ)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            C3512gJ c3512gJ2 = (C3512gJ) obj;
            int iA = c3512gJ2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                C3512gJ c3512gJC = c3512gJ2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3512gJC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final boolean x() {
        S5 s5 = this.c;
        if (!(s5 != null ? s5.isEmpty() : true)) {
            return false;
        }
        C3033as c3033as = (C3033as) f.get(this);
        if (c3033as != null && C3446fc0.b.get(c3033as) != 0) {
            return false;
        }
        Object obj = e.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof C3512gJ) {
            long j = C3512gJ.f.get((C3512gJ) obj);
            if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC3298ds.b) {
            return true;
        }
        return false;
    }

    public final void y(long j, AbstractRunnableC2943Zr abstractRunnableC2943Zr) {
        int iD;
        Thread threadN;
        boolean z = g.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        if (z) {
            iD = 1;
        } else {
            C3033as c3033as = (C3033as) atomicReferenceFieldUpdater.get(this);
            if (c3033as == null) {
                C3033as c3033as2 = new C3033as();
                c3033as2.c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c3033as2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC2995aW.n(obj);
                c3033as = (C3033as) obj;
            }
            iD = abstractRunnableC2943Zr.d(j, c3033as, this);
        }
        if (iD != 0) {
            if (iD == 1) {
                u(j, abstractRunnableC2943Zr);
                return;
            } else {
                if (iD != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        C3033as c3033as3 = (C3033as) atomicReferenceFieldUpdater.get(this);
        if ((c3033as3 != null ? c3033as3.b() : null) != abstractRunnableC2943Zr || Thread.currentThread() == (threadN = n())) {
            return;
        }
        LockSupport.unpark(threadN);
    }
}
