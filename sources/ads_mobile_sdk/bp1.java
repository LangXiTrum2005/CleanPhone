package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class bp1 implements coi {
    public final coffeecake a;

    public bp1(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        j20 csiGmsgHandler = (j20) this.a.get();
        Intrinsics.checkNotNullParameter(csiGmsgHandler, "csiGmsgHandler");
        return new zo1(csiGmsgHandler);
    }
}
