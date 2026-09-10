package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class yl2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;

    public yl2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, h21 h21Var, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = h21Var;
        this.d = coffeecakeVar3;
        this.e = coffeecakeVar4;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new xl2((String) this.a.get(), (jk0) this.b.get(), (Context) this.c.get(), (ip0) this.d.get(), (String) this.e.get());
    }
}
