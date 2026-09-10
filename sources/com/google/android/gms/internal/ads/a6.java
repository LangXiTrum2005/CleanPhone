package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a6 implements x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f11906g;

    public a6(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f11900a = j10;
        this.f11901b = i10;
        this.f11902c = j11;
        this.f11903d = i11;
        this.f11904e = j12;
        this.f11906g = jArr;
        this.f11905f = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.x5
    public final long a(long j10) {
        if (!zzb()) {
            return 0L;
        }
        long j11 = j10 - this.f11900a;
        if (j11 <= this.f11901b) {
            return 0L;
        }
        long[] jArr = this.f11906g;
        jArr.getClass();
        double d10 = (j11 * 256.0d) / this.f11904e;
        int iR = uu0.r(jArr, (long) d10, true);
        long j12 = this.f11902c;
        long j13 = (((long) iR) * j12) / 100;
        long j14 = jArr[iR];
        int i10 = iR + 1;
        long j15 = (j12 * ((long) i10)) / 100;
        long j16 = iR == 99 ? 256L : jArr[i10];
        return Math.round((j14 == j16 ? 0.0d : (d10 - j14) / (j16 - j14)) * (j15 - j13)) + j13;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 b(long j10) {
        double d10;
        boolean zZzb = zzb();
        int i10 = this.f11901b;
        long j11 = this.f11900a;
        if (!zZzb) {
            b3 b3Var = new b3(0L, j11 + ((long) i10));
            return new z2(b3Var, b3Var);
        }
        String str = uu0.f20901a;
        long j12 = this.f11902c;
        long jMax = Math.max(0L, Math.min(j10, j12));
        double d11 = (jMax * 100.0d) / j12;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d10 = 256.0d;
        } else if (d11 >= 100.0d) {
            d10 = 256.0d;
            d12 = 256.0d;
        } else {
            int i11 = (int) d11;
            long[] jArr = this.f11906g;
            jArr.getClass();
            double d13 = jArr[i11];
            d10 = 256.0d;
            d12 = (((i11 == 99 ? 256.0d : jArr[i11 + 1]) - d13) * (d11 - ((double) i11))) + d13;
        }
        long j13 = this.f11904e;
        b3 b3Var2 = new b3(jMax, j11 + Math.max(i10, Math.min(Math.round((d12 / d10) * j13), j13 - 1)));
        return new z2(b3Var2, b3Var2);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f11902c;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return this.f11906g != null;
    }

    @Override // com.google.android.gms.internal.ads.x5
    public final long zzg() {
        return this.f11905f;
    }

    @Override // com.google.android.gms.internal.ads.x5
    public final int zzh() {
        return this.f11903d;
    }
}
