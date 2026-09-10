package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.presbytery;

/* JADX INFO: loaded from: classes.dex */
public final class y32 implements coi {
    public final coffeecake a;

    public y32(bd1 bd1Var) {
        this.a = bd1Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        Map modifiers = (Map) this.a.get();
        Intrinsics.checkNotNullParameter(modifiers, "modifiers");
        return new presbytery(modifiers);
    }
}
