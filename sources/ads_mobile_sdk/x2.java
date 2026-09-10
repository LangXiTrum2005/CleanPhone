package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.gotcha;

/* JADX INFO: loaded from: classes.dex */
public final class x2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public x2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new w2((y2) this.a.get(), (gotcha) this.b.get());
    }
}
