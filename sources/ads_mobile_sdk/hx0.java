package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.supercargo;

/* JADX INFO: loaded from: classes.dex */
public final class hx0 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public hx0(coffeecake coffeecakeVar, hb0 hb0Var) {
        this.a = coffeecakeVar;
        this.b = hb0Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        supercargo javascriptEngine = (supercargo) this.a.get();
        iv consentManager = (iv) this.b.get();
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        return new sv0(javascriptEngine, consentManager);
    }
}
