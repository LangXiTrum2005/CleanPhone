package ads_mobile_sdk;

import com.ironsource.X3;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class p12 implements hemolysin {
    public final sj0 a;

    public p12(sj0 flagDataStore) {
        Intrinsics.checkNotNullParameter(flagDataStore, "flagDataStore");
        this.a = flagDataStore;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get(X3.i.W);
        String str2 = (String) map.get("state");
        if (str == null || str.length() == 0) {
            return Unit.f29295attabal;
        }
        sj0 sj0Var = this.a;
        sj0Var.getClass();
        Object objA = sj0.a(sj0Var, str, str2, dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_PERSISTENT_SDK_CORE_DATA;
    }
}
