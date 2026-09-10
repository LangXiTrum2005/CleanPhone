package p2;

import go.k;
import java.math.RoundingMode;
import l1.y;
import n2.a0;
import n2.s;
import n2.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f48233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f48234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f48239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f48240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f48241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f48242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f48243k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long[] f48244m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f48245n;

    public e(int i10, d dVar, a0 a0Var) {
        int i11 = dVar.f48230d;
        this.f48233a = dVar;
        int iA = dVar.a();
        boolean z10 = true;
        if (iA != 1 && iA != 2) {
            z10 = false;
        }
        k.i(z10);
        int i12 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f48235c = (iA == 2 ? 1667497984 : 1651965952) | i12;
        long j10 = ((long) dVar.f48228b) * 1000000;
        long j11 = dVar.f48229c;
        String str = y.f44830a;
        this.f48237e = y.U(i11, j10, j11, RoundingMode.DOWN);
        this.f48234b = a0Var;
        this.f48236d = iA == 2 ? i12 | 1650720768 : -1;
        this.l = -1L;
        this.f48244m = new long[512];
        this.f48245n = new int[512];
        this.f48238f = i11;
    }

    public final u a(int i10) {
        return new u(((this.f48237e * ((long) 1)) / ((long) this.f48238f)) * ((long) this.f48245n[i10]), this.f48244m[i10]);
    }

    public final s b(long j10) {
        if (this.f48243k == 0) {
            u uVar = new u(0L, this.l);
            return new s(uVar, uVar);
        }
        int i10 = (int) (j10 / ((this.f48237e * ((long) 1)) / ((long) this.f48238f)));
        int iE = y.e(this.f48245n, i10, true, true);
        if (this.f48245n[iE] == i10) {
            u uVarA = a(iE);
            return new s(uVarA, uVarA);
        }
        u uVarA2 = a(iE);
        int i11 = iE + 1;
        return i11 < this.f48244m.length ? new s(uVarA2, a(i11)) : new s(uVarA2, uVarA2);
    }
}
