package ads_mobile_sdk;

import complexometry.competently;
import complexometry.formularize;
import saneness.coffeecake;
import saneness.eia;
import saneness.footbinding;
import saneness.pigboat;

/* JADX INFO: loaded from: classes.dex */
public final class n80 implements pigboat {
    public final i60 a;
    public h21 b;
    public coffeecake c;
    public coffeecake d;
    public h21 e;
    public h21 f;
    public b80 g;
    public coffeecake h;
    public coffeecake i;

    public n80(i60 i60Var, competently competentlyVar, formularize formularizeVar, yf2 yf2Var, Boolean bool, Boolean bool2) {
        this.a = i60Var;
        a(competentlyVar, formularizeVar, yf2Var, bool, bool2);
    }

    public final void a(competently competentlyVar, formularize formularizeVar, yf2 yf2Var, Boolean bool, Boolean bool2) {
        this.b = h21.a(competentlyVar);
        h21 h21Var = eia.f37136attabal;
        wb2 wb2Var = new wb2(h21Var, h21Var, h21Var);
        Object obj = qd0.c;
        this.c = new qd0(wb2Var);
        this.d = new qd0(new vb2(this.a.o0));
        this.e = h21.a(yf2Var);
        this.f = h21.a(bool2);
        this.g = new b80(h21.a(formularizeVar));
        h21 h21VarA = h21.a(bool);
        i60 i60Var = this.a;
        this.h = new qd0(new hy0(i60Var.Q0, this.e, this.g, this.d, h21VarA, i60Var.g));
        qd0 qd0Var = new qd0(new ub2(this.a.t, new qd0(footbinding.f37150attabal)));
        i60 i60Var2 = this.a;
        this.i = new qd0(new db2(i60Var2.v2, i60Var2.t, this.b, this.c, i60Var2.p, i60Var2.H, this.d, this.e, i60Var2.D, this.f, this.h, i60Var2.z2, qd0Var));
    }

    @Override // saneness.pigboat
    public final k92 b() {
        return (cb2) this.i.get();
    }

    @Override // saneness.pigboat
    public final gy0 a() {
        return (gy0) this.h.get();
    }
}
