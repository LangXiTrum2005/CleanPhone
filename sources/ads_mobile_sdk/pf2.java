package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class pf2 implements portwide {
    public final String a;

    public pf2(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.a = requestId;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.REQUEST_ID;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        return new tn0(new of2(this.a));
    }
}
