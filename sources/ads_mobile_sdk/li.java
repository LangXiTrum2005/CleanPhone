package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;
import saneness.phytopathogen;

/* JADX INFO: loaded from: classes.dex */
public final class li implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public li(coffeecake coffeecakeVar, h21 h21Var) {
        this.a = coffeecakeVar;
        this.b = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new ki((saran) this.a.get(), (phytopathogen) this.b.get());
    }
}
