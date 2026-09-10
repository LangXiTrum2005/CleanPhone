package ads_mobile_sdk;

import android.content.Context;
import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class jh implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public jh(h21 h21Var, coffeecake coffeecakeVar) {
        this.a = h21Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new ih((Context) this.a.get(), (saran) this.b.get());
    }
}
