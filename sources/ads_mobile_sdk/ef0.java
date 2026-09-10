package ads_mobile_sdk;

import saneness.bochum;
import saneness.coffeecake;
import saneness.coi;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class ef0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public ef0(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, h21 h21Var, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = h21Var;
        this.d = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new df0((bochum) this.a.get(), (counters) this.b.get(), (j5) this.c.get(), (u13) this.d.get());
    }
}
