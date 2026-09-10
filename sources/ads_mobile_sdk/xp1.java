package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.thomist;

/* JADX INFO: loaded from: classes.dex */
public final class xp1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public xp1(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, tp1 tp1Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = tp1Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new wp1((ri2) this.a.get(), (g83) this.b.get(), (thomist) this.c.get());
    }
}
