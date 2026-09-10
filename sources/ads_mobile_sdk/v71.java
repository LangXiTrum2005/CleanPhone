package ads_mobile_sdk;

import complexometry.polloi;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class v71 extends Lambda implements Function1 {
    public final /* synthetic */ w71 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v71(w71 w71Var) {
        super(1);
        this.a = w71Var;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        gargoyle.saneness sanenessVar = (gargoyle.saneness) obj;
        wb0 wb0VarH = this.a.b.h();
        synchronized (wb0VarH) {
            wb0VarH.h = sanenessVar;
            wb0VarH.a((complexometry.dern) sanenessVar);
            wb0VarH.a((polloi) sanenessVar);
            unit = Unit.f29295attabal;
        }
        return unit;
    }
}
