package com.thinkup.core.common.no.n;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class om0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final om0 f42093n = new om0() { // from class: com.thinkup.core.common.no.n.om0.1
        @Override // com.thinkup.core.common.no.n.om0
        public final om0 o(long j) {
            return this;
        }

        @Override // com.thinkup.core.common.no.n.om0
        public final void on() {
        }

        @Override // com.thinkup.core.common.no.n.om0
        public final om0 o(long j, TimeUnit timeUnit) {
            return this;
        }
    };
    private long m;
    private boolean o;
    private long o0;

    private om0 m(long j, TimeUnit timeUnit) {
        if (j <= 0) {
            throw new IllegalArgumentException("duration <= 0: ".concat(String.valueOf(j)));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        return o(timeUnit.toNanos(j) + System.nanoTime());
    }

    private static long o(long j, long j2) {
        return (j != 0 && (j2 == 0 || j < j2)) ? j : j2;
    }

    public boolean d_() {
        return this.o;
    }

    public long e_() {
        if (this.o) {
            return this.m;
        }
        throw new IllegalStateException("No deadline");
    }

    public om0 f_() {
        this.o0 = 0L;
        return this;
    }

    public long g_() {
        return this.o0;
    }

    public om0 om() {
        this.o = false;
        return this;
    }

    public void on() throws InterruptedIOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.o && this.m - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public om0 o(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j)));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.o0 = timeUnit.toNanos(j);
        return this;
    }

    public om0 o(long j) {
        this.o = true;
        this.m = j;
        return this;
    }

    private void o(Object obj) throws InterruptedIOException {
        try {
            boolean zD_ = d_();
            long jG_ = g_();
            long jNanoTime = 0;
            if (!zD_ && jG_ == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zD_ && jG_ != 0) {
                jG_ = Math.min(jG_, e_() - jNanoTime2);
            } else if (zD_) {
                jG_ = e_() - jNanoTime2;
            }
            if (jG_ > 0) {
                long j = jG_ / 1000000;
                obj.wait(j, (int) (jG_ - (1000000 * j)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jG_) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
