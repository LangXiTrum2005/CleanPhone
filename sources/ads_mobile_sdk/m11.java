package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class m11 implements hemolysin {
    public final wz0 a;

    public m11(wz0 inspectorManager) {
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        this.a = inspectorManager;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get("persistentData");
        if (str == null) {
            return Unit.f29295attabal;
        }
        if (StringsKt.empress(str)) {
            return Unit.f29295attabal;
        }
        wz0 wz0Var = this.a;
        wz0Var.getClass();
        Object objB = wz0.b(wz0Var, str, dernVar);
        return objB == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objB : Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_INSPECTOR_UI_STORAGE;
    }
}
