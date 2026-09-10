package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class jv2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public jv2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, f71 f71Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = f71Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new iv2((c7) this.a.get(), (ah) this.b.get(), (String) this.c.get(), ((Long) this.d.get()).longValue());
    }
}
