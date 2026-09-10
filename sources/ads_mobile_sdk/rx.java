package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class rx implements coi {
    public final coffeecake a;

    public rx(hb0 hb0Var) {
        this.a = hb0Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        vy1 openGmsgHandler = (vy1) this.a.get();
        Intrinsics.checkNotNullParameter(openGmsgHandler, "openGmsgHandler");
        return new bx(openGmsgHandler);
    }
}
