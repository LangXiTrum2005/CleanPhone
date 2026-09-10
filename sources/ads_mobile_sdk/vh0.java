package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.voltammeter;

/* JADX INFO: loaded from: classes.dex */
public final class vh0 implements coi {
    public final coffeecake a;

    public vh0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        voltammeter closeGmsgHandler = (voltammeter) this.a.get();
        Intrinsics.checkNotNullParameter(closeGmsgHandler, "closeGmsgHandler");
        return new bx(closeGmsgHandler);
    }
}
