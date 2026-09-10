package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class c73 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Map a;
    public final /* synthetic */ er0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c73(Map map, er0 er0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = map;
        this.b = er0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new c73(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c73(this.a, this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        String str = (String) this.a.get("src");
        if (str != null && !StringsKt.empress(str)) {
            this.b.a(str);
            return Unit.f29295attabal;
        }
        y13.a("Src parameter missing from video GMSG: " + this.a, null, 6);
        this.b.a((String) null);
        return Unit.f29295attabal;
    }
}
