package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;
import saneness.psalmodic;

/* JADX INFO: loaded from: classes.dex */
public final class sd0 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public sd0(h21 h21Var, coffeecake coffeecakeVar) {
        this.a = h21Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new eh((Context) this.a.get(), (psalmodic) this.b.get()).a();
    }
}
