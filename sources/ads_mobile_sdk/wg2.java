package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.vinyl;

/* JADX INFO: loaded from: classes.dex */
public final class wg2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public wg2(coffeecake coffeecakeVar, h21 h21Var) {
        this.a = coffeecakeVar;
        this.b = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new vg2((vinyl) this.a.get(), (h1) this.b.get());
    }
}
