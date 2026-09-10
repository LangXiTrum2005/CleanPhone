package ads_mobile_sdk;

import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;
import saneness.neurotropism;

/* JADX INFO: loaded from: classes.dex */
public final class v13 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public v13(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new u13((amphitheatre) this.a.get(), (neurotropism) this.b.get());
    }
}
