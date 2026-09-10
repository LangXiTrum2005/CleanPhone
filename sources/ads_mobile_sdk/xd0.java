package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;
import saneness.madbrain;
import saneness.psalmodic;

/* JADX INFO: loaded from: classes.dex */
public final class xd0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;

    public xd0(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, h21 h21Var2) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
        this.e = h21Var2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new u73((Context) this.a.get(), (madbrain) this.b.get(), (psalmodic) this.c.get(), (q73) this.d.get(), ((j5) this.e.get()).s());
    }
}
