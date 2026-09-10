package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class nr1 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public nr1(coffeecake coffeecakeVar, h21 h21Var) {
        this.a = coffeecakeVar;
        this.b = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new mr1((yj1) this.a.get(), (hj1) this.b.get());
    }
}
