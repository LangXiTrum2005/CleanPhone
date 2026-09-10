package ads_mobile_sdk;

import saneness.carport;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class qb1 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public qb1(coffeecake coffeecakeVar, h21 h21Var) {
        this.a = coffeecakeVar;
        this.b = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new pb1((yj1) this.a.get(), (carport) this.b.get());
    }
}
