package n2;

import com.google.android.gms.internal.ads.s2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class o implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f46482c;

    public /* synthetic */ o(Object obj, long j10, int i10) {
        this.f46480a = i10;
        this.f46482c = obj;
        this.f46481b = j10;
    }

    @Override // n2.t
    public final long getDurationUs() {
        switch (this.f46480a) {
            case 0:
                return ((s2) this.f46482c).b();
            case 1:
                return this.f46481b;
            default:
                return this.f46481b;
        }
    }

    @Override // n2.t
    public final s getSeekPoints(long j10) {
        switch (this.f46480a) {
            case 0:
                s2 s2Var = (s2) this.f46482c;
                ((m5.k) s2Var.f19778k).getClass();
                m5.k kVar = (m5.k) s2Var.f19778k;
                long[] jArr = (long[]) kVar.f45902b;
                long[] jArr2 = (long[]) kVar.f45903c;
                int iF = l1.y.f(jArr, l1.y.k((((long) s2Var.f19772e) * j10) / 1000000, 0L, s2Var.f19777j - 1), false);
                long j11 = iF == -1 ? 0L : jArr[iF];
                long j12 = iF != -1 ? jArr2[iF] : 0L;
                int i10 = s2Var.f19772e;
                long j13 = (j11 * 1000000) / ((long) i10);
                long j14 = this.f46481b;
                u uVar = new u(j13, j12 + j14);
                if (j13 == j10 || iF == jArr.length - 1) {
                    return new s(uVar, uVar);
                }
                int i11 = iF + 1;
                return new s(uVar, new u((jArr[i11] * 1000000) / ((long) i10), j14 + jArr2[i11]));
            case 1:
                return (s) this.f46482c;
            default:
                p2.b bVar = (p2.b) this.f46482c;
                s sVarB = bVar.f48217i[0].b(j10);
                int i12 = 1;
                while (true) {
                    p2.e[] eVarArr = bVar.f48217i;
                    if (i12 >= eVarArr.length) {
                        return sVarB;
                    }
                    s sVarB2 = eVarArr[i12].b(j10);
                    if (sVarB2.f46490a.f46494b < sVarB.f46490a.f46494b) {
                        sVarB = sVarB2;
                    }
                    i12++;
                }
                break;
        }
    }

    @Override // n2.t
    public final boolean isSeekable() {
        switch (this.f46480a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(long j10) {
        this(j10, 0L);
        this.f46480a = 1;
    }

    public o(long j10, long j11) {
        this.f46480a = 1;
        this.f46481b = j10;
        u uVar = j11 == 0 ? u.f46492c : new u(0L, j11);
        this.f46482c = new s(uVar, uVar);
    }
}
