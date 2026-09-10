package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.eradication;

/* JADX INFO: loaded from: classes.dex */
public final class ey implements coi {
    public final coffeecake a;

    public ey(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        eradication webViewViewabilityMonitor = (eradication) this.a.get();
        Intrinsics.checkNotNullParameter(webViewViewabilityMonitor, "webViewViewabilityMonitor");
        return new xw(webViewViewabilityMonitor);
    }
}
