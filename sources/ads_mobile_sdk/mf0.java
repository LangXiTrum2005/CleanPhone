package ads_mobile_sdk;

import saneness.blighty;
import saneness.coffeecake;
import saneness.coi;
import saneness.hobby;

/* JADX INFO: loaded from: classes.dex */
public final class mf0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public mf0(hb0 hb0Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = hb0Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new lf0(this.a, (hobby) this.b.get(), (jk0) this.c.get(), (blighty) this.d.get());
    }
}
