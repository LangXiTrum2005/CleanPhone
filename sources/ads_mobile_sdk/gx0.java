package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.backstairs;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class gx0 implements coi {
    public final coffeecake a;

    public gx0(hb0 hb0Var) {
        this.a = hb0Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        coffeecake webViewProfileWrapper = this.a;
        Intrinsics.checkNotNullParameter(webViewProfileWrapper, "webViewProfileWrapper");
        return new backstairs(webViewProfileWrapper);
    }
}
