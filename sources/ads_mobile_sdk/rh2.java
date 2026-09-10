package ads_mobile_sdk;

import java.util.Map;
import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;
import saneness.vinyl;

/* JADX INFO: loaded from: classes.dex */
public final class rh2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public rh2(coffeecake coffeecakeVar, coi coiVar) {
        this.a = coffeecakeVar;
        this.b = coiVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new vinyl((saran) this.a.get(), (Map) this.b.get());
    }
}
