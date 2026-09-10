package i2;

import i1.q0;
import java.util.Comparator;
import oa.j0;
import oa.l1;
import oa.m1;
import oa.w1;
import oa.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends n implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f42788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f42789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f42790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f42791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f42792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f42793k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f42794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f42795n;

    public l(int i10, q0 q0Var, int i11, i iVar, int i12, String str, String str2) {
        int iD;
        super(i10, q0Var, i11);
        int i13 = 0;
        this.f42788f = p1.a.k(i12, false);
        int i14 = this.f42799d.f42635e;
        iVar.getClass();
        j0 j0Var = iVar.f42689r;
        this.f42789g = (i14 & 1) != 0;
        this.f42790h = (i14 & 2) != 0;
        j0 j0VarB = str2 != null ? j0.B(str2) : j0Var.isEmpty() ? j0.B("") : j0Var;
        int i15 = 0;
        while (true) {
            if (i15 >= j0VarB.size()) {
                iD = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iD = p.d(this.f42799d, (String) j0VarB.get(i15), false);
                if (iD > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f42791i = i15;
        this.f42792j = iD;
        int i16 = str2 != null ? 1088 : 0;
        int i17 = this.f42799d.f42636f;
        m1 m1Var = p.f42818k;
        int iBitCount = (i17 == 0 || i17 != i16) ? Integer.bitCount(i16 & i17) : Integer.MAX_VALUE;
        this.f42793k = iBitCount;
        i1.p pVar = this.f42799d;
        this.f42795n = (1088 & pVar.f42636f) != 0;
        int iB = p.b(pVar, iVar.f42690s);
        this.l = iB;
        int iD2 = p.d(this.f42799d, str, p.f(str) == null);
        this.f42794m = iD2;
        boolean z10 = iD > 0 || (j0Var.isEmpty() && iBitCount > 0) || ((j0Var.isEmpty() && iB != Integer.MAX_VALUE) || this.f42789g || (this.f42790h && iD2 > 0));
        if (p1.a.k(i12, iVar.B) && z10) {
            i13 = 1;
        }
        this.f42787e = i13;
    }

    @Override // i2.n
    public final int a() {
        return this.f42787e;
    }

    @Override // i2.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        y yVarC = y.f47346a.c(this.f42788f, lVar.f42788f);
        Integer numValueOf = Integer.valueOf(this.f42791i);
        Integer numValueOf2 = Integer.valueOf(lVar.f42791i);
        Comparator comparator = w1.f47340a;
        y yVarB = yVarC.b(numValueOf, numValueOf2, comparator);
        int i10 = lVar.f42792j;
        int i11 = this.f42792j;
        y yVarA = yVarB.a(i11, i10);
        int i12 = lVar.f42793k;
        int i13 = this.f42793k;
        y yVarC2 = yVarA.a(i13, i12).b(Integer.valueOf(this.l), Integer.valueOf(lVar.l), comparator).c(this.f42789g, lVar.f42789g);
        Boolean boolValueOf = Boolean.valueOf(this.f42790h);
        Boolean boolValueOf2 = Boolean.valueOf(lVar.f42790h);
        if (i11 == 0) {
            comparator = l1.f47272a;
        }
        y yVarA2 = yVarC2.b(boolValueOf, boolValueOf2, comparator).a(this.f42794m, lVar.f42794m);
        if (i13 == 0) {
            yVarA2 = yVarA2.d(this.f42795n, lVar.f42795n);
        }
        return yVarA2.e();
    }
}
