package ads_mobile_sdk;

import java.util.Map;
import saneness.bochum;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public q0(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, h21 h21Var, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = h21Var;
        this.d = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new p0((bochum) this.a.get(), (Map) this.b.get(), (j5) this.c.get(), (u13) this.d.get());
    }
}
