package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class xg0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public xg0(h21 h21Var, hb0 hb0Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = h21Var;
        this.b = hb0Var;
        this.c = coffeecakeVar;
        this.d = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new wg0((Context) this.a.get(), (loun) this.b.get(), (ri2) this.c.get(), (jk0) this.d.get());
    }
}
