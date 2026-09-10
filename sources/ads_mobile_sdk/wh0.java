package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class wh0 implements coi {
    public final coffeecake a;

    public wh0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        g30 customCloseGmsgHandler = (g30) this.a.get();
        Intrinsics.checkNotNullParameter(customCloseGmsgHandler, "customCloseGmsgHandler");
        return new bx(customCloseGmsgHandler);
    }
}
