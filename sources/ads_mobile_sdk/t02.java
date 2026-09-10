package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class t02 implements portwide {
    public final rc2 a;

    public t02(rc2 recursiveAdData) {
        Intrinsics.checkNotNullParameter(recursiveAdData, "recursiveAdData");
        this.a = recursiveAdData;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.PARENT_AD_CONFIG;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        return new tn0(new s02(this.a));
    }
}
