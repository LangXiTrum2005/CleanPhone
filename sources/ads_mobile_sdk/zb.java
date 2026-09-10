package ads_mobile_sdk;

import android.content.Context;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class zb implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;
    public final coffeecake g;
    public final coffeecake h;

    public zb(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, hb0 hb0Var, coffeecake coffeecakeVar5, coffeecake coffeecakeVar6) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
        this.e = coffeecakeVar4;
        this.f = hb0Var;
        this.g = coffeecakeVar5;
        this.h = coffeecakeVar6;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new yb((Context) this.a.get(), (String) this.b.get(), (String) this.c.get(), (String) this.d.get(), (amphitheatre) this.e.get(), (iv) this.f.get(), (vo) this.g.get(), (jk0) this.h.get());
    }
}
