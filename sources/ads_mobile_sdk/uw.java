package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class uw extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ x83 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(x83 x83Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = x83Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        uw uwVar = new uw(this.b, dernVar);
        uwVar.a = obj;
        return uwVar;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        uw uwVar = new uw(this.b, (wretchedly.dern) obj2);
        uwVar.a = (gq0) obj;
        return uwVar.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        ((gq0) this.a).o = this.b;
        return Unit.f29295attabal;
    }
}
