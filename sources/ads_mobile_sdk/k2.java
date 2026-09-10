package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class k2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public k2(coffeecake coffeecakeVar, hb0 hb0Var, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5) {
        this.a = coffeecakeVar;
        this.b = hb0Var;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
        this.e = coffeecakeVar4;
        this.f = coffeecakeVar5;
    }

    @Override // saneness.adultoid
    public final Object get() {
        saran saranVar = (saran) this.a.get();
        iv ivVar = (iv) this.b.get();
        amphitheatre amphitheatreVar = (amphitheatre) this.c.get();
        return new j2(ivVar, (jk0) this.d.get(), (x) this.f.get(), (ri2) this.e.get(), amphitheatreVar, saranVar);
    }
}
