package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class oz1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;
    public final coffeecake g;
    public final coffeecake h;
    public final coffeecake i;

    public oz1(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, hb0 hb0Var, j50 j50Var, u50 u50Var, b60 b60Var, c60 c60Var, d60 d60Var) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = hb0Var;
        this.e = j50Var;
        this.f = u50Var;
        this.g = b60Var;
        this.h = c60Var;
        this.i = d60Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new nz1((Context) this.a.get(), (ip0) this.b.get(), (x) this.c.get(), (wz0) this.d.get(), this.e, this.f, this.g, this.h, this.i);
    }
}
