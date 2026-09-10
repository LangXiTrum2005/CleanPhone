package jn;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import hn.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43991i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f43992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f43993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f43994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f43995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f43996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f43998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f43999h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i10) {
        this.f43999h = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f43992a = new m();
        this.f43993b = new c0();
        this.f43994c = b.f44003d;
        this.nextParkedWorker = c.f44009k;
        int iNanoTime = (int) System.nanoTime();
        this.f43997f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i10);
    }

    public final i a(boolean z10) {
        i iVarE;
        i iVarE2;
        long j10;
        b bVar = this.f43994c;
        c cVar = this.f43999h;
        i iVar = null;
        m mVar = this.f43992a;
        b bVar2 = b.f44000a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f44007i;
            do {
                j10 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f44032b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || !iVar2.f44023b) {
                            int i10 = m.f44034d.get(mVar);
                            int i11 = m.f44033c.get(mVar);
                            while (i10 != i11 && m.f44035e.get(mVar) != 0) {
                                i11--;
                                i iVarC = mVar.c(i11, true);
                                if (iVarC != null) {
                                    iVar = iVarC;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                iVar = iVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == iVar2);
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.f44015f.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f44007i.compareAndSet(cVar, j10, j10 - 4398046511104L));
            this.f43994c = bVar2;
        }
        if (z10) {
            boolean z11 = d(cVar.f44010a * 2) == 0;
            if (z11 && (iVarE2 = e()) != null) {
                return iVarE2;
            }
            mVar.getClass();
            i iVarB = (i) m.f44032b.getAndSet(mVar, null);
            if (iVarB == null) {
                iVarB = mVar.b();
            }
            if (iVarB != null) {
                return iVarB;
            }
            if (!z11 && (iVarE = e()) != null) {
                return iVarE;
            }
        } else {
            i iVarE3 = e();
            if (iVarE3 != null) {
                return iVarE3;
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

    public final int d(int i10) {
        int i11 = this.f43997f;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f43997f = i14;
        int i15 = i10 - 1;
        return (i15 & i10) == 0 ? i15 & i14 : (Integer.MAX_VALUE & i14) % i10;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.f43999h;
        if (iD == 0) {
            i iVar = (i) cVar.f44014e.d();
            return iVar != null ? iVar : (i) cVar.f44015f.d();
        }
        i iVar2 = (i) cVar.f44015f.d();
        return iVar2 != null ? iVar2 : (i) cVar.f44014e.d();
    }

    public final void f(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f43999h.f44013d);
        sb2.append("-worker-");
        sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
        setName(sb2.toString());
        this.indexInArray = i10;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f43994c;
        boolean z10 = bVar2 == b.f44000a;
        if (z10) {
            c.f44007i.addAndGet(this.f43999h, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f43994c = bVar;
        }
        return z10;
    }

    public final i i(int i10) {
        long j10;
        i iVarB;
        long j11;
        long j12;
        i iVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f44007i;
        c cVar = this.f43999h;
        int i11 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar2 = null;
        if (i11 < 2) {
            return null;
        }
        int iD = d(i11);
        int i12 = 0;
        long jMin = Long.MAX_VALUE;
        while (i12 < i11) {
            iD++;
            if (iD > i11) {
                iD = 1;
            }
            a aVar = (a) cVar.f44016g.b(iD);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f43992a;
                mVar.getClass();
                if (i10 != 3) {
                    boolean z10 = i10 == 1;
                    int i13 = m.f44034d.get(mVar);
                    int i14 = m.f44033c.get(mVar);
                    while (true) {
                        if (i13 != i14) {
                            j10 = 0;
                            if (!z10 || m.f44035e.get(mVar) != 0) {
                                int i15 = i13 + 1;
                                i iVarC = mVar.c(i13, z10);
                                if (iVarC != null) {
                                    iVarB = iVarC;
                                    break;
                                }
                                i13 = i15;
                            }
                        } else {
                            j10 = 0;
                        }
                        iVarB = iVar2;
                        break;
                    }
                } else {
                    iVarB = mVar.b();
                    j10 = 0;
                }
                c0 c0Var = this.f43993b;
                if (iVarB == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f44032b;
                        i iVar3 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar3 == null) {
                            j11 = -1;
                        } else {
                            j11 = -1;
                            if (((iVar3.f44023b ? 1 : 2) & i10) != 0) {
                                k.f44030f.getClass();
                                m mVar2 = mVar;
                                long jNanoTime = System.nanoTime() - iVar3.f44022a;
                                long j13 = k.f44026b;
                                if (jNanoTime < j13) {
                                    j12 = j13 - jNanoTime;
                                    iVar = null;
                                    break;
                                }
                                do {
                                    iVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar3, null)) {
                                        c0Var.f44760a = iVar3;
                                        j12 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(mVar2) == iVar3);
                                mVar = mVar2;
                                iVar2 = null;
                            }
                        }
                        j12 = -2;
                        iVar = iVar2;
                        break;
                    }
                } else {
                    c0Var.f44760a = iVarB;
                    iVar = iVar2;
                    j12 = -1;
                    j11 = -1;
                }
                if (j12 == j11) {
                    i iVar4 = (i) c0Var.f44760a;
                    c0Var.f44760a = iVar;
                    return iVar4;
                }
                if (j12 > j10) {
                    jMin = Math.min(jMin, j12);
                }
            }
            i12++;
            iVar2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f43996e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j10;
        loop0: while (true) {
            boolean z10 = false;
            while (true) {
                if (c.f44008j.get(this.f43999h) != 1) {
                    b bVar = this.f43994c;
                    b bVar2 = b.f44004e;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i iVarA = a(this.f43998g);
                    if (iVarA != null) {
                        this.f43996e = 0L;
                        c cVar = this.f43999h;
                        this.f43995d = 0L;
                        if (this.f43994c == b.f44002c) {
                            this.f43994c = b.f44001b;
                        }
                        if (!iVarA.f44023b) {
                            try {
                                iVarA.run();
                                break;
                            } catch (Throwable th2) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                                break;
                            }
                        }
                        if (h(b.f44001b) && !cVar.o() && !cVar.n(c.f44007i.get(cVar))) {
                            cVar.o();
                        }
                        try {
                            iVarA.run();
                        } catch (Throwable th3) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
                        }
                        c.f44007i.addAndGet(cVar, -2097152L);
                        if (this.f43994c == bVar2) {
                            break;
                        }
                        this.f43994c = b.f44003d;
                        break;
                    }
                    this.f43998g = false;
                    if (this.f43996e == 0) {
                        Object obj = this.nextParkedWorker;
                        u uVar = c.f44009k;
                        if (obj != uVar) {
                            f43991i.set(this, -1);
                            while (this.nextParkedWorker != c.f44009k) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f43991i;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                c cVar2 = this.f43999h;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f44008j;
                                if (atomicIntegerFieldUpdater2.get(cVar2) == 1) {
                                    break;
                                }
                                b bVar3 = this.f43994c;
                                b bVar4 = b.f44004e;
                                if (bVar3 == bVar4) {
                                    break;
                                }
                                h(b.f44002c);
                                Thread.interrupted();
                                if (this.f43995d == 0) {
                                    j10 = 2097151;
                                    this.f43995d = System.nanoTime() + this.f43999h.f44012c;
                                } else {
                                    j10 = 2097151;
                                }
                                LockSupport.parkNanos(this.f43999h.f44012c);
                                if (System.nanoTime() - this.f43995d >= 0) {
                                    this.f43995d = 0L;
                                    c cVar3 = this.f43999h;
                                    synchronized (cVar3.f44016g) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(cVar3) == 1)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = c.f44007i;
                                                if (((int) (atomicLongFieldUpdater.get(cVar3) & j10)) > cVar3.f44010a && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                    int i10 = this.indexInArray;
                                                    f(0);
                                                    cVar3.k(this, i10, 0);
                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j10);
                                                    if (andDecrement != i10) {
                                                        Object objB = cVar3.f44016g.b(andDecrement);
                                                        n.c(objB);
                                                        a aVar = (a) objB;
                                                        cVar3.f44016g.c(i10, aVar);
                                                        aVar.f(i10);
                                                        cVar3.k(aVar, andDecrement, i10);
                                                    }
                                                    cVar3.f44016g.c(andDecrement, null);
                                                    this.f43994c = bVar4;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar4 = this.f43999h;
                            if (this.nextParkedWorker == uVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f44006h;
                                while (true) {
                                    long j11 = atomicLongFieldUpdater2.get(cVar4);
                                    long j12 = (j11 + CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) & (-2097152);
                                    int i11 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.f44016g.b((int) (j11 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.f44006h.compareAndSet(cVar5, j11, j12 | ((long) i11))) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z10) {
                            h(b.f44002c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f43996e);
                            this.f43996e = 0L;
                            break;
                        }
                        z10 = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f44004e);
    }
}
