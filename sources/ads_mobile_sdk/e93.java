package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.homozygous;

/* JADX INFO: loaded from: classes.dex */
public final class e93 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public e93(h21 h21Var, coffeecake coffeecakeVar) {
        this.a = h21Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new d93((gq0) this.a.get(), (homozygous) this.b.get());
    }
}
