package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class A6 extends Ic0 {
    public static final long h;
    public static final long i;
    public static A6 j;
    public boolean e;
    public A6 f;
    public long g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        h = millis;
        i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        A6 a6;
        long j2 = this.c;
        boolean z = this.f3228a;
        if (j2 != 0 || z) {
            synchronized (A6.class) {
                try {
                    if (!(!this.e)) {
                        throw new IllegalStateException("Unbalanced enter/exit".toString());
                    }
                    this.e = true;
                    if (j == null) {
                        j = new A6();
                        C4988x6 c4988x6 = new C4988x6("Okio Watchdog");
                        c4988x6.setDaemon(true);
                        c4988x6.start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j2 != 0 && z) {
                        this.g = Math.min(j2, c() - jNanoTime) + jNanoTime;
                    } else if (j2 != 0) {
                        this.g = j2 + jNanoTime;
                    } else {
                        if (!z) {
                            throw new AssertionError();
                        }
                        this.g = c();
                    }
                    long j3 = this.g - jNanoTime;
                    A6 a7 = j;
                    AbstractC2995aW.n(a7);
                    while (true) {
                        a6 = a7.f;
                        if (a6 == null || j3 < a6.g - jNanoTime) {
                            break;
                            break;
                        }
                        a7 = a6;
                    }
                    this.f = a6;
                    a7.f = this;
                    if (a7 == j) {
                        A6.class.notify();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean i() {
        synchronized (A6.class) {
            if (!this.e) {
                return false;
            }
            this.e = false;
            A6 a6 = j;
            while (a6 != null) {
                A6 a7 = a6.f;
                if (a7 == this) {
                    a6.f = this.f;
                    this.f = null;
                    return false;
                }
                a6 = a7;
            }
            return true;
        }
    }

    public InterruptedIOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
