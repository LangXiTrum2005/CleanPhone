package ads_mobile_sdk;

import saneness.blighty;
import saneness.coffeecake;
import saneness.coi;
import saneness.hobby;

/* JADX INFO: loaded from: classes.dex */
public final class hh1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public hh1(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new gh1((jk0) this.a.get(), (blighty) this.b.get(), (hobby) this.c.get());
    }
}
