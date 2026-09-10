package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class qx implements coi {
    public final coffeecake a;

    public qx(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        yg1 mraidLoadedGmsgHandler = (yg1) this.a.get();
        Intrinsics.checkNotNullParameter(mraidLoadedGmsgHandler, "mraidLoadedGmsgHandler");
        return new bx(mraidLoadedGmsgHandler);
    }
}
