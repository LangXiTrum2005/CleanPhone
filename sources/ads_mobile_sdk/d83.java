package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;
import saneness.lateral;
import saneness.microchemistry;

/* JADX INFO: loaded from: classes.dex */
public final class d83 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public d83(h21 h21Var, hb0 hb0Var, coffeecake coffeecakeVar) {
        this.a = h21Var;
        this.b = hb0Var;
        this.c = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new microchemistry((Context) this.a.get(), (lateral) this.b.get(), (jk0) this.c.get());
    }
}
