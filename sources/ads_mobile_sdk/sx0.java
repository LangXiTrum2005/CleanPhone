package ads_mobile_sdk;

import java.util.concurrent.ExecutorService;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class sx0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public sx0(xm2 xm2Var, xm2 xm2Var2, h21 h21Var, coffeecake coffeecakeVar) {
        this.a = xm2Var;
        this.b = xm2Var2;
        this.c = h21Var;
        this.d = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new rx0(qd0.a(this.a), qd0.a(this.b), (ExecutorService) this.c.get(), qd0.a(this.d));
    }
}
