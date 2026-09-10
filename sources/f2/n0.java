package f2;

import com.google.android.gms.internal.ads.q2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final i1.y f40410s;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a[] f40411k;
    public final ArrayList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i1.p0[] f40412m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f40413n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ea.b0 f40414o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f40415p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long[][] f40416q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b2.z f40417r;

    static {
        q2 q2Var = new q2();
        oa.f0 f0Var = oa.j0.f47265b;
        n1 n1Var = n1.f47281e;
        List list = Collections.EMPTY_LIST;
        n1 n1Var2 = n1.f47281e;
        i1.t tVar = new i1.t();
        f40410s = new i1.y("MergingMediaSource", new i1.s(q2Var), null, new i1.u(tVar), i1.a0.B, i1.w.f42711a);
    }

    public n0(a... aVarArr) {
        ea.b0 b0Var = new ea.b0(12);
        this.f40411k = aVarArr;
        this.f40414o = b0Var;
        this.f40413n = new ArrayList(Arrays.asList(aVarArr));
        this.f40415p = -1;
        this.l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.l.add(new ArrayList());
        }
        this.f40412m = new i1.p0[aVarArr.length];
        this.f40416q = new long[0][];
        new HashMap();
        oa.q.d(8, "expectedKeys");
        oa.q.d(2, "expectedValuesPerKey");
        new oa.j1(oa.u.e(8)).f47266f = new oa.i1();
    }

    @Override // f2.l
    public final void A(Object obj, a aVar, i1.p0 p0Var) {
        Integer num = (Integer) obj;
        if (this.f40417r != null) {
            return;
        }
        if (this.f40415p == -1) {
            this.f40415p = p0Var.h();
        } else if (p0Var.h() != this.f40415p) {
            this.f40417r = new b2.z();
            return;
        }
        int length = this.f40416q.length;
        i1.p0[] p0VarArr = this.f40412m;
        if (length == 0) {
            this.f40416q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f40415p, p0VarArr.length);
        }
        ArrayList arrayList = this.f40413n;
        arrayList.remove(aVar);
        p0VarArr[num.intValue()] = p0Var;
        if (arrayList.isEmpty()) {
            q(p0VarArr[0]);
        }
    }

    @Override // f2.a
    public final a0 c(c0 c0Var, v9.e eVar, long j10) {
        a[] aVarArr = this.f40411k;
        int length = aVarArr.length;
        a0[] a0VarArr = new a0[length];
        i1.p0[] p0VarArr = this.f40412m;
        int iB = p0VarArr[0].b(c0Var.f40307a);
        for (int i10 = 0; i10 < length; i10++) {
            c0 c0VarA = c0Var.a(p0VarArr[i10].l(iB));
            a0VarArr[i10] = aVarArr[i10].c(c0VarA, eVar, j10 - this.f40416q[iB][i10]);
            ((List) this.l.get(i10)).add(new m0(c0VarA, a0VarArr[i10]));
        }
        return new l0(this.f40414o, this.f40416q[iB], a0VarArr);
    }

    @Override // f2.a
    public final i1.y k() {
        a[] aVarArr = this.f40411k;
        return aVarArr.length > 0 ? aVarArr[0].k() : f40410s;
    }

    @Override // f2.l, f2.a
    public final void m() throws b2.z {
        b2.z zVar = this.f40417r;
        if (zVar != null) {
            throw zVar;
        }
        super.m();
    }

    @Override // f2.a
    public final void p(n1.z zVar) {
        this.f40391j = zVar;
        this.f40390i = l1.y.q(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f40411k;
            if (i10 >= aVarArr.length) {
                return;
            }
            B(Integer.valueOf(i10), aVarArr[i10]);
            i10++;
        }
    }

    @Override // f2.a
    public final void r(a0 a0Var) {
        l0 l0Var = (l0) a0Var;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f40411k;
            if (i10 >= aVarArr.length) {
                return;
            }
            List list = (List) this.l.get(i10);
            a0[] a0VarArr = l0Var.f40392a;
            boolean[] zArr = l0Var.f40393b;
            a0 a0Var2 = zArr[i10] ? ((i1) a0VarArr[i10]).f40372a : a0VarArr[i10];
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (((m0) list.get(i11)).f40406b.equals(a0Var2)) {
                    list.remove(i11);
                    break;
                }
            }
            a aVar = aVarArr[i10];
            a0[] a0VarArr2 = l0Var.f40392a;
            aVar.r(zArr[i10] ? ((i1) a0VarArr2[i10]).f40372a : a0VarArr2[i10]);
            i10++;
        }
    }

    @Override // f2.l, f2.a
    public final void t() {
        super.t();
        Arrays.fill(this.f40412m, (Object) null);
        this.f40415p = -1;
        this.f40417r = null;
        ArrayList arrayList = this.f40413n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f40411k);
    }

    @Override // f2.a
    public final void w(i1.y yVar) {
        this.f40411k[0].w(yVar);
    }

    @Override // f2.l
    public final c0 x(Object obj, c0 c0Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((m0) list.get(i10)).f40405a.equals(c0Var)) {
                return ((m0) ((List) arrayList.get(0)).get(i10)).f40405a;
            }
        }
        return null;
    }
}
