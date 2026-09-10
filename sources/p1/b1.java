package p1;

import android.util.Pair;
import f2.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends i1.p0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f47961k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f47963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f47966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f47967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i1.p0[] f47968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object[] f47969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f47970j;

    /* JADX WARN: Illegal instructions before constructor call */
    public b1(ArrayList arrayList, f1 f1Var) {
        i1.p0[] p0VarArr = new i1.p0[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            p0VarArr[i11] = ((o0) it.next()).b();
            i11++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i10] = ((o0) it2.next()).a();
            i10++;
        }
        this(p0VarArr, objArr, f1Var);
    }

    @Override // i1.p0
    public final int a(boolean z10) {
        if (this.f47962b != 0) {
            int iQ = 0;
            if (z10) {
                int[] iArr = this.f47963c.f40337b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                i1.p0[] p0VarArr = this.f47968h;
                if (!p0VarArr[iQ].p()) {
                    return p0VarArr[iQ].a(z10) + this.f47967g[iQ];
                }
                iQ = q(iQ, z10);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // i1.p0
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f47970j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.f47968h[iIntValue].b(obj3)) != -1) {
                return this.f47966f[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // i1.p0
    public final int c(boolean z10) {
        int iR;
        int i10 = this.f47962b;
        if (i10 != 0) {
            if (z10) {
                int[] iArr = this.f47963c.f40337b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i10 - 1;
            }
            do {
                i1.p0[] p0VarArr = this.f47968h;
                if (!p0VarArr[iR].p()) {
                    return p0VarArr[iR].c(z10) + this.f47967g[iR];
                }
                iR = r(iR, z10);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // i1.p0
    public final int e(int i10, int i11, boolean z10) {
        int[] iArr = this.f47967g;
        int iE = l1.y.e(iArr, i10 + 1, false, false);
        int i12 = iArr[iE];
        i1.p0[] p0VarArr = this.f47968h;
        int iE2 = p0VarArr[iE].e(i10 - i12, i11 != 2 ? i11 : 0, z10);
        if (iE2 != -1) {
            return i12 + iE2;
        }
        int iQ = q(iE, z10);
        while (iQ != -1 && p0VarArr[iQ].p()) {
            iQ = q(iQ, z10);
        }
        if (iQ != -1) {
            return p0VarArr[iQ].a(z10) + iArr[iQ];
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // i1.p0
    public final i1.n0 f(int i10, i1.n0 n0Var, boolean z10) {
        int[] iArr = this.f47966f;
        int iE = l1.y.e(iArr, i10 + 1, false, false);
        int i11 = this.f47967g[iE];
        this.f47968h[iE].f(i10 - iArr[iE], n0Var, z10);
        n0Var.f42584c += i11;
        if (z10) {
            Object obj = this.f47969i[iE];
            Object obj2 = n0Var.f42583b;
            obj2.getClass();
            n0Var.f42583b = Pair.create(obj, obj2);
        }
        return n0Var;
    }

    @Override // i1.p0
    public final i1.n0 g(Object obj, i1.n0 n0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f47970j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i10 = this.f47967g[iIntValue];
        this.f47968h[iIntValue].g(obj3, n0Var);
        n0Var.f42584c += i10;
        n0Var.f42583b = obj;
        return n0Var;
    }

    @Override // i1.p0
    public final int h() {
        return this.f47965e;
    }

    @Override // i1.p0
    public final int k(int i10, int i11) {
        int[] iArr = this.f47967g;
        int iE = l1.y.e(iArr, i10 + 1, false, false);
        int i12 = iArr[iE];
        i1.p0[] p0VarArr = this.f47968h;
        int iK = p0VarArr[iE].k(i10 - i12, i11 == 2 ? 0 : i11);
        if (iK != -1) {
            return i12 + iK;
        }
        int iR = r(iE, false);
        while (iR != -1 && p0VarArr[iR].p()) {
            iR = r(iR, false);
        }
        if (iR != -1) {
            return p0VarArr[iR].c(false) + iArr[iR];
        }
        if (i11 == 2) {
            return c(false);
        }
        return -1;
    }

    @Override // i1.p0
    public final Object l(int i10) {
        int[] iArr = this.f47966f;
        int iE = l1.y.e(iArr, i10 + 1, false, false);
        return Pair.create(this.f47969i[iE], this.f47968h[iE].l(i10 - iArr[iE]));
    }

    @Override // i1.p0
    public final i1.o0 m(int i10, i1.o0 o0Var, long j10) {
        int[] iArr = this.f47967g;
        int iE = l1.y.e(iArr, i10 + 1, false, false);
        int i11 = iArr[iE];
        int i12 = this.f47966f[iE];
        this.f47968h[iE].m(i10 - i11, o0Var, j10);
        Object objCreate = this.f47969i[iE];
        if (!i1.o0.f42614q.equals(o0Var.f42616a)) {
            objCreate = Pair.create(objCreate, o0Var.f42616a);
        }
        o0Var.f42616a = objCreate;
        o0Var.f42628n += i12;
        o0Var.f42629o += i12;
        return o0Var;
    }

    @Override // i1.p0
    public final int o() {
        return this.f47964d;
    }

    public final int q(int i10, boolean z10) {
        if (!z10) {
            if (i10 < this.f47962b - 1) {
                return i10 + 1;
            }
            return -1;
        }
        f1 f1Var = this.f47963c;
        int i11 = f1Var.f40338c[i10] + 1;
        int[] iArr = f1Var.f40337b;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    public final int r(int i10, boolean z10) {
        if (!z10) {
            if (i10 > 0) {
                return i10 - 1;
            }
            return -1;
        }
        f1 f1Var = this.f47963c;
        int i11 = f1Var.f40338c[i10] - 1;
        if (i11 >= 0) {
            return f1Var.f40337b[i11];
        }
        return -1;
    }

    public b1(i1.p0[] p0VarArr, Object[] objArr, f1 f1Var) {
        this.f47963c = f1Var;
        this.f47962b = f1Var.f40337b.length;
        int length = p0VarArr.length;
        this.f47968h = p0VarArr;
        this.f47966f = new int[length];
        this.f47967g = new int[length];
        this.f47969i = objArr;
        this.f47970j = new HashMap();
        int length2 = p0VarArr.length;
        int i10 = 0;
        int iO = 0;
        int iH = 0;
        int i11 = 0;
        while (i10 < length2) {
            i1.p0 p0Var = p0VarArr[i10];
            this.f47968h[i11] = p0Var;
            this.f47967g[i11] = iO;
            this.f47966f[i11] = iH;
            iO += p0Var.o();
            iH += this.f47968h[i11].h();
            this.f47970j.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f47964d = iO;
        this.f47965e = iH;
    }
}
