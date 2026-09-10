package ads_mobile_sdk;

import java.util.Map;
import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;
import saneness.gotcha;

/* JADX INFO: loaded from: classes.dex */
public final class u2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public u2(coffeecake coffeecakeVar, bd1 bd1Var) {
        this.a = coffeecakeVar;
        this.b = bd1Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new gotcha((saran) this.a.get(), (Map) this.b.get());
    }
}
