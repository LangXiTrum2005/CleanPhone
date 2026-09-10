package ads_mobile_sdk;

import complexometry.formularize;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ap implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public ap(coi coiVar, coffeecake coffeecakeVar, h21 h21Var, coffeecake coffeecakeVar2) {
        this.a = coiVar;
        this.b = coffeecakeVar;
        this.c = h21Var;
        this.d = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new zo((yf2) this.a.get(), (ug) this.b.get(), (formularize) this.c.get(), (bt) this.d.get());
    }
}
