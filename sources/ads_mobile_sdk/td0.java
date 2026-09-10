package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class td0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public td0(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        Context context = (Context) this.a.get();
        return new x62(context, context.getSharedPreferences("pcvmspf2", 0), qd0.a(this.b), (u13) this.c.get());
    }
}
