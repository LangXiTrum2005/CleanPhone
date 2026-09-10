package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class vn1 implements hemolysin {
    public final e2 a;

    public vn1(e2 adEventEmitter) {
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        this.a = adEventEmitter;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        Object objQ = this.a.q(dernVar);
        return objQ == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objQ : Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_NATIVE_IMPRESSION;
    }
}
