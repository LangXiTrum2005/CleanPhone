package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class v32 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public v32(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        h1 adConfiguration = (h1) this.a.get();
        go canOpenIntentsGmsgHandler = (go) this.b.get();
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(canOpenIntentsGmsgHandler, "canOpenIntentsGmsgHandler");
        return new t32(adConfiguration, canOpenIntentsGmsgHandler);
    }
}
