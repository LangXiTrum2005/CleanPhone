package ads_mobile_sdk;

import p002kotlin.coroutines.CoroutineContext;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class yw1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public yw1(coffeecake coffeecakeVar, h21 h21Var, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = h21Var;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new xw1((lv1) this.a.get(), (h1) this.b.get(), (jk0) this.c.get(), (CoroutineContext) this.d.get());
    }
}
