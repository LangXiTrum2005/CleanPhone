package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class nd implements hemolysin {
    public final e2 a;

    public nd(e2 adEventEmitter) {
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        this.a = adEventEmitter;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get("name");
        if (str == null) {
            kn0.c("App event with no name parameter.", null);
            return Unit.f29295attabal;
        }
        Unit unitA = this.a.a(str, (String) map.get("info"), dernVar);
        return unitA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? unitA : Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_APP_EVENT;
    }
}
