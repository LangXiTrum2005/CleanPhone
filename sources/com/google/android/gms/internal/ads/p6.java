package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p6 implements a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q6[] f18538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18539c;

    public p6(long j10, q6[] q6VarArr, int i10) {
        this.f18537a = j10;
        this.f18538b = q6VarArr;
        this.f18539c = i10;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 b(long j10) {
        long j11;
        long j12;
        long j13;
        int iB;
        long j14 = j10;
        q6[] q6VarArr = this.f18538b;
        int length = q6VarArr.length;
        b3 b3Var = b3.f12618c;
        if (length == 0) {
            return new z2(b3Var, b3Var);
        }
        int i10 = this.f18539c;
        if (i10 != -1) {
            z6 z6Var = q6VarArr[i10].f18941b;
            int iA = z6Var.a(j14);
            if (iA == -1) {
                iA = z6Var.b(j14);
            }
            if (iA == -1) {
                return new z2(b3Var, b3Var);
            }
            long[] jArr = z6Var.f22515f;
            long j15 = jArr[iA];
            long[] jArr2 = z6Var.f22512c;
            j11 = jArr2[iA];
            if (j15 >= j14 || iA >= z6Var.f22511b - 1 || (iB = z6Var.b(j14)) == -1 || iB == iA) {
                j12 = C.TIME_UNSET;
                j13 = -1;
            } else {
                j12 = jArr[iB];
                j13 = jArr2[iB];
            }
            j14 = j15;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = C.TIME_UNSET;
            j13 = -1;
        }
        long jMin = j11;
        long jMin2 = j13;
        for (int i11 = 0; i11 < q6VarArr.length; i11++) {
            if (i11 != i10) {
                z6 z6Var2 = q6VarArr[i11].f18941b;
                long[] jArr3 = z6Var2.f22512c;
                int iA2 = z6Var2.a(j14);
                if (iA2 == -1) {
                    iA2 = z6Var2.b(j14);
                }
                if (iA2 != -1) {
                    jMin = Math.min(jArr3[iA2], jMin);
                }
                if (j12 != C.TIME_UNSET) {
                    int iA3 = z6Var2.a(j12);
                    if (iA3 == -1) {
                        iA3 = z6Var2.b(j12);
                    }
                    if (iA3 != -1) {
                        jMin2 = Math.min(jArr3[iA3], jMin2);
                    }
                }
            }
        }
        b3 b3Var2 = new b3(j14, jMin);
        return j12 == C.TIME_UNSET ? new z2(b3Var2, b3Var2) : new z2(b3Var2, new b3(j12, jMin2));
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f18537a;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return true;
    }
}
