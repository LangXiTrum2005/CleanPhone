package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class n43 implements coi {
    public final coffeecake a;

    public n43(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        r0 backButtonGmsgHandler = (r0) this.a.get();
        Intrinsics.checkNotNullParameter(backButtonGmsgHandler, "backButtonGmsgHandler");
        return new z33(backButtonGmsgHandler);
    }
}
