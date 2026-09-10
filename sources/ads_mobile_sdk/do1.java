package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;
import saneness.collection;

/* JADX INFO: loaded from: classes.dex */
public final class do1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;
    public final coffeecake g;

    public do1(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5, coffeecake coffeecakeVar6, ou2 ou2Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
        this.e = coffeecakeVar5;
        this.f = coffeecakeVar6;
        this.g = ou2Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new co1((saran) this.a.get(), (saran) this.b.get(), (jk0) this.c.get(), (g83) this.d.get(), (ri2) this.e.get(), this.f, (collection) this.g.get());
    }
}
