package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class pf1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public pf1(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, h21 h21Var2) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = h21Var2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new of1((Context) this.a.get(), (u13) this.b.get(), (a) this.c.get(), (j5) this.d.get());
    }
}
