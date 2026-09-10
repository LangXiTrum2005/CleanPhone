package ads_mobile_sdk;

import saneness.bochum;
import saneness.coffeecake;
import saneness.coi;
import saneness.counters;
import saneness.quadrennium;

/* JADX INFO: loaded from: classes.dex */
public final class hc0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public hc0(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new quadrennium((bochum) this.a.get(), (counters) this.b.get(), (u13) this.c.get());
    }
}
