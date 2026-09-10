package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class r2 implements a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f19280c;

    public /* synthetic */ r2(Object obj, long j10, int i10) {
        this.f19278a = i10;
        this.f19280c = obj;
        this.f19279b = j10;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 b(long j10) {
        int i10 = this.f19278a;
        int i11 = 1;
        Object obj = this.f19280c;
        switch (i10) {
            case 0:
                s2 s2Var = (s2) obj;
                md0 md0Var = (md0) s2Var.f19778k;
                md0Var.getClass();
                String str = uu0.f20901a;
                long jMax = Math.max(0L, Math.min((((long) s2Var.f19772e) * j10) / 1000000, s2Var.f19777j - 1));
                long[] jArr = (long[]) md0Var.f17399b;
                int iR = uu0.r(jArr, jMax, false);
                long j11 = iR == -1 ? 0L : jArr[iR];
                long[] jArr2 = (long[]) md0Var.f17400c;
                long j12 = iR != -1 ? jArr2[iR] : 0L;
                int i12 = s2Var.f19772e;
                long j13 = (j11 * 1000000) / ((long) i12);
                long j14 = this.f19279b;
                b3 b3Var = new b3(j13, j12 + j14);
                if (j13 == j10 || iR == jArr.length - 1) {
                    return new z2(b3Var, b3Var);
                }
                int i13 = iR + 1;
                return new z2(b3Var, new b3((jArr[i13] * 1000000) / ((long) i12), j14 + jArr2[i13]));
            case 1:
                return (z2) obj;
            default:
                o3 o3Var = (o3) obj;
                z2 z2VarA = o3Var.f18101i[0].a(j10);
                while (true) {
                    r3[] r3VarArr = o3Var.f18101i;
                    if (i11 >= r3VarArr.length) {
                        return z2VarA;
                    }
                    z2 z2VarA2 = r3VarArr[i11].a(j10);
                    if (z2VarA2.f22469a.f12620b < z2VarA.f22469a.f12620b) {
                        z2VarA = z2VarA2;
                    }
                    i11++;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        switch (this.f19278a) {
            case 0:
                return ((s2) this.f19280c).e();
            case 1:
                return this.f19279b;
            default:
                return this.f19279b;
        }
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        switch (this.f19278a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    public r2(long j10, long j11) {
        this.f19278a = 1;
        this.f19279b = j10;
        b3 b3Var = j11 == 0 ? b3.f12618c : new b3(0L, j11);
        this.f19280c = new z2(b3Var, b3Var);
    }
}
