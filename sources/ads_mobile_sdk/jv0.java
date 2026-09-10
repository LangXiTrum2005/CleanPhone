package ads_mobile_sdk;

import com.ironsource.X3;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class jv0 implements hemolysin {
    public final vg a;

    public jv0(vg appState) {
        Intrinsics.checkNotNullParameter(appState, "appState");
        this.a = appState;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get(X3.i.W);
        String str2 = (String) map.get("value");
        if (str == null || str.length() == 0) {
            return Unit.f29295attabal;
        }
        vg vgVar = this.a;
        vgVar.getClass();
        Object objA = vg.a(vgVar, str, str2, dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_IN_MEMORY_SDK_CORE_DATA;
    }
}
