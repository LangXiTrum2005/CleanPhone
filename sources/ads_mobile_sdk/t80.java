package ads_mobile_sdk;

import complexometry.competently;
import complexometry.formularize;
import saneness.coffeecake;
import saneness.eia;
import saneness.footbinding;
import saneness.pigboat;

/* JADX INFO: loaded from: classes.dex */
public final class t80 implements pigboat {
    public final i60 a;
    public coffeecake b;
    public coffeecake c;
    public h21 d;
    public h21 e;
    public b80 f;
    public coffeecake g;
    public h21 h;
    public coffeecake i;

    public t80(i60 i60Var, competently competentlyVar, formularize formularizeVar, yf2 yf2Var, Boolean bool, Boolean bool2) {
        this.a = i60Var;
        a(competentlyVar, formularizeVar, yf2Var, bool, bool2);
    }

    @Override // saneness.pigboat
    public final gy0 a() {
        return (gy0) this.g.get();
    }

    @Override // saneness.pigboat
    public final k92 b() {
        return (yb2) this.i.get();
    }

    public final void a(competently competentlyVar, formularize formularizeVar, yf2 yf2Var, Boolean bool, Boolean bool2) {
        h21 h21Var = eia.f37136attabal;
        wb2 wb2Var = new wb2(h21Var, h21Var, h21Var);
        Object obj = qd0.c;
        this.b = new qd0(wb2Var);
        this.c = new qd0(new vb2(this.a.o0));
        this.d = h21.a(yf2Var);
        this.e = h21.a(bool2);
        this.f = new b80(h21.a(formularizeVar));
        h21 h21VarA = h21.a(bool);
        i60 i60Var = this.a;
        this.g = new qd0(new hy0(i60Var.Q0, this.d, this.f, this.c, h21VarA, i60Var.g));
        this.h = h21.a(competentlyVar);
        qd0 qd0Var = new qd0(new ub2(this.a.t, new qd0(footbinding.f37150attabal)));
        i60 i60Var2 = this.a;
        this.i = new qd0(new zb2(i60Var2.v2, i60Var2.t, this.b, i60Var2.p, i60Var2.H, this.c, this.d, i60Var2.D, this.e, this.g, this.h, i60Var2.B2, qd0Var));
    }
}
