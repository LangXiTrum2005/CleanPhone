package ads_mobile_sdk;

import java.util.Optional;
import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class sa3 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public sa3(coffeecake coffeecakeVar, b80 b80Var) {
        this.a = coffeecakeVar;
        this.b = b80Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new ra3((saran) this.a.get(), (Optional) this.b.get());
    }
}
