package ads_mobile_sdk;

import java.util.Optional;
import kotlinx.coroutines.saran;
import saneness.ballistician;
import saneness.coffeecake;
import saneness.coi;
import saneness.vinyl;

/* JADX INFO: loaded from: classes.dex */
public final class iy2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public iy2(coffeecake coffeecakeVar, h21 h21Var, hb0 hb0Var, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4) {
        this.a = coffeecakeVar;
        this.b = h21Var;
        this.c = hb0Var;
        this.d = coffeecakeVar2;
        this.e = coffeecakeVar3;
        this.f = coffeecakeVar4;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new hy2((saran) this.a.get(), (h1) this.b.get(), (e2) this.c.get(), (vinyl) this.d.get(), (ballistician) this.e.get(), (Optional) this.f.get());
    }
}
