package ads_mobile_sdk;

import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class pp2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public pp2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new op2((ri2) this.a.get(), (amphitheatre) this.b.get(), (jk0) this.c.get());
    }
}
