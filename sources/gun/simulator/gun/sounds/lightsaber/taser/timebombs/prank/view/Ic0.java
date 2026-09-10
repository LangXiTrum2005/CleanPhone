package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class Ic0 {
    public static final Hc0 d = new Hc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3228a;
    public long b;
    public long c;

    public Ic0 a() {
        this.f3228a = false;
        return this;
    }

    public Ic0 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.f3228a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public Ic0 d(long j) {
        this.f3228a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.f3228a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f3228a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public Ic0 g(long j, TimeUnit timeUnit) {
        AbstractC2995aW.q(timeUnit, "unit");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Long.valueOf(j), "timeout < 0: ").toString());
        }
        this.c = timeUnit.toNanos(j);
        return this;
    }
}
