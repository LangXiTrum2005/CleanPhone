package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class mq1 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public mq1(h21 h21Var, coffeecake coffeecakeVar) {
        this.a = h21Var;
        this.b = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        h1 adConfiguration = (h1) this.a.get();
        zl2 sendMessageToSdkGmsgHandler = (zl2) this.b.get();
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(sendMessageToSdkGmsgHandler, "sendMessageToSdkGmsgHandler");
        return new gq1(sendMessageToSdkGmsgHandler);
    }
}
