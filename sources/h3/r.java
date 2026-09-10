package h3;

import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f42197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f42199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f42200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f42202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f42203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f42204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f42205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f42206j;

    public r(p pVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, int[] iArr3, boolean z10, long j10, int i11) {
        go.k.i(iArr.length == jArr2.length);
        go.k.i(jArr.length == jArr2.length);
        go.k.i(iArr2.length == jArr2.length);
        this.f42197a = pVar;
        this.f42199c = jArr;
        this.f42200d = iArr;
        this.f42201e = i10;
        this.f42202f = jArr2;
        this.f42203g = iArr2;
        this.f42204h = iArr3;
        this.f42206j = z10;
        this.f42205i = j10;
        this.f42198b = i11;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        boolean z10 = this.f42206j;
        int i10 = 0;
        long[] jArr = this.f42202f;
        if (z10) {
            return y.f(jArr, j10, false);
        }
        int[] iArr = this.f42204h;
        int length = iArr.length - 1;
        int i11 = -1;
        while (i10 <= length) {
            int i12 = ((length - i10) / 2) + i10;
            if (jArr[iArr[i12]] <= j10) {
                i10 = i12 + 1;
                i11 = i12;
            } else {
                length = i12 - 1;
            }
        }
        if (i11 == -1) {
            return -1;
        }
        long j11 = jArr[iArr[i11]];
        if (j11 == j10) {
            while (i11 > 0 && jArr[iArr[i11 - 1]] == j11) {
                i11--;
            }
        }
        return iArr[i11];
    }

    public final int b(long j10) {
        boolean z10 = this.f42206j;
        long[] jArr = this.f42202f;
        if (z10) {
            return y.b(jArr, j10, true);
        }
        int[] iArr = this.f42204h;
        int length = iArr.length - 1;
        int i10 = 0;
        int i11 = -1;
        while (i10 <= length) {
            int i12 = ((length - i10) / 2) + i10;
            if (jArr[iArr[i12]] >= j10) {
                length = i12 - 1;
                i11 = i12;
            } else {
                i10 = i12 + 1;
            }
        }
        if (i11 == -1) {
            return -1;
        }
        long j11 = jArr[iArr[i11]];
        if (j11 == j10) {
            while (i11 < iArr.length - 1) {
                int i13 = i11 + 1;
                if (jArr[iArr[i13]] != j11) {
                    break;
                }
                i11 = i13;
            }
        }
        return iArr[i11];
    }
}
