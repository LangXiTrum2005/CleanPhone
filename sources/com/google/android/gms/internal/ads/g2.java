package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 implements a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f14660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f14661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f14662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f14663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14664f;

    public g2(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f14660b = iArr;
        this.f14661c = jArr;
        this.f14662d = jArr2;
        this.f14663e = jArr3;
        int length = iArr.length;
        this.f14659a = length;
        if (length <= 0) {
            this.f14664f = 0L;
        } else {
            int i10 = length - 1;
            this.f14664f = jArr2[i10] + jArr3[i10];
        }
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 b(long j10) {
        long[] jArr = this.f14663e;
        int iR = uu0.r(jArr, j10, true);
        long j11 = jArr[iR];
        long[] jArr2 = this.f14661c;
        b3 b3Var = new b3(j11, jArr2[iR]);
        if (j11 >= j10 || iR == this.f14659a - 1) {
            return new z2(b3Var, b3Var);
        }
        int i10 = iR + 1;
        return new z2(b3Var, new b3(jArr[i10], jArr2[i10]));
    }

    public final String toString() {
        String string = Arrays.toString(this.f14660b);
        String string2 = Arrays.toString(this.f14661c);
        String string3 = Arrays.toString(this.f14663e);
        String string4 = Arrays.toString(this.f14662d);
        int i10 = this.f14659a;
        int length = String.valueOf(i10).length();
        int length2 = String.valueOf(string).length();
        int length3 = String.valueOf(string2).length();
        StringBuilder sb2 = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(string3).length() + 14 + String.valueOf(string4).length() + 1);
        sb2.append("ChunkIndex(length=");
        sb2.append(i10);
        sb2.append(", sizes=");
        sb2.append(string);
        d5.u.r(sb2, ", offsets=", string2, ", timeUs=", string3);
        return q4.a.j(sb2, ", durationsUs=", string4, ")");
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f14664f;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return true;
    }
}
