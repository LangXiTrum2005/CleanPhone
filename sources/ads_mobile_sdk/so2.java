package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class so2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;

    public so2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, e60 e60Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
        this.e = e60Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new po2((saran) this.a.get(), (jk0) this.b.get(), (amphitheatre) this.c.get(), (ri2) this.d.get(), this.e);
    }
}
