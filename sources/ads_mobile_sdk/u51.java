package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class u51 extends SuspendLambda implements Function2 {
    public final /* synthetic */ eddy.dern a;
    public final /* synthetic */ z51 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u51(eddy.dern dernVar, z51 z51Var, wretchedly.dern dernVar2) {
        super(2, dernVar2);
        this.a = dernVar;
        this.b = z51Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new u51(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u51(this.a, this.b, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        this.a.attabal(this.b.a());
        return Unit.f29295attabal;
    }
}
