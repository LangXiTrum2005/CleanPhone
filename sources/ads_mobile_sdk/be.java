package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class be extends Lambda implements Function1 {
    public final /* synthetic */ ce a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(ce ceVar) {
        super(1);
        this.a = ceVar;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        extensimeter.saneness sanenessVar = (extensimeter.saneness) obj;
        wb0 wb0VarH = this.a.b.h();
        synchronized (wb0VarH) {
            wb0VarH.n = sanenessVar;
            wb0VarH.a(sanenessVar);
            unit = Unit.f29295attabal;
        }
        return unit;
    }
}
