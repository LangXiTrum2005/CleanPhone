package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class g22 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public g22(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new f22((h1) this.a.get(), (k22) this.b.get(), (jk0) this.c.get());
    }
}
