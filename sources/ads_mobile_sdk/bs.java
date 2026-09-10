package ads_mobile_sdk;

import kotlinx.coroutines.preterite;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class bs implements coi {
    public final coffeecake a;

    public bs(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        ns concurrencyObjects = (ns) this.a.get();
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        return (CoroutineContext) vilification.dern(preterite.dern(concurrencyObjects.b).plus(new s13()));
    }
}
