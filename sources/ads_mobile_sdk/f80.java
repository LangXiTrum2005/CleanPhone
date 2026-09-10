package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.eia;
import saneness.footbinding;

/* JADX INFO: loaded from: classes.dex */
public final class f80 {
    public final i60 a;
    public h21 b;
    public coffeecake c;
    public coffeecake d;
    public h21 e;
    public h21 f;
    public coffeecake g;
    public coffeecake h;
    public coffeecake i;

    public f80(i60 i60Var, yf2 yf2Var, String str, Boolean bool) {
        this.a = i60Var;
        a(yf2Var, str, bool);
    }

    public final void a(yf2 yf2Var, String str, Boolean bool) {
        this.b = h21.a(str);
        h21 h21Var = eia.f37136attabal;
        wb2 wb2Var = new wb2(h21Var, h21Var, h21Var);
        Object obj = qd0.c;
        this.c = new qd0(wb2Var);
        this.d = new qd0(new vb2(this.a.o0));
        this.e = h21.a(yf2Var);
        this.f = h21Var;
        h21 h21VarA = h21.a(bool);
        i60 i60Var = this.a;
        this.g = new qd0(new hy0(i60Var.Q0, this.e, this.f, this.d, h21VarA, i60Var.g));
        qd0 qd0Var = new qd0(footbinding.f37150attabal);
        this.h = qd0Var;
        qd0 qd0Var2 = new qd0(new ub2(this.a.t, qd0Var));
        i60 i60Var2 = this.a;
        this.i = new qd0(new sa2(i60Var2.l3, i60Var2.D2, i60Var2.i1, this.b, i60Var2.v2, i60Var2.t, this.c, i60Var2.p, i60Var2.H, this.d, this.e, i60Var2.D, this.g, i60Var2.z, i60Var2.B0, qd0Var2));
    }
}
