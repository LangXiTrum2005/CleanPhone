package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public d0(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new c0((saran) this.a.get(), (jk0) this.b.get());
    }
}
