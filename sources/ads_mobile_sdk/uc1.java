package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class uc1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;

    public uc1(h21 h21Var, coffeecake coffeecakeVar, hb0 hb0Var, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = hb0Var;
        this.d = coffeecakeVar2;
        this.e = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new tc1((Context) this.a.get(), (String) this.b.get(), (iv) this.c.get(), (ip0) this.d.get(), (jk0) this.e.get());
    }
}
