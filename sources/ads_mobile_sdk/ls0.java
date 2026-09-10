package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ls0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public ls0(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new ks0((saran) this.a.get(), (yj1) this.b.get(), (sr1) this.c.get());
    }
}
