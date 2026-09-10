package ads_mobile_sdk;

import android.content.Context;
import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class y23 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public y23(coffeecake coffeecakeVar, h21 h21Var, hb0 hb0Var) {
        this.a = coffeecakeVar;
        this.b = h21Var;
        this.c = hb0Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new x23((saran) this.a.get(), (Context) this.b.get(), (loun) this.c.get());
    }
}
