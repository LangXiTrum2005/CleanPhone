package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.eddy;
import saneness.larchwood;

/* JADX INFO: loaded from: classes.dex */
public final class gx implements coi {
    public final coffeecake a = larchwood.f37184attabal;

    @Override // saneness.adultoid
    public final Object get() {
        eddy canOpenUrlsGmsgHandler = (eddy) this.a.get();
        Intrinsics.checkNotNullParameter(canOpenUrlsGmsgHandler, "canOpenUrlsGmsgHandler");
        return new bx(canOpenUrlsGmsgHandler);
    }
}
