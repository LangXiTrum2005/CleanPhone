package ads_mobile_sdk;

import complexometry.formularize;
import liquory.marial;
import saneness.coffeecake;
import saneness.dight;
import saneness.eia;
import saneness.footbinding;

/* JADX INFO: loaded from: classes.dex */
public final class h80 implements dight {
    public final i60 a;
    public coffeecake b;
    public h21 c;
    public coffeecake d;
    public coffeecake e;
    public h21 f;
    public h21 g;
    public b80 h;
    public coffeecake i;
    public coffeecake j;
    public coffeecake k;

    public h80(i60 i60Var, formularize formularizeVar, yf2 yf2Var, Boolean bool, Boolean bool2, marial marialVar) {
        this.a = i60Var;
        a(formularizeVar, yf2Var, bool, bool2, marialVar);
    }

    public final void a(formularize formularizeVar, yf2 yf2Var, Boolean bool, Boolean bool2, marial marialVar) {
        i60 i60Var = this.a;
        fe2 fe2Var = new fe2(i60Var.t, i60Var.g, i60Var.p);
        Object obj = qd0.c;
        this.b = new qd0(fe2Var);
        this.c = h21.a(marialVar);
        h21 h21Var = eia.f37136attabal;
        this.d = new qd0(new wb2(h21Var, h21Var, h21Var));
        this.e = new qd0(new vb2(this.a.o0));
        this.f = h21.a(yf2Var);
        this.g = h21.a(bool2);
        this.h = new b80(h21.a(formularizeVar));
        h21 h21VarA = h21.a(bool);
        i60 i60Var2 = this.a;
        this.i = new qd0(new hy0(i60Var2.Q0, this.f, this.h, this.e, h21VarA, i60Var2.g));
        qd0 qd0Var = new qd0(footbinding.f37150attabal);
        this.j = qd0Var;
        qd0 qd0Var2 = new qd0(new ub2(this.a.t, qd0Var));
        i60 i60Var3 = this.a;
        this.k = new qd0(new oa2(i60Var3.d, i60Var3.u, i60Var3.u2, i60Var3.v2, i60Var3.t, i60Var3.x2, this.b, i60Var3.y2, this.c, this.d, i60Var3.p, i60Var3.H, this.e, this.f, i60Var3.D, this.g, this.i, qd0Var2));
    }

    @Override // saneness.pigboat
    public final k92 b() {
        return (na2) this.k.get();
    }

    @Override // saneness.pigboat
    public final gy0 a() {
        return (gy0) this.i.get();
    }
}
