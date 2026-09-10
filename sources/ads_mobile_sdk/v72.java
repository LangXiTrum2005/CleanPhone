package ads_mobile_sdk;

import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class v72 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public v72(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, h21 h21Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new ed0(qd0.a(this.a), (u13) this.b.get(), (amphitheatre) this.c.get(), ((j5) this.d.get()).J().s());
    }
}
