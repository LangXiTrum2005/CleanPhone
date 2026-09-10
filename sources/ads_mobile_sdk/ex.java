package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ex implements coi {
    public final coffeecake a;

    public ex(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        xn canOpenAppGmsgHandler = (xn) this.a.get();
        Intrinsics.checkNotNullParameter(canOpenAppGmsgHandler, "canOpenAppGmsgHandler");
        return new bx(canOpenAppGmsgHandler);
    }
}
