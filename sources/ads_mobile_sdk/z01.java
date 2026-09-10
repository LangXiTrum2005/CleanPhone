package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class z01 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public z01(hb0 hb0Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = hb0Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new y01((loun) this.a.get(), (lf2) this.b.get(), (wf) this.c.get());
    }
}
