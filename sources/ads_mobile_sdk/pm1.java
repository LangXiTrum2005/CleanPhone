package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.webby;

/* JADX INFO: loaded from: classes.dex */
public final class pm1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public pm1(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new om1((webby) this.a.get(), (km1) this.b.get(), (uo1) this.c.get());
    }
}
