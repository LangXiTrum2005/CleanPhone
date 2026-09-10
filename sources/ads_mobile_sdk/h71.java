package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class h71 implements coi {
    public final coffeecake a;

    public h71(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        ah appStatsTracker = (ah) this.a.get();
        Intrinsics.checkNotNullParameter(appStatsTracker, "appStatsTracker");
        return Integer.valueOf(appStatsTracker.d.incrementAndGet());
    }
}
