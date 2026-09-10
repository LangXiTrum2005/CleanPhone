package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class vo1 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public vo1(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new uo1((jk0) this.a.get(), (yj1) this.b.get());
    }
}
