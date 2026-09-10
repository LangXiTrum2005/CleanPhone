package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ow extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ gh1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(gh1 gh1Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = gh1Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        ow owVar = new ow(this.b, dernVar);
        owVar.a = obj;
        return owVar;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ow owVar = new ow(this.b, (wretchedly.dern) obj2);
        owVar.a = (gq0) obj;
        return owVar.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        ((gq0) this.a).b().n = this.b;
        return Unit.f29295attabal;
    }
}
