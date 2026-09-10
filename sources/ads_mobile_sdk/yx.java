package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class yx implements coi {
    public final coffeecake a;

    public yx(hb0 hb0Var) {
        this.a = hb0Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        e2 adEventEmitter = (e2) this.a.get();
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        return new mw(adEventEmitter);
    }
}
