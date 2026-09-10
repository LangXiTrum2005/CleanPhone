package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class i30 extends Lambda implements Function1 {
    public final /* synthetic */ k30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i30(k30 k30Var) {
        super(1);
        this.a = k30Var;
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        acidy.dern dernVar = (acidy.dern) obj;
        wb0 wb0VarH = this.a.b.h();
        synchronized (wb0VarH) {
            wb0VarH.k = dernVar;
            wb0VarH.a(dernVar);
            unit = Unit.f29295attabal;
        }
        return unit;
    }
}
