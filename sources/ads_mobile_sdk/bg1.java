package ads_mobile_sdk;

import android.content.Context;
import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class bg1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public bg1(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new ag1((Context) this.a.get(), (saran) this.b.get(), (x) this.c.get());
    }
}
