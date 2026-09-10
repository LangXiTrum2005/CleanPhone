package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.rockless;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class ag implements coi {
    public final coffeecake a;

    public ag(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        bt listener = (bt) this.a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        return (rockless) vilification.dern(listener);
    }
}
