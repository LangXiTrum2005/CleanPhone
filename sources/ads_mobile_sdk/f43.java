package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.pruinose;

/* JADX INFO: loaded from: classes.dex */
public final class f43 implements coi {
    public final coffeecake a = pruinose.f37266attabal;

    @Override // saneness.adultoid
    public final Object get() {
        bb0 delayPageClosedGmsgHandler = (bb0) this.a.get();
        Intrinsics.checkNotNullParameter(delayPageClosedGmsgHandler, "delayPageClosedGmsgHandler");
        return new z33(delayPageClosedGmsgHandler);
    }
}
