package ads_mobile_sdk;

import android.content.Context;
import java.util.Optional;
import saneness.coffeecake;
import saneness.coi;
import saneness.kaif;
import saneness.loun;
import saneness.supercargo;

/* JADX INFO: loaded from: classes.dex */
public final class kf2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;
    public final coffeecake g;
    public final coffeecake h;
    public final coffeecake i;

    public kf2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, hb0 hb0Var, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5, coffeecake coffeecakeVar6, coffeecake coffeecakeVar7, h21 h21Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = hb0Var;
        this.d = coffeecakeVar3;
        this.e = coffeecakeVar4;
        this.f = coffeecakeVar5;
        this.g = coffeecakeVar6;
        this.h = coffeecakeVar7;
        this.i = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new jf2((jk0) this.a.get(), (vg) this.b.get(), (loun) this.c.get(), (zl) this.d.get(), (Optional) this.e.get(), (kaif) this.f.get(), (supercargo) this.g.get(), ((Integer) this.h.get()).intValue(), (Context) this.i.get());
    }
}
