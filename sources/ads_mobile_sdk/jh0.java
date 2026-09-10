package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class jh0 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public jh0(hb0 hb0Var, coffeecake coffeecakeVar) {
        this.a = hb0Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new ih0((iv) this.a.get(), (wg0) this.b.get());
    }
}
