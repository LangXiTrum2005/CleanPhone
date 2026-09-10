package ads_mobile_sdk;

import android.content.Context;
import java.util.Set;
import kotlinx.coroutines.saran;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class ms1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;

    public ms1(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, hb0 hb0Var, xm2 xm2Var) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = hb0Var;
        this.e = xm2Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new js1((Context) this.a.get(), (saran) this.b.get(), (amphitheatre) this.c.get(), (loun) this.d.get(), (Set) this.e.get());
    }
}
