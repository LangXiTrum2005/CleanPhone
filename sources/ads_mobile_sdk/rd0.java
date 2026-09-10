package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.neurotropism;

/* JADX INFO: loaded from: classes.dex */
public final class rd0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public rd0(h21 h21Var, h21 h21Var2, coffeecake coffeecakeVar) {
        this.a = h21Var;
        this.b = h21Var2;
        this.c = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new x4((neurotropism) this.c.get());
    }
}
