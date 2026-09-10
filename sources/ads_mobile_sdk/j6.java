package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class j6 implements portwide {
    public final g6 a;

    public j6(g6 adSpamClient) {
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        this.a = adSpamClient;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.AD_SPAM;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        g6 g6Var = this.a;
        c5 c5VarB = g6Var.b();
        String strA = c5VarB.a.a(g6Var.c());
        Intrinsics.checkNotNullExpressionValue(strA, "getQuerySignals(...)");
        return new tn0(new i6(strA));
    }
}
