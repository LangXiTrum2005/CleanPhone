package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.rockless;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class z61 implements coi {
    public final coffeecake a;

    public z61(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        iv2 listener = (iv2) this.a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        return (rockless) vilification.dern(listener);
    }
}
