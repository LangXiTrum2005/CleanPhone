package ads_mobile_sdk;

import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class tj0 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public tj0(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new sj0(qd0.a(this.a), (amphitheatre) this.b.get());
    }
}
