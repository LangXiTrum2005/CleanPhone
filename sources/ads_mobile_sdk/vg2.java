package ads_mobile_sdk;

import com.google.common.base.triweekly;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;
import saneness.vinyl;

/* JADX INFO: loaded from: classes.dex */
public final class vg2 implements hemolysin {
    public final vinyl a;
    public final h1 b;

    public vg2(vinyl rewardedEventEmitter, h1 adConfiguration) {
        Intrinsics.checkNotNullParameter(rewardedEventEmitter, "rewardedEventEmitter");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.a = rewardedEventEmitter;
        this.b = adConfiguration;
    }

    public final Unit a(Map map, wretchedly.dern dernVar) {
        scarbroite.attabal attabalVar = this.b.i0;
        if (attabalVar != null) {
            Unit unitA = this.a.a(attabalVar, dernVar);
            return unitA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? unitA : Unit.f29295attabal;
        }
        int i = 1;
        try {
            String str = (String) map.get("amount");
            if (str != null) {
                i = Integer.parseInt(str);
            }
        } catch (NumberFormatException e) {
            triweekly triweeklyVar = kn0.a;
            kn0.c("Unable to parse reward amount: " + e, null);
        }
        String str2 = (String) map.get("type");
        if (str2 == null) {
            str2 = "";
        }
        Unit unitA2 = this.a.a(new ug2(str2, i), dernVar);
        return unitA2 == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? unitA2 : Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_REWARD;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get("action");
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 98615580) {
                if (iHashCode != 1385608094) {
                    if (iHashCode == 2098866301 && str.equals("video_complete")) {
                        Object objF = this.a.f(dernVar);
                        return objF == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objF : Unit.f29295attabal;
                    }
                } else if (str.equals("video_start")) {
                    Object objK = this.a.k(dernVar);
                    return objK == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objK : Unit.f29295attabal;
                }
            } else if (str.equals("grant")) {
                Unit unitA = a(map, dernVar);
                return unitA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? unitA : Unit.f29295attabal;
            }
        }
        return Unit.f29295attabal;
    }
}
