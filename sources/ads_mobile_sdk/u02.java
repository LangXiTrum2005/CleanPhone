package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class u02 implements coi {
    public final coffeecake a;

    public u02(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new t02((rc2) this.a.get());
    }
}
