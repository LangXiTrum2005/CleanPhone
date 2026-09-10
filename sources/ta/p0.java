package ta;

import com.ironsource.X3;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p0 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.api.internal.b0 f50637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.common.api.internal.b0 f50638b;

    static {
        int i10 = 1;
        f50637a = new com.google.android.gms.common.api.internal.b0(i10);
        f50638b = new com.google.android.gms.common.api.internal.b0(i10);
    }

    public abstract void a(Throwable th2);

    public abstract void b(Object obj);

    public final void d() {
        com.google.android.gms.common.api.internal.b0 b0Var = f50638b;
        com.google.android.gms.common.api.internal.b0 b0Var2 = f50637a;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            o0 o0Var = new o0(this);
            o0.a(o0Var, Thread.currentThread());
            if (compareAndSet(runnable, o0Var)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(b0Var2)) == b0Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean g();

    public abstract Object h();

    public abstract String i();

    public final void j(Thread thread) {
        Runnable runnable = (Runnable) get();
        o0 o0Var = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof o0;
            com.google.android.gms.common.api.internal.b0 b0Var = f50638b;
            if (!z11 && runnable != b0Var) {
                break;
            }
            if (z11) {
                o0Var = (o0) runnable;
            }
            i10++;
            if (i10 <= 1000) {
                Thread.yield();
            } else if (runnable == b0Var || compareAndSet(runnable, b0Var)) {
                z10 = Thread.interrupted() || z10;
                LockSupport.park(o0Var);
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objH = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zG = g();
            com.google.android.gms.common.api.internal.b0 b0Var = f50637a;
            if (!zG) {
                try {
                    objH = h();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, b0Var)) {
                            j(threadCurrentThread);
                        }
                        if (zG) {
                            return;
                        }
                        a(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, b0Var)) {
                            j(threadCurrentThread);
                        }
                        if (!zG) {
                            b(null);
                        }
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, b0Var)) {
                j(threadCurrentThread);
            }
            if (zG) {
                return;
            }
            b(objH);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f50637a) {
            str = "running=[DONE]";
        } else if (runnable instanceof o0) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + X3.j.f27836e;
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbJ = d5.u.j(str, ", ");
        sbJ.append(i());
        return sbJ.toString();
    }
}
