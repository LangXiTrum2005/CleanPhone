package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class st0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f20048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f20050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f20051d = new ThreadLocal();

    public st0() {
        b(0L);
    }

    public final synchronized long a() {
        long j10 = this.f20048a;
        return (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) ? C.TIME_UNSET : j10;
    }

    public final synchronized void b(long j10) {
        this.f20048a = j10;
        this.f20049b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f20050c = C.TIME_UNSET;
    }

    public final synchronized long c(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j11 = this.f20050c;
            if (j11 != C.TIME_UNSET) {
                long jV = uu0.v(j11, 90000L, 1000000L, RoundingMode.DOWN);
                long j12 = (4294967296L + jV) / 8589934592L;
                long j13 = (((-1) + j12) * 8589934592L) + j10;
                long j14 = (j12 * 8589934592L) + j10;
                j10 = Math.abs(j13 - jV) < Math.abs(j14 - jV) ? j13 : j14;
            }
            return e(uu0.v(j10, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long d(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j11 = this.f20050c;
            if (j11 != C.TIME_UNSET) {
                long jV = uu0.v(j11, 90000L, 1000000L, RoundingMode.DOWN);
                long j12 = jV / 8589934592L;
                long j13 = (j12 * 8589934592L) + j10;
                j10 = j13 >= jV ? j13 : ((j12 + 1) * 8589934592L) + j10;
            }
            return e(uu0.v(j10, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long e(long j10) {
        long j11;
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            synchronized (this) {
                if (!(this.f20049b != C.TIME_UNSET)) {
                    long jLongValue = this.f20048a;
                    if (jLongValue == 9223372036854775806L) {
                        Long l = (Long) this.f20051d.get();
                        if (l == null) {
                            throw null;
                        }
                        jLongValue = l.longValue();
                    }
                    this.f20049b = jLongValue - j10;
                    notifyAll();
                }
                this.f20050c = j10;
                j11 = j10 + this.f20049b;
            }
            return j11;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
