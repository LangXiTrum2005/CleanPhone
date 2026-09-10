package ads_mobile_sdk;

import saneness.bochum;
import saneness.coffeecake;
import saneness.coi;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class z81 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public z81(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new y81((bochum) this.a.get(), (counters) this.b.get(), (u13) this.c.get());
    }
}
