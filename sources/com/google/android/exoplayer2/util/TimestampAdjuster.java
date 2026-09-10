package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes3.dex */
public final class TimestampAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18978c;
    public final ThreadLocal d = new ThreadLocal();

    public TimestampAdjuster(long j) {
        d(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f18977b == -9223372036854775807L) {
                long jLongValue = this.f18976a;
                if (jLongValue == 9223372036854775806L) {
                    Long l2 = (Long) this.d.get();
                    l2.getClass();
                    jLongValue = l2.longValue();
                }
                this.f18977b = jLongValue - j;
                notifyAll();
            }
            this.f18978c = j;
            return j + this.f18977b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f18978c;
            if (j2 != -9223372036854775807L) {
                long j3 = (j2 * 90000) / 1000000;
                long j4 = (4294967296L + j3) / 8589934592L;
                long j5 = ((j4 - 1) * 8589934592L) + j;
                long j6 = (j4 * 8589934592L) + j;
                j = Math.abs(j5 - j3) < Math.abs(j6 - j3) ? j5 : j6;
            }
            return a((j * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c() {
        long j;
        j = this.f18976a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized void d(long j) {
        this.f18976a = j;
        this.f18977b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f18978c = -9223372036854775807L;
    }
}
