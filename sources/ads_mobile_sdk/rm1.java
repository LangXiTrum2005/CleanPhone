package ads_mobile_sdk;

import android.content.Context;
import complexometry.formularize;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class rm1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;
    public final coffeecake g;

    public rm1(coffeecake coffeecakeVar, h21 h21Var, coffeecake coffeecakeVar2, h21 h21Var2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, w50 w50Var) {
        this.a = coffeecakeVar;
        this.b = h21Var;
        this.c = coffeecakeVar2;
        this.d = h21Var2;
        this.e = coffeecakeVar3;
        this.f = coffeecakeVar4;
        this.g = w50Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new qm1((formularize) this.a.get(), (com.google.android.libraries.ads.mobile.sdk.nativead.dern) this.b.get(), (lf2) this.c.get(), (Context) this.d.get(), (x) this.e.get(), (yb0) this.f.get(), this.g);
    }
}
