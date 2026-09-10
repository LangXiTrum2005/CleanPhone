package ads_mobile_sdk;

import complexometry.formularize;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class g7 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public g7(coffeecake coffeecakeVar, h21 h21Var) {
        this.a = coffeecakeVar;
        this.b = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new f7((c7) this.a.get(), (formularize) this.b.get());
    }
}
