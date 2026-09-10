package com.smartdigimkt.p4;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 {
    public static final long d = Long.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f37521e = 8589934592L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f37522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f37523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f37524c = -9223372036854775807L;

    public c0(long j) {
        d(j);
    }

    public long a() {
        return this.f37522a;
    }

    public long b() {
        if (this.f37524c != -9223372036854775807L) {
            return this.f37524c + this.f37523b;
        }
        long j = this.f37522a;
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return -9223372036854775807L;
    }

    public long c() {
        if (this.f37522a == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.f37524c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f37523b;
    }

    public synchronized void d(long j) {
        a.b(this.f37524c == -9223372036854775807L);
        this.f37522a = j;
    }

    public synchronized void e() throws InterruptedException {
        while (this.f37524c == -9223372036854775807L) {
            wait();
        }
    }

    public long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f37524c != -9223372036854775807L) {
            this.f37524c = j;
        } else {
            long j2 = this.f37522a;
            if (j2 != Long.MAX_VALUE) {
                this.f37523b = j2 - j;
            }
            synchronized (this) {
                this.f37524c = j;
                notifyAll();
            }
        }
        return j + this.f37523b;
    }

    public static long c(long j) {
        return (j * 1000000) / 90000;
    }

    public static long e(long j) {
        return (j * 90000) / 1000000;
    }

    public void d() {
        this.f37524c = -9223372036854775807L;
    }

    public long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f37524c != -9223372036854775807L) {
            long jE = e(this.f37524c);
            long j2 = (4294967296L + jE) / f37521e;
            long j3 = ((j2 - 1) * f37521e) + j;
            j += j2 * f37521e;
            if (Math.abs(j3 - jE) < Math.abs(j - jE)) {
                j = j3;
            }
        }
        return a(c(j));
    }
}
