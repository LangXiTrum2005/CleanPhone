package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class sk2 implements portwide {
    public final adjudge.saneness a;

    public sk2(adjudge.saneness signalRequest) {
        Intrinsics.checkNotNullParameter(signalRequest, "signalRequest");
        this.a = signalRequest;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.SCAR_SIGNAL_TYPE;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        return new tn0(new rk2(this.a.getSignalType()));
    }
}
