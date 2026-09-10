package cn;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w0 extends x0 implements i0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6780f = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6781g = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6782h = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    public void A(Runnable runnable) {
        B();
        if (!C(runnable)) {
            e0.f6703i.A(runnable);
            return;
        }
        Thread threadV = v();
        if (Thread.currentThread() != threadV) {
            LockSupport.unpark(threadV);
        }
    }

    public final void B() {
        u0 u0VarB;
        v0 v0Var = (v0) f6781g.get(this);
        if (v0Var == null || hn.w.f42460b.get(v0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (v0Var) {
                try {
                    u0[] u0VarArr = v0Var.f42461a;
                    u0VarB = null;
                    u0 u0Var = u0VarArr != null ? u0VarArr[0] : null;
                    if (u0Var != null) {
                        if (jNanoTime - u0Var.f6772a >= 0 ? C(u0Var) : false) {
                            u0VarB = v0Var.b(0);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (u0VarB != null);
    }

    public final boolean C(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6780f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f6782h.get(this) == 1) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof hn.n)) {
                if (obj == d0.f6690c) {
                    return false;
                }
                hn.n nVar = new hn.n(8, true);
                nVar.a((Runnable) obj);
                nVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            hn.n nVar2 = (hn.n) obj;
            int iA = nVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                hn.n nVarC = nVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    public final boolean D() {
        Object obj;
        long j10;
        xj.j jVar = this.f6787d;
        if (jVar != null ? jVar.isEmpty() : true) {
            v0 v0Var = (v0) f6781g.get(this);
            if (v0Var == null) {
                obj = f6780f.get(this);
                if (obj != null) {
                    if (obj instanceof hn.n) {
                        j10 = hn.n.f42445f.get((hn.n) obj);
                        if (((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == d0.f6690c) {
                    }
                }
                return true;
            }
            if (hn.w.f42460b.get(v0Var) == 0) {
                obj = f6780f.get(this);
                if (obj != null) {
                    if (obj instanceof hn.n) {
                        j10 = hn.n.f42445f.get((hn.n) obj);
                        if (((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == d0.f6690c) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void E(long j10, u0 u0Var) {
        int iB;
        Thread threadV;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6781g;
        u0 u0Var2 = null;
        if (f6782h.get(this) == 1) {
            iB = 1;
        } else {
            v0 v0Var = (v0) atomicReferenceFieldUpdater.get(this);
            if (v0Var == null) {
                v0 v0Var2 = new v0();
                v0Var2.f6777c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, v0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.n.c(obj);
                v0Var = (v0) obj;
            }
            iB = u0Var.b(j10, v0Var, this);
        }
        if (iB != 0) {
            if (iB == 1) {
                z(j10, u0Var);
                return;
            } else {
                if (iB != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        v0 v0Var3 = (v0) atomicReferenceFieldUpdater.get(this);
        if (v0Var3 != null) {
            synchronized (v0Var3) {
                u0[] u0VarArr = v0Var3.f42461a;
                u0Var2 = u0VarArr != null ? u0VarArr[0] : null;
            }
        }
        if (u0Var2 != u0Var || Thread.currentThread() == (threadV = v())) {
            return;
        }
        LockSupport.unpark(threadV);
    }

    @Override // cn.i0
    public final void c(long j10, l lVar) {
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10;
        }
        if (j11 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            s0 s0Var = new s0(this, j11 + jNanoTime, lVar);
            E(jNanoTime, s0Var);
            lVar.w(new h(s0Var, 2));
        }
    }

    @Override // cn.w
    public final void p(ak.k kVar, Runnable runnable) {
        A(runnable);
    }

    @Override // cn.x0
    public void shutdown() {
        u0 u0VarB;
        b2.f6678a.set(null);
        f6782h.set(this, 1);
        hn.u uVar = d0.f6690c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6780f;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, uVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof hn.n) {
                ((hn.n) obj).b();
                break;
            } else {
                if (obj == uVar) {
                    break;
                }
                hn.n nVar = new hn.n(8, true);
                nVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (x() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            v0 v0Var = (v0) f6781g.get(this);
            if (v0Var == null) {
                return;
            }
            synchronized (v0Var) {
                u0VarB = hn.w.f42460b.get(v0Var) > 0 ? v0Var.b(0) : null;
            }
            if (u0VarB == null) {
                return;
            } else {
                z(jNanoTime, u0VarB);
            }
        }
    }

    @Override // cn.x0
    public final long x() {
        Runnable runnable;
        u0 u0Var;
        hn.u uVar = d0.f6690c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6780f;
        if (!y()) {
            B();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof hn.n) {
                        hn.n nVar = (hn.n) obj;
                        Object objD = nVar.d();
                        if (objD != hn.n.f42446g) {
                            runnable = (Runnable) objD;
                            break;
                        }
                        hn.n nVarC = nVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != uVar) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                runnable = (Runnable) obj;
                                break loop0;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            xj.j jVar = this.f6787d;
            if (((jVar == null || jVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof hn.n) {
                        long j10 = hn.n.f42445f.get((hn.n) obj2);
                        if (((int) (1073741823 & j10)) != ((int) ((j10 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == uVar) {
                        return Long.MAX_VALUE;
                    }
                }
                v0 v0Var = (v0) f6781g.get(this);
                if (v0Var != null) {
                    synchronized (v0Var) {
                        u0[] u0VarArr = v0Var.f42461a;
                        u0Var = u0VarArr != null ? u0VarArr[0] : null;
                    }
                    if (u0Var != null) {
                        long jNanoTime = u0Var.f6772a - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }
}
