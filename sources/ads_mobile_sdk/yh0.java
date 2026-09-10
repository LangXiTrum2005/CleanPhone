package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class yh0 implements coi {
    public final coffeecake a;

    public yh0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        d81 interstitialPropertiesGmsgHandler = (d81) this.a.get();
        Intrinsics.checkNotNullParameter(interstitialPropertiesGmsgHandler, "interstitialPropertiesGmsgHandler");
        return new bx(interstitialPropertiesGmsgHandler);
    }
}
