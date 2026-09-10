package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.gintrap;

/* JADX INFO: loaded from: classes.dex */
public final class zx implements coi {
    public final coffeecake a;

    public zx(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        gintrap adViewabilityMonitor = (gintrap) this.a.get();
        Intrinsics.checkNotNullParameter(adViewabilityMonitor, "adViewabilityMonitor");
        return new nw(adViewabilityMonitor);
    }
}
