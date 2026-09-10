package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class TimestampAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5682c;
    public final ThreadLocal d = new ThreadLocal();

    public TimestampAdjuster(long j) {
        e(j);
    }

    public final synchronized long a(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.f5681b != -9223372036854775807L)) {
                    long jLongValue = this.f5680a;
                    if (jLongValue == 9223372036854775806L) {
                        Long l2 = (Long) this.d.get();
                        l2.getClass();
                        jLongValue = l2.longValue();
                    }
                    this.f5681b = jLongValue - j;
                    notifyAll();
                }
                this.f5682c = j;
                j2 = j + this.f5681b;
            }
            return j2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f5682c;
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

    public final synchronized long c(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.f5682c;
            if (j3 != -9223372036854775807L) {
                long j4 = (j3 * 90000) / 1000000;
                long j5 = j4 / 8589934592L;
                long j6 = (j5 * 8589934592L) + j;
                j2 = ((j5 + 1) * 8589934592L) + j;
                if (j6 >= j4) {
                    j2 = j6;
                }
            } else {
                j2 = j;
            }
            return a((j2 * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d() {
        long j;
        j = this.f5680a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized void e(long j) {
        this.f5680a = j;
        this.f5681b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f5682c = -9223372036854775807L;
    }
}
