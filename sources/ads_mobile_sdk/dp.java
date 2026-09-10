package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class dp implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;

    public dp(coffeecake coffeecakeVar, hb0 hb0Var, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, h21 h21Var) {
        this.a = coffeecakeVar;
        this.b = hb0Var;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
        this.e = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new cp((g6) this.a.get(), (e2) this.b.get(), (oh) this.c.get(), (ch0) this.d.get(), (h1) this.e.get());
    }
}
