package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class fe2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public fe2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new ee2((saran) this.a.get(), (amphitheatre) this.b.get(), (jk0) this.c.get());
    }
}
