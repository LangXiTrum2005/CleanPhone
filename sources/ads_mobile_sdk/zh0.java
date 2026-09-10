package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class zh0 implements coi {
    public final coffeecake a;

    public zh0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        r0 backButtonGmsgHandler = (r0) this.a.get();
        Intrinsics.checkNotNullParameter(backButtonGmsgHandler, "backButtonGmsgHandler");
        return new bx(backButtonGmsgHandler);
    }
}
