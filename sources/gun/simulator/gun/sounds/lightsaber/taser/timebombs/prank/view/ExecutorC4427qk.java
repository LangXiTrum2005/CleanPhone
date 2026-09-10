package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.work.WorkRequest;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorC4427qk implements Executor, Closeable {
    public static final AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(ExecutorC4427qk.class, "parkedWorkersStack");
    public static final AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(ExecutorC4427qk.class, "controlState");
    public static final AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(ExecutorC4427qk.class, "_isTerminated");
    public static final SE k = new SE("NOT_IN_STACK", 1);
    private volatile int _isTerminated;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4897a;
    public final int b;
    public final long c;
    private volatile long controlState;
    public final String d;
    public final C4006ly e;
    public final C4006ly f;
    public final C3528gZ g;
    private volatile long parkedWorkersStack;

    public ExecutorC4427qk(int i2, int i3, String str, long j2) {
        this.f4897a = i2;
        this.b = i3;
        this.c = j2;
        this.d = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(AbstractC5044xl.g("Core pool size ", i2, " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(AbstractC3888ke0.h("Max pool size ", i3, " should be greater than or equals to core pool size ", i2).toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(AbstractC5044xl.g("Max pool size ", i3, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(AbstractC5044xl.i("Idle worker keep alive time ", j2, " must be positive").toString());
        }
        this.e = new C4006ly();
        this.f = new C4006ly();
        this.g = new C3528gZ((i2 + 1) * 2);
        this.controlState = ((long) i2) << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void k(ExecutorC4427qk executorC4427qk, Runnable runnable, boolean z, int i2) {
        Qm0 qm0 = AbstractC4585sb0.g;
        if ((i2 & 4) != 0) {
            z = false;
        }
        executorC4427qk.i(runnable, qm0, z);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i2;
        AbstractRunnableC3970lb0 abstractRunnableC3970lb0A;
        if (j.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C4339pk c4339pk = threadCurrentThread instanceof C4339pk ? (C4339pk) threadCurrentThread : null;
            if (c4339pk == null || !AbstractC2995aW.i(c4339pk.h, this)) {
                c4339pk = null;
            }
            synchronized (this.g) {
                i2 = (int) (i.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    Object objB = this.g.b(i3);
                    AbstractC2995aW.n(objB);
                    C4339pk c4339pk2 = (C4339pk) objB;
                    if (c4339pk2 != c4339pk) {
                        while (c4339pk2.isAlive()) {
                            LockSupport.unpark(c4339pk2);
                            c4339pk2.join(WorkRequest.MIN_BACKOFF_MILLIS);
                        }
                        C3378em0 c3378em0 = c4339pk2.f4846a;
                        C4006ly c4006ly = this.f;
                        c3378em0.getClass();
                        AbstractRunnableC3970lb0 abstractRunnableC3970lb0 = (AbstractRunnableC3970lb0) C3378em0.b.getAndSet(c3378em0, null);
                        if (abstractRunnableC3970lb0 != null) {
                            c4006ly.a(abstractRunnableC3970lb0);
                        }
                        while (true) {
                            AbstractRunnableC3970lb0 abstractRunnableC3970lb0B = c3378em0.b();
                            if (abstractRunnableC3970lb0B == null) {
                                break;
                            } else {
                                c4006ly.a(abstractRunnableC3970lb0B);
                            }
                        }
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f.b();
            this.e.b();
            while (true) {
                if (c4339pk != null) {
                    abstractRunnableC3970lb0A = c4339pk.a(true);
                    if (abstractRunnableC3970lb0A == null) {
                        abstractRunnableC3970lb0A = (AbstractRunnableC3970lb0) this.e.d();
                        if (abstractRunnableC3970lb0A == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC3970lb0A = (AbstractRunnableC3970lb0) this.e.d();
                    if (abstractRunnableC3970lb0A == null && (abstractRunnableC3970lb0A = (AbstractRunnableC3970lb0) this.f.d()) == null) {
                        break;
                    }
                }
                try {
                    abstractRunnableC3970lb0A.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c4339pk != null) {
                c4339pk.h(5);
            }
            h.set(this, 0L);
            i.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        k(this, runnable, false, 6);
    }

    public final int h() {
        synchronized (this.g) {
            try {
                if (j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = i;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f4897a) {
                    return 0;
                }
                if (i2 >= this.b) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.g.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                C4339pk c4339pk = new C4339pk(this, i4);
                this.g.c(i4, c4339pk);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i5 = i3 + 1;
                c4339pk.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(Runnable runnable, Qm0 qm0, boolean z) {
        AbstractRunnableC3970lb0 c4058mb0;
        int i2;
        AbstractC4585sb0.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC3970lb0) {
            c4058mb0 = (AbstractRunnableC3970lb0) runnable;
            c4058mb0.f4652a = jNanoTime;
            c4058mb0.b = qm0;
        } else {
            c4058mb0 = new C4058mb0(runnable, jNanoTime, qm0);
        }
        boolean z2 = false;
        boolean z3 = c4058mb0.b.f3624a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C4339pk c4339pk = threadCurrentThread instanceof C4339pk ? (C4339pk) threadCurrentThread : null;
        if (c4339pk == null || !AbstractC2995aW.i(c4339pk.h, this)) {
            c4339pk = null;
        }
        if (c4339pk != null && (i2 = c4339pk.c) != 5 && (c4058mb0.b.f3624a != 0 || i2 != 2)) {
            c4339pk.g = true;
            C3378em0 c3378em0 = c4339pk.f4846a;
            if (z) {
                c4058mb0 = c3378em0.a(c4058mb0);
            } else {
                c3378em0.getClass();
                AbstractRunnableC3970lb0 abstractRunnableC3970lb0 = (AbstractRunnableC3970lb0) C3378em0.b.getAndSet(c3378em0, c4058mb0);
                c4058mb0 = abstractRunnableC3970lb0 == null ? null : c3378em0.a(abstractRunnableC3970lb0);
            }
        }
        if (c4058mb0 != null) {
            if (!(c4058mb0.b.f3624a == 1 ? this.f.a(c4058mb0) : this.e.a(c4058mb0))) {
                throw new RejectedExecutionException(DM.m(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z && c4339pk != null) {
            z2 = true;
        }
        if (z3) {
            if (z2 || o() || n(jAddAndGet)) {
                return;
            }
            o();
            return;
        }
        if (z2 || o() || n(atomicLongFieldUpdater.get(this))) {
            return;
        }
        o();
    }

    public final void m(C4339pk c4339pk, int i2, int i3) {
        while (true) {
            long j2 = h.get(this);
            int iB = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (iB == i2) {
                if (i3 == 0) {
                    Object objC = c4339pk.c();
                    while (true) {
                        if (objC == k) {
                            iB = -1;
                            break;
                        }
                        if (objC == null) {
                            iB = 0;
                            break;
                        }
                        C4339pk c4339pk2 = (C4339pk) objC;
                        iB = c4339pk2.b();
                        if (iB != 0) {
                            break;
                        } else {
                            objC = c4339pk2.c();
                        }
                    }
                } else {
                    iB = i3;
                }
            }
            if (iB >= 0) {
                if (h.compareAndSet(this, j2, j3 | ((long) iB))) {
                    return;
                }
            }
        }
    }

    public final boolean n(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f4897a;
        if (i2 < i3) {
            int iH = h();
            if (iH == 1 && i3 > 1) {
                h();
            }
            if (iH > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        SE se;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long j2 = atomicLongFieldUpdater.get(this);
            C4339pk c4339pk = (C4339pk) this.g.b((int) (2097151 & j2));
            if (c4339pk == null) {
                c4339pk = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object objC = c4339pk.c();
                while (true) {
                    se = k;
                    if (objC == se) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    C4339pk c4339pk2 = (C4339pk) objC;
                    iB = c4339pk2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = c4339pk2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j2, j3 | ((long) iB))) {
                    c4339pk.g(se);
                }
            }
            if (c4339pk == null) {
                return false;
            }
            if (C4339pk.i.compareAndSet(c4339pk, -1, 0)) {
                LockSupport.unpark(c4339pk);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C3528gZ c3528gZ = this.g;
        int iA = c3528gZ.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < iA; i7++) {
            C4339pk c4339pk = (C4339pk) c3528gZ.b(i7);
            if (c4339pk != null) {
                C3378em0 c3378em0 = c4339pk.f4846a;
                c3378em0.getClass();
                int i8 = C3378em0.b.get(c3378em0) != null ? (C3378em0.c.get(c3378em0) - C3378em0.d.get(c3378em0)) + 1 : C3378em0.c.get(c3378em0) - C3378em0.d.get(c3378em0);
                int iD = DM.D(c4339pk.c);
                if (iD == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iD == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i8);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iD == 2) {
                    i4++;
                } else if (iD == 3) {
                    i5++;
                    if (i8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iD == 4) {
                    i6++;
                }
            }
        }
        long j2 = i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(AbstractC2340Cl.x(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.f4897a;
        sb4.append(i9);
        sb4.append(", max = ");
        AbstractC3888ke0.t(sb4, this.b, "}, Worker States {CPU = ", i2, ", blocking = ");
        AbstractC3888ke0.t(sb4, i3, ", parked = ", i4, ", dormant = ");
        AbstractC3888ke0.t(sb4, i5, ", terminated = ", i6, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
