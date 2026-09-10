package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;
import saneness.hobby;

/* JADX INFO: loaded from: classes.dex */
public final class db3 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public db3(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, h21 h21Var, coffeecake coffeecakeVar5) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
        this.e = h21Var;
        this.f = coffeecakeVar5;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new cb3((wg0) this.a.get(), (saran) this.b.get(), (ip0) this.c.get(), (jk0) this.d.get(), (h1) this.e.get(), (hobby) this.f.get());
    }
}
