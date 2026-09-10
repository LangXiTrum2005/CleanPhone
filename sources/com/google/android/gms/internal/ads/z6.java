package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w6 f22510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f22512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f22513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f22515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f22516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f22517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f22518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f22519j;

    public z6(w6 w6Var, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, int[] iArr3, boolean z10, long j10, int i11) {
        int length = iArr.length;
        int length2 = jArr2.length;
        ps1.v(length == length2);
        ps1.v(jArr.length == length2);
        int length3 = iArr2.length;
        ps1.v(length3 == length2);
        this.f22510a = w6Var;
        this.f22512c = jArr;
        this.f22513d = iArr;
        this.f22514e = i10;
        this.f22515f = jArr2;
        this.f22516g = iArr2;
        this.f22517h = iArr3;
        this.f22519j = z10;
        this.f22518i = j10;
        this.f22511b = i11;
        if (length3 > 0) {
            int i12 = length3 - 1;
            iArr2[i12] = iArr2[i12] | 536870912;
        }
    }

    public final int a(long j10) {
        boolean z10 = this.f22519j;
        int i10 = 0;
        long[] jArr = this.f22515f;
        if (z10) {
            return uu0.r(jArr, j10, false);
        }
        int[] iArr = this.f22517h;
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
            while (i11 > 0) {
                int i13 = i11 - 1;
                if (jArr[iArr[i13]] != j11) {
                    break;
                }
                i11 = i13;
            }
        }
        return iArr[i11];
    }

    public final int b(long j10) {
        boolean z10 = this.f22519j;
        long[] jArr = this.f22515f;
        if (z10) {
            String str = uu0.f20901a;
            int iBinarySearch = Arrays.binarySearch(jArr, j10);
            if (iBinarySearch < 0) {
                return ~iBinarySearch;
            }
            while (true) {
                int i10 = iBinarySearch + 1;
                if (i10 >= jArr.length || jArr[i10] != j10) {
                    break;
                }
                iBinarySearch = i10;
            }
            return iBinarySearch;
        }
        int[] iArr = this.f22517h;
        int length = iArr.length - 1;
        int i11 = 0;
        int i12 = -1;
        while (i11 <= length) {
            int i13 = ((length - i11) / 2) + i11;
            if (jArr[iArr[i13]] >= j10) {
                length = i13 - 1;
                i12 = i13;
            } else {
                i11 = i13 + 1;
            }
        }
        if (i12 == -1) {
            return -1;
        }
        long j11 = jArr[iArr[i12]];
        if (j11 == j10) {
            while (i12 < iArr.length - 1) {
                int i14 = i12 + 1;
                if (jArr[iArr[i14]] != j11) {
                    break;
                }
                i12 = i14;
            }
        }
        return iArr[i12];
    }
}
