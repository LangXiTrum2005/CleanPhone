package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.rockless;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class b71 implements coi {
    public final coffeecake a;

    public b71(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        x30 listener = (x30) this.a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        return (rockless) vilification.dern(listener);
    }
}
