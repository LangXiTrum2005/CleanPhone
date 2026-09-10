package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.delouse;

/* JADX INFO: loaded from: classes.dex */
public final class m62 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public m62(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, h21 h21Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        delouse delouseVarA = qd0.a(this.a);
        delouse delouseVarA2 = qd0.a(this.b);
        delouse delouseVarA3 = qd0.a(this.c);
        j5 j5Var = (j5) this.d.get();
        return new l62(delouseVarA, delouseVarA2, delouseVarA3, j5Var.J().v(), j5Var.J().o());
    }
}
