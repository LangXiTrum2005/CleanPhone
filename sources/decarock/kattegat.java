package decarock;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: TimestampAdjuster.java */
/* JADX INFO: loaded from: classes.dex */
public final class kattegat {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public long f25108attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public long f25109dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public long f25110saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ThreadLocal<Long> f25111wireman = new ThreadLocal<>();

    public kattegat(long j) {
        taiyuan(j);
    }

    public static long cutely(long j) {
        return (j * 90000) / 1000000;
    }

    public static long impromptu(long j) {
        return (j * 1000000) / 90000;
    }

    public synchronized long attabal(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (!competently()) {
                long jLongValue = this.f25108attabal;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) attabal.marial(this.f25111wireman.get())).longValue();
                }
                this.f25110saneness = jLongValue - j;
                notifyAll();
            }
            this.f25109dern = j;
            return j + this.f25110saneness;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long beachfront() {
        return this.f25110saneness;
    }

    public synchronized boolean competently() {
        return this.f25110saneness != C.TIME_UNSET;
    }

    public synchronized long dern(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j2 = this.f25109dern;
            if (j2 != C.TIME_UNSET) {
                long jCutely = cutely(j2);
                long j3 = jCutely / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j += (j3 + 1) * 8589934592L;
                if (j4 >= jCutely) {
                    j = j4;
                }
            }
            return attabal(impromptu(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long marial() {
        long j;
        try {
            j = this.f25109dern;
        } catch (Throwable th) {
            throw th;
        }
        return j != C.TIME_UNSET ? j + this.f25110saneness : wireman();
    }

    public synchronized long saneness(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j2 = this.f25109dern;
            if (j2 != C.TIME_UNSET) {
                long jCutely = cutely(j2);
                long j3 = (4294967296L + jCutely) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (Math.abs(j4 - jCutely) < Math.abs(j - jCutely)) {
                    j = j4;
                }
            }
            return attabal(impromptu(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void taiyuan(long j) {
        this.f25108attabal = j;
        this.f25110saneness = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f25109dern = C.TIME_UNSET;
    }

    public synchronized long wireman() {
        long j;
        j = this.f25108attabal;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = C.TIME_UNSET;
        }
        return j;
    }
}
