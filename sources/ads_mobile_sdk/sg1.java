package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class sg1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;
    public final coffeecake g;

    public sg1(vh1 vh1Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, ci1 ci1Var, ei1 ei1Var, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4) {
        this.a = vh1Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = ci1Var;
        this.e = ei1Var;
        this.f = coffeecakeVar3;
        this.g = coffeecakeVar4;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new rg1(qd0.a(this.a), qd0.a(this.b), qd0.a(this.c), qd0.a(this.d), qd0.a(this.e), (x) this.f.get(), (gk2) this.g.get());
    }
}
