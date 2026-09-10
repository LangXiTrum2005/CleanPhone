package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class d33 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public d33(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5, hb0 hb0Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
        this.e = coffeecakeVar5;
        this.f = hb0Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        jk0 jk0Var = (jk0) this.a.get();
        amphitheatre amphitheatreVar = (amphitheatre) this.b.get();
        saran saranVar = (saran) this.c.get();
        ri2 ri2Var = (ri2) this.d.get();
        return new c33((iv) this.f.get(), jk0Var, (x) this.e.get(), ri2Var, amphitheatreVar, saranVar);
    }
}
