package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class xb0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public xb0(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new wb0((saran) this.a.get(), (jk0) this.b.get(), (l13) this.c.get(), (ri2) this.d.get());
    }
}
