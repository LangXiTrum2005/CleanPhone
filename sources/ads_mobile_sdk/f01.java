package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class f01 implements coi {
    public final coffeecake a;

    public f01(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        y01 inspectorSetApplicationStateGmsgHandler = (y01) this.a.get();
        Intrinsics.checkNotNullParameter(inspectorSetApplicationStateGmsgHandler, "inspectorSetApplicationStateGmsgHandler");
        return new a01(inspectorSetApplicationStateGmsgHandler);
    }
}
