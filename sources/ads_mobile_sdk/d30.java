package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class d30 implements hemolysin {
    public final e2 a;

    public d30(e2 adEventEmitter) {
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        this.a = adEventEmitter;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get("asset");
        if (str == null || str.length() == 0) {
            y13.a("No asset name provided in custom click GMSG.", null, 6);
            return Unit.f29295attabal;
        }
        Unit unitA = this.a.a(str, dernVar);
        return unitA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? unitA : Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_CUSTOM_CLICK;
    }
}
