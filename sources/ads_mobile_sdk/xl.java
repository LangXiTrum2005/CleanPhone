package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.hobby;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class xl implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public xl(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, hb0 hb0Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = hb0Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new wl((hobby) this.a.get(), (jk0) this.b.get(), (loun) this.c.get());
    }
}
