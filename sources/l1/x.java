package l1;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f44826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f44827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f44828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f44829d = new ThreadLocal();

    public x(long j10) {
        f(j10);
    }

    public final synchronized long a(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (!e()) {
                long jLongValue = this.f44826a;
                if (jLongValue == 9223372036854775806L) {
                    Long l = (Long) this.f44829d.get();
                    l.getClass();
                    jLongValue = l.longValue();
                }
                this.f44827b = jLongValue - j10;
                notifyAll();
            }
            this.f44828c = j10;
            return j10 + this.f44827b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j11 = this.f44828c;
            if (j11 != C.TIME_UNSET) {
                String str = y.f44830a;
                long jU = y.U(j11, 90000L, 1000000L, RoundingMode.DOWN);
                long j12 = (4294967296L + jU) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j10;
                long j14 = (j12 * 8589934592L) + j10;
                j10 = Math.abs(j13 - jU) < Math.abs(j14 - jU) ? j13 : j14;
            }
            long j15 = j10;
            String str2 = y.f44830a;
            return a(y.U(j15, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c(long j10) {
        if (j10 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j11 = this.f44828c;
            if (j11 != C.TIME_UNSET) {
                String str = y.f44830a;
                long jU = y.U(j11, 90000L, 1000000L, RoundingMode.DOWN);
                long j12 = jU / 8589934592L;
                long j13 = (j12 * 8589934592L) + j10;
                j10 = j13 >= jU ? j13 : ((j12 + 1) * 8589934592L) + j10;
            }
            long j14 = j10;
            String str2 = y.f44830a;
            return a(y.U(j14, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long d() {
        long j10;
        j10 = this.f44826a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = C.TIME_UNSET;
        }
        return j10;
    }

    public final synchronized boolean e() {
        return this.f44827b != C.TIME_UNSET;
    }

    public final synchronized void f(long j10) {
        this.f44826a = j10;
        this.f44827b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f44828c = C.TIME_UNSET;
    }

    public final synchronized void g(long j10, boolean z10) {
        try {
            go.k.t(this.f44826a == 9223372036854775806L);
            if (e()) {
                return;
            }
            if (z10) {
                this.f44829d.set(Long.valueOf(j10));
            } else {
                while (!e()) {
                    wait();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
