package ads_mobile_sdk;

import p002kotlin.coroutines.CoroutineContext;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class yg implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public yg(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new ug((CoroutineContext) this.a.get(), (yf) this.b.get(), (amphitheatre) this.c.get(), (jk0) this.d.get());
    }
}
