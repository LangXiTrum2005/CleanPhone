package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.lemures;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class bh1 implements coi {
    public final coffeecake a;

    public bh1(hb0 hb0Var) {
        this.a = hb0Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        e2 adEventEmitter = (e2) this.a.get();
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        return (lemures) vilification.dern(adEventEmitter);
    }
}
