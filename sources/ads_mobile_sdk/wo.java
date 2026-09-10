package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;
import saneness.microchemistry;

/* JADX INFO: loaded from: classes.dex */
public final class wo implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;

    public wo(coffeecake coffeecakeVar, hb0 hb0Var, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4) {
        this.a = coffeecakeVar;
        this.b = hb0Var;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
        this.e = coffeecakeVar4;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new vo((saran) this.a.get(), (microchemistry) this.b.get(), (ri2) this.c.get(), (jk0) this.d.get(), (ip0) this.e.get());
    }
}
