package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class h6 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;
    public final coffeecake g;

    public h6(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5, coffeecake coffeecakeVar6) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
        this.e = coffeecakeVar4;
        this.f = coffeecakeVar5;
        this.g = coffeecakeVar6;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new g6((Context) this.a.get(), (jk0) this.b.get(), (ip0) this.c.get(), (x) this.d.get(), (ns) this.e.get(), (String) this.f.get(), (ri2) this.g.get());
    }
}
