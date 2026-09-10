package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y5 implements x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f22148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f22149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22152e;

    public y5(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.f22148a = jArr;
        this.f22149b = jArr2;
        this.f22150c = j10;
        this.f22151d = j11;
        this.f22152e = i10;
    }

    @Override // com.google.android.gms.internal.ads.x5
    public final long a(long j10) {
        return this.f22148a[uu0.r(this.f22149b, j10, true)];
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 b(long j10) {
        long[] jArr = this.f22148a;
        int iR = uu0.r(jArr, j10, true);
        long j11 = jArr[iR];
        long[] jArr2 = this.f22149b;
        b3 b3Var = new b3(j11, jArr2[iR]);
        if (j11 >= j10 || iR == jArr.length - 1) {
            return new z2(b3Var, b3Var);
        }
        int i10 = iR + 1;
        return new z2(b3Var, new b3(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f22150c;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.x5
    public final long zzg() {
        return this.f22151d;
    }

    @Override // com.google.android.gms.internal.ads.x5
    public final int zzh() {
        return this.f22152e;
    }
}
