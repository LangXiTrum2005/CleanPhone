package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class y30 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public y30(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new x30((v30) this.a.get(), (saran) this.b.get(), (jk0) this.c.get());
    }
}
