package ads_mobile_sdk;

import complexometry.formularize;
import java.util.Optional;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class yj2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public yj2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, qj2 qj2Var, coi coiVar, h21 h21Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = qj2Var;
        this.e = coiVar;
        this.f = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new xj2((jk0) this.a.get(), (Optional) this.b.get(), (Optional) this.c.get(), (pj2) this.d.get(), (yf2) this.e.get(), (formularize) this.f.get());
    }
}
