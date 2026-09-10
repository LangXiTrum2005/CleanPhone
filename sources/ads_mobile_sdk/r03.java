package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class r03 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public r03(h21 h21Var, hb0 hb0Var, hb0 hb0Var2, coffeecake coffeecakeVar) {
        this.a = h21Var;
        this.b = hb0Var;
        this.c = hb0Var2;
        this.d = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new q03((Context) this.a.get(), (iv) this.b.get(), (loun) this.c.get(), (jk0) this.d.get());
    }
}
