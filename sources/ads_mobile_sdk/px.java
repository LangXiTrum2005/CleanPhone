package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class px implements coi {
    public final coffeecake a;

    public px(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        rg1 mraidGmsgHandler = (rg1) this.a.get();
        Intrinsics.checkNotNullParameter(mraidGmsgHandler, "mraidGmsgHandler");
        return new bx(mraidGmsgHandler);
    }
}
