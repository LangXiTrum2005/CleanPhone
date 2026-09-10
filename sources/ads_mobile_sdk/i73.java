package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class i73 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public i73(h21 h21Var, coffeecake coffeecakeVar) {
        this.a = h21Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new h73((Context) this.a.get(), (x) this.b.get());
    }
}
