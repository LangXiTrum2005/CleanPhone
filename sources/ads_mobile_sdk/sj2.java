package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class sj2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public sj2(hb0 hb0Var, h21 h21Var) {
        this.a = hb0Var;
        this.b = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new rj2((e2) this.a.get(), (h1) this.b.get());
    }
}
