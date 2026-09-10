package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class ky0 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public ky0(coffeecake coffeecakeVar, hb0 hb0Var) {
        this.a = coffeecakeVar;
        this.b = hb0Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new jy0((v8) this.a.get(), (loun) this.b.get());
    }
}
