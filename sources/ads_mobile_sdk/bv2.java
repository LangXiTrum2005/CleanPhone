package ads_mobile_sdk;

import java.util.Set;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class bv2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public bv2(coffeecake coffeecakeVar, xm2 xm2Var) {
        this.a = coffeecakeVar;
        this.b = xm2Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new av2((vu2) this.a.get(), (Set) this.b.get());
    }
}
