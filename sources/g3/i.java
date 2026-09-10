package g3;

import l1.y;
import n2.s;
import n2.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f41460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f41461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f41463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41464e;

    public i(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i10) {
        this.f41460a = jArr;
        this.f41461b = jArr2;
        this.f41462c = j10;
        this.f41463d = j12;
        this.f41464e = i10;
    }

    @Override // g3.h
    public final long b() {
        return this.f41463d;
    }

    @Override // g3.h
    public final int c() {
        return this.f41464e;
    }

    @Override // n2.t
    public final long getDurationUs() {
        return this.f41462c;
    }

    @Override // n2.t
    public final s getSeekPoints(long j10) {
        long[] jArr = this.f41460a;
        int iF = y.f(jArr, j10, true);
        long j11 = jArr[iF];
        long[] jArr2 = this.f41461b;
        u uVar = new u(j11, jArr2[iF]);
        if (j11 >= j10 || iF == jArr.length - 1) {
            return new s(uVar, uVar);
        }
        int i10 = iF + 1;
        return new s(uVar, new u(jArr[i10], jArr2[i10]));
    }

    @Override // g3.h
    public final long getTimeUs(long j10) {
        return this.f41460a[y.f(this.f41461b, j10, true)];
    }

    @Override // n2.t
    public final boolean isSeekable() {
        return true;
    }
}
