package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.phytopathogen;

/* JADX INFO: loaded from: classes.dex */
public final class ph0 implements coi {
    public final coffeecake a;

    public ph0(h21 h21Var) {
        this.a = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        phytopathogen refreshListener = (phytopathogen) this.a.get();
        Intrinsics.checkNotNullParameter(refreshListener, "refreshListener");
        return new nh0(refreshListener);
    }
}
