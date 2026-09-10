package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class g73 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public g73(hb0 hb0Var, coffeecake coffeecakeVar) {
        this.a = hb0Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new f73((loun) this.a.get(), (saran) this.b.get());
    }
}
