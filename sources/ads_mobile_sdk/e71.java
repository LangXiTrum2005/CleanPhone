package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.rockless;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class e71 implements coi {
    public final coffeecake a;

    public e71(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        jr1 listener = (jr1) this.a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        return (rockless) vilification.dern(listener);
    }
}
