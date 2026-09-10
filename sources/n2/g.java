package n2;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f46458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f46459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f46460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f46461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46462f;

    public g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f46458b = iArr;
        this.f46459c = jArr;
        this.f46460d = jArr2;
        this.f46461e = jArr3;
        int length = iArr.length;
        this.f46457a = length;
        if (length > 0) {
            this.f46462f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f46462f = 0L;
        }
    }

    @Override // n2.t
    public final long getDurationUs() {
        return this.f46462f;
    }

    @Override // n2.t
    public final s getSeekPoints(long j10) {
        long[] jArr = this.f46461e;
        int iF = l1.y.f(jArr, j10, true);
        long j11 = jArr[iF];
        long[] jArr2 = this.f46459c;
        u uVar = new u(j11, jArr2[iF]);
        if (j11 >= j10 || iF == this.f46457a - 1) {
            return new s(uVar, uVar);
        }
        int i10 = iF + 1;
        return new s(uVar, new u(jArr[i10], jArr2[i10]));
    }

    @Override // n2.t
    public final boolean isSeekable() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f46457a + ", sizes=" + Arrays.toString(this.f46458b) + ", offsets=" + Arrays.toString(this.f46459c) + ", timeUs=" + Arrays.toString(this.f46461e) + ", durationsUs=" + Arrays.toString(this.f46460d) + ")";
    }
}
