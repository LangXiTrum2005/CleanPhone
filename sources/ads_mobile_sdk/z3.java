package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.bostonian;
import saneness.idolatry;

/* JADX INFO: loaded from: classes.dex */
public final class z3 implements bostonian {
    public final Map a;

    public z3(Map rendererMap) {
        Intrinsics.checkNotNullParameter(rendererMap, "rendererMap");
        this.a = rendererMap;
    }

    @Override // saneness.bostonian
    public final idolatry a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (idolatry) this.a.get(name);
    }
}
