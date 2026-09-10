package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class gg implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public gg(h21 h21Var, hb0 hb0Var) {
        this.a = h21Var;
        this.b = hb0Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new wf((Context) this.a.get(), (loun) this.b.get());
    }
}
