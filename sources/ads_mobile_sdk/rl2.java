package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;
import saneness.supercargo;

/* JADX INFO: loaded from: classes.dex */
public final class rl2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public rl2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new ql2((saran) this.a.get(), (jk0) this.b.get(), (supercargo) this.c.get());
    }
}
