package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a73 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Map a;
    public final /* synthetic */ er0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a73(Map map, er0 er0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.a = map;
        this.b = er0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new a73(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a73(this.a, this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        String str = (String) this.a.get("currentTime");
        if (str == null) {
            y13.a("CurrentTime parameter missing from timeupdate video GMSG: " + this.a, null, 6);
            return Unit.f29295attabal;
        }
        try {
            this.b.a(Float.parseFloat(str));
        } catch (NumberFormatException e) {
            y13.a("Could not parse currentTime from timeupdate video GMSG: " + str, e, 4);
        }
        return Unit.f29295attabal;
    }
}
