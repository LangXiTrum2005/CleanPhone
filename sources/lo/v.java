package lo;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f45672d = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f45673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f45674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f45675c;

    public v a() {
        this.f45673a = false;
        return this;
    }

    public v b() {
        this.f45675c = 0L;
        return this;
    }

    public long c() {
        if (this.f45673a) {
            return this.f45674b;
        }
        throw new IllegalStateException("No deadline");
    }

    public v d(long j10) {
        this.f45673a = true;
        this.f45674b = j10;
        return this;
    }

    public boolean e() {
        return this.f45673a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f45673a && this.f45674b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public v g(long j10) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.n.f(unit, "unit");
        if (j10 < 0) {
            throw new IllegalArgumentException(defpackage.e.i(j10, "timeout < 0: ").toString());
        }
        this.f45675c = unit.toNanos(j10);
        return this;
    }
}
