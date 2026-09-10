package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class yl1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public yl1(h21 h21Var, coffeecake coffeecakeVar, hb0 hb0Var) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = hb0Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new xl1((Context) this.a.get(), (jk0) this.b.get(), (loun) this.c.get());
    }
}
