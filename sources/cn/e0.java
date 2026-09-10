package cn;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends w0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e0 f6703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f6704j;

    static {
        Long l;
        e0 e0Var = new e0();
        f6703i = e0Var;
        e0Var.w(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f6704j = timeUnit.toNanos(l.longValue());
    }

    @Override // cn.w0
    public final void A(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.A(runnable);
    }

    public final synchronized void F() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            debugStatus = 3;
            w0.f6780f.set(this, null);
            w0.f6781g.set(this, null);
            notifyAll();
        }
    }

    @Override // cn.i0
    public final p0 b(long j10, e2 e2Var, ak.k kVar) {
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10;
        }
        if (j11 >= 4611686018427387903L) {
            return v1.f6778a;
        }
        long jNanoTime = System.nanoTime();
        t0 t0Var = new t0(j11 + jNanoTime, e2Var);
        E(jNanoTime, t0Var);
        return t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b2.f6678a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 == 2 || i10 == 3) {
                    _thread = null;
                    F();
                    if (D()) {
                        return;
                    }
                    v();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jX = x();
                    if (jX == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = f6704j + jNanoTime;
                        }
                        long j11 = j10 - jNanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            F();
                            if (D()) {
                                return;
                            }
                            v();
                            return;
                        }
                        if (jX > j11) {
                            jX = j11;
                        }
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (jX > 0) {
                        int i11 = debugStatus;
                        if (i11 == 2 || i11 == 3) {
                            _thread = null;
                            F();
                            if (D()) {
                                return;
                            }
                            v();
                            return;
                        }
                        LockSupport.parkNanos(this, jX);
                    }
                }
            }
        } catch (Throwable th2) {
            _thread = null;
            F();
            if (!D()) {
                v();
            }
            throw th2;
        }
    }

    @Override // cn.w0, cn.x0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // cn.w
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // cn.x0
    public final Thread v() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f6703i.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // cn.x0
    public final void z(long j10, u0 u0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
}
