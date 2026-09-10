package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class an0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public an0(hb0 hb0Var, coffeecake coffeecakeVar, hb0 hb0Var2) {
        this.a = hb0Var;
        this.b = coffeecakeVar;
        this.c = hb0Var2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new zm0((iv) this.a.get(), (jk0) this.b.get(), (loun) this.c.get());
    }
}
