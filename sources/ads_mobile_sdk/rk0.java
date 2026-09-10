package ads_mobile_sdk;

import java.util.Map;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class rk0 implements hemolysin {
    public final saran a;

    public rk0(saran uiScope) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.a = uiScope;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        String str = (String) map.get("height");
        Integer intOrNull = str != null ? StringsKt.toIntOrNull(str) : null;
        if (intOrNull != null && gq0Var.a() != intOrNull.intValue()) {
            gq0Var.a(intOrNull.intValue());
            y13.a(this.a, new qk0(gq0Var, null));
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_FLUID_HEIGHT;
    }
}
