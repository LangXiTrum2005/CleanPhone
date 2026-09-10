package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ec1 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public ec1(coffeecake coffeecakeVar, h21 h21Var) {
        this.a = coffeecakeVar;
        this.b = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new dc1((wg0) this.a.get(), (h1) this.b.get());
    }
}
