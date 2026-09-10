package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class zf2 implements hemolysin {
    public final a02 a;

    public zf2(a02 paidLifecycleWrapper) {
        Intrinsics.checkNotNullParameter(paidLifecycleWrapper, "paidLifecycleWrapper");
        this.a = paidLifecycleWrapper;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        this.a.a();
        this.a.b();
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_RESET_PAID;
    }
}
