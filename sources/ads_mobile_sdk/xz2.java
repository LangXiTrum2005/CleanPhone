package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class xz2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public xz2(h21 h21Var, coffeecake coffeecakeVar) {
        this.a = h21Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new wz2((hj1) this.a.get(), (saran) this.b.get());
    }
}
