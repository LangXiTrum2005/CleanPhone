package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.rockless;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class v61 implements coi {
    public final coffeecake a;

    public v61(h21 h21Var) {
        this.a = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        gy0 listener = (gy0) this.a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        return (rockless) vilification.dern(listener);
    }
}
