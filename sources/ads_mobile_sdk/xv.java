package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class xv implements coi {
    public final coffeecake a;

    public xv(h21 h21Var) {
        this.a = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        eddy.attabal initializationConfig = (eddy.attabal) this.a.get();
        Intrinsics.checkNotNullParameter(initializationConfig, "initializationConfig");
        return (String) vilification.dern(initializationConfig.getApplicationId());
    }
}
