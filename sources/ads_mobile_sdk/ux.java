package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ux implements coi {
    public final coffeecake a;

    public ux(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        ym2 paidPersonalizationEnabledGmsgHandler = (ym2) this.a.get();
        Intrinsics.checkNotNullParameter(paidPersonalizationEnabledGmsgHandler, "paidPersonalizationEnabledGmsgHandler");
        return new bx(paidPersonalizationEnabledGmsgHandler);
    }
}
