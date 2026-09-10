package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class rc0 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public rc0(h21 h21Var, hb0 hb0Var) {
        this.a = h21Var;
        this.b = hb0Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new qc0((Context) this.a.get(), (loun) this.b.get());
    }
}
