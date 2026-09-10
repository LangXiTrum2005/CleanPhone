package ads_mobile_sdk;

import com.google.common.base.triweekly;
import java.util.Map;
import kotlinx.coroutines.impromptu;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class d73 implements hemolysin {
    public final CoroutineContext a;

    public d73(CoroutineContext backgroundContext) {
        Intrinsics.checkNotNullParameter(backgroundContext, "backgroundContext");
        this.a = backgroundContext;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get("action");
        if (str == null || StringsKt.empress(str)) {
            y13.a("Action is missing from a video GMSG: " + map, null, 6);
            return Unit.f29295attabal;
        }
        triweekly triweeklyVar = kn0.a;
        kn0.b("Handling \"" + str + "\" video GMSG", null);
        er0 er0VarD = gq0Var.d();
        if (er0VarD == null) {
            return Unit.f29295attabal;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 114148) {
            if (iHashCode != 3532159) {
                if (iHashCode == 1762557398 && str.equals("timeupdate")) {
                    Object objCompetently = impromptu.competently(this.a, new a73(map, er0VarD, null), dernVar);
                    return objCompetently == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCompetently : Unit.f29295attabal;
                }
            } else if (str.equals("skip")) {
                Object objCompetently2 = impromptu.competently(this.a, new b73(er0VarD, null), dernVar);
                return objCompetently2 == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCompetently2 : Unit.f29295attabal;
            }
        } else if (str.equals("src")) {
            Object objCompetently3 = impromptu.competently(this.a, new c73(map, er0VarD, null), dernVar);
            return objCompetently3 == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCompetently3 : Unit.f29295attabal;
        }
        y13.a("Unhandled video GMSG: " + map, null, 6);
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_VIDEO;
    }

    @Override // saneness.hemolysin
    public final boolean c() {
        return true;
    }
}
