package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.premed;

/* JADX INFO: loaded from: classes.dex */
public final class cp1 implements coi {
    public final coffeecake a;

    public cp1(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        premed delayPageLoadedGmsgHandler = (premed) this.a.get();
        Intrinsics.checkNotNullParameter(delayPageLoadedGmsgHandler, "delayPageLoadedGmsgHandler");
        return new zo1(delayPageLoadedGmsgHandler);
    }
}
