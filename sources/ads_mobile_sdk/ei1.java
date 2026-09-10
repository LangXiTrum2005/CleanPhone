package ads_mobile_sdk;

import saneness.ahermatype;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ei1 implements coi {
    public final coffeecake a;

    public ei1(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new di1((ahermatype) this.a.get());
    }
}
