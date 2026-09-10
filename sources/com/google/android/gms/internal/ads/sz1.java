package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sz1 extends ci {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f20092k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q42 f20094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f20097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f20098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ci[] f20099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object[] f20100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f20101j;

    public sz1(ci[] ciVarArr, Object[] objArr, q42 q42Var) {
        this.f20094c = q42Var;
        this.f20093b = q42Var.f18927b.length;
        this.f20099h = ciVarArr;
        int length = ciVarArr.length;
        this.f20097f = new int[length];
        this.f20098g = new int[length];
        this.f20100i = objArr;
        this.f20101j = new HashMap();
        int i10 = 0;
        int iA = 0;
        int iC = 0;
        int i11 = 0;
        while (i10 < ciVarArr.length) {
            ci ciVar = ciVarArr[i10];
            this.f20099h[i11] = ciVar;
            this.f20098g[i11] = iA;
            this.f20097f[i11] = iC;
            iA += ciVar.a();
            iC += this.f20099h[i11].c();
            this.f20101j.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f20095d = iA;
        this.f20096e = iC;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int a() {
        return this.f20095d;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final ih b(int i10, ih ihVar, long j10) {
        int[] iArr = this.f20098g;
        int iQ = uu0.q(iArr, i10 + 1, false, false);
        int i11 = iArr[iQ];
        int i12 = this.f20097f[iQ];
        this.f20099h[iQ].b(i10 - i11, ihVar, j10);
        Object objCreate = this.f20100i[iQ];
        if (!ih.f15742m.equals(ihVar.f15744a)) {
            objCreate = Pair.create(objCreate, ihVar.f15744a);
        }
        ihVar.f15744a = objCreate;
        ihVar.f15754k += i12;
        ihVar.l += i12;
        return ihVar;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int c() {
        return this.f20096e;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final ug d(int i10, ug ugVar, boolean z10) {
        int[] iArr = this.f20097f;
        int iQ = uu0.q(iArr, i10 + 1, false, false);
        int i11 = this.f20098g[iQ];
        this.f20099h[iQ].d(i10 - iArr[iQ], ugVar, z10);
        ugVar.f20772c += i11;
        if (z10) {
            Object obj = this.f20100i[iQ];
            Object obj2 = ugVar.f20771b;
            obj2.getClass();
            ugVar.f20771b = Pair.create(obj, obj2);
        }
        return ugVar;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int e(Object obj) {
        int iE;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f20101j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iE = this.f20099h[iIntValue].e(obj3)) != -1) {
                return this.f20097f[iIntValue] + iE;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final Object f(int i10) {
        int[] iArr = this.f20097f;
        int iQ = uu0.q(iArr, i10 + 1, false, false);
        return Pair.create(this.f20100i[iQ], this.f20099h[iQ].f(i10 - iArr[iQ]));
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int h(int i10, int i11, boolean z10) {
        int[] iArr = this.f20098g;
        int iQ = uu0.q(iArr, i10 + 1, false, false);
        int i12 = iArr[iQ];
        ci[] ciVarArr = this.f20099h;
        int iH = ciVarArr[iQ].h(i10 - i12, i11 != 2 ? i11 : 0, z10);
        if (iH != -1) {
            return i12 + iH;
        }
        int iP = p(iQ, z10);
        while (iP != -1 && ciVarArr[iP].g()) {
            iP = p(iP, z10);
        }
        if (iP != -1) {
            return ciVarArr[iP].k(z10) + iArr[iP];
        }
        if (i11 == 2) {
            return k(z10);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int i(int i10) {
        int[] iArr = this.f20098g;
        int iQ = uu0.q(iArr, i10 + 1, false, false);
        int i11 = iArr[iQ];
        ci[] ciVarArr = this.f20099h;
        int i12 = ciVarArr[iQ].i(i10 - i11);
        if (i12 != -1) {
            return i11 + i12;
        }
        int iQ2 = q(iQ, false);
        while (iQ2 != -1 && ciVarArr[iQ2].g()) {
            iQ2 = q(iQ2, false);
        }
        if (iQ2 == -1) {
            return -1;
        }
        return ciVarArr[iQ2].j(false) + iArr[iQ2];
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int j(boolean z10) {
        int iQ;
        int i10 = this.f20093b;
        if (i10 != 0) {
            if (z10) {
                int[] iArr = this.f20094c.f18927b;
                int length = iArr.length;
                iQ = length > 0 ? iArr[length - 1] : -1;
            } else {
                iQ = i10 - 1;
            }
            do {
                ci[] ciVarArr = this.f20099h;
                if (!ciVarArr[iQ].g()) {
                    return ciVarArr[iQ].j(z10) + this.f20098g[iQ];
                }
                iQ = q(iQ, z10);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int k(boolean z10) {
        if (this.f20093b != 0) {
            int iP = 0;
            if (z10) {
                int[] iArr = this.f20094c.f18927b;
                iP = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                ci[] ciVarArr = this.f20099h;
                if (!ciVarArr[iP].g()) {
                    return ciVarArr[iP].k(z10) + this.f20098g[iP];
                }
                iP = p(iP, z10);
            } while (iP != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final ug o(Object obj, ug ugVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f20101j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i10 = this.f20098g[iIntValue];
        this.f20099h[iIntValue].o(obj3, ugVar);
        ugVar.f20772c += i10;
        ugVar.f20771b = obj;
        return ugVar;
    }

    public final int p(int i10, boolean z10) {
        if (!z10) {
            if (i10 >= this.f20093b - 1) {
                return -1;
            }
            return i10 + 1;
        }
        q42 q42Var = this.f20094c;
        int i11 = q42Var.f18928c[i10] + 1;
        int[] iArr = q42Var.f18927b;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    public final int q(int i10, boolean z10) {
        if (!z10) {
            if (i10 <= 0) {
                return -1;
            }
            return i10 - 1;
        }
        q42 q42Var = this.f20094c;
        int i11 = q42Var.f18928c[i10] - 1;
        if (i11 >= 0) {
            return q42Var.f18927b[i11];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sz1(List list, q42 q42Var) {
        ci[] ciVarArr = new ci[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            ciVarArr[i11] = ((gz1) it.next()).zzb();
            i11++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i10] = ((gz1) it2.next()).zza();
            i10++;
        }
        this(ciVarArr, objArr, q42Var);
    }
}
