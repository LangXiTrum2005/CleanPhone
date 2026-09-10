package jn;

import cn.d0;
import com.ironsource.Xa;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import hn.q;
import hn.u;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Executor, Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f44006h = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f44007i = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f44008j = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u f44009k = new u("NOT_IN_STACK", 0);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f44012c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f44014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f44015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f44016g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i10, int i11, String str, long j10) {
        this.f44010a = i10;
        this.f44011b = i11;
        this.f44012c = j10;
        this.f44013d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(defpackage.e.h(i10, "Core pool size ", " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(defpackage.e.g(i11, i10, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(defpackage.e.h(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(defpackage.e.j(j10, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.f44014e = new f();
        this.f44015f = new f();
        this.f44016g = new q((i10 + 1) * 2);
        this.controlState$volatile = ((long) i10) << 42;
    }

    public static /* synthetic */ void j(c cVar, Runnable runnable, int i10) {
        cVar.h(runnable, false, (i10 & 4) == 0);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i10;
        i iVarA;
        if (f44008j.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !n.a(aVar.f43999h, this)) {
                aVar = null;
            }
            synchronized (this.f44016g) {
                i10 = (int) (f44007i.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object objB = this.f44016g.b(i11);
                    n.c(objB);
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(Xa.f27908s);
                        }
                        m mVar = aVar2.f43992a;
                        f fVar = this.f44015f;
                        mVar.getClass();
                        i iVar = (i) m.f44032b.getAndSet(mVar, null);
                        if (iVar != null) {
                            fVar.a(iVar);
                        }
                        while (true) {
                            i iVarB = mVar.b();
                            if (iVarB == null) {
                                break;
                            } else {
                                fVar.a(iVarB);
                            }
                        }
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f44015f.b();
            this.f44014e.b();
            while (true) {
                if (aVar != null) {
                    iVarA = aVar.a(true);
                    if (iVarA == null) {
                        iVarA = (i) this.f44014e.d();
                        if (iVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    iVarA = (i) this.f44014e.d();
                    if (iVarA == null && (iVarA = (i) this.f44015f.d()) == null) {
                        break;
                    }
                }
                try {
                    iVarA.run();
                } catch (Throwable th2) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                }
            }
            if (aVar != null) {
                aVar.h(b.f44004e);
            }
            f44006h.set(this, 0L);
            f44007i.set(this, 0L);
        }
    }

    public final int d() {
        synchronized (this.f44016g) {
            try {
                if (f44008j.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f44007i;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f44010a) {
                    return 0;
                }
                if (i10 >= this.f44011b) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f44016g.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i12);
                this.f44016g.c(i12, aVar);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = i11 + 1;
                aVar.start();
                return i13;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        j(this, runnable, 6);
    }

    public final void h(Runnable runnable, boolean z10, boolean z11) {
        i jVar;
        b bVar;
        k.f44030f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f44022a = jNanoTime;
            jVar.f44023b = z10;
        } else {
            jVar = new j(jNanoTime, runnable, z10);
        }
        boolean z12 = jVar.f44023b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f44007i;
        long jAddAndGet = z12 ? atomicLongFieldUpdater.addAndGet(this, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !n.a(aVar.f43999h, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f43994c) != b.f44004e && (jVar.f44023b || bVar != b.f44001b)) {
            aVar.f43998g = true;
            m mVar = aVar.f43992a;
            if (z11) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f44032b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f44023b ? this.f44015f.a(jVar) : this.f44014e.a(jVar))) {
                throw new RejectedExecutionException(defpackage.e.q(this.f44013d, " was terminated", new StringBuilder()));
            }
        }
        if (z12) {
            if (o() || n(jAddAndGet)) {
                return;
            }
            o();
            return;
        }
        if (o() || n(atomicLongFieldUpdater.get(this))) {
            return;
        }
        o();
    }

    public final void k(a aVar, int i10, int i11) {
        while (true) {
            long j10 = f44006h.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j10) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f44009k) {
                            i12 = -1;
                            break;
                        }
                        if (objC == null) {
                            i12 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i12 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                c cVar = this;
                if (f44006h.compareAndSet(cVar, j10, ((long) i12) | j11)) {
                    return;
                } else {
                    this = cVar;
                }
            }
        }
    }

    public final boolean n(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f44010a;
        if (i10 < i11) {
            int iD = d();
            if (iD == 1 && i11 > 1) {
                d();
            }
            if (iD > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        c cVar;
        u uVar;
        int iB;
        while (true) {
            long j10 = f44006h.get(this);
            a aVar = (a) this.f44016g.b((int) (2097151 & j10));
            if (aVar == null) {
                aVar = null;
                cVar = this;
            } else {
                long j11 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + j10) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    uVar = f44009k;
                    if (objC == uVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                    j10 = j10;
                }
                if (iB >= 0) {
                    c cVar2 = this;
                    boolean zCompareAndSet = f44006h.compareAndSet(cVar2, j10, ((long) iB) | j11);
                    cVar = cVar2;
                    if (zCompareAndSet) {
                        aVar.g(uVar);
                    }
                    this = cVar;
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f43991i.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
            this = cVar;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        q qVar = this.f44016g;
        int iA = qVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            a aVar = (a) qVar.b(i15);
            if (aVar != null) {
                m mVar = aVar.f43992a;
                mVar.getClass();
                int i16 = m.f44032b.get(mVar) != null ? (m.f44033c.get(mVar) - m.f44034d.get(mVar)) + 1 : m.f44033c.get(mVar) - m.f44034d.get(mVar);
                int iOrdinal = aVar.f43994c.ordinal();
                if (iOrdinal == 0) {
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 1) {
                    i11++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iOrdinal == 2) {
                    i12++;
                } else if (iOrdinal == 3) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new aa.b((byte) 0, 20);
                    }
                    i14++;
                }
            }
        }
        long j10 = f44007i.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f44013d);
        sb5.append('@');
        sb5.append(d0.q(this));
        sb5.append("[Pool Size {core = ");
        int i17 = this.f44010a;
        sb5.append(i17);
        sb5.append(", max = ");
        l1.d.o(sb5, this.f44011b, "}, Worker States {CPU = ", i10, ", blocking = ");
        l1.d.o(sb5, i11, ", parked = ", i12, ", dormant = ");
        l1.d.o(sb5, i13, ", terminated = ", i14, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f44014e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f44015f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j10));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j10) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i17 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
