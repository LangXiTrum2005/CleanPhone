package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class yi implements coi {
    public final coffeecake a;

    public yi(h21 h21Var) {
        this.a = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new xi(((Boolean) this.a.get()).booleanValue());
    }
}
