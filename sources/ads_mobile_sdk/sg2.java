package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class sg2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public sg2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, tg2 tg2Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = tg2Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new rg2((h1) this.a.get(), (ur) this.b.get(), (qg2) this.c.get());
    }
}
