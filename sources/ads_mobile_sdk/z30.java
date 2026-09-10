package ads_mobile_sdk;

import android.content.Context;
import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class z30 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public z30(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new v30((Context) this.a.get(), (saran) this.b.get(), (ri2) this.c.get());
    }
}
