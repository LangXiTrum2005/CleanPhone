package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class tc0 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public tc0(h21 h21Var, coffeecake coffeecakeVar) {
        this.a = h21Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new sc0((Context) this.a.get(), (jk0) this.b.get());
    }
}
