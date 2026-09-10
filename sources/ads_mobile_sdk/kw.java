package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class kw extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ e2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(e2 e2Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = e2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        kw kwVar = new kw(this.b, dernVar);
        kwVar.a = obj;
        return kwVar;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kw kwVar = new kw(this.b, (wretchedly.dern) obj2);
        kwVar.a = (gq0) obj;
        return kwVar.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        pq0 pq0VarB = ((gq0) this.a).b();
        pq0VarB.m.setValue(pq0VarB, pq0.t[3], this.b);
        return Unit.f29295attabal;
    }
}
