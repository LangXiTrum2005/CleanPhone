package ads_mobile_sdk;

import java.util.Map;
import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public f2(coffeecake coffeecakeVar, bd1 bd1Var, h21 h21Var) {
        this.a = coffeecakeVar;
        this.b = bd1Var;
        this.c = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new e2((saran) this.a.get(), (Map) this.b.get(), (h1) this.c.get());
    }
}
