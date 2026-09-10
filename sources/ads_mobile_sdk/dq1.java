package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.grimness;

/* JADX INFO: loaded from: classes.dex */
public final class dq1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public dq1(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, nq1 nq1Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = nq1Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new cq1((ri2) this.a.get(), (g83) this.b.get(), (grimness) this.c.get());
    }
}
