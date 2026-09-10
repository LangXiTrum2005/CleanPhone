package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4339pk extends Thread {
    public static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(C4339pk.class, "workerCtl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3378em0 f4846a;
    public final C3086bY b;
    public int c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final /* synthetic */ ExecutorC4427qk h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public C4339pk(ExecutorC4427qk executorC4427qk, int i2) {
        this.h = executorC4427qk;
        setDaemon(true);
        this.f4846a = new C3378em0();
        this.b = new C3086bY();
        this.c = 4;
        this.nextParkedWorker = ExecutorC4427qk.k;
        AbstractC3173cX.f4226a.getClass();
        this.f = AbstractC3173cX.b.b();
        f(i2);
    }

    public final AbstractRunnableC3970lb0 a(boolean z) {
        AbstractRunnableC3970lb0 abstractRunnableC3970lb0E;
        AbstractRunnableC3970lb0 abstractRunnableC3970lb0E2;
        ExecutorC4427qk executorC4427qk;
        long j;
        int i2 = this.c;
        AbstractRunnableC3970lb0 abstractRunnableC3970lb0 = null;
        C3378em0 c3378em0 = this.f4846a;
        ExecutorC4427qk executorC4427qk2 = this.h;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC4427qk.i;
            do {
                executorC4427qk = this.h;
                j = atomicLongFieldUpdater.get(executorC4427qk);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    c3378em0.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3378em0.b;
                        AbstractRunnableC3970lb0 abstractRunnableC3970lb1 = (AbstractRunnableC3970lb0) atomicReferenceFieldUpdater.get(c3378em0);
                        if (abstractRunnableC3970lb1 == null || abstractRunnableC3970lb1.b.f3624a != 1) {
                            int i3 = C3378em0.d.get(c3378em0);
                            int i4 = C3378em0.c.get(c3378em0);
                            while (i3 != i4 && C3378em0.e.get(c3378em0) != 0) {
                                i4--;
                                AbstractRunnableC3970lb0 abstractRunnableC3970lb0C = c3378em0.c(i4, true);
                                if (abstractRunnableC3970lb0C != null) {
                                    abstractRunnableC3970lb0 = abstractRunnableC3970lb0C;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(c3378em0, abstractRunnableC3970lb1, null)) {
                                abstractRunnableC3970lb0 = abstractRunnableC3970lb1;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(c3378em0) == abstractRunnableC3970lb1);
                    }
                    if (abstractRunnableC3970lb0 != null) {
                        return abstractRunnableC3970lb0;
                    }
                    AbstractRunnableC3970lb0 abstractRunnableC3970lb2 = (AbstractRunnableC3970lb0) executorC4427qk2.f.d();
                    return abstractRunnableC3970lb2 == null ? i(1) : abstractRunnableC3970lb2;
                }
            } while (!ExecutorC4427qk.i.compareAndSet(executorC4427qk, j, j - 4398046511104L));
            this.c = 1;
        }
        if (z) {
            boolean z2 = d(executorC4427qk2.f4897a * 2) == 0;
            if (z2 && (abstractRunnableC3970lb0E2 = e()) != null) {
                return abstractRunnableC3970lb0E2;
            }
            c3378em0.getClass();
            AbstractRunnableC3970lb0 abstractRunnableC3970lb0B = (AbstractRunnableC3970lb0) C3378em0.b.getAndSet(c3378em0, null);
            if (abstractRunnableC3970lb0B == null) {
                abstractRunnableC3970lb0B = c3378em0.b();
            }
            if (abstractRunnableC3970lb0B != null) {
                return abstractRunnableC3970lb0B;
            }
            if (!z2 && (abstractRunnableC3970lb0E = e()) != null) {
                return abstractRunnableC3970lb0E;
            }
        } else {
            AbstractRunnableC3970lb0 abstractRunnableC3970lb0E3 = e();
            if (abstractRunnableC3970lb0E3 != null) {
                return abstractRunnableC3970lb0E3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final AbstractRunnableC3970lb0 e() {
        int iD = d(2);
        ExecutorC4427qk executorC4427qk = this.h;
        if (iD == 0) {
            AbstractRunnableC3970lb0 abstractRunnableC3970lb0 = (AbstractRunnableC3970lb0) executorC4427qk.e.d();
            return abstractRunnableC3970lb0 != null ? abstractRunnableC3970lb0 : (AbstractRunnableC3970lb0) executorC4427qk.f.d();
        }
        AbstractRunnableC3970lb0 abstractRunnableC3970lb1 = (AbstractRunnableC3970lb0) executorC4427qk.f.d();
        return abstractRunnableC3970lb1 != null ? abstractRunnableC3970lb1 : (AbstractRunnableC3970lb0) executorC4427qk.e.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.c;
        boolean z = i3 == 1;
        if (z) {
            ExecutorC4427qk.i.addAndGet(this.h, 4398046511104L);
        }
        if (i3 != i2) {
            this.c = i2;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00df A[SYNTHETIC] */
    public final AbstractRunnableC3970lb0 i(int i2) {
        int i3;
        AbstractRunnableC3970lb0 abstractRunnableC3970lb0C;
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC4427qk.i;
        ExecutorC4427qk executorC4427qk = this.h;
        int i4 = (int) (atomicLongFieldUpdater.get(executorC4427qk) & 2097151);
        AbstractRunnableC3970lb0 abstractRunnableC3970lb0 = null;
        if (i4 < 2) {
            return null;
        }
        int iD = d(i4);
        int i5 = 0;
        long jMin = Long.MAX_VALUE;
        while (i5 < i4) {
            int i6 = iD + 1;
            if (i6 > i4) {
                i6 = 1;
            }
            C4339pk c4339pk = (C4339pk) executorC4427qk.g.b(i6);
            if (c4339pk == null || c4339pk == this) {
                i3 = i6;
            } else {
                C3378em0 c3378em0 = c4339pk.f4846a;
                if (i2 != 3) {
                    c3378em0.getClass();
                    int i7 = C3378em0.d.get(c3378em0);
                    int i8 = C3378em0.c.get(c3378em0);
                    boolean z = i2 == 1;
                    while (true) {
                        if (i7 != i8 && (!z || C3378em0.e.get(c3378em0) != 0)) {
                            int i9 = i7 + 1;
                            abstractRunnableC3970lb0C = c3378em0.c(i7, z);
                            if (abstractRunnableC3970lb0C != null) {
                                break;
                            }
                            i7 = i9;
                        } else {
                            abstractRunnableC3970lb0C = abstractRunnableC3970lb0;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC3970lb0C = c3378em0.b();
                }
                C3086bY c3086bY = this.b;
                if (abstractRunnableC3970lb0C != null) {
                    c3086bY.f4172a = abstractRunnableC3970lb0C;
                    i3 = i6;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3378em0.b;
                        AbstractRunnableC3970lb0 abstractRunnableC3970lb1 = (AbstractRunnableC3970lb0) atomicReferenceFieldUpdater.get(c3378em0);
                        if (abstractRunnableC3970lb1 != null) {
                            if (((abstractRunnableC3970lb1.b.f3624a == 1 ? 1 : 2) & i2) != 0) {
                                AbstractC4585sb0.f.getClass();
                                i3 = i6;
                                long jNanoTime = System.nanoTime() - abstractRunnableC3970lb1.f4652a;
                                long j2 = AbstractC4585sb0.b;
                                if (jNanoTime < j2) {
                                    j = j2 - jNanoTime;
                                    abstractRunnableC3970lb0 = null;
                                    break;
                                }
                                while (true) {
                                    abstractRunnableC3970lb0 = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(c3378em0, abstractRunnableC3970lb1, null)) {
                                        c3086bY.f4172a = abstractRunnableC3970lb1;
                                    } else if (atomicReferenceFieldUpdater.get(c3378em0) != abstractRunnableC3970lb1) {
                                        i6 = i3;
                                        abstractRunnableC3970lb0 = null;
                                    }
                                }
                            }
                        }
                        i3 = i6;
                        j = -2;
                        break;
                    }
                    if (j == -1) {
                        AbstractRunnableC3970lb0 abstractRunnableC3970lb2 = (AbstractRunnableC3970lb0) c3086bY.f4172a;
                        c3086bY.f4172a = abstractRunnableC3970lb0;
                        return abstractRunnableC3970lb2;
                    }
                    if (j > 0) {
                        jMin = Math.min(jMin, j);
                    }
                }
                j = -1;
                if (j == -1) {
                    AbstractRunnableC3970lb0 abstractRunnableC3970lb3 = (AbstractRunnableC3970lb0) c3086bY.f4172a;
                    c3086bY.f4172a = abstractRunnableC3970lb0;
                    return abstractRunnableC3970lb3;
                }
                if (j > 0) {
                    jMin = Math.min(jMin, j);
                }
            }
            i5++;
            iD = i3;
            abstractRunnableC3970lb0 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        int i2;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                ExecutorC4427qk executorC4427qk = this.h;
                executorC4427qk.getClass();
                int i3 = 5;
                if (ExecutorC4427qk.j.get(executorC4427qk) != 0 || this.c == 5) {
                    break loop0;
                }
                AbstractRunnableC3970lb0 abstractRunnableC3970lb0A = a(this.g);
                int i4 = 3;
                if (abstractRunnableC3970lb0A == null) {
                    this.g = false;
                    if (this.e == 0) {
                        Object obj = this.nextParkedWorker;
                        SE se = ExecutorC4427qk.k;
                        if (obj != se) {
                            i.set(this, -1);
                            while (this.nextParkedWorker != ExecutorC4427qk.k) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                ExecutorC4427qk executorC4427qk2 = this.h;
                                executorC4427qk2.getClass();
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC4427qk.j;
                                if (atomicIntegerFieldUpdater2.get(executorC4427qk2) != 0 || this.c == i3) {
                                    break;
                                }
                                h(i4);
                                Thread.interrupted();
                                if (this.d == 0) {
                                    this.d = System.nanoTime() + this.h.c;
                                }
                                LockSupport.parkNanos(this.h.c);
                                if (System.nanoTime() - this.d >= 0) {
                                    this.d = 0L;
                                    ExecutorC4427qk executorC4427qk3 = this.h;
                                    synchronized (executorC4427qk3.g) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(executorC4427qk3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC4427qk.i;
                                                if (((int) (atomicLongFieldUpdater2.get(executorC4427qk3) & 2097151)) > executorC4427qk3.f4897a) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i5 = this.indexInArray;
                                                        f(0);
                                                        executorC4427qk3.m(this, i5, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(executorC4427qk3) & 2097151);
                                                        if (andDecrement != i5) {
                                                            Object objB = executorC4427qk3.g.b(andDecrement);
                                                            AbstractC2995aW.n(objB);
                                                            C4339pk c4339pk = (C4339pk) objB;
                                                            executorC4427qk3.g.c(i5, c4339pk);
                                                            c4339pk.f(i5);
                                                            executorC4427qk3.m(c4339pk, andDecrement, i5);
                                                        }
                                                        executorC4427qk3.g.c(andDecrement, null);
                                                        this.c = 5;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                i3 = 5;
                                i4 = 3;
                            }
                        } else {
                            ExecutorC4427qk executorC4427qk4 = this.h;
                            executorC4427qk4.getClass();
                            if (this.nextParkedWorker == se) {
                                do {
                                    atomicLongFieldUpdater = ExecutorC4427qk.h;
                                    j = atomicLongFieldUpdater.get(executorC4427qk4);
                                    i2 = this.indexInArray;
                                    this.nextParkedWorker = executorC4427qk4.g.b((int) (j & 2097151));
                                } while (!atomicLongFieldUpdater.compareAndSet(executorC4427qk4, j, ((j + 2097152) & (-2097152)) | ((long) i2)));
                            }
                        }
                    } else {
                        if (z) {
                            h(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.e);
                            this.e = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    this.e = 0L;
                    int i6 = abstractRunnableC3970lb0A.b.f3624a;
                    this.d = 0L;
                    if (this.c == 3) {
                        this.c = 2;
                    }
                    ExecutorC4427qk executorC4427qk5 = this.h;
                    if (i6 != 0 && h(2) && !executorC4427qk5.o() && !executorC4427qk5.n(ExecutorC4427qk.i.get(executorC4427qk5))) {
                        executorC4427qk5.o();
                    }
                    executorC4427qk5.getClass();
                    try {
                        abstractRunnableC3970lb0A.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread = Thread.currentThread();
                        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                    }
                    if (i6 != 0) {
                        ExecutorC4427qk.i.addAndGet(executorC4427qk5, -2097152L);
                        if (this.c == 5) {
                            break;
                        }
                        this.c = 4;
                        break;
                    }
                    break;
                }
            }
        }
        h(5);
    }
}
