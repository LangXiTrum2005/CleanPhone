package bn;

import go.k;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements e, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5756a;

    public static long a(long j10) {
        long jB = d.b();
        c unit = c.NANOSECONDS;
        n.f(unit, "unit");
        return (1 | (j10 - 1)) == Long.MAX_VALUE ? a.i(k.N(j10)) : k.U(jB, j10, unit);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long jN;
        f other = (f) obj;
        n.f(other, "other");
        long j10 = other.f5756a;
        int i10 = d.f5755b;
        c unit = c.NANOSECONDS;
        n.f(unit, "unit");
        long j11 = (j10 - 1) | 1;
        long j12 = this.f5756a;
        if (j11 != Long.MAX_VALUE) {
            jN = (1 | (j12 - 1)) == Long.MAX_VALUE ? k.N(j12) : k.U(j12, j10, unit);
        } else if (j12 == j10) {
            int i11 = a.f5743d;
            jN = 0;
        } else {
            jN = a.i(k.N(j10));
        }
        return a.c(jN, 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f5756a == ((f) obj).f5756a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5756a);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.f5756a + ')';
    }
}
