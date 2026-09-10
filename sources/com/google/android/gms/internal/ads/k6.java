package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k6 implements a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f16335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f16336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16339e;

    public /* synthetic */ k6(SparseArray sparseArray, SparseArray sparseArray2, long j10, long j11, int i10) {
        this.f16335a = sparseArray;
        this.f16336b = sparseArray2;
        this.f16337c = j10;
        this.f16338d = j11;
        this.f16339e = i10;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 b(long j10) {
        SparseArray sparseArray = this.f16335a;
        int i10 = this.f16339e;
        long[] jArr = (long[]) sparseArray.get(i10);
        SparseArray sparseArray2 = this.f16336b;
        long[] jArr2 = (long[]) sparseArray2.get(i10);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i10);
            jArr2 = (long[]) sparseArray2.get(i10);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j10 < jArr[0]) {
            b3 b3Var = new b3(0L, this.f16338d);
            return new z2(b3Var, b3Var);
        }
        int iR = uu0.r(jArr, j10, true);
        b3 b3Var2 = new b3(jArr[iR], jArr2[iR]);
        return new z2(b3Var2, b3Var2);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f16337c;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return true;
    }
}
