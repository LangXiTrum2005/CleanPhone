package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ev2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public ev2(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new dv2((Context) this.a.get(), (qc0) this.b.get(), (jk0) this.c.get(), (ip0) this.d.get());
    }
}
