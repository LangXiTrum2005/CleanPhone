package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oa implements a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ma f18207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18211e;

    public oa(ma maVar, int i10, long j10, long j11) {
        this.f18207a = maVar;
        this.f18208b = i10;
        this.f18209c = j10;
        long j12 = (j11 - j10) / ((long) maVar.f17362c);
        this.f18210d = j12;
        this.f18211e = c(j12);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 b(long j10) {
        long j11 = this.f18208b;
        ma maVar = this.f18207a;
        long j12 = (((long) maVar.f17361b) * j10) / (j11 * 1000000);
        String str = uu0.f20901a;
        long j13 = this.f18210d - 1;
        long jMax = Math.max(0L, Math.min(j12, j13));
        long j14 = maVar.f17362c;
        long jC = c(jMax);
        long j15 = this.f18209c;
        b3 b3Var = new b3(jC, (jMax * j14) + j15);
        if (jC >= j10 || jMax == j13) {
            return new z2(b3Var, b3Var);
        }
        long j16 = jMax + 1;
        return new z2(b3Var, new b3(c(j16), (j14 * j16) + j15));
    }

    public final long c(long j10) {
        return uu0.v(j10 * ((long) this.f18208b), 1000000L, this.f18207a.f17361b, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f18211e;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return true;
    }
}
