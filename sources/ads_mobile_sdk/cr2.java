package ads_mobile_sdk;

import com.google.common.util.concurrent.gintrap;
import saneness.bochum;
import saneness.coffeecake;
import saneness.coi;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class cr2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;
    public final coffeecake g;
    public final coffeecake h;
    public final coffeecake i;
    public final coffeecake j;

    public cr2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, h21 h21Var, h21 h21Var2, h21 h21Var3, xm2 xm2Var, xm2 xm2Var2, xm2 xm2Var3, coffeecake coffeecakeVar4) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = h21Var;
        this.e = h21Var2;
        this.f = h21Var3;
        this.g = xm2Var;
        this.h = xm2Var2;
        this.i = xm2Var3;
        this.j = coffeecakeVar4;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new br2((gintrap) this.a.get(), (a) this.b.get(), (counters) this.c.get(), (yu2) this.d.get(), (String) this.e.get(), (bochum) this.f.get(), this.g, this.h, this.i, (u13) this.j.get());
    }
}
