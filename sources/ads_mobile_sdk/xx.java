package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class xx implements coi {
    public final coffeecake a;

    public xx(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        dc1 logScionEventGmsgHandler = (dc1) this.a.get();
        Intrinsics.checkNotNullParameter(logScionEventGmsgHandler, "logScionEventGmsgHandler");
        return new bx(logScionEventGmsgHandler);
    }
}
