package ads_mobile_sdk;

import android.content.Context;
import com.google.common.util.concurrent.gintrap;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class km0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public km0(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, h21 h21Var2) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = h21Var2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new jm0((Context) this.a.get(), (j5) this.d.get(), (u13) this.b.get(), (gintrap) this.c.get());
    }
}
