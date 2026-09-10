package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class i01 implements coi {
    public final coffeecake a;

    public i01(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        ly0 backButtonGmsgHandler = (ly0) this.a.get();
        Intrinsics.checkNotNullParameter(backButtonGmsgHandler, "backButtonGmsgHandler");
        return new a01(backButtonGmsgHandler);
    }
}
