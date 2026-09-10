package ud;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 {
    public static final e1 Companion = new e1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f52072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f52073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f52074c;

    public /* synthetic */ f1(int i10, long j10, long j11, long j12) {
        if (1 != (i10 & 1)) {
            rn.k.a(i10, 1, d1.f52058a.d());
            throw null;
        }
        this.f52072a = j10;
        this.f52073b = (i10 & 2) == 0 ? ((long) 1000) * j10 : j11;
        if ((i10 & 4) == 0) {
            this.f52074c = j10 / ((long) 1000);
        } else {
            this.f52074c = j12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && this.f52072a == ((f1) obj).f52072a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f52072a);
    }

    public final String toString() {
        return "Time(ms=" + this.f52072a + ')';
    }

    public f1(long j10) {
        this.f52072a = j10;
        long j11 = 1000;
        this.f52073b = j10 * j11;
        this.f52074c = j10 / j11;
    }
}
