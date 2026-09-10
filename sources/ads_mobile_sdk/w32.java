package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.eddy;
import saneness.glycolate;
import saneness.larchwood;

/* JADX INFO: loaded from: classes.dex */
public final class w32 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public w32(coffeecake coffeecakeVar) {
        glycolate glycolateVar = larchwood.f37184attabal;
        this.a = coffeecakeVar;
        this.b = glycolateVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        h1 adConfiguration = (h1) this.a.get();
        eddy canOpenUrlsGmsgHandler = (eddy) this.b.get();
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(canOpenUrlsGmsgHandler, "canOpenUrlsGmsgHandler");
        return new t32(adConfiguration, canOpenUrlsGmsgHandler);
    }
}
