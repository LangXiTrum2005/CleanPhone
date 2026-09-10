package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s5 implements x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f19839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f19840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19841c;

    public s5(long[] jArr, long[] jArr2, long j10) {
        this.f19839a = jArr;
        this.f19840b = jArr2;
        this.f19841c = j10 == C.TIME_UNSET ? uu0.t(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair c(long[] jArr, long[] jArr2, long j10) {
        int iR = uu0.r(jArr, j10, true);
        long j11 = jArr[iR];
        long j12 = jArr2[iR];
        int i10 = iR + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // com.google.android.gms.internal.ads.x5
    public final long a(long j10) {
        return uu0.t(((Long) c(this.f19839a, this.f19840b, j10).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 b(long j10) {
        String str = uu0.f20901a;
        Pair pairC = c(this.f19840b, this.f19839a, uu0.s(Math.max(0L, Math.min(j10, this.f19841c))));
        b3 b3Var = new b3(uu0.t(((Long) pairC.first).longValue()), ((Long) pairC.second).longValue());
        return new z2(b3Var, b3Var);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f19841c;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.x5
    public final long zzg() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.x5
    public final int zzh() {
        return -2147483647;
    }
}
