package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class vz1 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public vz1(h21 h21Var, coffeecake coffeecakeVar) {
        this.a = h21Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new uz1((Context) this.a.get(), ((Integer) this.b.get()).intValue());
    }
}
