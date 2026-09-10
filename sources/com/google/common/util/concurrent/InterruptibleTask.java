package com.google.common.util.concurrent;

import com.p004ironsource.d9;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {
    public static final Runnable X = new DoNothingRunnable();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Runnable f20133Y = new DoNothingRunnable();

    public static final class Blocker extends AbstractOwnableSynchronizer implements Runnable {
        public final InterruptibleTask X;

        public Blocker(InterruptibleTask interruptibleTask) {
            this.X = interruptibleTask;
        }

        public static void a(Blocker blocker, Thread thread) {
            blocker.setExclusiveOwnerThread(thread);
        }

        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return this.X.toString();
        }
    }

    public static final class DoNothingRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public abstract boolean d();

    public abstract Object g();

    public abstract String h();

    public final void i(Thread thread) {
        Runnable runnable = get();
        Blocker blocker = null;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            boolean z3 = runnable instanceof Blocker;
            Runnable runnable2 = f20133Y;
            if (!z3 && runnable != runnable2) {
                break;
            }
            if (z3) {
                blocker = (Blocker) runnable;
            }
            i2++;
            if (i2 <= 1000) {
                Thread.yield();
            } else if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                z2 = Thread.interrupted() || z2;
                LockSupport.park(blocker);
            }
            runnable = get();
        }
        if (z2) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objG = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            Runnable runnable = X;
            if (!zD) {
                try {
                    objG = g();
                } catch (Throwable th) {
                    try {
                        Platform.a(th);
                        if (!compareAndSet(threadCurrentThread, runnable)) {
                            i(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, runnable)) {
                            i(threadCurrentThread);
                        }
                        if (!zD) {
                            b(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, runnable)) {
                i(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            b(objG);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == X) {
            str = "running=[DONE]";
        } else if (runnable instanceof Blocker) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + d9.i.f24752e;
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbX = android.support.v4.media.a.x(str, ", ");
        sbX.append(h());
        return sbX.toString();
    }
}
