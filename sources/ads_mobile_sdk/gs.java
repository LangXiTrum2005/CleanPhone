package ads_mobile_sdk;

import kotlinx.coroutines.premeiotic;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class gs implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public gs(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        ns concurrencyObjects = (ns) this.a.get();
        hn0 exceptionHandler = (hn0) this.b.get();
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        return (CoroutineContext) vilification.dern(premeiotic.dern().plus(exceptionHandler).plus(new s13()));
    }
}
