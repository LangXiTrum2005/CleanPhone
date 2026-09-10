package ads_mobile_sdk;

import android.content.Context;
import complexometry.formularize;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class a81 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public a81(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, h21 h21Var, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, s50 s50Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = h21Var;
        this.d = coffeecakeVar3;
        this.e = coffeecakeVar4;
        this.f = s50Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new z71((formularize) this.a.get(), (lf2) this.b.get(), (Context) this.c.get(), (x) this.d.get(), (yb0) this.e.get(), this.f);
    }
}
