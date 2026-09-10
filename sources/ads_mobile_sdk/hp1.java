package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class hp1 implements coi {
    public final coffeecake a;

    public hp1(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        h73 viewLocationGmsgHandler = (h73) this.a.get();
        Intrinsics.checkNotNullParameter(viewLocationGmsgHandler, "viewLocationGmsgHandler");
        return new zo1(viewLocationGmsgHandler);
    }
}
