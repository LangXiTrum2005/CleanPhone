package ads_mobile_sdk;

import java.util.Map;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.hemolysin;

/* JADX INFO: loaded from: classes.dex */
public final class g30 implements hemolysin {
    public final saran a;

    public g30(saran uiScope) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.a = uiScope;
    }

    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        boolean zWireman = Intrinsics.wireman(map.get("custom_close"), "1");
        saran saranVar = this.a;
        f30 block = new f30(gq0Var, zWireman, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_CUSTOM_CLOSE;
    }
}
