package ads_mobile_sdk;

import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class w72 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public w72(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, h21 h21Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new bz1((amphitheatre) this.a.get(), (u13) this.b.get(), ((j5) this.c.get()).J().s());
    }
}
