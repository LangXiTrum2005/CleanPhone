package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class wp2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public wp2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new vp2((jk0) this.a.get(), (py) this.b.get(), (adjudge.saneness) this.c.get());
    }
}
