package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.hobby;

/* JADX INFO: loaded from: classes.dex */
public final class wa0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public wa0(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new va0((jk0) this.a.get(), (vg) this.b.get(), (hobby) this.c.get(), (ja0) this.d.get());
    }
}
