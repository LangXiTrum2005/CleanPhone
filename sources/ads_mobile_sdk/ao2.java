package ads_mobile_sdk;

import p002kotlin.coroutines.CoroutineContext;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ao2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public ao2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new zn2((CoroutineContext) this.a.get(), (yj1) this.b.get(), (sr1) this.c.get());
    }
}
