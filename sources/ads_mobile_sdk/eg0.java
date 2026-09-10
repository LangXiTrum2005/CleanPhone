package ads_mobile_sdk;

import java.util.concurrent.ExecutorService;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class eg0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;
    public final coffeecake g;

    public eg0(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, h40 h40Var, h21 h21Var2) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
        this.e = coffeecakeVar4;
        this.f = h40Var;
        this.g = h21Var2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new cg0((ExecutorService) this.a.get(), qd0.a(this.b), qd0.a(this.c), (av2) this.d.get(), qd0.a(this.e), this.f, (j5) this.g.get());
    }
}
