package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class hd0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public hd0(h21 h21Var, h21 h21Var2, coffeecake coffeecakeVar) {
        this.a = h21Var;
        this.b = h21Var2;
        this.c = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new gd0((Context) this.a.get(), (j5) this.b.get(), (av2) this.c.get());
    }
}
