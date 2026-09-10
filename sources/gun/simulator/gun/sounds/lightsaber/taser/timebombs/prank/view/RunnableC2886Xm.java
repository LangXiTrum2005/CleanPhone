package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2886Xm extends AbstractC3122bs implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final RunnableC2886Xm h;
    public static final long i;

    static {
        Long l;
        RunnableC2886Xm runnableC2886Xm = new RunnableC2886Xm();
        h = runnableC2886Xm;
        runnableC2886Xm.o(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        i = timeUnit.toNanos(l.longValue());
    }

    public final synchronized void R() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            AbstractC3122bs.e.set(this, null);
            AbstractC3122bs.f.set(this, null);
            notifyAll();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3122bs, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4083mo
    public final InterfaceC4612sp f(long j, Runnable runnable, InterfaceC3549gk interfaceC3549gk) {
        SE se = AbstractC3298ds.f4295a;
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return NR.f3457a;
        }
        long jNanoTime = System.nanoTime();
        C2917Yr c2917Yr = new C2917Yr(j2 + jNanoTime, runnable);
        y(jNanoTime, c2917Yr);
        return c2917Yr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3210cs
    public final Thread n() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC3270dc0.f4278a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 != 2 && i2 != 3) {
                    debugStatus = 1;
                    notifyAll();
                    long j = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long jR = r();
                        if (jR == Long.MAX_VALUE) {
                            long jNanoTime = System.nanoTime();
                            if (j == Long.MAX_VALUE) {
                                j = i + jNanoTime;
                            }
                            long j2 = j - jNanoTime;
                            if (j2 <= 0) {
                                _thread = null;
                                R();
                                if (x()) {
                                    return;
                                }
                                n();
                                return;
                            }
                            if (jR > j2) {
                                jR = j2;
                            }
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        if (jR > 0) {
                            int i3 = debugStatus;
                            if (i3 == 2 || i3 == 3) {
                                break;
                                break;
                            }
                            LockSupport.parkNanos(this, jR);
                        }
                    }
                    _thread = null;
                    R();
                    if (x()) {
                        return;
                    }
                    n();
                    return;
                }
                _thread = null;
                R();
                if (x()) {
                    return;
                }
                n();
            }
        } catch (Throwable th) {
            _thread = null;
            R();
            if (!x()) {
                n();
            }
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3122bs, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3210cs
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3210cs
    public final void u(long j, AbstractRunnableC2943Zr abstractRunnableC2943Zr) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3122bs
    public final void v(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.v(runnable);
    }
}
