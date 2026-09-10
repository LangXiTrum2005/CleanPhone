package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a7 implements a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b7 f11917a;

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 b(long j10) {
        b7 b7Var = this.f11917a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) ((k7) b7Var.l).f16351e) * j10) / 1000000);
        long j11 = b7Var.f12661b;
        long j12 = b7Var.f12660a;
        long jLongValue = bigIntegerValueOf.multiply(BigInteger.valueOf(j11 - j12)).divide(BigInteger.valueOf(b7Var.f12663d)).longValue() + j12;
        String str = uu0.f20901a;
        b3 b3Var = new b3(j10, Math.max(j12, Math.min(jLongValue - 30000, j11 - 1)));
        return new z2(b3Var, b3Var);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        b7 b7Var = this.f11917a;
        k7 k7Var = (k7) b7Var.l;
        return (b7Var.f12663d * 1000000) / ((long) k7Var.f16351e);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return true;
    }
}
