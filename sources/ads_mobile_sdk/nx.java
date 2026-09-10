package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class nx implements coi {
    public final coffeecake a;

    public nx(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        h73 locationGmsgHandler = (h73) this.a.get();
        Intrinsics.checkNotNullParameter(locationGmsgHandler, "locationGmsgHandler");
        return new bx(locationGmsgHandler);
    }
}
