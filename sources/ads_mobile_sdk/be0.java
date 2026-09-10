package ads_mobile_sdk;

import android.content.Context;
import saneness.bochum;
import saneness.coffeecake;
import saneness.coi;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class be0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public be0(h21 h21Var, coffeecake coffeecakeVar, h21 h21Var2, coffeecake coffeecakeVar2) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = h21Var2;
        this.d = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new ae0((bochum) this.a.get(), (counters) this.b.get(), (Context) this.c.get(), (u13) this.d.get());
    }
}
