package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class s53 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public s53(hb0 hb0Var, hb0 hb0Var2) {
        this.a = hb0Var;
        this.b = hb0Var2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new r53((iv) this.a.get(), (loun) this.b.get());
    }
}
