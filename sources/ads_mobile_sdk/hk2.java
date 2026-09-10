package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.hobby;

/* JADX INFO: loaded from: classes.dex */
public final class hk2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public hk2(coffeecake coffeecakeVar, h21 h21Var, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5) {
        this.a = coffeecakeVar;
        this.b = h21Var;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
        this.e = coffeecakeVar4;
        this.f = coffeecakeVar5;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new gk2((String) this.a.get(), (h1) this.b.get(), (ip0) this.c.get(), (hobby) this.d.get(), (yf2) this.e.get(), (jk0) this.f.get());
    }
}
