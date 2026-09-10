package t1;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.RoundingMode;
import java.util.List;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f50395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f50396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f50397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f50398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f50399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f50400i;

    public n(j jVar, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
        super(jVar, j10, j11);
        this.f50395d = j12;
        this.f50396e = j13;
        this.f50397f = list;
        this.f50400i = j14;
        this.f50398g = j15;
        this.f50399h = j16;
    }

    public final long b(long j10, long j11) {
        long jD = d(j10);
        return jD != -1 ? jD : (int) (f((j11 - this.f50399h) + this.f50400i, j10) - c(j10, j11));
    }

    public final long c(long j10, long j11) {
        long jD = d(j10);
        long j12 = this.f50395d;
        if (jD == -1) {
            long j13 = this.f50398g;
            if (j13 != C.TIME_UNSET) {
                return Math.max(j12, f((j11 - this.f50399h) - j13, j10));
            }
        }
        return j12;
    }

    public abstract long d(long j10);

    public final long e(long j10, long j11) {
        long j12 = this.f50409b;
        long j13 = this.f50395d;
        List list = this.f50397f;
        if (list != null) {
            return (((q) list.get((int) (j10 - j13))).f50405b * 1000000) / j12;
        }
        long jD = d(j11);
        return (jD == -1 || j10 != (j13 + jD) - 1) ? (this.f50396e * 1000000) / j12 : j11 - g(j10);
    }

    public final long f(long j10, long j11) {
        long jD = d(j11);
        long j12 = this.f50395d;
        if (jD != 0) {
            if (this.f50397f != null) {
                long j13 = (jD + j12) - 1;
                long j14 = j12;
                while (j14 <= j13) {
                    long j15 = ((j13 - j14) / 2) + j14;
                    long jG = g(j15);
                    if (jG < j10) {
                        j14 = j15 + 1;
                    } else {
                        if (jG <= j10) {
                            return j15;
                        }
                        j13 = j15 - 1;
                    }
                }
                return j14 == j12 ? j14 : j13;
            }
            long j16 = (j10 / ((this.f50396e * 1000000) / this.f50409b)) + j12;
            if (j16 >= j12) {
                return jD == -1 ? j16 : Math.min(j16, (j12 + jD) - 1);
            }
        }
        return j12;
    }

    public final long g(long j10) {
        long j11 = this.f50395d;
        List list = this.f50397f;
        long j12 = list != null ? ((q) list.get((int) (j10 - j11))).f50404a - this.f50410c : (j10 - j11) * this.f50396e;
        String str = y.f44830a;
        return y.U(j12, 1000000L, this.f50409b, RoundingMode.DOWN);
    }

    public abstract j h(k kVar, long j10);

    public boolean i() {
        return this.f50397f != null;
    }
}
