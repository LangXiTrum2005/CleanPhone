package p1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e1 f48005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e1 f48006d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48008b;

    static {
        e1 e1Var = new e1(0L, 0L);
        new e1(Long.MAX_VALUE, Long.MAX_VALUE);
        f48005c = new e1(Long.MAX_VALUE, 0L);
        new e1(0L, Long.MAX_VALUE);
        f48006d = e1Var;
    }

    public e1(long j10, long j11) {
        go.k.i(j10 >= 0);
        go.k.i(j11 >= 0);
        this.f48007a = j10;
        this.f48008b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0082 A[RETURN] */
    public final long a(long j10, long j11, long j12) {
        long j13 = this.f48007a;
        long j14 = this.f48008b;
        if (j13 == 0 && j14 == 0) {
            return j10;
        }
        String str = l1.y.f44830a;
        long j15 = j10 - j13;
        long j16 = (((j13 ^ j10) > 0L ? 1 : ((j13 ^ j10) == 0L ? 0 : -1)) >= 0) | (((j10 ^ j15) > 0L ? 1 : ((j10 ^ j15) == 0L ? 0 : -1)) >= 0) ? j15 : ((j15 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j16 == Long.MIN_VALUE && j15 != Long.MIN_VALUE) || (j16 == Long.MAX_VALUE && j15 != Long.MAX_VALUE)) {
            j16 = Long.MIN_VALUE;
        }
        long jA = l1.y.a(j10, j14);
        boolean z10 = j16 <= j11 && j11 <= jA;
        boolean z11 = j16 <= j12 && j12 <= jA;
        if (z10 && z11) {
            if (Math.abs(j11 - j10) <= Math.abs(j12 - j10)) {
                return j11;
            }
            return j12;
        }
        if (!z10) {
            if (z11) {
                return j12;
            }
            return j16;
        }
        return j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (this.f48007a == e1Var.f48007a && this.f48008b == e1Var.f48008b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f48007a) * 31) + ((int) this.f48008b);
    }
}
