package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class yn1 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public yn1(hb0 hb0Var, sg2 sg2Var) {
        this.a = hb0Var;
        this.b = sg2Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new xn1((e2) this.a.get(), (rg2) this.b.get());
    }
}
