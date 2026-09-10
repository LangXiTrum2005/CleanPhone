package ads_mobile_sdk;

import p002kotlin.coroutines.CoroutineContext;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class do2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public do2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new co2((CoroutineContext) this.a.get(), (yj1) this.b.get());
    }
}
