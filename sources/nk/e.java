package nk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f46785a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46786b;

    static {
        Integer num = gk.a.f41959a;
        f46786b = (num == null || num.intValue() >= 34) ? new ok.a() : new b();
    }

    public abstract int a(int i10);

    public abstract int d();

    public int e(int i10, int i11) {
        int iD;
        int i12;
        int iA;
        if (i11 <= i10) {
            throw new IllegalArgumentException(a.a.b(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
        int i13 = i11 - i10;
        if (i13 > 0 || i13 == Integer.MIN_VALUE) {
            if (((-i13) & i13) == i13) {
                iA = a(31 - Integer.numberOfLeadingZeros(i13));
            } else {
                do {
                    iD = d() >>> 1;
                    i12 = iD % i13;
                } while ((i13 - 1) + (iD - i12) < 0);
                iA = i12;
            }
            return i10 + iA;
        }
        while (true) {
            int iD2 = d();
            if (i10 <= iD2 && iD2 < i11) {
                return iD2;
            }
        }
    }

    public abstract long g();

    public long h(long j10, long j11) {
        long jG;
        long j12;
        long jA;
        int iD;
        if (j11 <= j10) {
            throw new IllegalArgumentException(a.a.b(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
        long j13 = j11 - j10;
        if (j13 > 0) {
            if (((-j13) & j13) == j13) {
                int i10 = (int) j13;
                int i11 = (int) (j13 >>> 32);
                if (i10 != 0) {
                    iD = a(31 - Integer.numberOfLeadingZeros(i10));
                } else if (i11 == 1) {
                    iD = d();
                } else {
                    jA = (((long) a(31 - Integer.numberOfLeadingZeros(i11))) << 32) + (((long) d()) & 4294967295L);
                }
                jA = ((long) iD) & 4294967295L;
            } else {
                do {
                    jG = g() >>> 1;
                    j12 = jG % j13;
                } while ((j13 - 1) + (jG - j12) < 0);
                jA = j12;
            }
            return j10 + jA;
        }
        while (true) {
            long jG2 = g();
            if (j10 <= jG2 && jG2 < j11) {
                return jG2;
            }
        }
    }
}
