package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class l63 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public l63(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new k63((Context) this.a.get(), (String) this.b.get(), (sj0) this.c.get());
    }
}
