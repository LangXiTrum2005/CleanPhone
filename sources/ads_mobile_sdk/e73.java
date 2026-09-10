package ads_mobile_sdk;

import p002kotlin.coroutines.CoroutineContext;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class e73 implements coi {
    public final coffeecake a;

    public e73(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new d73((CoroutineContext) this.a.get());
    }
}
