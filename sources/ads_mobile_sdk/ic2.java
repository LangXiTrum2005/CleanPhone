package ads_mobile_sdk;

import complexometry.formularize;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ic2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public ic2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, h21 h21Var, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = h21Var;
        this.d = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new hc2((ah) this.a.get(), (c7) this.b.get(), (formularize) this.c.get(), (vg) this.d.get());
    }
}
