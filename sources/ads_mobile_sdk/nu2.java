package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class nu2 implements coi {
    public final coffeecake a;

    public nu2(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        ym2 paidPersonalizationEnabledGmsgHandler = (ym2) this.a.get();
        Intrinsics.checkNotNullParameter(paidPersonalizationEnabledGmsgHandler, "paidPersonalizationEnabledGmsgHandler");
        return new fu2(paidPersonalizationEnabledGmsgHandler);
    }
}
