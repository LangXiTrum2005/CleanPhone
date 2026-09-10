package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class kx implements coi {
    public final coffeecake a;

    public kx(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        rk0 fluidHeightGmsgHandler = (rk0) this.a.get();
        Intrinsics.checkNotNullParameter(fluidHeightGmsgHandler, "fluidHeightGmsgHandler");
        return new bx(fluidHeightGmsgHandler);
    }
}
