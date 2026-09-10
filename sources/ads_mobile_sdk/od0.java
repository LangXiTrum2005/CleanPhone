package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class od0 implements coi {
    public final coffeecake a;

    public od0(h21 h21Var) {
        this.a = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new nd0((Context) this.a.get());
    }
}
