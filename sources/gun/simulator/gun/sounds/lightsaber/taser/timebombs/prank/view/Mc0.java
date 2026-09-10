package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class Mc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3411a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public Mc0(long j) {
        e(j);
    }

    public final synchronized long a(long j) {
        if (j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        try {
            if (this.b == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                long jLongValue = this.f3411a;
                if (jLongValue == 9223372036854775806L) {
                    Long l = (Long) this.d.get();
                    l.getClass();
                    jLongValue = l.longValue();
                }
                this.b = jLongValue - j;
                notifyAll();
            }
            this.c = j;
            return j + this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        try {
            long j2 = this.c;
            if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
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
        j = this.f3411a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        return j;
    }

    public final synchronized long d() {
        return this.b;
    }

    public final synchronized void e(long j) {
        this.f3411a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }
}
