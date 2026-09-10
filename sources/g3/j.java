package g3;

import l1.y;
import n2.s;
import n2.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f41469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f41470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f41471g;

    public j(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f41465a = j10;
        this.f41466b = i10;
        this.f41467c = j11;
        this.f41468d = i11;
        this.f41469e = j12;
        this.f41471g = jArr;
        this.f41470f = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // g3.h
    public final long b() {
        return this.f41470f;
    }

    @Override // g3.h
    public final int c() {
        return this.f41468d;
    }

    @Override // n2.t
    public final long getDurationUs() {
        return this.f41467c;
    }

    @Override // n2.t
    public final s getSeekPoints(long j10) {
        double d10;
        double d11;
        boolean zIsSeekable = isSeekable();
        int i10 = this.f41466b;
        long j11 = this.f41465a;
        if (!zIsSeekable) {
            u uVar = new u(0L, j11 + ((long) i10));
            return new s(uVar, uVar);
        }
        long jK = y.k(j10, 0L, this.f41467c);
        double d12 = (jK * 100.0d) / this.f41467c;
        double d13 = 0.0d;
        if (d12 <= 0.0d) {
            d10 = 256.0d;
        } else if (d12 >= 100.0d) {
            d10 = 256.0d;
            d13 = 256.0d;
        } else {
            int i11 = (int) d12;
            long[] jArr = this.f41471g;
            jArr.getClass();
            double d14 = jArr[i11];
            if (i11 == 99) {
                d10 = 256.0d;
                d11 = 256.0d;
            } else {
                d10 = 256.0d;
                d11 = jArr[i11 + 1];
            }
            d13 = ((d11 - d14) * (d12 - ((double) i11))) + d14;
        }
        long j12 = this.f41469e;
        u uVar2 = new u(jK, j11 + y.k(Math.round((d13 / d10) * j12), i10, j12 - 1));
        return new s(uVar2, uVar2);
    }

    @Override // g3.h
    public final long getTimeUs(long j10) {
        long j11 = j10 - this.f41465a;
        if (!isSeekable() || j11 <= this.f41466b) {
            return 0L;
        }
        long[] jArr = this.f41471g;
        jArr.getClass();
        double d10 = (j11 * 256.0d) / this.f41469e;
        int iF = y.f(jArr, (long) d10, true);
        long j12 = this.f41467c;
        long j13 = (((long) iF) * j12) / 100;
        long j14 = jArr[iF];
        int i10 = iF + 1;
        long j15 = (j12 * ((long) i10)) / 100;
        long j16 = iF == 99 ? 256L : jArr[i10];
        return Math.round((j14 == j16 ? 0.0d : (d10 - j14) / (j16 - j14)) * (j15 - j13)) + j13;
    }

    @Override // n2.t
    public final boolean isSeekable() {
        return this.f41471g != null;
    }
}
