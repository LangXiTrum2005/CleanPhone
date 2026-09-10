package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class de1 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bf f13510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bf f13511b;

    static {
        int i10 = 9;
        f13510a = new bf(i10);
        f13511b = new bf(i10);
    }

    public abstract Object d();

    public final void e(Thread thread) {
        Runnable runnable = (Runnable) get();
        ce1 ce1Var = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof ce1;
            bf bfVar = f13511b;
            if (!z11) {
                if (runnable != bfVar) {
                    break;
                }
            } else {
                ce1Var = (ce1) runnable;
            }
            i10++;
            if (i10 <= 1000) {
                Thread.yield();
            } else if (runnable == bfVar || compareAndSet(runnable, bfVar)) {
                z10 = Thread.interrupted() || z10;
                LockSupport.park(ce1Var);
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    public abstract String g();

    public abstract boolean h();

    public abstract void i(Object obj);

    public abstract void j(Throwable th2);

    public final void k() {
        bf bfVar = f13511b;
        bf bfVar2 = f13510a;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            ce1 ce1Var = new ce1(this);
            ce1Var.a(Thread.currentThread());
            if (compareAndSet(runnable, ce1Var)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(bfVar2)) == bfVar) {
                    }
                } finally {
                    if (((Runnable) getAndSet(bfVar2)) == bfVar) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objD = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zH = h();
            bf bfVar = f13510a;
            if (!zH) {
                try {
                    objD = d();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, bfVar)) {
                            e(threadCurrentThread);
                        }
                        j(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, bfVar)) {
                            e(threadCurrentThread);
                        }
                        i(null);
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, bfVar)) {
                e(threadCurrentThread);
            }
            if (zH) {
                return;
            }
            i(objD);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strJ;
        Runnable runnable = (Runnable) get();
        if (runnable == f13510a) {
            strJ = "running=[DONE]";
        } else if (runnable instanceof ce1) {
            strJ = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            strJ = q4.a.j(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, X3.j.f27836e);
        } else {
            strJ = "running=[NOT STARTED YET]";
        }
        String strG = g();
        return q4.a.j(new StringBuilder(strJ.length() + 2 + String.valueOf(strG).length()), strJ, ", ", strG);
    }
}
