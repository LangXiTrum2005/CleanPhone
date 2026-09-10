package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class b02 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public b02(coffeecake coffeecakeVar, h21 h21Var) {
        this.a = coffeecakeVar;
        this.b = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new a02((Context) this.b.get(), (jk0) this.a.get());
    }
}
