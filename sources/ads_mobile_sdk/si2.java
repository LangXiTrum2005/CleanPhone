package ads_mobile_sdk;

import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class si2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public si2(coffeecake coffeecakeVar, hb0 hb0Var, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = hb0Var;
        this.c = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new ri2((x) this.a.get(), (loun) this.b.get(), (amphitheatre) this.c.get());
    }
}
