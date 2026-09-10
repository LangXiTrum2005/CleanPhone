package ads_mobile_sdk;

import android.content.Context;
import java.util.Optional;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class b6 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public b6(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, h21 h21Var, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = h21Var;
        this.d = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new a6((Optional) this.a.get(), (yf2) this.b.get(), (Context) this.c.get(), (jk0) this.d.get());
    }
}
