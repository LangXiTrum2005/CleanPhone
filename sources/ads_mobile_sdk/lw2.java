package ads_mobile_sdk;

import java.util.concurrent.ExecutorService;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class lw2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public lw2(coffeecake coffeecakeVar, h21 h21Var, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = h21Var;
        this.c = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new kw2((x62) this.a.get(), (ExecutorService) this.b.get(), (u13) this.c.get());
    }
}
