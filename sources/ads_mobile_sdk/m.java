package ads_mobile_sdk;

import java.util.Map;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class m implements coi {
    public final coffeecake a;

    public m(bd1 bd1Var) {
        this.a = bd1Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new l((Map) this.a.get());
    }
}
