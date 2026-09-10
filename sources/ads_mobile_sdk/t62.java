package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class t62 implements coi {
    public final coffeecake a;

    public t62(rz1 rz1Var) {
        this.a = rz1Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        qz1 outOfContextTestingGmsgHandler = (qz1) this.a.get();
        Intrinsics.checkNotNullParameter(outOfContextTestingGmsgHandler, "outOfContextTestingGmsgHandler");
        return new a01(outOfContextTestingGmsgHandler);
    }
}
