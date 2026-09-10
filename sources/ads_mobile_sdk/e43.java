package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class e43 implements coi {
    public final coffeecake a;

    public e43(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        g30 customCloseGmsgHandler = (g30) this.a.get();
        Intrinsics.checkNotNullParameter(customCloseGmsgHandler, "customCloseGmsgHandler");
        return new z33(customCloseGmsgHandler);
    }
}
