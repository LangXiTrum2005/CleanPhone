package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class b43 implements coi {
    public final coffeecake a;

    public b43(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        nd appEventGmsgHandler = (nd) this.a.get();
        Intrinsics.checkNotNullParameter(appEventGmsgHandler, "appEventGmsgHandler");
        return new z33(appEventGmsgHandler);
    }
}
