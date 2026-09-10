package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class hu2 implements coi {
    public final coffeecake a;

    public hu2(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        xn canOpenAppGmsgHandler = (xn) this.a.get();
        Intrinsics.checkNotNullParameter(canOpenAppGmsgHandler, "canOpenAppGmsgHandler");
        return new fu2(canOpenAppGmsgHandler);
    }
}
