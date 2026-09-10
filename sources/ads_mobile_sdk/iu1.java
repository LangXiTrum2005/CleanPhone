package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class iu1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;

    public iu1(h21 h21Var, h21 h21Var2, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = h21Var;
        this.b = h21Var2;
        this.c = coffeecakeVar;
        this.d = coffeecakeVar2;
        this.e = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new hu1((h1) this.a.get(), (ur) this.b.get(), (js1) this.c.get(), (au1) this.d.get(), (jk0) this.e.get());
    }
}
