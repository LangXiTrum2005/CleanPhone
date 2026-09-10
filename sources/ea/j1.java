package ea;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends t1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicLong f39498k = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i1 f39499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i1 f39500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f39501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f39502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g1 f39503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g1 f39504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f39505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Semaphore f39506j;

    public j1(m1 m1Var) {
        super(m1Var);
        this.f39505i = new Object();
        this.f39506j = new Semaphore(2);
        this.f39501e = new PriorityBlockingQueue();
        this.f39502f = new LinkedBlockingQueue();
        this.f39503g = new g1(this, "Thread death: Uncaught exception on worker thread");
        this.f39504h = new g1(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // al.b
    public final void G0() {
        if (Thread.currentThread() != this.f39499c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // ea.t1
    public final boolean H0() {
        return false;
    }

    public final void K0() {
        if (Thread.currentThread() != this.f39500d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void L0() {
        if (Thread.currentThread() == this.f39499c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean M0() {
        return Thread.currentThread() == this.f39499c;
    }

    public final h1 N0(Callable callable) {
        I0();
        h1 h1Var = new h1(this, callable, false);
        if (Thread.currentThread() != this.f39499c) {
            T0(h1Var);
            return h1Var;
        }
        if (!this.f39501e.isEmpty()) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39756i.b("Callable skipped the worker queue.");
        }
        h1Var.run();
        return h1Var;
    }

    public final h1 O0(Callable callable) {
        I0();
        h1 h1Var = new h1(this, callable, true);
        if (Thread.currentThread() == this.f39499c) {
            h1Var.run();
            return h1Var;
        }
        T0(h1Var);
        return h1Var;
    }

    public final void P0(Runnable runnable) {
        I0();
        k9.c0.h(runnable);
        T0(new h1(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object Q0(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            j1 j1Var = ((m1) this.f3623a).f39588g;
            m1.h(j1Var);
            j1Var.P0(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                s0 s0Var = ((m1) this.f3623a).f39587f;
                m1.h(s0Var);
                bo.b bVar = s0Var.f39756i;
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                bVar.b(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            s0 s0Var2 = ((m1) this.f3623a).f39587f;
            m1.h(s0Var2);
            s0Var2.f39756i.b("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void R0(Runnable runnable) {
        I0();
        T0(new h1(this, runnable, true, "Task exception on worker thread"));
    }

    public final void S0(Runnable runnable) {
        I0();
        h1 h1Var = new h1(this, runnable, false, "Task exception on network thread");
        synchronized (this.f39505i) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f39502f;
                linkedBlockingQueue.add(h1Var);
                i1 i1Var = this.f39500d;
                if (i1Var == null) {
                    i1 i1Var2 = new i1(this, "Measurement Network", linkedBlockingQueue);
                    this.f39500d = i1Var2;
                    i1Var2.setUncaughtExceptionHandler(this.f39504h);
                    this.f39500d.start();
                } else {
                    Object obj = i1Var.f39468a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void T0(h1 h1Var) {
        synchronized (this.f39505i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f39501e;
                priorityBlockingQueue.add(h1Var);
                i1 i1Var = this.f39499c;
                if (i1Var == null) {
                    i1 i1Var2 = new i1(this, "Measurement Worker", priorityBlockingQueue);
                    this.f39499c = i1Var2;
                    i1Var2.setUncaughtExceptionHandler(this.f39503g);
                    this.f39499c.start();
                } else {
                    Object obj = i1Var.f39468a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
