package ads_mobile_sdk;

import android.os.Bundle;
import com.ironsource.X3;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class dc1 implements hemolysin {
    public final wg0 a;
    public final h1 b;

    public dc1(wg0 firebaseAnalyticsAdapter, h1 adConfiguration) {
        Intrinsics.checkNotNullParameter(firebaseAnalyticsAdapter, "firebaseAnalyticsAdapter");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.a = firebaseAnalyticsAdapter;
        this.b = adConfiguration;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get(X3.i.j0);
        if (str == null) {
            return Unit.f29295attabal;
        }
        String str2 = (String) map.get("eventId");
        if (str2 == null) {
            return Unit.f29295attabal;
        }
        tg0 tg0Var = tg0.b;
        if (!Intrinsics.wireman(str, "_ac")) {
            tg0Var = tg0.c;
            if (!Intrinsics.wireman(str, "_ai")) {
                return Unit.f29295attabal;
            }
        }
        wg0 wg0Var = this.a;
        Bundle bundle = this.b.q;
        wg0Var.getClass();
        Unit unitA = wg0.a(wg0Var, tg0Var, bundle, str2);
        return unitA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? unitA : Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_LOG_SCION_EVENT;
    }
}
