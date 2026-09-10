package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x.e f4929a = new x.e(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x.g f4930b = new x.g();

    public final void a(h1 h1Var, m0 m0Var) {
        x.e eVar = this.f4929a;
        q1 q1VarA = (q1) eVar.get(h1Var);
        if (q1VarA == null) {
            q1VarA = q1.a();
            eVar.put(h1Var, q1VarA);
        }
        q1VarA.f4899c = m0Var;
        q1VarA.f4897a |= 8;
    }

    public final m0 b(h1 h1Var, int i10) {
        q1 q1Var;
        m0 m0Var;
        x.e eVar = this.f4929a;
        int iD = eVar.d(h1Var);
        if (iD >= 0 && (q1Var = (q1) eVar.j(iD)) != null) {
            int i11 = q1Var.f4897a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                q1Var.f4897a = i12;
                if (i10 == 4) {
                    m0Var = q1Var.f4898b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    m0Var = q1Var.f4899c;
                }
                if ((i12 & 12) == 0) {
                    eVar.h(iD);
                    q1Var.f4897a = 0;
                    q1Var.f4898b = null;
                    q1Var.f4899c = null;
                    q1.f4896d.e(q1Var);
                }
                return m0Var;
            }
        }
        return null;
    }

    public final void c(h1 h1Var) {
        q1 q1Var = (q1) this.f4929a.get(h1Var);
        if (q1Var == null) {
            return;
        }
        q1Var.f4897a &= -2;
    }

    public final void d(h1 h1Var) {
        x.g gVar = this.f4930b;
        for (int iE = gVar.e() - 1; iE >= 0; iE--) {
            if (h1Var == gVar.f(iE)) {
                Object[] objArr = gVar.f53500c;
                Object obj = objArr[iE];
                Object obj2 = x.h.f53502a;
                if (obj == obj2) {
                    break;
                }
                objArr[iE] = obj2;
                gVar.f53498a = true;
                break;
            }
        }
        q1 q1Var = (q1) this.f4929a.remove(h1Var);
        if (q1Var != null) {
            q1Var.f4897a = 0;
            q1Var.f4898b = null;
            q1Var.f4899c = null;
            q1.f4896d.e(q1Var);
        }
    }
}
