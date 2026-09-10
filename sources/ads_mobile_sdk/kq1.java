package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class kq1 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public kq1(h21 h21Var, hb0 hb0Var) {
        this.a = h21Var;
        this.b = hb0Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        h1 adConfiguration = (h1) this.a.get();
        ns0 hideValidatorOverlayGmsgHandler = (ns0) this.b.get();
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(hideValidatorOverlayGmsgHandler, "hideValidatorOverlayGmsgHandler");
        return new gq1(hideValidatorOverlayGmsgHandler);
    }
}
